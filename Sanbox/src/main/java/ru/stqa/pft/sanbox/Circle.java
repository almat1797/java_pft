package ru.stqa.pft.sanbox;

public class Circle {
  public double r;

  public Circle(double r) {
    this.r = r;

  }
  public double area() {

        return Math.PI * Math.pow(this.r, 2);
  }
}
