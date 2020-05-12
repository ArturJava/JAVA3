import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void MENU(){
        int choice = 100;
        Scanner scanner = new Scanner(System.in);
        do {
            try {


                System.out.println(Colors.ANSI_RED +
                        "        Menu           " + "\n" +
                        "-------------------------" + "\n" +
                        "| 0 - Exit               |" + "\n" +
                        "-------------------------" + "\n" + Colors.ANSI_PURPLE +
                        "| 1 - Derivative         |" + "\n" +
                        "-------------------------" + "\n");
                choice = scanner.nextInt();
                switch (choice) {
                    case 0: {
                        System.out.println("U've selected to exit");
                        System.exit(0);
                        break;
                    }
                    case 1: {
                        double b = 0.7;
                        double c = -1;
                        double t = 1.2;
                        double m = 2;
                        final Function expression = new PowerFunction(1.0 / 3,
                                new Sum(new Multiplication(new Constant(m), new Tan(new Linear(t))),
                                        new Multiplication(new Constant(c), new Sin(new Linear(t)))));
                        System.out.println("f("+t+") = " + expression.calculate(t));
                        System.out.println("f'("+t+") = " + expression.derivative().calculate(t));
                        final Function expression1 = new Sum(new Multiplication(new Constant(m),
                                new Cos(new Multiplication(new Multiplication(new Constant(b), new Constant(t)),
                                        new Sin(new Linear(t))))), new Constant(c));
                        System.out.println("f("+t+") = " + expression1.calculate(t));
                        System.out.println("f'("+t+") = " + expression1.derivative().calculate(t));
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value");
                scanner.nextLine();
            }
        } while (choice != 0);
    }
}
