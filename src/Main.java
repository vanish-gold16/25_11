import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Datum datum = new Datum();
        //System.out.println(datum);

        System.out.println("****************");

        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 1; j < 11; j++) {
                if(i * j < 10){
                    System.out.print("   " + j * i);
                }
                else if(i * j >= 10)
                    System.out.print("  " + j * i);
            }
        }

        System.out.print("\n****************");

        for (int i = 0; i <= 5; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
        System.out.print("\n");
        for (int i = 5; i >= 1; i--) {
            System.out.println();
            for (int j = 5; j >= i; j--) {
                System.out.print(i);
            }
        }
        System.out.println("\n");
        for (int i = 1; i <= 4; i++) {
            System.out.println();
            for (int j = 1; j < 5; j++) {
                System.out.print(i);
            }
        }
        System.out.println("\n");
        for (int i = -2; i <= 7; i++) {
            i++;
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }

        System.out.println("\n");

        Ctverec ctverec = new Ctverec(5);
        System.out.println(ctverec.FillSquare());

        System.out.println("\n");
    }
}