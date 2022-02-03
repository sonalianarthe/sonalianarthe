package org.TestNgEx2;

import org.testng.annotations.Test;
import org.utilities.BaseUtilitise;

public class InvocationCountEx1 {
	@Test(invocationCount=3,threadPoolSize=2)
	public void test1() {
   String url="http://localhost/login.do";
   BaseUtilitise.bu.startUp(url,"CH");
  }
   }
