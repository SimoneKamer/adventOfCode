package demo.day3;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FindValidTrianglesTest {

    TriangleCounter calculator = new TriangleCounter();

    @Test
    public void itShouldCheckIfSumOfSidesIsGreaterThanThirdSide() throws Exception {
        Triangle triangle = new Triangle(10, 15, 11);

        assertThat(triangle.isPossible(), is(true));
    }

    @Test
    public void itShouldTellWhenTriangleIsImpossible() throws Exception {
        Triangle triangle = new Triangle(1,2,5);
        assertThat(triangle.isPossible(),is(false));
    }

    @Test
    public void itShouldTellExampleTriangleIsImpossible() throws Exception {
        Triangle triangle = new Triangle(5,10,25);
        assertThat(triangle.isPossible(),is(false));
    }

    @Test
    public void findValidTriangles() throws Exception {
        assertThat(calculator.countValidTriangles("10 15    11"),is(1));
    }
}
