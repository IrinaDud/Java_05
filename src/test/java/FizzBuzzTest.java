import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {                  //тестируем в TestNG. Но обычно тестируют unit test в JUnit

    //1. Positive tasting Happy path          копируем из алгоритма
    // if (start <= end)
    // return array;

    //1_1 start < end;
    @Test                                    // с  @Test начинаем  и сразу подтягивается аннотация biblioteca TestNG
    public void testStartLessThenEnd_HappyPath() {
        // AAA
        // arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        // act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    // start == end

    @Test                                    // с  @Test начинаем  и сразу подтягивается аннотация biblioteca TestNG
    public void testStartEqualsEnd_HappyPath() {
        // AAA
        // arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        // act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }



                                      // в результат нужно переписать массив сзада наперед
    @Test                                    // с  @Test начинаем  и сразу подтягивается аннотация biblioteca TestNG
    public void testStartLessThenEndAreNegative_HappyPath() {
        // AAA
        // arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11",
                "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};

        // act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 2. Negative testing
    // if (start > end)
    // return new String[0];
    @Test                                    // с  @Test начинаем  и сразу подтягивается аннотация biblioteca TestNG
    public void testStartGraterThenEnd_Negative() {
        // AAA
        // arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        // act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


}
