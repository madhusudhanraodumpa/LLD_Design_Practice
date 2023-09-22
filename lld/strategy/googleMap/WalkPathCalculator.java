package strategy.googleMap;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Walk path from "+source+" to "+destination);
    }
}
