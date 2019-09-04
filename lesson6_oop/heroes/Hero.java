package lesson6_oop.heroes;

import lesson6_oop.Enemy;
import lesson6_oop.Mortal;

public abstract class Hero implements Mortal {

    String name;
    int health;

    public String getName() {
        return name;
    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    Hero(String name,int health){
        this.name=name;
        this.health=health;
    }
    public abstract void attackEnemy( Enemy obj);
    public void takeDamage(int damage){
        this.health -= damage;
    }


}
