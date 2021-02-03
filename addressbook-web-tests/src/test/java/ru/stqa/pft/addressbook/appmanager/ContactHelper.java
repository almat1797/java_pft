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

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("(//img[@alt='Edit'])"));
  }

  public void createContact(ContactData contact, boolean b) {
    initContactCreation();
    fillContactForm(new ContactData("test_name2", "test_username2", "nur-sultan", "test2@mail.ru", "Check1"), true);
    submitContactCreation();
    returnToHomePage();
  }

  public ContactData infoFromEditForm(ContactData contact) {
    initContactModificationById(contact.getId());
    String firstname = driver.findElement(By.name("firstname")).getAttribute("value");
    String lastname = driver.findElement(By.name("lastname")).getAttribute("value");
    String home = driver.findElement(By.name("home")).getAttribute("value");
    String mobile = driver.findElement(By.name("mobile")).getAttribute("value");
    String work = driver.findElement(By.name("work")).getAttribute("value");
    driver.navigate().back();
    return  new ContactData().withId()
  }

}

