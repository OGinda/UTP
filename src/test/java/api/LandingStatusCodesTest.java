package api;

import baseClases.StatusCodesCheckingUTP;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class LandingStatusCodesTest {
    private final StatusCodesCheckingUTP statusCodesCheckingUTP = new StatusCodesCheckingUTP();

    @Before
    public void before() {

    }

    @Test
    public void statusCodesChecking() throws IOException {
        statusCodesCheckingUTP.getStatus();
        int actual = 0;
        int expected = statusCodesCheckingUTP.fails;
        assertEquals(actual, expected);
    }

    @Test
    public void t1() {

    }

    @After
    public void after() {
        //after
    }
}
