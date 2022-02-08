public class Java {
    //1.2
    public static void CheckPassFail(int mark) {
        System.out.println("The mark is " + mark);

        if(mark >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println("Done");
    }

    //1.3
    public static void CheckOddEven(int number) {
        System.out.println("The number is " + number);
        if(number % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Impair");
        }
        System.out.println("Done");
    }

    //1.4
    public static void PrintNumberInWord(int number) {
        if(number == 1) {
            System.out.println("ONE");
        } else if(number == 2) {
            System.out.println("TWO");
        } else if(number == 3) {
            System.out.println("THREE");
        } else if(number == 4) {
            System.out.println("FOUR");
        } else if(number == 5) {
            System.out.println("FIVE");
        } else if(number == 6) {
            System.out.println("SIX");
        } else if(number == 7) {
            System.out.println("SEVEN");
        } else if(number == 8) {
            System.out.println("HEIGHT");
        } else if(number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("nope");
        }

        switch(number) {
            case 1:
                System.out.println("ONE"); break;
            case 2:
                System.out.println("TWO"); break;
            case 3:
                System.out.println("THREE"); break;
            case 4:
                System.out.println("FOUR"); break;
            case 5:
                System.out.println("FIVE"); break;
            case 6:
                System.out.println("SIX"); break;
            case 7:
                System.out.println("SEVEN"); break;
            case 8:
                System.out.println("HEIGHT"); break;
            case 9:
                System.out.println("NINE"); break;
            default:
                System.out.println("nope"); break;
        }
    }

    //1.5
    public static void PrintDayInWord(int day) {
        if(day > 7) return;
        String[] dString = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        System.out.println(dString[day]);
    }

    //main
    public static void main(String[] args) {
        //CheckPassFail(49);
        //CheckOddEven(48);
        //PrintNumberInWord(5);
        PrintDayInWord(7);
    }
}