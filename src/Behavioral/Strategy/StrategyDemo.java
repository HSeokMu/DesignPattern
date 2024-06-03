package Behavioral.Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        System.out.println(new Context(new OperationAdd()).execute(10, 30));
        System.out.println(new Context(new OperationSubtract()).execute(40, 10, 20, 30));
    }
}
