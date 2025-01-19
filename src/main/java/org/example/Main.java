package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 秋涩
 * @create 2024-06-13 23:23
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String>list;
        String s1="test";
        list= Arrays.asList(s1);
        System.out.println(list.toString());

        List<String>recipientsList=new ArrayList<>();
        recipientsList.add("1");
        recipientsList.add("2");
        String[] array = recipientsList.toArray(new String[0]);
        System.out.println(array.toString());
    }
}