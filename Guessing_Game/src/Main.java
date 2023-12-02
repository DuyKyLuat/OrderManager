import java.util.Random;
import java.util.Scanner;

public class Main {
    // thiết lập số lượt đoaán cho từng độ khó
    private static int Easy_level_turn = 10;
    private static int Hard_Level_turn = 5;

    public static void main(String[] args) {
        //println start display
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("I have selected a random number between 1 and 100.");
        //khởi tạo random phạm vi từ 1 -> 100
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        // set turns gán với phương thức set_difficutly ở dưới
        int turns = set_difficutly();
        // cho guess giá trị ban đầu bằng 1
        int guess = 1;
        //Lặp lại chức năng đoán nếu họ đoán sai.
        while (guess != answer) {
            System.out.println("You have " + turns + " attempts remaining to guess the number.");
            //Số người chơi đoán
            System.out.print("Make a guess: ");
            guess = sc.nextInt();
            turns = check_ans(guess, answer, turns);
            // khi lượt chơi về 0 mà chưa đoán được thì thì in ra màn hình là thua, hoặc nếu chưa đúng thì đoán lại đến lúc nào turns = 0
            if ( turns == 0 ) {
                System.out.println("You lose, Pssst, the correct answer is " + answer);
                return;
            } else if ( guess != answer ) {
                System.out.println("Guess again");
            }
        }
    }
    public static int check_ans (int guess, int answer, int turns){
        if(guess > answer){ // đoán cao thì in ra là high, turns trừ đi 1
            System.out.println("Too high.");
            return --turns;
        } else if (guess < answer){ // đoán thấp thì in ra là high, turns trừ đi 1
            System.out.println("Too low.");
            return --turns;
        } else { // đoán đúng thì in ra là màn hình chính xác và kết quả. Trả về 0.
            System.out.println("Exactly ! The answer was " + answer + ".");
            return 0;
        }
    }
    // Tạo độ khó cho game hard là 5 lần và easy là 10 lần
    private static int set_difficutly() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a difficutly. Type 'Easy' or 'Hard':");
        String level = sc.nextLine();
        // kiểm tra điều kiện nhập vào
        if ( level.equals("Easy")) {
            return Easy_level_turn;
        } else {
            return Hard_Level_turn;
        }
    }
}

