
public class Func_1 implements Function{
    private final Function a, b;

    public Func_1(Function a, Function b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return Math.cbrt(2 * Math.tan(a.calculate(x)) + Math.abs(b.calculate(x) * Math.sin(a.calculate(x))));
    }

    @Override
    public Function derivative() {
        return new Func_1(a.derivative(), b.derivative());
    }

}
