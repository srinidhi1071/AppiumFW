package com.app.androidapp.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.androidapp.pages.LandingPage;
import com.app.androidapp.util.MobileActionUtil;

public class TC_002_TestScript2 extends BaseLib{
	
	@Test
	public void tc_002_testTwo() throws IOException, InterruptedException
	{
		LandingPage lp = new LandingPage(gv.driver);
		
		lp.tapOnViewsMenu();
		
	}

}
