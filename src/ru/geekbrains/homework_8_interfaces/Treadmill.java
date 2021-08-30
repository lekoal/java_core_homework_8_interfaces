package ru.geekbrains.homework_8_interfaces;

public class Treadmill implements Obstacle {
    public int value;
    private String name;
    private int maxRun;

    public Treadmill(int value) { // Конструктор класса с принимаемой длиной
        this.value = value;
    }

    public void isAction(Participants x) { // Метод бега для участников
        if (x.getClass() == Human.class) { // Проверка класса участника
            this.name = ((Human) x).name;
            this.maxRun = ((Human) x).maxRun;

            if (maxRun >= value && x.getAction()) { // Проверка на возможность прыжка
                System.out.printf("%s run %s meters%n", name, value);
                x.setAction(true);
            } else if (maxRun < value && x.getAction()) {
                System.out.printf("%s cant run %s meters%n", name, value);
                x.setAction(false); // Изменение значения переменной действий
            }
        } else if (x.getClass() == Cat.class) { // Проверка класса участника
            this.name = ((Cat) x).name;
            this.maxRun = ((Cat) x).maxRun;

            if (maxRun >= value && x.getAction()) { // Проверка на возможность прыжка
                System.out.printf("%s run %s meters%n", name, value);
                x.setAction(true);
            } else if (maxRun < value && x.getAction()) {
                System.out.printf("%s cant run %s meters%n", name, value);
                x.setAction(false); // Изменение значения переменной действий
            }
        } else if (x.getClass() == Robot.class) { // Проверка класса участника
            this.name = ((Robot) x).name;
            this.maxRun = ((Robot) x).maxRun;

            if (maxRun >= value && x.getAction()) { // Проверка на возможность прыжка
                System.out.printf("%s run %s meters%n", name, value);
                x.setAction(true);
            } else if (maxRun < value && x.getAction()) {
                System.out.printf("%s cant run %s meters%n", name, value);
                x.setAction(false); // Изменение значения переменной действий
            }
        }
    }

}