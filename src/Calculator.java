import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (a, b) -> a + b;
    BinaryOperator<Integer> minus = (a, b) -> a - b;
    BinaryOperator<Integer> multiply = (a, b) -> a * b;
    BinaryOperator<Integer> divide = (a, b) -> {
            try {
                return  a / b;
            } catch (Exception e) {
                throw new ArithmeticException("На ноль делить нельзя");
            }
    };
    UnaryOperator<Integer> pow = a -> a * a;
    UnaryOperator<Integer> abs = a -> a > 0 ? a : -a;
    Predicate<Integer> isPositive = a -> a > 0;
    Consumer<Integer> printLn = System.out::println;
}
