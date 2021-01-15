package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
  WebDriver driver;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void init() {
    if (browser.equals(BrowserType.CHROME)) {
      driver = new ChromeDriver();
    } else if (browser.equals(BrowserType.FIREFOX)) {
      driver = new FirefoxDriver();
    } else if (browser.equals(BrowserType.IE)){
      driver = new InternetExplorerDriver();
    }
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("http://localhost/addressbook/group.php");
    contactHelper = new ContactHelper(driver);
    groupHelper = new GroupHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  public boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }



  public String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {return contactHelper;
  }
}
