package com.thinkful.inventory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product physicalTheoryComputation = new PhysicalProduct("Elements of the Theory of Computation (2nd Edition)", "A formal study of the mathematics that underly algorithmic design and analysis", 149.71);
        Product digitalTheoryComputation = new DigitalBook("Elements of the Theory of Computation (2nd Edition)", "A formal study of the mathematics that underly algorithmic design and analysis", 149.71, 24.3, "https://www.amazon.com/Elements-Theory-Computation-Harry-Lewis/");
        Product dog = new PhysicalProduct("Rover", "A good boy", 200);

        LoanItem artProgramming = new DigitalBook("The Art of Computer Programming", "The definitive word on algorithms", 169);

        List<Product> allProducts = new ArrayList<>();
        List<LoanItem> loanItems = new ArrayList<>();

        allProducts.add(digitalTheoryComputation);
        allProducts.add((Product)artProgramming);

        loanItems.add((LoanItem)digitalTheoryComputation);
        loanItems.add(artProgramming);

    }
}
