package ru.geekbrains.homework_8_interfaces;

public class Wall implements Obstacle {
    public int value;
    private String name;
    private int maxJump;

    public Wall(int value) { // Конструктор класса с принимаемой высотой
        this.value = value;
    }

    public void isAction(Participants x) { // Метод прыжков для участников
        if (x.getClass() == Human.class) { // Проверка класса участника
            this.name = ((Human) x).name;
            this.maxJump = ((Human) x).maxJump;

            if (maxJump >= value && x.getAction()) { // Проверка на возможность прыжка
                System.out.printf("%s jump %s meters%n", name, value);
                x.setAction(true);
            } else if (maxJump < value && x.getAction()) {
                System.out.printf("%s cant jump %s meters%n", name, value);
                x.setAction(false); // Изменение значения переменной действий
            }
        } else if (x.getClass() == Cat.class) { // Проверка класса участника
            this.name = ((Cat) x).name;
            this.maxJump = ((Cat) x).maxJump;

            if (maxJump >= value && x.getAction()) { // Проверка на возможность прыжка
                System.out.printf("%s jump %s meters%n", name, value);
                x.setAction(true);
            } else if (maxJump < value && x.getAction()) {
                System.out.printf("%s cant jump %s meters%n", name, value);
                x.setAction(false); // Изменение значения переменной действий
            }
        } else if (x.getClass() == Robot.class) { // Проверка класса участника
            this.name = ((Robot) x).name;
            this.maxJump = ((Robot) x).maxJump;

            if (maxJump >= value && x.getAction()) { // Проверка на возможность прыжка
                System.out.printf("%s jump %s meters%n", name, value);
                x.setAction(true);
            } else if (maxJump < value && x.getAction()) {
                System.out.printf("%s cant jump %s meters%n", name, value);
                x.setAction(false); // Изменение значения переменной действий
            }
        }
    }
}