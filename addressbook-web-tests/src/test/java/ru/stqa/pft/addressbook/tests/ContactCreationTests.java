package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;

public class ContactCreationTests extends TestBase{

@Test(enabled = true)
  public void testContactCreation(){
    app.goTo().HomePage();
    app.contact().initContactCreation();
    File photo = new File("src/test/resources/tele.jpg");
    app.contact().fillContactForm
            (new ContactData()
                    .withFirstname("firstname").withLastname("lastname").withPhoto(photo)
                    .withHomePhone("7777").withMobilePhone("7182").withWorkPhone("1414"), false);
    app.contact().submitContactCreation();
    app.contact().returnToHomePage();
}

}