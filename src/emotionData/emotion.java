package emotionData;

public class emotion {

    public final String emotion;
    public final String likeliness;

    public emotion(String emotion, String likeliness) {
        this.emotion = emotion;
        this.likeliness = likeliness;
    }

    public String getLikeliness() {
        return likeliness;
    }
}

