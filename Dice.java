/**
 * why? ... for the sake of practice.
 *
 * @author MajidBhatti
 * @version 2019-01-18
 */

 public class Dice
 {
   //private int numOfDice
   private Die d1;
   private Die d2;

   //constructor
   public Dice()
   {
     d1 = new Die();
     d2 = new Die();
   }

   public int[] roll()
   {
     int[] rolls = new int[2];
     rolls[0] = d1.roll();
     rolls[1] = d2.roll();
     return rolls;
   }

 }
