package leson6_oop.heroes;


import leson6_oop.Enemy;

public class Archer extends  Hero {
    Archer(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy obj){
        if (obj.isAlive(obj.getHealth())) {
            System.out.println(name + "наносит 9 урона, выстрелив в противника");
            obj.takeDamage(9);
            if (obj.isAlive(obj.getHealth())) {
                System.out.println(obj.getNameOfEnemy() + " is alive");
                System.out.println("Health of enemy " + obj.getHealth());
            } else {
                System.out.println(obj.getNameOfEnemy() + "is dead");
            }
        }
        else {
            System.out.println("Enemy is dead");
        }

    }

}


