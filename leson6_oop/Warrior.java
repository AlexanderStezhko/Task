package leson6_oop;

public class Warrior extends Hero {
    Warrior(String name){
        super(name);
    }
    public void attackEnemy(Enemy obj){
        System.out.println( name +" наносит 15 урона щитом");
        obj.takeDamage(15);
        System.out.println("Health of enemy "+obj.getHealth());
    }
}
