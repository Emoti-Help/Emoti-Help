package OutputComputer;


import emotionData.emotion;
import user.currentUser;

public class EmotionComputer {

    public EmotionComputer(){}

    private int emotionProcessor(emotion processedEmotion) {
        if (processedEmotion.getLikeliness() == "Very Unlikely") {
            return 1;
        } else if (processedEmotion.getLikeliness() == "Unlikely") {
            return 2;
        } else if (processedEmotion.getLikeliness() == "Neutral") {
            return 3;
        } else if (processedEmotion.getLikeliness() == "Likely") {
            return 4;
        } else {
            return 5;
        }
    }

    public int emotionScoreGenerator(currentUser user) {
        int joySorrowRatio = emotionProcessor(user.getJoy()) - emotionProcessor(user.getSorrow());
        if (emotionProcessor(user.getSurprise()) > 3) {
            return 1;
        } else if (emotionProcessor(user.getAnger()) > 3) {
            return 2;
        } else if (emotionProcessor(user.getSorrow()) > 3) {
            return 3;
        } else if (emotionProcessor(user.getJoy()) > 3) {
            return 4;
        } else if (0 <= joySorrowRatio && joySorrowRatio <= 2) {
        return 5;
        } else {
            return 0;
        }
    }
}
