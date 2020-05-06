

import static java.lang.Math.*;

public class Derivative  {
    public double der2 (double x){
        return -2*((0.7*x*cos(x)+0.7*sin(x))*sin(0.7*x*sin(x)));
    }
    public double der1 (double x){
        return (((-1*cos(x)*sin(x))/3)+((2*pow(tan(x),2))/3)+2/3)/pow(2*tan(x)+abs(-1*sin(x)),2/3);
    }
}
