package strategy.googleMap;

public class Client {
    public static void main(String[] args) {
        PathCalculator pathCalculator = FindPathCalculatorFactory.getPathCalculator(PathMode.WALK);
        pathCalculator.findPath("Hyd","Banglore");
    }
}
