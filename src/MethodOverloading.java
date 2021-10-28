public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimiters(10, 12);
        calcFeetAndInchesToCentimiters(1000);
    }

    public static int calculateScore(String player, int score) {
        System.out.println("player" + player + " scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + "points");
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println("no player name,no score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimiters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("invalid feet or inches");
            return -1;
        }
        double CM = (feet * 12) * 2.54;
        CM += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + CM + " cm");
        return CM;
    }

    public static double calcFeetAndInchesToCentimiters(double inches) {
        if (inches < 0) {
            System.out.println("invalid feet or inches");
            return -1;
        }
        double feet = (int) inches / 12;
        double inchesLeft = (int) inches % 12;
        System.out.println(inches + " inchys = " + feet + " feet " + inchesLeft);
        return calcFeetAndInchesToCentimiters(feet, inchesLeft);
    }
}
