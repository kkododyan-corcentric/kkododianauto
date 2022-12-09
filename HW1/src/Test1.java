public class Test1 {
    public static void main(String[] args) {
    ProductOrder productOrder = new ProductOrder("Order 1");
    productOrder.addItem("Snikers", 3);
    productOrder.addItem("Bounty", 3);
    System.out.println(productOrder.getOrder());
    }
}