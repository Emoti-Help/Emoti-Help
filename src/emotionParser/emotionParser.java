package emotionParser;

import user.currentUser;
import emotionData.emotion;

import java.util.*;
import org.json.simple.*;


/**
 * Use Case class to parse information returned by API and create an emotion entity.
 */
public class emotionParser {

    // string variables for JSON key
    public static final String ANGER = "angerLikelihood";
    public static final String JOY = "joyLikelihood";
    public static final String SORROW = "sorrowLikelihood";
    public static final String SURPRISE = "surpriseLikelihood";

    public static currentUser readData(JSONObject dataFromAPI) {

        JSONArray faceAnnotations = (JSONArray) dataFromAPI.get("faceAnnotations");
        HashMap<String, emotion> emotions = new HashMap<>();

        for (Object faceAnnotation : faceAnnotations) {
            if (faceAnnotation instanceof JSONObject) {
                JSONObject faceData = (JSONObject) faceAnnotation;
                if (!Objects.equals(containsEmotions(faceData), "")) {
                    String emotionKey = containsEmotions(faceData);
                    String emotionName = getEmotions(emotionKey);
                    faceData.get(containsEmotions(faceData));
                    emotion userEmotion = new emotion(emotionName, (String) faceData.get(emotionKey));
                    emotions.put(emotionName, userEmotion);
                }

            } else if (faceAnnotation instanceof String) {
                if (!findEmotionName((String) faceAnnotation).equals("")) {
                    String emotionName = findEmotionName((String) faceAnnotation);
                    emotion userEmotion = new emotion(emotionName, (String)
                            faceAnnotations.get(faceAnnotations.indexOf(faceAnnotation))); // better way?
                    emotions.put(emotionName, userEmotion);
                }
            }
        }
        return new currentUser(emotions.get("ANGER"), emotions.get("JOY"),
                emotions.get("SORROW"), emotions.get("SURPRISE"));
    }

    private static String findEmotionName(String key) {
        if (Objects.equals(key, ANGER)) {
            return "ANGER";
        } else if (Objects.equals(key, JOY)) {
            return "JOY";
        } else if (Objects.equals(key, SORROW)) {
            return "SORROW";
        } else if (Objects.equals(key, SURPRISE)) {
            return "SURPRISE";
        } else {
            return "";
        }
    }


    /**
     * Helper function for readData. returns string of the key the JSONObject contains, or an empty string if there is
     * no emotion data found.
     * @param faceData The JSONObject to read through
     * @return string of emotion, or empty string if none
     */
    private static String containsEmotions(JSONObject faceData) {
        if (faceData.containsKey(ANGER)) {
            return ANGER;
        } else if (faceData.containsKey(JOY)) {
            return JOY;
        } else if (faceData.containsKey(SORROW)) {
            return SORROW;
        } else if (faceData.containsKey(SURPRISE)) {
            return SURPRISE;
        } else {
            return "";
        }
    }

    /**
     * Helper function to get the emotion name
     * @param emotionKey in the JSONObject
     * @return name of emotion
     */
    private static String getEmotions(String emotionKey) {
        if (Objects.equals(emotionKey, ANGER)) {
            return "ANGER";
        } else if (Objects.equals(emotionKey, JOY)) {
            return "JOY";
        } else if (Objects.equals(emotionKey, SORROW)) {
            return "SORROW";
        } else if (Objects.equals(emotionKey, SURPRISE)) {
            return "SURPRISE";
        } else {
            return "";
        }
    }

}
