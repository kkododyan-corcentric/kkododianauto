public class ServiceOrder extends Order{
    public ServiceOrder(String name) {
        super(name);
    }
    String serviceType;

    @Override
    public String getOrder() {
        return name+" "+serviceType+" "+price+" "+date;
    }
}
