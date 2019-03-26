package tests;

import org.junit.*;
import ak.utils.*;

public class StrUtilsTest extends junit.framework.TestCase {

    public void testOkay() {
	String greeting = StrUtils.getGreetings();
	assertTrue(greeting.length() > 0);
    }
}
