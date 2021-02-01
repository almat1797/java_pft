package ru.stqa.pft.sanbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MassivOdinOdin {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите значение элементов массива из 20 чисел!");
    int[] array = new int[5];

    for (int i = 0; i < 5; i++) {
      try {
        array[i] = Integer.parseInt(reader.readLine());

      } catch (NumberFormatException ex) {

      }

    }
    System.out.println("Your array is: ");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    Integer max = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }

    }
    System.out.println("max value of array is: " + max);

  }
}