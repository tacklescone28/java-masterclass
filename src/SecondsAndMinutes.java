public class SecondsAndMinutes {
    public static void main(String[] args) {
        secondsAndMinutes(60, 170);
        secondsAndMinutes(2147123871);
        areaCalc(10,-19);
        areaCalc(10);
    }

    public static int secondsAndMinutes(int seconds, int minutes) {
        if (seconds < 0 || seconds > 59 || minutes < 0) {
            System.out.println("invalid volue");
            return -1;
        } else {
            int H = minutes / 60;
            int M = seconds / 60;
            int NewM = M + minutes - 60 * H;
            System.out.println(H + "h " + NewM + "m " + seconds + "s");
        }
        return 1;
    }

    public static void secondsAndMinutes(int seconds) {
        if (seconds < 0) {
            System.out.println("invalid volue");
        } else {
            int Min = seconds / 60;
            int Sec = seconds - 60 * Min;
            int Hour = Min / 60;
            int NewMin = Min - 60 * Hour;
            int Days = Hour / 24;
            int NewHour = Hour - 24 * Days;
            int year = Days / 365;
            int NewDays = Days - 365 * year;
            int Decade = year / 10;
            int Newyear = year - 10 * Decade;
            System.out.println(Decade + "decades " + Newyear + "years " + NewDays + "days " + NewHour + "h " + NewMin + "m " + Sec + "seconds");
        }
    }

    public static double areaCalc(double radius) {
        if (radius < 0) {
            System.out.println("invalid volue");
            return -1;
        } else {
            System.out.println(radius);
            return radius;
        }
    }

    public static double areaCalc(double x, double z) {
        if ((x < 0) || (z < 0)) {
            System.out.println("invalid value");
            return -1;
        }else {
            System.out.println(x + "X " + z+ "Z");
            return 0;
        }
    }
}
