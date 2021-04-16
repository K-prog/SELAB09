package jUNITp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TEST2ADDNUMBERS {

	@Test
	public void test() {
		JUNITFUNCTION junit= new JUNITFUNCTION();
        int result= junit.addnumbers(100, 200);
        assertEquals (300,result);
	}

}
