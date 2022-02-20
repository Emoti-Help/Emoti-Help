package user;

import java.util.ArrayList;

/**
 * Keeps track of user emotions over the past week.
 */
public class userLog {

    public ArrayList<user> userEmotions = new ArrayList<>();

    /**
     * Add user emotions to log
     * @param user to add emotion log
     */
    public void logEmotions(user user) {
        if (this.userEmotions.size() < 7) {
            this.userEmotions.add(user);
        } else {
            userEmotions.add(user);
            userEmotions.remove(0);
        }
    }

}
