public class MethodChalange {
    public static void main(String[] args) {
        checkNumber(-10);
        checkNumber(5);
        checkNumber(0);
        toMilesPerH(10);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }

    public static long toMilesPerH(double kmph) {
        if(kmph < 0){
            return -1;
        }else {
            return Math.round(kmph / 1.609);
        }
    }
}
