package leson6_oop;

public interface Mortal {
     default public boolean isAlive( int health) {
         if (health > 0) {
             return true;
         } else {
             return false;
         }

     }
}
