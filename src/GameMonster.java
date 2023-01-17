import java.util.Scanner;

class GameCharacter {
    String name;
    int hp;
    int maxHp;
    int attackPower;
    boolean block;

    public GameCharacter(String name, int maxHp, int attackPower) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = this.maxHp;
        this.attackPower = attackPower;
        this.block = false;
    }

    public void attack(GameCharacter target) {
        int damage = this.attackPower;
        target.hp -= damage;
        System.out.println(this.name + " нанёс персонажу " + target.name + " урон = " + damage);
        System.out.println("У персонажа " + target.name + " осталось " + target.hp + " / " + target.maxHp + " ед.здоровья");
        if (target.block) {
            if (Math.random() < 0.55) {
                System.out.println(target.name + " заблокировал атаку");
                return;
            } else {
                damage *= 2;
            }

        }


    }

    public void blockAction() {
        hp++;
        if (hp > maxHp) {
            hp = maxHp;
        }
        block = true;
        System.out.println(this.name + " пытается заблокировать следующую атаку. Получает +1 ед. здоровья");
    }

    public void reset() {
        block = false;
    }
}

public class GameMonster {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите имя");
        GameCharacter hero = new GameCharacter(sc.next(), 10, 2);
        GameCharacter monster = new GameCharacter("Тролль", 10, 2);
        System.out.println("Герой " + hero.name + " начинает своё путешествие");
        System.out.println(hero.name + " сразу же попадает в засаду. Из леса на него нападает " + monster.name);
        System.out.println("Началалсь великая битва");
        while (true) {
            System.out.println("\nХод героя: " + hero.name);
            System.out.println(hero.name + " каковы будут ваши дейсвтия");
            hero.reset();
            String input = sc.next();
            if (input.equals("атака")) {
                hero.attack(monster);
                if (monster.hp <= 0) {
                    System.out.println(hero.name + " убил персонажа " + monster.name);
                    break;
                }
            } else if (input.equals("блок")) {
                hero.blockAction();
            }
            System.out.println("\nХод монстра: " + monster.name);
            monster.reset();
            if (Math.random() < 0.5) {
                monster.attack(hero);
                if (hero.hp <= 0) {
                    System.out.println(monster.name + " убил персонажа " + hero.name);
                    break;
                }
            } else {
                monster.blockAction();
            }
        }

        System.out.println("Игра завершена");


    }
}

