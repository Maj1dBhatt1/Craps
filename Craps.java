/**
 * Game of Craps
 *
 * @author MajidBhatti
 * @version 2019-01-18
 */
import java.util.Scanner;
public class Craps
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    boolean play = false;
    System.out.println("Do you want to play a game of craps? (Y/n)");
    String Input = in.nextLine();
    if (Input.equalsIgnoreCase("y") ||
        Input.equals(""))
    {
      play = true;

      System.out.println("Do you want to read the instructions? (y/N)");
      if (in.nextLine().equalsIgnoreCase("y"))
      {
        System.out.println("A player rolls two six-sided dice and adds the numbers rolled together.");
        System.out.println("On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over.");
        System.out.println("If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
        System.out.println("The player continues to roll the two dice again until one of two things happens:");
        System.out.println("either they roll the point from that first roll again, in which case they win;");
        System.out.println("or they roll a 7, in which case they lose.");
        System.out.println("PRESS ANY KEY TO CONTINUE");
        in.nextLine();
      }
    }
    else
    {
        play = false;
    }

    while (play) //only while user chooses to play
    {
      Dice twoDice = new Dice(); //initialize dice

      System.out.println("press ENTER to roll for your point");
      in.nextLine();
      String Status = "rolling"; //String variable tracks the User's game's status and is reffered to by loops and print statemnts.
      int[] pointRoll = twoDice.roll(); //initialize the point
      int point = pointRoll[0] + pointRoll[1];
      System.out.println("Dice 1 rolled for " + pointRoll[0] + " and  Dice 2 rolled for " + pointRoll[1]);

      if (point == 2 || //instant defeat condition
          point == 3 ||
          point == 12)
          {
            System.out.println("Sorry. You rolled a " + point);
            Status = "lose";
          }
      if (point == 7 || //instant win condition
          point == 11)
          {
            System.out.println("Great Luck! You rolled a " + point);
            Status = "win";
          }

      if (Status.equals("rolling"))
      { //prints user's point
        System.out.println("Your point is " + point + ".");
      }

      while (Status.equals("rolling"))
      {
        System.out.println("press ENTER to roll");
        in.nextLine();

        int[] roll = twoDice.roll();
        int rollTotal = roll[0] + roll[1];
        System.out.println("Dice 1 rolled for " + roll[0] + " and Dice 2 rolled for " + roll[1] + " for a total of " + rollTotal);


        if (rollTotal == point) // win
        {
            System.out.println("Nice. you rolled the point!");
            System.out.println("You win.");
            Status = "win";
        } //win conditions

        if (rollTotal == 7) // lose
        {
          System.out.println("Oh no! You rolled a 7!");
          System.out.println("You lose.");
          Status = "lose";
        }

        else
        {
          System.out.println("Keep rolling... the point is " + point + ".");
        }
      }
        //to play again
      System.out.println("want to play craps again? (y/N)");
      if (in.nextLine().equalsIgnoreCase("y")){
        play = true;}
      else{
          play = false;}
    }
    System.out.println("Goodbye.");
  }
}
