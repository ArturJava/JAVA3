import java.text.SimpleDateFormat;
import java.util.Date;

public class Сalc_func {
    final static double m = -2;
    final static double t = 1.2;
    final static double c = -1;
    final static double b = 0.7;

    void date() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
        System.out.println("Current date and time " + formatForDateNow.format(dateNow));
    }

    double calc_first(double m, double t, double c) {
        double func = Math.cbrt(m * Math.tan(t) + Math.abs(c * Math.sin(t)));
        return func;
    }

    double calc_second(double m, double t, double c, double b) {
        double func = m * Math.cos(b * t * Math.sin(t)) + c;
        return func;
    }

    void printall_res(double m, double t, double c, double b) {
        System.out.println("U've entered  : " + "\n" + "m = " + m + "\n" + "t = " + t + "\n" + "c = " + c + "\n" + "b = " + b + "\n");
        System.out.println("First function :  " + calc_first(m, t, c));
        System.out.println("Second function :  " + calc_second(m, t, c, b));
    }

    void results() {
        System.out.println(Main.ANSI_BLUE + "First function :  " + calc_first(m, t, c));
        System.out.println(Main.ANSI_BLUE + "Second function :  " + calc_second(m, t, c, b));
    }

    void print_default_param() {
        System.out.println("Default  : " + "\n" + "m = " + m + "\n" + "t = " + t + "\n" + "c = " + c + "\n" + "b = " + b + "\n");
    }

    final static void print_param(double m, double t, double c, double b) {
        System.out.println("m = " + m + "\n" + "t = " + t + "\n" + "c = " + c + "\n" + "b = " + b + "\n");
    }
}
