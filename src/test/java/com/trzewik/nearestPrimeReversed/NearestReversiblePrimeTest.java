package com.trzewik.nearestPrimeReversed;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NearestReversiblePrimeTest {

    private NearestReversiblePrime nearestReversiblePrime;
    private int number;
    private int nearestReversedPrime;

    public NearestReversiblePrimeTest(int number, int nearestReversedPrime) {
        this.number = number;
        this.nearestReversedPrime = nearestReversedPrime;
    }

    @Parameterized.Parameters(name = "number: {0} = nearestReversedPrime {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{-10, 2}, {10, 11}, {32, 37}, {0, 2},{1,2}, {20000, 30011}
        });
    }

    @Before
    public void initialize(){
        nearestReversiblePrime = new NearestReversiblePrime();
    }

    @Test
    public void findClosestReversiblePrime() {
        Assert.assertEquals(nearestReversedPrime, nearestReversiblePrime.findNearestReversiblePrime(number));
    }
}