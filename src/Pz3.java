public class Pz3 {
    public static void main(String[] args) {
        double km = (100 * 1.609344);
        System.out.println(km);
        int highestScore = 50;
        if (highestScore == 50) {
            System.out.println("this is an expresion");
        }
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("this is a test");
        System.out.println("this is " +
                "another" +
                "still more ");
        int anotherVarible = 50;
        myVariable--;
        System.out.println("this is another one");
        boolean gameOver = true;
        calculateScore(true,800,5,100);
        int highScorePosition = scoreCalc(1500);
        displayHighScorePosition("bob", highScorePosition);
        highScorePosition = scoreCalc(900);
        displayHighScorePosition("tim", highScorePosition);
        highScorePosition = scoreCalc(400);
        displayHighScorePosition("tom", highScorePosition);
        highScorePosition = scoreCalc(50);
        displayHighScorePosition("natan", highScorePosition);
    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition +
                " on the high score table");
    }

    public static int scoreCalc(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore < 1000 && playerScore > 500) {
            return 2;
        } else if (playerScore < 500 && playerScore > 100) {
            return 3;
        } else return 4;

    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (score < 5000 && score > 1000) {
            System.out.println("your score was less then 5000");
            System.out.println("this was executed");
        } else if (score < 1000) {
            System.out.println("your score was less then a 1000");
        } else {
            System.out.println("got here");
        }
        boolean newGameOver = false;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if (newGameOver) {
            int FinalScore = newScore + (newLevelCompleted * newBonus);
            FinalScore += 2000;
            System.out.println("your final score =" + FinalScore);
        } else if (!newGameOver) {
            int FinalScore = newScore + (newLevelCompleted * newBonus) + 1000;
            System.out.println("level completed final score =" + FinalScore);
        }
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }
}