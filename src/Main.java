import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                \s
                        ____
                    ,dP9CGG88@b,
                  ,IP  _   Y888@@b,
                 dIi  (_)   G8888@b
                dCII  (_)   G8888@@b
                GCCIi     ,GG8888@@@
                GGCCCCCCCGGG88888@@@
                GGGGCCCGGGG88888@@@@...
                Y8GGGGGG8888888@@@@P.....
                 Y88888888888@@@@@P......
                 `Y8888888@@@@@@@P'......
                    `@@@@@@@@@P'.......
                        ""\""........
                """);
        
        while (true) {

            System.out.println("\nWelcome to the Magic 8 Ball");
            System.out.println("What question would you like to ask the Oracle: ");

            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            System.out.println("\nYou asked... " + answer);

            String eightBallAnswer = getMagic8BallAnswer();
            System.out.println(eightBallAnswer);
        }
    }
    public static String getMagic8BallAnswer() {
        String[] eightBallAnswers = { "It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it",
                "As I see it, yes", "Most Likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy, try again", "Ask again later",
                "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no",
                "My sources say no", "Outlook not so good", "Very doubtful"};

        Random random = new Random();
        int index = random.nextInt(eightBallAnswers.length);
        return eightBallAnswers[index];
    }
}

