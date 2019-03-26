package tests;

import org.junit.*;
import ak.utils.*;

public class UtilsTest extends junit.framework.TestCase {

    public void testOkay() {
	int nResult = Utils.abs(1);
	assertEquals(1, nResult);
    }
    
    public void testWillFail() {
	int nResult = Utils.abs(-1);
	assertEquals(1, nResult);
    }
    
}
