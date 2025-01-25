package dev.lpa;

public class Main {

    public static void main(String[] args) {

        Contact bob = new Contact("Bob", "3145566789");
        Contact alice = Contact.createContact("Alice", "31455667781");
        Contact tom = Contact.createContact("Tom", "3335566123");

        MobilePhone myPhone = new MobilePhone("33344557891");
        myPhone.addNewContact(bob);
        myPhone.addNewContact(alice);
        myPhone.addNewContact(tom);

        myPhone.printContacts();
    }
}
