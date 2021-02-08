package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class PhoneDir {
     private HashMap <String, ArrayList <String> > phoneBook = new HashMap<>();

     public void add(String name, String number) {
          ArrayList<String> telList = phoneBook.get(name);
          if (telList == null) telList = new ArrayList<>();
          telList.add(number);
          phoneBook.put(name, telList);
     }

     public ArrayList <String> get(String name) {
          return phoneBook.get(name);
     }

     public void info() {
          System.out.println(phoneBook);
     }
}
