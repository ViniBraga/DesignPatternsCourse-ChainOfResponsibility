public class DiscountByFiveItems implements Discount{

    private Discount nextDiscount;

    public double doDiscount(Budget budget) {
        if(budget.getItems().size() > 5){
            return budget.getValue() * .1;
        }
        return nextDiscount.doDiscount(budget);
    }

    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }


}