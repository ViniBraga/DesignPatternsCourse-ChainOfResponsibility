public class DiscountTest {

    public static void main(String[] args) {
        DiscountCalculator discounts = new DiscountCalculator();

        Budget budget = new Budget(600.0);
        budget.addItem(new Item("PEN", 250.0));
        budget.addItem(new Item("PENCIL", 250.0));

        double finalDiscount = discounts.doCalculate(budget);
        System.out.println(finalDiscount);
    }

}