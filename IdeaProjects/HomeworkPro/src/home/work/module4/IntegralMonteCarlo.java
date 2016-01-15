package home.work.module4;

import java.util.Random;

public class IntegralMonteCarlo {
    int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }

    public double calculateIntegral(int n){
        double x;
        double sum = 0;

        for (int i = 0; i < n; i ++){
            x = new Random().nextDouble()*(b-a)+a;
            sum = f(x)+sum;

        }
        return (sum/n*(b-a));
    }

    public double f(double x) {
        return 1+x;
    }

}
