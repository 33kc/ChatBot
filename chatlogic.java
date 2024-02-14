import java.util.Random;
import java.util.Scanner;

public class ChatLogic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'm your chatbot. How can I assist you today?");
        System.out.println("Type 'exit' to end the conversation.");

        String userInput;
        do {
            System.out.print("You: ");
            userInput = scanner.nextLine();
            String response = getBotResponse(userInput);
            System.out.println("Bot: " + response);
        } while (!userInput.equalsIgnoreCase("exit"));

        System.out.println("Goodbye! Have a great day.");
    }

    private static String getBotResponse(String userInput) {
        Random random = new Random();
        int randomVariation = random.nextInt(5);

        if (userInput.contains("hello") || userInput.contains("hi")) {
            return randomVariation == 0 ? "Hey there! What's up?" :
                   randomVariation == 1 ? "Hello! How can I assist you today?" :
                   randomVariation == 2 ? "Hi! What brings you here?" :
                   randomVariation == 3 ? "Greetings! Anything on your mind?" :
                   "Hey! Ready for a chat?";
        } else if (userInput.contains("how are you")) {
            return randomVariation == 0 ? "I'm just a program, but I'm doing well in the world of ones and zeros. How about you?" :
                   randomVariation == 1 ? "I'm great, thanks for asking! What can I do for you?" :
                   randomVariation == 2 ? "Doing fine! What's on your mind?" :
                   randomVariation == 3 ? "I'm hanging in there! What's going on with you?" :
                   "Not too shabby! What brings you to me?";
        } else if (userInput.contains("your name")) {
            return randomVariation == 0 ? "Ah, I don't have a name, but you can call me ChatBot. What's on your mind?" :
                   randomVariation == 1 ? "No name here, just your friendly ChatBot ready to chat!" :
                   randomVariation == 2 ? "Names are overrated, but you can refer to me as your helpful assistant." :
                   randomVariation == 3 ? "Call me ChatBot, your virtual companion. What can I assist you with?" :
                   "You can call me ChatBot! What brings you to our conversation?";
        } else if (userInput.contains("how about") || userInput.contains("what about")) {
            return randomVariation == 0 ? "Interesting proposition! Tell me more about your idea or suggestion." :
                   randomVariation == 1 ? "I'm intrigued! What do you have in mind?" :
                   randomVariation == 2 ? "I'm all ears! Share your thoughts, and let's continue the conversation." :
                   randomVariation == 3 ? "Sounds intriguing! What's your take on it?" :
                   "I'm curious! How would you like to proceed?";
        } else if (userInput.contains("tell me more") || userInput.contains("expand on")) {
            return randomVariation == 0 ? "Sure thing! What specific details are you interested in?" :
                   randomVariation == 1 ? "Absolutely! What aspect would you like me to elaborate on?" :
                   randomVariation == 2 ? "I'm ready to share more! Is there a particular area you'd like more information about?" :
                   randomVariation == 3 ? "I'm at your service! What additional information would you like?" :
                   "Great! What specific details would you like me to delve into?";
        } else {
            return randomVariation == 0 ? "Hmm, that's interesting! Tell me more or ask me something else." :
                   randomVariation == 1 ? "I'm not sure how to respond to that. What else is on your mind?" :
                   randomVariation == 2 ? "Interesting choice of words! Feel free to share more or ask another question." :
                   randomVariation == 3 ? "Curious! Can you tell me more, or is there another topic you'd like to explore?" :
                   "I'm intrigued! What prompted that thought, or is there something else you'd like to discuss?";
        }
    }
}
//bro this is so bad omg
