package Module03OOAD.designPatterns.BehavioralDPBatch1.StrategyMethodDP.demo.src.main.java.com.example;

public class CardPaymentConcreteStrategy implements PaymentStrategy {
    public void process(double price) {
        System.out.println("payment processing using card");
    }
}



