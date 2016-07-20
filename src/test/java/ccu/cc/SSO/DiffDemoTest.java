package ccu.cc.SSO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DiffDemoTest {

	DiffDemo diffDemo;
	@Before
	public void setUp() throws Exception {
		diffDemo = new DiffDemo();
	}

	@Test
	public void testGetDiff() {
		
		String str1 = "abcdef";
		String str2 = "abcdxy";
		
		String expected = "xy";
		try {
			String diffResult = diffDemo.getDiff(str1, str2);
			assertEquals(expected, diffResult);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		//fail("Not yet implemented");
	}

}
