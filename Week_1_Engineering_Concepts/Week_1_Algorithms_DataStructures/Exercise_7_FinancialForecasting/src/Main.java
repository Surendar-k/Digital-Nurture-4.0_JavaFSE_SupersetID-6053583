
import forecast.Forecaster;

public class Main {
    public static void main(String[] args) {
        double presentValue = 10000.0;
        double rate = 0.08; 
        int years = 5;

        System.out.println("Predicting future value recursively...");
        double futureVal = Forecaster.futureValue(presentValue, rate, years);
        System.out.printf("Future Value (Recursion) after %d years: ₹%.2f%n", years, futureVal);

        System.out.println(" Using memoization (optimized)...");
        Double[] memo = new Double[years + 1];
        double futureValMemo = Forecaster.futureValueMemo(presentValue, rate, years, memo);
        System.out.printf("Future Value (Memoized) after %d years: ₹%.2f%n", years, futureValMemo);
    }
}
