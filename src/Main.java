import transport.*;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle("Школьник");
        Car car=new Car("БМВ");
        Truck truck=new Truck("Вольво",8);
        Transport[] transports=new Transport[]{bicycle,car,truck};
        ServiceStation serviceStation=new ServiceStation();
        serviceStation.check (transports[2]);
        serviceStation.check (transports);
    }
}