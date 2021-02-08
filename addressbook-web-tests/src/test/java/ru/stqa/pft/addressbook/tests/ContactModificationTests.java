package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{
  @Test
  public void testContactCreation() {
    app.goTo().HomePage();
    if (! app.contact().isThereAContact()){
      ContactData contact = new ContactData().withFirstname("test1").withLastname("LastName").withHomePhone("7777").withMobilePhone("7182").withWorkPhone("1414");

      app.contact().createContact(contact);
    }
    app.contact().initContactModification();
    app.contact().fillContactForm
            (new ContactData().withFirstname("firstname").withLastname("lastname"), true);
//    app.getContactHelper().fillContactForm(new ContactData("test_name2", "test_surname2", "nur-sultan", "test2@mail.ru", null), false);
    app.contact().submitContactModification();
    app.contact().returnToHomePage();
  }
}
