package server;

import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.Feature.Type;
import com.google.cloud.vision.v1.Image;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.protobuf.ByteString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import emotionParser.emotionParser;
import user.currentUser;

public class FetchEmotionData {
    public static void main(String... args) throws Exception {
        // Initialize client that will be used to send requests. This client only needs to be created
        // once, and can be reused for multiple requests. After completing all of your requests, call
        // the "close" method on the client to safely clean up any remaining background resources.
        // The path to the image file to annotate
        String fileName = "../Images/sad_face.jpg";
        try {
            JsonObject jsonResponse = labelImage(fileName);
            currentUser user = emotionParser.readData(jsonResponse);
            System.out.println(user);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static JsonObject labelImage(String fileName) throws IOException {

        // Reads the image file into memory
        Path path = Paths.get(fileName);
        byte[] data = Files.readAllBytes(path);
        ByteString imgBytes = ByteString.copyFrom(data);


        try (ImageAnnotatorClient vision = ImageAnnotatorClient.create()) {
            // Builds the image annotation request
            List<AnnotateImageRequest> requests = new ArrayList<>();
            Image img = Image.newBuilder().setContent(imgBytes).build();
            Feature feat = Feature.newBuilder().setType(Type.LABEL_DETECTION).build();
            AnnotateImageRequest request =
                    AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
            requests.add(request);

            // Performs label detection on the image file
            BatchAnnotateImagesResponse response = vision.batchAnnotateImages(requests);
            List<AnnotateImageResponse> responses = response.getResponsesList();
            String JsonString = new Gson().toJson(response);
            JsonParser parser = new JsonParser();
            JsonObject finalResponse = (JsonObject) parser.parse(JsonString);
            return finalResponse;
        }


    }



}
