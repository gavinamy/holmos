import holmos.webtest.EngineType;
import holmos.webtest.basetools.HolmosWindow;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestA {
	@Test
	public void test(){
		HolmosWindow.openNewWindow(EngineType.WebDriverChrome,"http://www.yellowpages.com/san-francisco-ca/mip/ego-enterprises-16349614");
		System.out.print("done");
		//HolmosBaseTools.sleep(5000);
		//HolmosWindow.closeAllWindows();
	}
	public void testB(){
		WebDriver   iedriver= new  InternetExplorerDriver();
		iedriver.get("http://202.110.200.130:9082/szyj1205/jsp/dcwork/portal/oaindex.jsp");
		WebElement element=iedriver.findElement(By.name("j_username"));
		WebElement element2=iedriver.findElement(By.name("j_password"));
		element.clear();
		element2.clear();
		element.sendKeys("maolishan");
		element2.sendKeys("1");
		iedriver.findElement(By.id("loginButton")).click();	
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		iedriver.findElement(By.linkText("行政办公")).click();
		//iedriver.switchTo().frame("frame0").findElement(By.xpath("//div[@id='menu']/div[13]/div[2]/a")).click();
		//System.out.println(iedriver.findElement(By.xpath("//div[@id='menu']")).findElements(By.tagName(".//div")).size());
	    
		

		//JavascriptExecutor driver = null;
		//((JavascriptExecutor)driver).executeScript("sysMenuClick(this)()");
	}
	
}
