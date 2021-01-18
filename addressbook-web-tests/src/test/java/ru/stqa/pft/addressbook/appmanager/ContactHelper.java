package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{
  public ContactHelper(WebDriver driver) {super(driver);}

  public void initContactCreation() { click(By.linkText("add new"));}

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("email"), contactData.getMail());

    if (creation) {
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
    }


  public void submitContactCreation() {click(By.name("submit"));}

  public void returnToHomePage() {click(By.linkText("home page"));}

  public void initContactModification()  {click(By.xpath("(//img[@alt='Edit'])"));};

  public void submitContactModification() {click(By.name("update"));};
  }

