package api;

import baseClases.StatusCodesCheckingUTP;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

import java.io.IOException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LandingStatusCodesTest {
    private final StatusCodesCheckingUTP statusCodesCheckingUTP = new StatusCodesCheckingUTP();

    @Before
    public void before(){
        System.out.println("The 'Landing Status Codes Tests' run starts");
    }
    @Test
    public void test1_statusCodesChecking() throws IOException {
        statusCodesCheckingUTP.getStatus();
        int actual = 0;
        int expected = statusCodesCheckingUTP.fails;
        assertEquals(actual, expected);
    }

    @After
    public void after(){
      //after method
    }
}
