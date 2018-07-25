package pl.javastart.junit;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static pl.javastart.junit.Fibonacci.fibonacci;

public class FibonacciTest {

    @Test
    public void TestFibo10(){

        int upTo=10;//given
        int sum = fibonacci(upTo);//when
        Assert.assertThat(sum, CoreMatchers.is(10));//then

    }

    @Test
    public void TestFibo4M(){

        int upTo=4_000_000;//given
        int sum = fibonacci(upTo);//when
        Assert.assertThat(sum, CoreMatchers.is(1089154));//then

    }

    @Test
    public void TestFibo0(){

        int upTo=0;//given
        int sum = fibonacci(upTo);//when
        Assert.assertThat(sum, CoreMatchers.is(0));//then

    }

}