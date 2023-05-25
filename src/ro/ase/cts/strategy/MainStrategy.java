package ro.ase.cts.strategy;

public class MainStrategy {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.setOperation(new SumOperation());
        try{
            Double result = calculator.calculate(4, 6, 8);
            System.out.println(result);
        } catch (StrategyNotSetException e) {
            throw new RuntimeException(e);
        }
    }
}
