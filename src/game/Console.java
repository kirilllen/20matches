package game;

/*Класс для вывода сообщений в консоль*/

import java.util.Scanner;

public class Console {
    private final Scanner scanner=new Scanner((System.in));

    public void printHello() {
        System.out.println("Добрый день, пользователь! Я хочу сыграть с тобой в игру!");
        System.out.println("Игра называется 20 спичек. Наверняка ты уже слышал про неё.");
        System.out.println("Чур я хожу первым");
    }

    public void printUserTookMatches(int numberMatchesOfUser,int numberMatchesLost) {
        System.out.println("Вы взяли " + numberMatchesOfUser + ". На столе осталось "+numberMatchesLost + " спичек.");
    }

    public void printComputerTakeMatches(int numberComputerTook, int numberMatchesLost) {
        System.out.println("Я возьму " + numberComputerTook + ". На столе осталось "+numberMatchesLost + " спичек." +
                            "теперь Ваш ход. Введите количество спичек");
    }

    public void printError() {
        System.out.println("Кажется, это не по правилам. Нужно было взять от одной из трёх спичек, но Вы, сударь, шулер!");
    }

    public int readNumberOfMatches() {
        return scanner.nextInt();
    }

    public void printComputerWin() {
        System.out.println("Кажется я победил!");
    }


}
