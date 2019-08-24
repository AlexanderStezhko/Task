package leson6_oop;

public abstract class Hero {
    String name;
    Hero(String name){
        this.name=name;
    }
    public abstract void attackEnemy( Enemy obj);
}
