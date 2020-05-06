
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Сalc_func сalcfunc = new Сalc_func();
        int choice = 100, option;
        Scanner scanner = new Scanner(System.in);
        //System.out.println("f'(10) = " + expression.derivative().calculate(10));

        do {
            try {


                System.out.println(ANSI_YELLOW +
                        "        Menu           " + "\n" +
                        "-------------------------" + "\n" +
                        "| 0 - Exit               |" + "\n" +
                        "-------------------------" + "\n" + ANSI_PURPLE +
                        "(         Lab 1          )" + "\n" + ANSI_YELLOW +
                        "| 1 - Show the time      |" + "\n" +
                        "| 2 - Show the results   |" + "\n" +
                        "|(default param)         |" + "\n" +
                        "| 3 - Print the values   |" + "\n" +
                        "| and results            |" + "\n" +
                        "| 4 - Print default param|" + "\n" + ANSI_PURPLE +
                        "-------------------------" + "\n");
                choice = scanner.nextInt();
                switch (choice) {
                    case 0: {
                        System.out.println("U've selected to exit");
                        System.exit(0);
                        break;
                    }
                    case 1: {
                        сalcfunc.date();
                        break;
                    }
                    case 2: {
                        сalcfunc.results();
                        break;
                    }
                    case 3: {
                        System.out.println("Please, enter some values");
                        double m = scanner.nextDouble();
                        double t = scanner.nextDouble();
                        double c = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        сalcfunc.printall_res(m, t, c, b);
                        break;
                    }
                    case 4: {
                        сalcfunc.print_default_param();
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value");
                scanner.nextLine();
            }
        } while (choice != 0);
    }
}

