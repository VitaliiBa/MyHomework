package home.work.unittests;

import home.work.module4.Distance;
import home.work.module4.FigureArea;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestModule4 {

    private static final double delta = 0.0001;

    private Distance distance;

    @Test
    public void shouldReturnCorrectDistance()throws Exception{
        final double x1 = 4;
        final double y1 = 9;
        final double x2 = 45;
        final double y2 = 12;
        final double expectedResult = 41.10960958218893;
        final Distance distance = new Distance();
        final double actualResult = distance.ecalcDistanc(x1,y1,x2,y2);
        Assert.assertEquals("Actual result differs from expected. Test is failed.",expectedResult, actualResult,delta );
    }

    @Test
    public void shouldReturnCorrectSquareArea()throws Exception{
        final double a = 7;
        final double b = 3.5;
        final double expectedResult = a*b;
        final FigureArea figureArea = new FigureArea();
        final double actualResult = figureArea.squareArea(a,b);
        Assert.assertEquals("Actual result differs from expected. Test is falied.",expectedResult,actualResult,delta);
    }
    @Test
    public void shouldReturnCorrectTriangleArea()throws Exception{
        final double a = 3.4;
        final double h = 7.8;
        final double expectedResult = a*h*0.5;
        final FigureArea figureArea = new FigureArea();
        final double actualResult = figureArea.triangleArea(a,h);
        Assert.assertEquals("Actual result differs from expected. Test is falied",expectedResult,actualResult,delta);
    }
    @Test
    public void shouldReturnCorrectCircleArea() throws Exception{
        final double r = 7.2;
        final  double expectedResult = Math.PI*Math.pow(r,2);
        final FigureArea figureArea = new FigureArea();
        final double actualResult = figureArea.circleArea(r);
       Assert.assertEquals("Actual result differs from expected. Test is falied",expectedResult,actualResult,delta);
    }


}
