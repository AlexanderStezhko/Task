package leson6_oop;

public class Mage extends Hero {
    Mage (String name){
        super (name);
    }
    public void attackEnemy(Enemy obj){
        System.out.println( name +" Использует проклятие и наносит урон в 12ед.");
        obj.takeDamage(12);
        System.out.println("Health of enemy "+obj.getHealth());
    }

}
