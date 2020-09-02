package utility;

import org.openqa.selenium.Platform;


public class Constant {
	
	public static final String URL ="http://dev.bossintegration.com:443/";
	public static final String USERNAME = System.getenv("BROWSERSTACK_USERNAME");;
	public static final String AUTOMATE_KEY =System.getenv("BROWSERSTACK_ACCESS_KEY");
	
	
	public static final Object[][] quickset = {
			  {Platform.MAC, "chrome", "1280x1024" },
			  {Platform.WINDOWS, "firefox", "1920x1080" }};
    

    public static final Object[][] fullset= {
    		  {Platform.MAC, "Safari","1280x1024"},
			  {Platform.MAC, "Safari","1920x1080"},
			  {Platform.MAC, "Edge","1280x1024"},
			  {Platform.MAC, "Edge","1920x1080"},
			  {Platform.MAC, "chrome", "1280x1024"},
			  {Platform.MAC, "chrome","1920x1080"},
			  {Platform.MAC, "Firefox","1280x1024"},
			  {Platform.MAC, "Firefox","1920x1080"},
			  {Platform.WINDOWS, "Edge","1280x1024"},
			  {Platform.WINDOWS, "Edge","1920x1080"},
			  {Platform.WINDOWS, "Chrome","1280x1024"},
			  {Platform.WINDOWS, "Chrome","1920x1080"},
			  {Platform.WINDOWS, "Firefox","1280x1024"},
			  {Platform.WINDOWS, "Firefox","1920x1080"},
			  {Platform.WINDOWS, "IE","1920x1080"},
			  {Platform.WINDOWS, "IE","1280x1024"},
			  {Platform.LINUX, "FireFox","1280x1024"},
			  {Platform.LINUX, "FireFox","1920x1080"}};
    }
