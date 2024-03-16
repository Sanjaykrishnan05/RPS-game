
import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String args[]){
    System.out.println("Rock Paper Scissors Game");
    String choice, choice1;
    int num = 0;
    Random r = new Random();
    int human=0;
    int computer=0;
    int max=3;
    int i=0;
    while(human<max&&computer<max){
    num = r.nextInt(3);
    System.out.println();
    System.out.println("Choose: \n-> Rock \n-> Paper \n -> Scissors.");
    Scanner userChoice = new Scanner(System.in);
    choice1 = userChoice.next();
    choice = choice1.toLowerCase();



    switch (num){
    case 0:
        String num1 = "rock";
        System.out.println("System chose Rock"); 
        if (choice.matches(num1)){
            System.out.println("Its a tie!");
            continue;
            }
        else if (choice.matches("paper")){
            System.out.println("You win!");
            human++;

        }
        else if (choice.matches("scissors")){
            System.out.println("computer won!");
            computer++;
        }
        else {
            System.out.println();
            System.out.println("ERROR: Please choose Rock, Paper or Scissors");
        }
    break;
    case 1:
        String num2 = "paper";
        System.out.println("System chose Paper");
        if (choice.matches(num2)){
            System.out.println("Its a tie!");
            continue;

        }
        else if (choice.matches("scissors")){
            System.out.println("You win!");
            human++;

        }
        else if (choice.matches("rock")){
            System.out.println("Computer won!");
            computer++;
        }
        else {
            System.out.println();
            System.out.println("ERROR: Please choose Rock, Paper or Scissors");
        }
    break;
    case 2: 
        String num3 = "scissors";
        System.out.println("System chose Scissors");
        if (choice.matches(num3)){
            System.out.println("Its a tie!");
            continue;

        }
        else if (choice.matches("rock")){
            System.out.println("You win!");
            human++;

        }
        else if (choice.matches("paper")){
            System.out.println("computer won!");
            computer++;
        }
        else {
            System.out.println();
            System.out.println("ERROR: Please choose Rock, Paper or Scissors");
        }
    break;


    }i++;
    }if(human==max)
    System.out.println("CONGRATS!!!!!!!!!!! YOU WON");
    else
    System.out.println("BETTER OF LUCK NEXTTIME !!!!!!!!!!!Computer won");
    

}
}
