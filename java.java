import java.util.Scanner;
import java.util.Vector;

public class bite {
    public static void Add2Integers() {
        int n1, n2, sum;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first int : ");
        n1 = in.nextInt();
        System.out.print("Enter second int : ");
        n2 = in.nextInt();

        in.close();
        sum = n1 + n2;

        System.out.println("Sum is : " + sum);
    }

    public static void AddInts() {
        int n1, n2, n3, sum, prod, min, max;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        n1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        n2 = in.nextInt();
        System.out.print("Enter number 3 : ");
        n3 = in.nextInt();
        in.close();

        sum = n1 + n2 + n3;
        prod = n1 * n2 * n3;

        min = n1;
        if(n2 < min) min = n2;
        if(n3 < min) min = n3;

        max = n1;
        if(n2 > max) max = n2;
        if(n3 > max) max = n3;

        System.out.println("sum is : " + sum);
        System.out.println("product is : " + prod);
        System.out.println("min is : " + min);
        System.out.println("max is : " + max);
    }

    public static void CircleComputation() {
        double radius, diameter, area, circumference;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        radius = in.nextDouble();
        in.close();

        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;

        System.out.println("Diameter is " + diameter);
        System.out.println("area is " + area);
        System.out.println("Circumference is " + circumference);
    }

    public static void SphereComputation() {
        double radius, volume, surfaceArea;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        radius = in.nextDouble();
        in.close();

        surfaceArea = 4.0 * Math.PI * radius * radius;
        volume = 4/3 * Math.PI * radius * radius * radius;

        System.out.println("Volume is " + volume);
        System.out.println("Area is " + surfaceArea);
    }

    public static void CylinderComputation() {
        double radius, height, baseArea, surfaceArea, volume;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        radius = in.nextDouble();
        System.out.print("Enter height : ");
        height = in.nextDouble();
        in.close();

        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;

        System.out.println("Volume is " + volume);
        System.out.println("Base Area is " + baseArea);
        System.out.println("Surface Area is " + surfaceArea);
    }

    public static void Swap2Integers() {
        int n1, n2, tmp;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        n1 = in.nextInt();
        System.out.print("Enter n2 : ");
        n2 = in.nextInt();

        tmp = n1;
        n1 = n2;
        n2 = tmp;

        System.out.println("n1 is " + n1);
        System.out.println("n2 is " + n2);
    }

    public static void SquarePattern(int size) {
        char car = '#';
        for(int r = 0; r < size; ++r) {
            for(int c = 0; c < size; ++c) {
                System.out.print(car + " ");
            }
            System.out.println();
        }
    }

    public static void TimeTable(int size) {
        System.out.print(" * |");
        for(int i = 1; i <= size; ++i) {
            if(i < 10) System.out.print("   " + i);
            else System.out.print("  "+ i);
        }
        System.out.println();
        System.out.print("-----");
        for(int i = 1; i <= size; ++i) {
            System.out.print("----");
        }
        System.out.println();
        for(int i = 1; i <= size; ++i) {
            if(i < 10) System.out.print(" ");
            System.out.print(i + " |");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Add2Integers();
        //AddInts();
        //CircleComputation();
        //SphereComputation();
        //CylinderComputation();
        //Swap2Integers();
        //SquarePattern(5);
        TimeTable(10);
    }
}