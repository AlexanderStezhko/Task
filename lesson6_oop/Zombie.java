package lesson6_oop;
import lesson6_oop.heroes.Hero;


public class Zombie extends Enemy {
    public Zombie(String name,int health){
        super(name,health);

    }
    public void attackHero(Hero heroObj){
            if (heroObj.isAlive(heroObj.getHealth())) {
                System.out.println(nameOfEnemy + "наносит 9 урона, выстрелив в противника");
                 heroObj.takeDamage(30);
                if (heroObj.isAlive(heroObj.getHealth())) {
                    System.out.println(heroObj.getName() + " is alive");
                    System.out.println("Health of enemy " + heroObj.getHealth());
                } else {
                    System.out.println(heroObj.getName() + "is dead");
                }
            }
            else if((Math.random()*100)>80) {
                System.out.println("Зомби воскрес");
                heroObj.setHealth(70);

        }
            else {
                System.out.println("Enemy is dead");
            }

        }

    }
