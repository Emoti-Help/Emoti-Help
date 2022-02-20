package OutputComputer;


import user.user;

public class MessageGenerator {
    private EmotionComputer emotionComputer;
    public MessageGenerator(){
        this.emotionComputer = new EmotionComputer();
    }

    public String userEmotionScoreProcessor(user user) {
        int emotionScore = this.emotionComputer.emotionScoreGenerator(user);
        if (emotionScore == 0){
            return "There was an error the user's stored emotion likelinesses";
        } else if (emotionScore == 1) {
            return "We hope whatever is surprising you is an amazing surprise, and it makes your day a thousand times " +
                    "happier because you are great and you deserve it.";
        } else if (emotionScore == 2) {
            return "Hey there! We see that there is something angering you.\n Try some of these to help calm you down: " +
                    "1. Count down from 10.\n" +
                    "2. Take a breather. Your breathing becomes shallower and speeds up as you grow angry.\n" +
                    "3. Go walk around. Exercise can help calm your nerves and reduce anger.\n" +
                    "4. Relax your muscles.\n" +
                    "5. Repeat a mantra.\n" +
                    "6. Stretch.\n" +
                    "7. Mentally escape by doing something.\n" +
                    "8. Take a timeout.\n" +
                    "9. Find the most immediate solution.\n" +
                    "10. Talk to a friend or Family member.\n" +
                    "11. Find a creative way to channel your emotions.\n" +
                    "Here are further resources to help you:\n" +
                    "https://ontario.cmha.ca/documents/understanding-anger-and-anger-management/\n" +
                    "https://www.heretohelp.bc.ca/wellness-module/wellness-module-5-anger-management";
        } else if (emotionScore == 3) {
            return "Hey there! We see that there is something making you sad. \n " +
                    "Lift you're chin up and smile, the world is a beautiful place, but nothing is as beautiful and " +
                    "perfect as you\n" +
                    "We know that there are some bad days but it always gets better and sadness is temporary but " +
                    "happiness is eternal\n" +
                    "Try some of these to help you feel better:\n" +
                    "1. Know that you are loved and cherished" +
                    "2. Talk to your friends and family" +
                    "4. Forget about what makes you sad and anxious\n" +
                    "5. Don't dwell on the past, what has happened has happened" +
                    "6. Think about something that makes you happy\n" +
                    "7. Write down all the things in your life you're grateful for\n" +
                    "8. Think of all the people who love you\n" +
                    "9. Practice Mindfulness\n" +
                    "10. Stop the Negative Self-Talk\n" +
                    "11. Distract Yourself\n" +
                    "12. Write in a Journal\n" +
                    "13. Get Enough Sleep\n" +
                    "14. Forgive Others\n" +
                    "15. Exercise\n" +
                    "16. Don’t Give up\n" +
                    "If you're feeling depressed or considering self harm, gere are a few resources that will help you. " +
                    "Please use them and seek help:\n" +
                    "suicide helpline: (Ca) 833-456-4566, (USA) 988\n" +
                    "https://suicidepreventionlifeline.org/" +
                    "https://www.healthline.com/health/mental-health/suicide-resource-guide#Crisis-hotlines" +
                    "https://afsp.org/suicide-prevention-resources";
        } else if (emotionScore == 4) {
            return "Hey there! We would like to say you have a beautiful smile and your joyful energy is quite infectious.\n" +
                    "Keep that smile on you face all day, and take that positive energy with you through everything you do." +
                    "You will not only achieve your goals but also bless the people around you with that amazing aura";
        } else {
            return "Hey there! We see that there is something making you sad. \n " +
                    "Lift you're chin up and smile, the world is a beautiful place, but nothing is as beautiful and " +
                    "perfect as you\n" +
                    "The happier you try to be, the happier you'll get.\n" +
                    "Just know that you are loved and cherished and we are routing for you to succeed and achieve " +
                    "all you dreams\n" +
                    "Remember to smile and spread that positive energy";
        }
    }
}
