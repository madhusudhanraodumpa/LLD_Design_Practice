package strategy.googleMap;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Bike path from "+source+" to "+destination);
    }
}
