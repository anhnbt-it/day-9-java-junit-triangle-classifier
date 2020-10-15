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
    @DisplayName("Tam giac deu EQUILATERAL")
    void classify2And2And2() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;

        TriangleType expected = TriangleType.EQUILATERAL;
        TriangleType actual = TriangleClassifier.classify(sideA, sideB, sideC);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Tam giac can ISOSCELES")
    void classify2And2And3() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;

        TriangleType expected = TriangleType.ISOSCELES;
        TriangleType actual = TriangleClassifier.classify(sideA, sideB, sideC);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Tam giac thuong SCALENE")
    void classify3And4And5() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;

        TriangleType expected = TriangleType.SCALENE;
        TriangleType actual = TriangleClassifier.classify(sideA, sideB, sideC);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Khong phai tam giac")
    void classify8And2And3() {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;

        TriangleType expected = TriangleType.NOT_A_TRIANGLE;
        TriangleType actual = TriangleClassifier.classify(sideA, sideB, sideC);

        assertEquals(expected, actual);
    }

}