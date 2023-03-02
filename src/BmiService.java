public class BmiService {
    public double calculate(double weight, double tall) {
        double result = weight / Math.pow (tall, 2);
        return result;
    }
}
