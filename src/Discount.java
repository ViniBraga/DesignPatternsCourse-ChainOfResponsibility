public interface Discount {

    double doDiscount(Budget budget);
    void setNextDiscount(Discount nextDiscount);

}