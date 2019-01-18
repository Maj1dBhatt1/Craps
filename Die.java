/**
 * A Die object for use with for programm such as Craps.java
 *
 * @author MajidBhatti
 * @version 2019-01-18
 */

 public class Die
 {
   private int roll;

   /**
    * constructor for objects of class Die
    *
    */
   public Die()
   {
     roll = roll();
   }

   public int roll()
   {
     roll = (int)(Math.random() * 6 + 1);
     return roll;
   }

 }
