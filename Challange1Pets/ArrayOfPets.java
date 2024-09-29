package Challange1Pets;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by abbyr on 29/09/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ArrayOfPets
{
   private List<Pet> pets;
   public ArrayOfPets(){
      pets = new ArrayList<Pet>();

   }

   protected void insert(Pet newPet){
      pets.add(newPet);
   }

   protected ArrayList<Integer> findPetByName(String name){
      ArrayList<Integer> result = new ArrayList<Integer>();
      for(int index = 0; index < pets.size(); index++){
         if(pets.get(index).getName().equals(name)){
            result.add(index);
         }
      }
      return result;
   }

   protected void displayAPet(int index){
      pets.get(index).speak();
   }



}//class
