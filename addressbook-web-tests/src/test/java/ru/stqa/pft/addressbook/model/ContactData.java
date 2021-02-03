package ru.stqa.pft.addressbook.model;

public class ContactData {
  private int id;
  private String firstname;
  private String lastname;
  private String address;
  private String mail;
  private String group;
  private String home;
  private String mobile;
  private String work;

  public int getId() {
    return id;
  }

  public GroupData withId(int id) {
    this.id = id;
 //   return this;
  }

  public ContactData withFistname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  public ContactData withLastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  public ContactData withAddress(String address) {
    this.address = address;
    return this;
  }

  public ContactData withMail(String mail) {
    this.mail = mail;
    return this;
  }

  public ContactData withGroup(String group) {
    this.group = group;
    return this;
  }

  public ContactData withHome(String home) {
    this.home = home;
    return this;
  }

  public ContactData withMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

//  public ContactData withWork(String work) {
//    this.work = work;
//    return this;
//  }

  public String getWorkPhone() {return work;}

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getMail() {
    return mail;
  }

  public String getGroup() {
    return group;
  }

  public String getHome() {
    return home;
  }

  public String getMobile() {
    return mobile;
  }
//
//  public String getWork() {
//    return work;
//  }
}
