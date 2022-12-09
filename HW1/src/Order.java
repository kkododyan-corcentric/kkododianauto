
public abstract class Order {
    protected Number price;
    protected String name;
    protected String[] items = new String[10];
    protected String date;
    protected int i = 0;

    public String getOrder() {
        return name + " " + price + " " + date;
    }

    public void addItem(String item, Number itemPrice) {
        price = itemPrice;
        if(i<=items.length) {
            items[i] = item;
            i++;
        }
        else System.out.println("No more space for items");
    }
}

