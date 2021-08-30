package ru.geekbrains.homework_8_interfaces;

public class Main {

    public static void main(String[] args) {
        Obstacle treadmill1 = new Treadmill(13); // Создание объектов беговой дорожки с указанием длины
        Obstacle treadmill2 = new Treadmill(15);
        Obstacle treadmill3 = new Treadmill(32);
        Obstacle treadmill4 = new Treadmill(21);
        Obstacle wall1 = new Wall(10); // Создание объектов стены с указанием высоты
        Obstacle wall2 = new Wall(13);
        Obstacle wall3 = new Wall(9);
        Obstacle wall4 = new Wall(14);

        Participants human1 = new Human("human1", 40, 12); // Создание объектов человек с пределами по расстоянию и высоте
        Participants human2 = new Human("human2", 32, 7);
        Participants cat1 = new Cat("cat1", 13, 15); // Создание объектов кот с пределами по расстоянию и высоте
        Participants cat2 = new Cat("cat2", 15, 13);
        Participants robot1 = new Robot("robot1", 60, 2); // Создание объектов робот с пределами по расстоянию и высоте
        Participants robot2 = new Robot("robot2", 50, 3);

        Participants[] participants = {human1, human2, cat1, cat2, robot1, robot2}; // Создание массива участников
        Obstacle[] obstacle = {treadmill1, wall1, treadmill2, wall2, treadmill3, wall3, treadmill4, wall4}; // Создание массива препятствий

        for (int i = 0; i < obstacle.length; i++) {
            for (int j = 0; j < participants.length; j++) {
                obstacle[i].isAction(participants[j]); // Передача объекта препятствию
            }
        }
    }
}