public class ServiceOrder extends Order{
    public ServiceOrder(String name, String serviceType) {
        super(name);
        this.serviceType = serviceType;
    }
    String serviceType;

    @Override
    public String getOrder() {
        return name+" "+serviceType+" "+price+" "+date;
    }
}
