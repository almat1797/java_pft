package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String address;
  private final String mail;

  public ContactData(String firstname, String lastname, String address, String mail) {
    this.firstname=firstname;
    this.lastname=lastname;
    this.address=address;
    this.mail=mail;

  }
  public String getFirstname() {return firstname;}

  public String getLastname() {return lastname;}
  public String getAddress() {return address;}
  public String getMail() {return mail;}
}
