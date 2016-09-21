import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jfabiano on 9/21/2016.
 */
public class CodingBatMethodsTest {
    CodingBatMethods myCodingBatMethods;

    @Before
    public void setUp() throws Exception {
        myCodingBatMethods = new CodingBatMethods();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void closeFar() throws Exception {

        boolean response = myCodingBatMethods.closeFar(1, 2, 10);
        assertEquals(true, response);
    }
    @Test
    public void closeFarTwo() throws Exception {

        boolean response = myCodingBatMethods.closeFar(1, 2, 3);
        assertEquals(false, response);
    }
    @Test
    public void closeFarThree() throws Exception {

        boolean response = myCodingBatMethods.closeFar(4, 1, 3);
        assertEquals(true, response);
    }
    @Test
    public void closeFarFour() throws Exception {

        boolean response = myCodingBatMethods.closeFar(-4, -2, -3);
        assertEquals(false, response);
    }
    @Test
    public void closeFarFive() throws Exception {

        boolean response = myCodingBatMethods.closeFar(0, -20, -20);
        assertEquals(false, response);
    }
    @Test
    public void closeFarSix() throws Exception {

        boolean response = myCodingBatMethods.closeFar(0, -1, 1);
        assertEquals(false, response);
    }
    @Test
    public void closeFarSeven() throws Exception {

        boolean response = myCodingBatMethods.closeFar(0, 0, 0);
        assertEquals(false, response);
    }
    @Test
    public void closeFarEight() throws Exception {

        boolean response = myCodingBatMethods.closeFar(100, -200, -3000);
        assertEquals(false, response);
    }
    @Test
    public void luckySum() throws Exception {

        int response = myCodingBatMethods.luckySum(1, 2, 3);
        assertEquals(6, response);
    }
    @Test
    public void luckySumTwo() throws Exception {

        int response = myCodingBatMethods.luckySum(1, 2, 13);
        assertEquals(3, response);
    }
    @Test
    public void luckySumThree() throws Exception {

        int response = myCodingBatMethods.luckySum(1, 13, 3);
        assertEquals(1, response);
    }
    @Test
    public void luckySumFour() throws Exception {

        int response = myCodingBatMethods.luckySum(13, -200, -3000);
        assertEquals(0, response);
    }
    @Test
    public void luckySumFive() throws Exception {

        int response = myCodingBatMethods.luckySum(13, 34, 13);
        assertEquals(0, response);
    }
    @Test
    public void luckySumSix() throws Exception {

        int response = myCodingBatMethods.luckySum(13, 13, 0);
        assertEquals(0, response);
    }
    @Test
    public void luckySumSeven() throws Exception {

        int response = myCodingBatMethods.luckySum(13, 13, 13);
        assertEquals(0, response);
    }
    @Test
    public void luckySumEight() throws Exception {

        int response = myCodingBatMethods.luckySum(-20, 13, 13);
        assertEquals(-20, response);
    }
//    @Test
//    public void testSimpleReverse() throws Exception {
//        String sample = "sample";
//        String reversed = stringExercise.reserveString(sample);
//        assertEquals("elpmas", reversed);
//    }
}