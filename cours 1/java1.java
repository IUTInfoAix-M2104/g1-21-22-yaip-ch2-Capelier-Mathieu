public class LaJavaLaJoieLaLaLa {
    public static void main(String[] arg)
    {
        //ex1();
        //ex6();
        //ex7();
        //ex8();
        //ex10();
        //ex11();
        //ex12();
    }

    public static void ex1() {
      System.out.println("Hello, world!");
   }

    public static void PrintCheckerPattern() {
        System.out.println("* * * * * ");
        System.out.println(" * * * * *");
        System.out.println("* * * * * ");
        System.out.println(" * * * * *");
        System.out.println("* * * * * ");
    }

    public static void PrintSquarePattern() {
        System.out.println("* * * * *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("* * * * *");
    }

    public static void PrintTriangularPattern() {
        System.out.println("* * * * *");
        System.out.println(" *     *");
        System.out.println("  *   *");
        System.out.println("   * *");
        System.out.println("    *");
    }
      
    public static void PrintStarPattern() {
        System.out.println("    *");
        System.out.println("* *   * *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
    }

    public static void PrintSheepPattern() {
        System.out.println("          '__'");
        System.out.println("          (oo)");
        System.out.println("  /========//");
        System.out.println(" / || @@ ||");
        System.out.println("*  ||----||");
        System.out.println("   VV    VV");
        System.out.println("   ''    ''");
    }

    public static void ex6() {
        PrintCheckerPattern();
        PrintSquarePattern();
        PrintTriangularPattern();
        PrintStarPattern();
        PrintSheepPattern();
    }

    public static void ex7() {
        int number1 = 11;
        int number2 = 22;
        int number3 = 33;
        int number4 = 44;
        int number5 = 55;
        int number6 = 66;
        int number7 = 77;
        int sum = number1 + number2 + number3 + number4 + number5;
        int prod = number1 * number2 * number3 * number4 * number5;
        System.out.println("The sum is " + sum);
        System.out.println("The prod is " + prod);
    }

    public static void ex8Exemple() {
        double radius, area, circumference;
        final double PI = 3.14159265;
        radius = 1.2;
        area = radius * radius * PI;
        circumference = 2.0 * radius * PI;
        System.out.println("The radius is "+radius);
        System.out.println("The area is "+area);
        System.out.println("The circumference is "+circumference);
    }
    public static void RectangleComputation() {
        double length, width, area, perimeter;
        length = 2;
        width = 6;
        area = length * width;
        perimeter = (length*2) + (width*2);
        System.out.println("The area is "+area);
        System.out.println("The perimeter is "+perimeter);
    }
    public static void CylinderComputation() {
        double radius, height, surfaceArea, baseArea, volume;
        final double PI = 3.14159265;
        radius = 3.5;
        height = 9.6;
        baseArea = radius * radius * PI;
        surfaceArea = ((2.0 * radius * PI) * height) + (2.0 * baseArea);
        volume = baseArea * height;
        System.out.println("The base area is "+baseArea);
        System.out.println("The surface area is "+surfaceArea);
        System.out.println("The volume is "+volume);
    }
    public static void ex8() {
        //RectangleComputation();
        CylinderComputation();
    }

    public static void SumProduct3Numbers() {
        int number1 = 98;
        int number2 = 5;
        int number3 = 77;
        System.out.println(number1+number2+number3);
        System.out.println(number1*number2*number3);
    }
    public static void ex10() {
        int number1 = 98;
        int number2 = 5;
        int sum, difference, product, quotient, remainder;
      
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;
  
        System.out.print("The sum, difference, product, quotient and remainder of "+number1+" and "+number2+" are "+sum+", "+difference+", "+product+", "+quotient+", and "+remainder);
   
        ++number1;
        --number2;
        System.out.println("number1 after increment is " + number1);
        System.out.println("number2 after decrement is " + number2);
        quotient = number1 / number2; 
        System.out.println("The new quotient of " + number1 + " and " + number2 + " is " + quotient);
        
        System.out.println("31 * number1 = "+(31*number1));
        System.out.println("17 * number2 = "+(17*number2));
        SumProduct3Numbers();
    }

    public static void ex11Exemple() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sum = 0;
        int number = LOWERBOUND;

        while (number <= UPPERBOUND) {
            sum = sum + number;
            ++number;
        }

        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
    public static void RunningNumberSum1() {
        final int LOWERBOUND = 9;
        final int UPPERBOUND = 899;
        int sum = 0;
        int number = LOWERBOUND;

        while (number <= UPPERBOUND) {
            sum = sum + number;
            ++number;
        }

        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
    public static void RunningNumberOddSum() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sum = 0;
        int number = LOWERBOUND;

        while (number <= UPPERBOUND) {
            sum = sum + number;
            number += 2;
        }

        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
    public static void RunningNumberMod7Sum() {
        final int LOWERBOUND = 7;
        final int UPPERBOUND = 1000;
        int sum = 0;
        int number = LOWERBOUND;

        while (number <= UPPERBOUND) {
            sum = sum + number;
            number += 7;
        }

        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
    public static void RunningNumberSquareSum() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int sum = 0;
        int number = LOWERBOUND;

        while (number <= UPPERBOUND) {
            sum = sum + (number*number);
            ++number;
        }

        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
    public static void RunningNumberProduct() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;
        int sum = 1;
        int number = LOWERBOUND;

        while (number <= UPPERBOUND) {
            sum = sum * number;
            ++number;
        }

        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
    public static void ex11() {
        //RunningNumberSum1();
        //RunningNumberOddSum();
        //RunningNumberMod7Sum();
        //RunningNumberSquareSum();
        RunningNumberProduct();
    }

    public static void ex12Exemple() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sumOdd  = 0;
        int sumEven = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
            ++number;
        } 
        System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
        System.out.println("The sum of even numbers from " + LOWERBOUND + " to " + UPPERBOUND + "  is " + sumEven);
        System.out.println("The difference between the two sums is " + (sumOdd - sumEven));
    }
    public static void ThreeFiveSevenSum() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sum = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            if ((number%3 == 0 || number%5 == 0 || number%7 == 0) && (number%15 != 0 || number%21 != 0 || number%35 != 0 || number%105 != 0))
                sum += number;
            ++number;
            
        } 
        System.out.println("The sum of numbers is " + sum);
    }
    public static void PrintLeapYears() {
        final int LOWERBOUND = 999;
        final int UPPERBOUND = 2010;
        int count = 0;
        int number = LOWERBOUND;
        while(number <= UPPERBOUND) {
            if((number%4 == 0 && number%100 != 0) || number%400 == 0)
                ++count;
            ++number;
        }
        System.out.println(count);
    }
    public static void ex12() {
        //ex12Exemple();
        ThreeFiveSevenSum();
        PrintLeapYears();
    }
}