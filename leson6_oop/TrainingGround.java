package leson6_oop;

public class TrainingGround {
    public static void main(String[] args ){
        Enemy obj =new Enemy("tester",100);
        Mage necro = new Mage("Monimarko");
        necro.attackEnemy(obj);
        Archer arch=new Archer("Traxes");
        arch.attackEnemy(obj);
        Warrior paladin=new Warrior("Artur");
        paladin.attackEnemy(obj);




    }
}
