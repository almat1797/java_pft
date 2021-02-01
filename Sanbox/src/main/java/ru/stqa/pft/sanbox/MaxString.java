package ru.stqa.pft.sanbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class MaxString {
  private static ArrayList<String> strings;

  public static void main(String[] args) throws Exception {
    List<String> strings = new ArrayList<String>();
    System.out.println("Введите 5 значении строк: ");
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i <5 ; i++) {
      String str=reader.readLine();
      strings.add(str);
    }
    int max = strings.get(0).length();
    for (int i = 0; i < 5; i++) {
      if (strings.get(i).length() >= max) {
        max = strings.get(i).length();
      }
    }

    for (int i = 0; i < 5; i++) {
      if (strings.get(i).length() == max)
        System.out.println("Самая длина строка в списке: " + strings.get(i));

    }
  }
}
