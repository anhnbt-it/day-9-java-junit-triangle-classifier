/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/15/2020
 * Time: 3:38 PM
 */
public class TriangleClassifier {

    public static TriangleType classify(int sideA, int sideB, int sideC) {
        if ((sideA > sideB + sideC) || (sideB > sideA + sideC) || (sideC > sideA + sideB)) {
            return TriangleType.NOT_A_TRIANGLE;
        } else if (sideA == sideB && sideB == sideC) { // 3 canh bang nhau
            return TriangleType.EQUILATERAL; // tam giac deu
        } else if (sideA == sideB) { //  2 canh bang nhau
            return TriangleType.ISOSCELES; // tam giac can
        } else {
            return TriangleType.SCALENE;
        }
    }
}
