package lesson6_oop;

import lesson6_oop.heroes.Archer;
import lesson6_oop.heroes.Mage;
import lesson6_oop.heroes.Warrior;
import lesson6_oop.heroes.Hero;

public class TrainingGround {
    public static void main(String[] args ){
        Enemy obj = new Zombie("tester",100);
        Hero necro = new Mage("Monimarko",100);
        Hero arch= new Archer("Traxes",100);
        Hero paladin= new Warrior("Artur",100);
    }
}
