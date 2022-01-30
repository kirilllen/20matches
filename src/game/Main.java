package game;

public class Main {

    public static void main (String[] args) {
        int numberOfMatchesLost=20;

        Console console=new Console();
        ComputerLogic logic=new ComputerLogic();
        console.printHello();
        logic.firstMove();
        numberOfMatchesLost-= logic.getMatchesTook();
        console.printComputerTakeMatches(logic.getMatchesTook(),numberOfMatchesLost);
        while (numberOfMatchesLost>0) {
            int numberOfMatchesTook=console.readNumberOfMatches();
            numberOfMatchesLost-=numberOfMatchesTook;
            console.printUserTookMatches(numberOfMatchesTook,numberOfMatchesLost);
            if (numberOfMatchesLost==0) {

                break;
            }
            logic.takeMatches(numberOfMatchesTook);
            numberOfMatchesLost-=logic.getMatchesTook();
            console.printComputerTakeMatches(logic.getMatchesTook(),numberOfMatchesLost);
        }
    }
}
