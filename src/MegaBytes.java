public class MegaBytes {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(666666666);
        shouldWakeUp(true, 23);
        //isLeapYear(1000);
    }

    public static void printMegaBytesAndKiloBytes(long kilobytes) {
        long MB = (kilobytes / 1024);
        long newKilobytes = (kilobytes - (MB * 1024));
        long GB = (MB / 1024);
        long newMB = (MB - (GB * 1024));
        long TB = (GB / 1024);
        long newGB = (GB - (TB * 1024));
        if (kilobytes < 0) {
            System.out.println("Invalid Volue");
        } else {
            System.out.println(kilobytes + "KB = " + TB + " TB and " + newGB + " GB and " + newMB + " MB and " + newKilobytes + " KB");
        }
    }

    public static void shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
            System.out.println("true");
        } else if (barking == false && hourOfDay < 8 || hourOfDay > 23) {
            System.out.println("false");
        }
    }

//public static void isLeapYear(int year) {
  //      if (year < 1 || year > 9999) {
    //        System.out.println("falsee");
      //  } else if (year / 4) {
        //    System.out.println("true");
       // } else if (year / 100) ;{
     //       System.out.println("true");
        //}

    //}
}