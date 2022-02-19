package user;

import emotionData.emotion;

public class currentUser {

    public emotion anger;
    public emotion joy;
    public emotion sorrow;
    public emotion surprise;

    public currentUser(emotion anger, emotion joy, emotion sorrow, emotion surprise) {
        this.anger = anger;
        this.joy = joy;
        this.sorrow = sorrow;
        this.surprise = surprise;
    }
}
