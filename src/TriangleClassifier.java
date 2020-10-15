/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/15/2020
 * Time: 3:38 PM
 */
public class TriangleClassifier {

    public static TriangleType classify(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideA != sideC) {
            return TriangleType.ISOSCELES;
        } else if (sideA == sideB && sideB == sideC) {
            return TriangleType.EQUILATERAL;
        } else if ((sideA + sideB) < sideC ||
                (sideB + sideC) < sideA ||
                (sideA + sideC) < sideB) {
            return TriangleType.NOT_A_TRIANGLE;
        } else {
            return TriangleType.SCALENE;
        }
    }
}
