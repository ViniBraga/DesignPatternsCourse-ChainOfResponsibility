public class NoDiscount implements Discount{

    public double doDiscount(Budget budget) {
        return 0;
    }

    public void setNextDiscount(Discount nextDiscount) {
    }

}