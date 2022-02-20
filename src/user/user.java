package user;

import emotionData.emotion;

public class user {

    public emotion anger;
    public emotion joy;
    public emotion sorrow;
    public emotion surprise;

    public user(emotion anger, emotion joy, emotion sorrow, emotion surprise) {
        this.anger = anger;
        this.joy = joy;
        this.sorrow = sorrow;
        this.surprise = surprise;
    }

    public emotion getAnger() {
        return anger;
    }

    public emotion getJoy() {
        return joy;
    }

    public emotion getSorrow() {
        return sorrow;
    }

    public emotion getSurprise() {
        return surprise;
    }
}
