package ru.stqa.pft.sanbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Lists {
  public static void main(String[] agrs) throws IOException {
    List<String> list = new ArrayList<String>();
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите 5 значении строк: ");
    for (int i=0; i<5; i++) {
      String str = reader.readLine();
      list.add(str);
    }
    System.out.println("Ваш список из 5 значении выглядит так: ");
    for (String l: list){
      System.out.println(l);
    }

  }
}
