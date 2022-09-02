import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guess Game! :)");

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", nice to meet you ;)");
        System.out.print("Are you ready to start the game? ");
        String x = input.nextLine();
        String ans = x.toLowerCase();

        if(ans.equals("no")) {
            System.out.println("Sorry to hear that, get back whenever you are ready!");
            System.exit(0);
        }
        Random random = new Random();
        int n = random.nextInt(30);
        int user_ans;
        for (int i = 5; i > 1 ; i--) {
            System.out.format("\nYou have %d chances\n", i);
            System.out.print("What is your guess? ");
            user_ans  = input.nextInt();
            check(user_ans, n);
        }

        System.out.print("\nYou only have 1 chance!\n");
        System.out.print("What is your last guess? ");
        user_ans  = input.nextInt();
        check(user_ans, n);

        System.out.println("GAME OVER...");
        System.out.format("The number was %d", n);
        System.exit(0);
    }

    public static void check(int ans, int n) {
        if (ans == n) {
            System.out.println("Winner winner, Chicken dinner!");
            System.exit(0);
        }else if (ans > n) {
            System.out.println("Your number is bigger than our number.");
        }else{
            System.out.println("Your number is less than our number.");
        }
    }
}
