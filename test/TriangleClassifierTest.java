import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/15/2020
 * Time: 3:57 PM
 */
class TriangleClassifierTest {
    @Test
    @DisplayName("Tam giac deu")
    void classifyEquilateral() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;

        TriangleType expected = TriangleType.EQUILATERAL;
        TriangleType actual = TriangleClassifier.classify(sideA, sideB, sideC);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Tam giac can")
    void classifyIsosceles() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;

        TriangleType expected = TriangleType.ISOSCELES;
        TriangleType actual = TriangleClassifier.classify(sideA, sideB, sideC);

        assertEquals(expected, actual);
    }
}