package com.thinkful.inventory;

public class Main {
    public static void main(String[] args) {
        Product physicalTheoryComputation = new PhysicalProduct("Elements of the Theory of Computation (2nd Edition)", "A formal study of the mathematics that underly algorithmic design and analysis", 149.71);
        Product digitalTheoryComputation = new DigitalBook("Elements of the Theory of Computation (2nd Edition)", "A formal study of the mathematics that underly algorithmic design and analysis", 149.71, 24.3, "https://www.amazon.com/Elements-Theory-Computation-Harry-Lewis/");

        System.out.printf("Price of physical book: $%.2f\n", physicalTheoryComputation.getFinalPrice());
        System.out.printf("Price of digital book: $%.2f\n", digitalTheoryComputation.getFinalPrice());

    }
}
