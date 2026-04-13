public class CarDriver extends Driver {
    @Override
    public Transport createTransport() {
        TransportFactory tf = new TransportFactory();
        return new Car();
    }
}