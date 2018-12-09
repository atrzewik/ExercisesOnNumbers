package com.trzewik.perfectNumber;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class VerificationOfPerfectNumberTest {

    private VerificationOfPerfectNumber verificationOfPerfectNumber;
    private int number;
    private boolean verification;


    public VerificationOfPerfectNumberTest(int number, boolean verification) {
        this.number = number;
        this.verification = verification;
    }

    @Parameterized.Parameters(name = "number: {0} = verification: {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{6, true}, {8, false}, {28, true}, {55, false}, {8128, true}, {5000, false},
                {0, false}, {1, false}, {-1, false}, {2, false}, {3, false}, {4, false}, {-6, false}, {-2, false}
        });
    }

    @Before
    public void initialize() {
        verificationOfPerfectNumber = new VerificationOfPerfectNumber();
    }

    @Test
    public void checkIfPerfectNumber() {
        assertEquals(verification, verificationOfPerfectNumber.checkIfPerfectNumber(number));
    }
}