package lesson6_oop;

import lesson6_oop.heroes.Hero;

public abstract class Enemy implements Mortal {
    public Enemy(String name,int health){
        this.nameOfEnemy=name;
        this.health=health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    int health;

    public String getNameOfEnemy() {
        return nameOfEnemy;
    }

    String nameOfEnemy;

    public void takeDamage(int damage){
        this.health -= damage;
    }
    public abstract void attackHero( Hero obj);



}
