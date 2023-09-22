package strategy.googleMap;

public class CarPathCalculator implements PathCalculator {

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Car path from "+source+" to "+destination);
    }
}
