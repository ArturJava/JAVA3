public class LinearFunction_1 implements Function {
    public final double k;
    public double res;
    Derivative derivative;
    public LinearFunction_1(double k, double res) {
        derivative = new Derivative();
        this.k = k;
        this.res = derivative.der1(res);
    }

    @Override
    public double calculate(double x) {

        return k * x;
    }

    @Override
    public Function derivative() {
        return new ConstFunction(res);
    }
}
