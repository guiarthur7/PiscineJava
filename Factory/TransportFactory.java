public class TransportFactory {

    public int getTransport(String type) {
        DriverFactory driverFactory = new DriverFactory();

        Driver driver = driverFactory.getDriver(type);

        Transport transport = driver.createTransport();

        return transport.getDistance();
    }
}