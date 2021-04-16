package jUNITp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TEST2ADDSTRINGS {

	@Test
	public void test() {
		JUNITFUNCTION jstr= new JUNITFUNCTION();
        String result= jstr.addstring("abc", "cda");
        assertEquals("abccda", result);	}

}
