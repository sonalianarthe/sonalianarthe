package org.TestNgEx2;

import org.testng.annotations.Test;
import org.utilities.BaseUtilitise;

public class ParallelMthod {
	@Test
	public void test1() {
		   String url="http://localhost/login.do";
		   BaseUtilitise.bu.startUp(url,"CH");
		  }
	@Test
	public void test2() {
		   String url="http://localhost/login.do";
		   BaseUtilitise.bu.startUp(url,"FF");
		  }
}
