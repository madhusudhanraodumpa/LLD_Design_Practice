package strategy.googleMap;

public class FindPathCalculatorFactory {

    public static PathCalculator getPathCalculator(PathMode pathMode){
        if(pathMode == PathMode.CAR) {
            return new CarPathCalculator();
        } else if (pathMode == PathMode.BIKE) {
            return new BikePathCalculator();
        } else {
            return new WalkPathCalculator();
        }

    }
}
