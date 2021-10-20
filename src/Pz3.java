public class Pz3 {
    public static void main(String[] args) {
        double km = (100 * 1.609344);
        System.out.println(km);
        int highestscore = 50;
        if (highestscore == 50) {
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
        int highScorePosition = scorecalc(1500);
        displayHighScorePosition("bob", highScorePosition);
        highScorePosition = scorecalc(900);
        displayHighScorePosition("tim", highScorePosition);
        highScorePosition = scorecalc(400);
        displayHighScorePosition("tom", highScorePosition);
        highScorePosition = scorecalc(50);
        displayHighScorePosition("natan", highScorePosition);
    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition +
                " on the high score table");
    }

    public static int scorecalc(int playerScore) {
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
        int Score = 10000;
        int LevelCompleted = 8;
        int Bonus = 200;
        if (newGameOver) {
            int FinalScore = Score + (LevelCompleted * Bonus);
            FinalScore += 2000;
            System.out.println("your final score =" + FinalScore);
        } else if (!newGameOver) {
            int FinalScore = Score + (LevelCompleted * Bonus) + 1000;
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