import java.util.Scanner;

class Guesser {
    int guessingNumber;

    int guessTheNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! guess the number: ");
        int number = scan.nextInt();
        return number;
    }
}

class Players{
    int guessingNumber;

    int guessTheNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! guess the number: ");
        int number = scan.nextInt();
        return number;
    }
}

class Umpire{
    int guessedNum;
    int player1Num;
    int player2Num;
    int player3Num;

    void collectNumFromGuesser(){
        Guesser num = new Guesser();
        guessedNum = num.guessTheNumber();
    }

    void collectNumFromPlayers(){

        Players num = new Players();
        player1Num = num.guessTheNumber();
        player2Num = num.guessTheNumber();
        player3Num = num.guessTheNumber();
    }

    void compare(){
        if(guessedNum==player1Num){
            if (guessedNum==player2Num && guessedNum==player3Num) {
                System.out.println("All Players won the game");
            } else if(guessedNum==player2Num){
                System.out.println("Player 1 and Player 2 won the game");
            } else if(guessedNum==player3Num){
                System.out.println("Player 1 and Player 3 won the game");
            } else {
                System.out.println("Player 1 won the game");
            }
        } else if (guessedNum==player2Num) {
            if(guessedNum==player3Num){
                System.out.println("Player 2 and Player 3 won the game");
            } else {
                System.out.println("Player 2 won the game");
            }
        } else if (guessedNum==player3Num) {
                System.out.println("Player 3 won the game");
        } else {
            System.out.println("GameLost! Please try again!");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        Umpire ump = new Umpire();
        ump.collectNumFromGuesser();
        ump.collectNumFromPlayers();
        ump.compare();
    }
}
