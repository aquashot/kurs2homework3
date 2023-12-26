package transport;

public class ServiceStation {

    public void check(Transport[] transports){
    for(Transport transport : transports){
        check(transport);

    }
    }
    public void check(Transport transport){
        System.out.println(transport.getModelName());
        transport.check();
    }
}
