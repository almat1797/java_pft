package ru.stqa.pft.sanbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Massiv {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите значение 8 элементов массива из 10 чисел!");
    int[] array = new int[10];
    array[8] = 9; // четвертому элементу присвоено значение 9
    array[9] = 10; // шестому элементу присвоено значение 10
    for (int i = 0; i < 8; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }
    System.out.println("Вы ввели следующий массив: ");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    System.out.println("Массив в обратном порядке: ");
      for(int i = 9;i>=0;i--)
        System.out.println(array[i]);
  }
  }
