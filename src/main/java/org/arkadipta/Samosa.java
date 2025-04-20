package org.arkadipta;

public class Samosa {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Samosa() {
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
}
