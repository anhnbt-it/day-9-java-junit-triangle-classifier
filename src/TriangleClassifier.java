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
        }
        return TriangleType.EQUILATERAL;
    }
}
