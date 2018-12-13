/**
 * Implementing Chain of Responsability
 * 
 */

public class DiscountCalculator {

    public double doCalculate(Budget budget){
        Discount d1 = new DiscountByFiveItems();
        Discount d2 = new DiscountByMoreThan500();
        Discount d3 = new NoDiscount();
        d1.setNextDiscount(d2);
        d2.setNextDiscount(d3);
        return d1.doDiscount(budget);
    }

}