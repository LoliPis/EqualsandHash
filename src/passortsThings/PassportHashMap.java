package passortsThings;

import java.util.HashMap;
import java.util.Objects;

public class PassportHashMap {
   private HashMap<String, Passport> personMap = new HashMap<>();

   public void addNewPassport(Passport passport){
      if (!personMap.containsKey(passport.getPassportNumber())){
         personMap.put(passport.getPassportNumber(), passport);
      } else {
         personMap.replace(passport.getPassportNumber(), passport);
      }
   }

   public Passport findPassport(String passportNumber) {
      if (personMap.containsKey(passportNumber)) {
         return personMap.get(passportNumber);
      } else {
         return null;
      }
   }

   @Override
   public String toString() {
      return "PassportHashMap{" +
              "personMap=" + personMap +
              '}';
   }

   public void printMap(){
      System.out.println(personMap.values());
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      PassportHashMap that = (PassportHashMap) o;
      return Objects.equals(personMap, that.personMap);
   }

   @Override
   public int hashCode() {
      return Objects.hash(personMap);
   }


}
