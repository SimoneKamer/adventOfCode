package demo.day3;

public class TriangleCounter {


    public Integer countValidTriangles(Triangle triangle) {
        Integer numberOfValidTriangles = 0;

        if (triangle.isPossible()) {
            numberOfValidTriangles++;
        }
        return numberOfValidTriangles;
    }

    public static void main(String[] args) {

    }
}
