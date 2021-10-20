public class FirstSteps {
    public static void main(String[] args) {
        int myfirstnumber = 5 - 10;
        System.out.println(myfirstnumber);
        int msn = 12;
        int mtn = 6;
        int mytotal = myfirstnumber + mtn + mtn;
        System.out.println(mytotal);
        int mylastone = 1000 - mytotal;
        System.out.println(mylastone);
        int myvalue = 10000;

        int myminintvalue = Integer.MIN_VALUE;
        int mymaxintvalue = Integer.MAX_VALUE;
        System.out.println("Integer Maximum Value = " + mymaxintvalue);
        System.out.println("Integer Minimum Value = " + myminintvalue);
        System.out.println("Busted MAX value = " + (mymaxintvalue + 1));
        System.out.println("Busted MIN value = " + (myminintvalue - 1));

        int myMaxInttest = 2_147_483_647;
        byte myMinbytevalue = Byte.MIN_VALUE;
        byte myMaxbytevalue = Byte.MAX_VALUE;
        System.out.println(myMaxbytevalue);
        System.out.println(myMinbytevalue);
        short myMaxshortvalue = Short.MAX_VALUE;
        short myMinshortvalue = Short.MIN_VALUE;
        System.out.println(myMaxshortvalue);
        System.out.println(myMinshortvalue);
        long mylongvolue = 100L;
        long myMaxLongvalue = Long.MAX_VALUE;
        long myMinLongvalue = Long.MIN_VALUE;
        System.out.println(myMaxLongvalue);
        System.out.println(myMinLongvalue);
        long biglongLiteralValue = 2147483647234L;
        System.out.println(biglongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myminintvalue / 2);

        byte myNewByteValue = (byte) (myMinbytevalue / 2);

        short myNewShortValue = (short) (myMinshortvalue / 2);
        byte p1 = 100;
        short p2 = 10000;
        int p3 = 100000;
        long p4 = 500000;
        System.out.println(p4 + 10 * (p3 + p2 + p1));
        // float and double
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float mimimum value = " + myMinFloatValue);
        System.out.println("float maximum value = " + myMaxFloatValue);
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMinDoubleValue);
        System.out.println("double maximum value = " + myMaxDoubleValue);
        int myIntVolue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue= " + myIntVolue);
        System.out.println("MyFloatVolue=" + myFloatValue);
        System.out.println("MyDoubleVolue=" + myDoubleValue);
        double kilogram = 1;
        double pound = 0.45359237;
        System.out.println("10 kilograms=" + (10 * kilogram) / pound + " pounds");
        double pi = 3.1415927;
        double anothernumber = 3000000.456789;
        System.out.println(pi);
        System.out.println(anothernumber);
        //char and  boolean
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyRightChar = '\u00a9';
        System.out.println(myCopyRightChar);
        boolean myTrueBooleanValue = true;
        boolean myFolseBooleanValue = false;

        boolean isCustomerOverTentyOne = true;
        //string now :D
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String mysteing = "this is a string";
        System.out.println("mystring =" + mysteing);
        mysteing = mysteing + ",and this is more.";
        System.out.println("mystring =" + mysteing);
        mysteing = mysteing + "\u00a9 2019";
        System.out.println("mystring =" + mysteing);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myint = 50;
        lastString = lastString + myint;
        System.out.println("lastString is equal to" + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to" + lastString);
        //operators
        int result = 1 + 2;
        System.out.println("1+2" + result);
        int previosResult = result;
        System.out.println("previousResult = " + previosResult);
        result = result - 1;
        System.out.println("3 -1 =" + result);
        System.out.println("previosResult = " + previosResult);

        result = result * 10;
        System.out.println("2*10 =" + result);
        result = result / 5;
        System.out.println("20 / 5 =" + result);
        result = result % 3;
        System.out.println(" 4 % 3 = " + result);
        //operators 2
        result++;
        System.out.println("1 + 1 =" + result);
        result--;
        System.out.println(" 2 - 1 = " + result);
        result += 2;
        System.out.println(" 1 + 2 = " + result);
        result *= 10;
        System.out.println("3 * 10 =" + result);
        result /= 3;
        System.out.println("30 / 3 =" + result);
        result -= 2;
        System.out.println("10 - 2 =" + result);
        // if then
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("its not an alien!");
            System.out.println("and i am scared of aliens");
        }
        // and operator
        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("you got the high score!");
        }
        int secondTopScore = 79;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater then second top score and less then 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("either or both of the conditions are true ");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is true");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("this is not supposed to hapend");
        }
        //ternary operator
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }
        double o1 = 20.00;
        double o2 = 80.00;
        double o3 =100*(o1 + o2);
        double o4 = o3 % 40.00;
        boolean o5 = o4 == 0? true:false;
        System.out.println(o5);
        if (!o5){
            System.out.println("got some remainder");
        }
        // za pierwszym ez :D
    }
}