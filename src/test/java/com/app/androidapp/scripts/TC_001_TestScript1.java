package com.app.androidapp.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.androidapp.pages.LandingPage;
import com.app.androidapp.pages.VookLandingPage;
import com.app.androidapp.util.MobileActionUtil;

public class TC_001_TestScript1 extends BaseLib{
	
	@Test
	public void tc_001_testOne() throws IOException, InterruptedException
	{
	
		VookLandingPage vLp= new VookLandingPage(gv.driver);
		vLp.scrollToMen();
		vLp.tapOnTshirtBtn();
		
	}

}
