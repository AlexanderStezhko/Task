package leson6_oop.heroes;

import leson6_oop.Enemy;

public class Warrior extends Hero {
    Warrior(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy obj){
        System.out.println( name +" наносит 15 урона щитом");
        obj.takeDamage(15);
        if (obj.isAlive(obj.getHealth())){
            System.out.println(obj.getNameOfEnemy()+" is alive");
            System.out.println("Health of enemy "+obj.getHealth());
        }
        else{
            System.out.println(obj.getNameOfEnemy()+"is dead");
        }

    }
}
