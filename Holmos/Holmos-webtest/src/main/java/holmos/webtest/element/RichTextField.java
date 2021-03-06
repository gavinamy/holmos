package holmos.webtest.element;

import holmos.webtest.Allocator;
import holmos.webtest.BrowserWindow;
import holmos.webtest.SeleniumBrowserWindow;
import holmos.webtest.WebDriverBrowserWindow;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.thoughtworks.selenium.Selenium;
/**
 * @author 吴银龙(15857164387)
 * */
public class RichTextField extends TextField{

	public RichTextField(String comment) {
		super(comment);
	}
	/**设置富文本框的值,富文本框是类似写日志和记录的时候的文本框<br>
	 * 这种富文本不是RichTextField，是用body模拟的<br>
	 * @param value 要输入的字符窜，对字符没有什么特别限制*/
	public void setBodyText(String value){
		StringBuilder message=new StringBuilder();
		BrowserWindow currentWindow=Allocator.getInstance().currentWindow;
		if(isExist()){
			message.append(this.wholeComment+":");
			if(currentWindow instanceof SeleniumBrowserWindow){
				String js="selenium.browserbot.getCurrentWindow().document.body.innerHTML=\'"+value+"\';";
				((Selenium)currentWindow.getDriver().getEngine()).getEval(js);
			}else if(currentWindow instanceof WebDriverBrowserWindow){
				String js="contentWindow.document.body.innerText=\'"+value+"\';";
				WebDriver driver=(WebDriver) currentWindow.getDriver().getEngine();
				((JavascriptExecutor)driver).executeScript(js);
			}
			message.append("用body模拟的富文本设置成功!");
			logger.info(message);
		}else{
			message.append(this.wholeComment+":");
			message.append("用body模拟的富文本设置失败!找不到元素!");
			logger.error(message);
		}
	}
	/**
	 * 清空富文本框的内容
	 * */
	public void clearBodyText(){
		StringBuilder message=new StringBuilder();
		BrowserWindow currentWindow=Allocator.getInstance().currentWindow;
		if(isExist()){
			message.append(this.wholeComment+":");
			if(currentWindow instanceof SeleniumBrowserWindow){
				String js="selenium.browserbot.getCurrentWindow().document.body.innerHTML=\'\';";
				((Selenium)currentWindow.getDriver().getEngine()).getEval(js);
			}else if(currentWindow instanceof WebDriverBrowserWindow){
				String js="contentWindow.document.body.innerText=\'\';";
				WebDriver driver=(WebDriver) currentWindow.getDriver().getEngine();
				((JavascriptExecutor)driver).executeScript(js);
			}
			message.append("清空富文本框的内容成功!");
			logger.info(message);
		}else{
			message.append(this.wholeComment+":");
			message.append("清空富文本框的内容失败!找不到元素!");
			logger.error(message);
		}
	}
}
