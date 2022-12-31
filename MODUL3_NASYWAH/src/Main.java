import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        Calculation z = new Calculation();
        Thread thread1 = new Thread(z);
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        do {
            try {
                System.out.println("\n===MENU PROGRAM===");
                System.out.println("1. Square");
                System.out.println("2. Circle");
                System.out.println("3. Trapezoid");
                System.out.println("0. exit");
                System.out.println("\n Select menu: ");
                int Menu = input.nextInt();

                switch(Menu){
                    case 1:
                    System.out.println("\nEnter the length of the side of the square: ");
                    double side = input.nextDouble();
                    z.setSquare(side);
                    thread1.start();
                    thread1.join();
                    System.out.println("\nThe Calculation Result : "+  z.getSquare());
                    break;

                    case 2:
                    System.out.println("\nEnter the length of the side of the circle: ");
                    double radius = input.nextDouble();
                    System.out.println("\n===PROGRAM WILL START IN===");
                    z.setCircle(radius);
                    thread1.start();
                    thread1.join();
                    System.out.println("\nThe Calculation Result : "+  z.getSquare());
                    break;

                    case 3:
                    System.out.println("\nEnter the side of the base of the trapezoid: ");
                    double a=input.nextDouble();
                    System.out.println("\nEnter the upper of the trapezoid: ");
                    double b=input.nextDouble();
                    System.out.println("\nEnter the height of the trapezoid: ");
                    double c=input.nextDouble();
                    System.out.println("\n===PROGRAM WILL START IN===");
                    z.setTrapezoid(a,b,c);
                    thread1.start();
                    thread1.join();
                    System.out.println("\nThe Calculation Result : "+  z.getSquare());
                    break;

                    case 0:
                    System.out.println("\nProgram END");
                    repeat = false;
                    break;

                    default:
                    System.out.println("\nOption not available");
                    continue;
                }
                repeat = false;
            }
            catch(InputMismatchException e){
                System.out.println("\nERROR===Input must be a number.");
                break;
            }

        } while (repeat);
        input.close();
    }
}

