package pl.javastart.junit;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static pl.javastart.junit.Euler.sumThreeFive;

public class EulerTest {

    @Test
    public void TestSumThreeFive10(){

        int upTo=10;//given
        int sum = sumThreeFive(upTo);//when
        Assert.assertThat(sum, CoreMatchers.is(23));//then

    }

    @Test
    public void TestSumThreeFive1000(){

        int upTo=1000;//given
        int sum = sumThreeFive(upTo);//when
        Assert.assertThat(sum, CoreMatchers.is(233168));//then
    }

    @Test
    public void TestSumThreeFive_10(){

        int upTo=-10;//given
        int sum = sumThreeFive(upTo);//when
        Assert.assertThat(sum, CoreMatchers.is(0));//then

    }

}