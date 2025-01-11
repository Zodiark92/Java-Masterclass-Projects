public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Tim", calculateHighScorePosition(1000));
        displayHighScorePosition("Tim", calculateHighScorePosition(500));
        displayHighScorePosition("Tim", calculateHighScorePosition(100));
        displayHighScorePosition("Tim", calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String name, int position){

        if(position != 0){
            System.out.println(name + " managed to get into position " + position
                    + " in the high score list");
        } else {
            System.out.println("[Error] Invalid position");
        }

    }

    public static int calculateHighScorePosition(int score){

        int position = 4;

        if(score >= 1000){
            position = 1;
        } else if(score >= 500){
            position = 2;
        } else if(score >= 100){
            position = 3;
        }

        return position;
    }

}
