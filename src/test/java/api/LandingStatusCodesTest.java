package api;

import baseClases.StatusCodesCheckingUTP;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class LandingStatusCodesTest {
    private final StatusCodesCheckingUTP statusCodesCheckingUTP = new StatusCodesCheckingUTP();

    @Before
    public void before(){

    }

    @Test
    public void statusCodesChecking() throws IOException {
        statusCodesCheckingUTP.getStatus();
        int actual = 0;
        int expected = statusCodesCheckingUTP.fails;
        assertEquals(actual, expected);
    }

    @After
    public void after(){
       //after
    }
}
