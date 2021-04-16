package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class testAddStrings {
	@Test
	void test() {
		jUnitFunction junitStrings = new jUnitFunction();
		String result = junitStrings.addStrings("Bennett University","sucks");
		assertEquals("Bennett Universitysucks", result);
	}

}
