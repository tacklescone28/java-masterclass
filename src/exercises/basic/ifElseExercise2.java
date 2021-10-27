package exercises.basic;

public class ifElseExercise2 {
    public static void main(String[] args) {
        int A = 20;
        if (A < 0){
            System.out.println("weird");
        }else if (A >= 2 && A <= 5){
            System.out.println("not weird");
        }else if(A >= 6 && A <= 20){
            System.out.println("weird");
        }else if(A >= 20){
            System.out.println("not weird");
        }
    }
}
