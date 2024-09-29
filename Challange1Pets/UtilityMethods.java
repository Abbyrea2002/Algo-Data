package Challange1Pets;

import java.util.Random;

/**
 * Created by abbyr on 29/09/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class UtilityMethods
{
   public static int getRandomValue(int low, int high){
      Random random = new Random();
      return random.nextInt(high - low)+ low;
   }//get random value method for age of pet
}//class
