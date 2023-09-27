
public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1,1);

        // c не будет рассчитан, т.к. делить на ноль нельзя
        // Для решения можно добавить в фунцию divide блок try/catch для обработки ошибки
        int c = calculator.divide.apply(a, b);

        calculator.printLn.accept(c);
    }
}