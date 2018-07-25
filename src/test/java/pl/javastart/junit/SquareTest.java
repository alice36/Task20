package pl.javastart.junit;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static pl.javastart.junit.Square.sumOfSquare;

public class SquareTest {

    @Test
    public void TestSquare10(){

        int upTo=10; //given
        int sum = sumOfSquare(upTo); //when
        Assert.assertThat(sum, CoreMatchers.is(2640)); //then

    }

    @Test
    public void TestSquare100(){

        int upTo=100;//given
        int sum = sumOfSquare(upTo);//when
        Assert.assertThat(sum, CoreMatchers.is(25164150));//then

    }
    @Test
    public void TestSquare0(){

        int upTo=0;//given
        int sum = sumOfSquare(upTo);//when
        Assert.assertThat(sum, CoreMatchers.is(0));//then

    }

}