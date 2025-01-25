package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
       if(queryContact(contact.getName()) != null) {
           return false;
       }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactIndex = findContact(oldContact);
        if(contactIndex >= 0) {
            myContacts.set(contactIndex, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = findContact(contact);
        if(contactIndex >= 0) {
            myContacts.remove(contactIndex);
            return true;
        }
        return false;
    }

    public void printContacts() {
        System.out.println("Contact list:");
        for(int i=0; i< myContacts.size(); i++) {
            System.out.printf("""
                    %d. %s -> %s%n""", i + 1, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }

    public Contact queryContact(String contactName) {
        int contactIndex = findContact(contactName);
        if(contactIndex >= 0) {
            return myContacts.get(contactIndex);
        }
        return null;
    }

    private int findContact(Contact contact) {
        for(int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName().equalsIgnoreCase(contact.getName())){
                return i;
            }
        }
        return -1;
    }

    private int findContact(String contactName) {
        for(int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName().equalsIgnoreCase(contactName)){
                return i;
            }
        }
        return -1;
    }

}
