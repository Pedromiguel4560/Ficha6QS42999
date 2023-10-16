import org.example.Area_Perimeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Area_PerimeterTest {

    @Test
    public void testAreaPerimeter(){
        Area_Perimeter  areaRetangle = new Area_Perimeter();
        Area_Perimeter perimeterRectangle = new Area_Perimeter();

        int area = areaRetangle.area(3,5);
        int areaTest = 15;
        int perimetro = perimeterRectangle.perimeter(3, 5);
        int perimetroTest = 8;
        assertEquals (area, areaTest, "Error calculating rectangle's area!!");
        assertEquals(perimetro, perimetroTest, "Error calculating rectangle's perimeter!!");

        int area2 = areaRetangle.area(5,8);
        int areaTest2 = 40;
        int perimetro2 = perimeterRectangle.perimeter(5,8);
        int perimeterTest2 = 13;
        assertEquals(area2, areaTest2, "Error calculating resctangle's area!!");
        assertEquals(perimetro2, perimeterTest2,"Error calculating rectangle's perimeter!!");

        int area3 = areaRetangle.area(2, 4);
        int areaTest3 = 8;
        int perimeter3 = perimeterRectangle.perimeter(2, 4);
        int perimeterTest3 = 6;
        assertEquals(area3 , areaTest3, "Error calculating resctangle's area!!");
        assertEquals(perimeter3, perimeterTest3, "Error calculating rectangle's perimeter!!");

    }


}
