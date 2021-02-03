package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

@Test
  public void testContactCreation(){
    app.goTo().gotoHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("test_name2", "test_username2", "nur-sultan", "test2@mail.ru", "Check1"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();


}
}

//
//
//

