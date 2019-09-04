package lesson6_oop.heroes;

import lesson6_oop.Enemy;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy obj){
        System.out.println( name +" Использует проклятие и наносит урон в 12ед.");
        obj.takeDamage(12);
        if (obj.isAlive(obj.getHealth())){
            System.out.println(obj.getNameOfEnemy()+" is alive");
            System.out.println("Health of enemy "+obj.getHealth());
        }
        else{
            System.out.println(obj.getNameOfEnemy()+"is dead");
        }
    }

}
