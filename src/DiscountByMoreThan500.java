public class DiscountByMoreThan500 implements Discount{

    private Discount nextDiscount;

    public double doDiscount(Budget budget) {
        if(budget.getValue() > 500){
            return budget.getValue() * .07;
        }
        return nextDiscount.doDiscount(budget);
    }

    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }




}