package com.trzewik.narcissisticNumber;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class VerificationOfNarcissisticNumberTest {

    private VerificationOfNarcissisticNumber verificationOfNarcissisticNumber;
    private int number;
    private boolean verification;

    public VerificationOfNarcissisticNumberTest(int number, boolean verification) {
        this.number = number;
        this.verification = verification;
    }

    @Parameterized.Parameters(name = "number: {0} = verification: {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, true}, {1, true}, {2, true}, {-20, false}, {153, true}, {203, false}, {1741725, true}, {95274, false},
                {9926315, true}, {407, true}, {1634, true}, {146511208, true}, {146511211, false}
        });
    }

    @Before
    public void initialize() {
        verificationOfNarcissisticNumber = new VerificationOfNarcissisticNumber();
    }

    @Test
    public void validationOfNarcissisticNumber() {
        assertEquals(verification, verificationOfNarcissisticNumber.checkIfNarcissisticNumber(number));
    }
}