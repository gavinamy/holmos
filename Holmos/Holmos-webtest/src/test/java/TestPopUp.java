import holmos.webtest.EngineType;
import holmos.webtest.basetools.HolmosWindow;
import pagestore.AlertPage;


public class TestPopUp {
	AlertPage alertPage=new AlertPage();
	public void testAlert(){
		HolmosWindow.openNewWindow(EngineType.WebDriverChrome,"http://www.w3school.com.cn/tiy/t.asp?f=hdom_alert");
		alertPage.alertFrame.select();
		alertPage.alertFrame.alsertBtn.click();
		HolmosWindow.dealAlert();
		HolmosWindow.closeAllWindows();
	}
}
