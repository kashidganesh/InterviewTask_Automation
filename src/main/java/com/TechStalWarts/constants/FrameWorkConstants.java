package com.TechStalWarts.constants;

public class FrameWorkConstants {

	
	private FrameWorkConstants() {
		
	}
	
	private static final String RESOURCEPATH=System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH=FrameWorkConstants.getResourcepath()+"/executables/chromedriver.exe";
	private static final String CONFIGFILEPATH=FrameWorkConstants.getResourcepath()+"/config/config.properties";
	private static final String EXCELAPTH=FrameWorkConstants.getResourcepath()+"/excel/DataSheet.xlsx";
	private static final String RUNMNAGERSHEET="RUNMANAGER";
	private static final String ITERATIONSHEET="Data";
	
	
	
	
	public static String getRunManagerSheet() {
		return RUNMNAGERSHEET;
	}
	public static String getIterationsheet() {
		return ITERATIONSHEET;
	}

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	public static String getExcelFilePath() {
		return EXCELAPTH;
	}

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

	public static String getResourcepath() {
		return RESOURCEPATH;
	}
	
}
