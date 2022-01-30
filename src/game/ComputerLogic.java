package game;
/*Класс, описывающий поведение компьютера*/

public class ComputerLogic {
    private int matchesTook;

    public void firstMove(){
        matchesTook=3;
    }

    public void takeMatches(int numberMatchesOfUser){
        //Чтобы победить, необходимо чтобы сумма взятых спичек компьютера и пользователя была равна 4.
        matchesTook=4-numberMatchesOfUser;
    }

    public int getMatchesTook() {
        return matchesTook;
    }

    public boolean isCorrectNumber(int numberMatchesOfUser) {
        return (1<=numberMatchesOfUser)&&(numberMatchesOfUser<=3);
    }
}
