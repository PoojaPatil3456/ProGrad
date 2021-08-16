import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {
    Arithmetic arithmetic=new Arithmetic();

    //Addition Test Cases
    @Test
    void toGetTheAdditionOfTwoPositiveNumbers(){
        int expectedResult=10;
        int actualResult= arithmetic.add(5,5);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void toGetTheAdditionOfTwoNegativeNumbers(){
        int expectedResult=-10;
        int actualResult= arithmetic.add(-5,-5);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void toGetTheAdditionOfOneNegativeAndOnePositiveNumber(){
        int expectedResult=0;
        int actualResult= arithmetic.add(-5,5);
        assertEquals(expectedResult,actualResult);
    }

    //Substraction Test Cases
    @Test
    void toGetTheSubstractionOfTwoPositiveNumbers(){
        int expectedResult=5;
        int actualResult= arithmetic.substract(10,5);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void toGetTheSubstractionOfTwoNegativeNumbers(){
        int expectedResult=-5;
        int actualResult= arithmetic.substract(-10,-5);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void toGetTheSubstractionOfOneNegativeAndOnePositiveNumber(){
        int expectedResult=-10;
        int actualResult= arithmetic.substract(-5,5);
        assertEquals(expectedResult,actualResult);
    }

    //Multiplication Test Cases
    @Test
    void toGetTheMultiplicationOfTwoPositiveNumbers(){
        int expectedResult=15;
        int actualResult= arithmetic.multiply(3,5);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void toGetTheMultiplicationOfTwoNegativeNumbers(){
        int expectedResult=15;
        int actualResult= arithmetic.multiply(-3,-5);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void toGetTheMultiplicationOfOneNegativeAndOnePositiveNumber(){
        int expectedResult=-15;
        int actualResult= arithmetic.multiply(-3,5);
        assertEquals(expectedResult,actualResult);
    }

    //Division Test Cases
    @Test
    void toGetTheDivisionOfTwoPositiveNumbers(){;
        int expectedResult=5;
        int actualResult= arithmetic.divide(15,3);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void toGetTheDivisionOfTwoNegativeNumbers(){;
        int expectedResult=5;
        int actualResult= arithmetic.divide(-15,-3);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void toGetTheDivisionOfOneNegativeAndOnePositiveNumber(){
        int expectedResult=-3;
        int actualResult= arithmetic.divide(-15,5);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void toDivideTheNumberByZero(){;
        int expectedResult=-1;
        int actualResult= arithmetic.divide(5,0);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void toDivideZeroByOtherIntegerNumber(){;
        int expectedResult=0;
        int actualResult= arithmetic.divide(0,7);
        assertEquals(expectedResult,actualResult);
    }
}

