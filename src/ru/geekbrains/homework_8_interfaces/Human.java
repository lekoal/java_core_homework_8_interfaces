package ru.geekbrains.homework_8_interfaces;

public class Human implements Participants {
    public String name; // Создание переменной имени
    public int maxRun; // Создание переменной, хранящей максимальную высоту прыжка
    public int maxJump; // Создание переменной, хранящей максимальную длину бега
    private boolean canAction = true; // Создание переменной, хранящей возможность совершать действия

    public Human(String name, int maxRun, int maxJump) { // Метод с параметрами
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public void setAction(boolean canAction) { // Сеттер для переменной действий
        this.canAction = canAction;
    }

    public boolean getAction() { // Геттер для переменной действий
        return canAction;
    }
}