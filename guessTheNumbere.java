import java.util.Random;
import java.util.Scanner;

class Game{
    int randomNumber;
    int number;
    int guess=0;
    public Game(){
        Random rand=new Random();
        randomNumber=rand.nextInt(100);
        
    }
    public int userNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur guess : ");
        number=sc.nextInt();
        sc.close();
        return number;
    }
    boolean isCorrectGuess(){
        if(number==randomNumber){
            System.out.println("your guess is correct after "+guess+" guasses ");
            return true;
        }
        else if(number>randomNumber){
            System.out.println("to high....");
            guess++;
        }
        else if(number<randomNumber){
            System.out.println("to low.....");
            guess++;
        }
        return false;
    }
}
public class guessTheNumbere {
    public static void main(String[] args) {
        Game game=new Game();
        boolean b=false;
        while(!b){
            game.userNumber();
            b=game.isCorrectGuess();
        }
    }
}
