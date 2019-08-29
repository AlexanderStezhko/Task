package leson6_oop.heroes;

import leson6_oop.Enemy;
import leson6_oop.Mortal;

public abstract class Hero implements Mortal {
    String name;
    int health;


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
    //public abstract void takeDamage();

}
