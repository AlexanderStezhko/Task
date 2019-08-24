package leson6_oop;

public class Enemy {
    Enemy(String name,int health){
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
    String nameOfEnemy;

    public void takeDamage(int damage){
        this.health -= damage;
    }



}
