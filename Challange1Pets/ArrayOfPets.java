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

   protected int getNoOfPets() {
      return pets.size();



   }

   protected Pet getCurrent(int position) {
      return pets.get(position);
   }

   protected void insert(Pet newPet)
   {
      pets.add(newPet);

   }

   protected Pet findPetByName(String name){
      for(int index = 0; index < pets.size(); index++){
         if(pets.get(index).getName().equals(name)){
            return pets.get(index);
         }
      }
      return null;
   }



}//class
