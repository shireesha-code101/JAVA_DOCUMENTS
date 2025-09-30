package Module03OOAD.designPatterns.BehavioralDPBatch1.StrategyMethodDP.demo.src.main.java.com.example;

public class PaymentUsingStrategy {
    private PaymentStrategy paymentStrategy;

    public PaymentUsingStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void process(double price) {
        paymentStrategy.process(price);
    }
}
