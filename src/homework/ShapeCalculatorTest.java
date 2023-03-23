package homework;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShapeCalculatorTest {
    ShapeCalculator shapeCalculator;
    @Test

    public static void calculateSumOfArea(){
        double totalArea=ShapeCalculator.sumArea(28.27,30);
        double expectedArea=58.269999999999996;
        assertEquals(totalArea,expectedArea);

    }


}
