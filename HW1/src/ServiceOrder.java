public class ServiceOrder extends Order{
    String serviceType;

    @Override
    public String getOrder() {
        return name+" "+serviceType+" "+price+" "+date;
    }
}
