package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        example1();
        PhoneDir phoneBook = new PhoneDir();

        phoneBook.add("vasin", "111111111");
        phoneBook.add("ivanov", "222222222");
        phoneBook.add("sidorov", "333333333");
        phoneBook.add("musin", "4444444");
        phoneBook.add("vasin", "55555555");

        phoneBook.info();

        System.out.println(" У vasin номера: " + phoneBook.get("vasin"));








    }


    private static void example1() {
        //создаем лист со словами
        ArrayList<String> al = new ArrayList<>();
        al.add("green");
        al.add("teen");
        al.add("swim");
        al.add("red");
        al.add("notebook");
        al.add("green");
        al.add("teen");
        al.add("table");
        al.add("chair");
        al.add("teen");
        al.add("swim");
        //передаем слова из листа в сет, для отсеивания повторов
        HashSet<String> hashSet = new HashSet<>(al);
        System.out.println(hashSet);
        //передаем слова в мап для поиска количества
        System.out.println();

        HashMap<String, Integer> map = new HashMap<>();
        Integer item;
        for (String i : al){
            item = map.get(i);
            map.put(i, item == null ? 1 : item +1);
        }
        System.out.println("Слова и их количество в массиве \n"+map);
    }
}