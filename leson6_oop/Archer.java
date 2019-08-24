package leson6_oop;


public class Archer extends  Hero {
    Archer (String name){
        super (name);
    }
    public void attackEnemy(Enemy obj){
        System.out.println( name +"наносит 9 урона, выстрелив в противника");
        obj.takeDamage(9);
        System.out.println("Health of enemy "+obj.getHealth());

    }

}


