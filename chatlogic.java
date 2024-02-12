import java.util.Scanner;

public class chatlogic {

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
       
        if (userInput.contains("hello") || userInput.contains("hi")) {
            return "Hi there! How can I help you?";
        } else if (userInput.contains("how are you")) {
            return "I'm just a program, but thanks for asking!";
        } else if (userInput.contains("your name")) {
            return "what am i doing with my life ai exists";
        } else {
            return "I'm not sure how to respond to that. Ask me something else.";
        }
    }
}
