import java.time.LocalDate;

public abstract class Order {
    public Order(String name) {
        this.name = name;
        this.date = today.toString();
    }

    protected int price;
    protected String name;
    protected String date;
    protected String[] items = new String[10];
    LocalDate today = LocalDate.now();

    protected int i = 0;

    public String getOrder() {
        return name + " " + price + " " + date;
    }

    public void addItem(String item, int itemPrice) {
        this.price = this.price + itemPrice;
        if (i <= items.length) {
            items[i] = item;
            i++;
        } else System.out.println("No more space for items");
    }
}

