package home.work.module4;

/**
 * Created by Vitalik on 20.12.2015.
 */
public class FigureArea {

    public double squareArea(double a,double b){
        return a*b;
    }
    public double triangleArea(double a,double h){
        return a*h*0.5;
    }
    public double circleArea(double r){
        return Math.PI*Math.pow(r,2);
    }

}
