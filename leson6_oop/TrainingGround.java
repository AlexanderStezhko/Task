package leson6_oop;

import leson6_oop.heroes.Archer;
import leson6_oop.heroes.Mage;
import leson6_oop.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args ){
        Enemy obj =new Enemy("tester",100);
        Mage necro = new Mage("Monimarko",100);
        necro.attackEnemy(obj);
        Archer arch=new Archer("Traxes",100);
        arch.attackEnemy(obj);
        Warrior paladin=new Warrior("Artur",100);
        paladin.attackEnemy(obj);




    }
}
