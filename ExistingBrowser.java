import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * This code and the steps to launch chrome browser in explained in the youtube video.
 * https://www.youtube.com/watch?v=L0XM2VhozGI
 * 
 * Prerequisite-Launch chrome in remote debugging mode before running this code.
 * C:\Program Files\Google\Chrome\Application>chrome -remote-debugging-port=9222
 * 
 * Required pom is added in comment section
 * */

/*POM.xml
 * <project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>Test</groupId>
	<artifactId>Test</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.141.59</version>
		</dependency>
	</dependencies>
</project>
 * 
 * */
public class ExistingBrowser {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:9222");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title="+title);
	}
}
