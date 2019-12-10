package com.app.android.lib;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

public class GenericLibrary {
	
	/*
	 * @Author:Srinidhi R.V
	 * 
	 * Description: To read the basic environment settings data from
	 * based on Property file value
	 */
	
	public static String getProprtyValue(String sFile, String sKey) {
		Properties prop = new Properties();
		String sValue = null;
		try {
			InputStream input = new FileInputStream(sFile);
			prop.load(input);
			sValue = prop.getProperty(sKey);

		}catch(Exception e)
		{
			
		}
		return sValue;
	}
	
	
	
	/*
	 * @Author:Srinidhi R.V
	 * 
	 * Description:To execute adb commands and store the result in an array list
	 */
	
	public static void executeBatchCommmand(String command) {
		
		try {
			String line;
			ArrayList<String> deviceUDID = new ArrayList<String>();
			Process p = Runtime.getRuntime().exec(command);

			BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((line = bri.readLine()) != null) {
				deviceUDID.add(line);
			}
			System.out.println(deviceUDID);
			bri.close();
			
		} catch (Exception err) {
			err.printStackTrace();
		}
	}

}
