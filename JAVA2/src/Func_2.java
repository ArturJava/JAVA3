
public class Func_2 implements Function {
    private final Function a, b;

    public Func_2(Function a, Function b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return 2 * Math.cos(0.7 * a.calculate(x) * Math.sin(a.calculate(x))) + b.calculate(x);
    }

    @Override
    public Function derivative() {
        return new Func_2(a.derivative(), b.derivative());
    }
}
