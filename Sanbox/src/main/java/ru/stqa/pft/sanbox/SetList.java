package ru.stqa.pft.sanbox;

import java.util.Arrays;

public class SetList {

  public static void main(String[] args){
    String [] word = new String[3];
    word[0] = "i";
    word[1] = "люблю";
    word[2] = "массивы";

    System.out.println("Мой массив = " + word[0] + " " + word[1] +" "+ word[2]);

    for(String s : word) {
    System.out.print(s + " ");
    }
  }
}