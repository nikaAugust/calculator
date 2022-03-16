package homework;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // BinaryOperator<Integer> devide = (x, y) -> x / y;             изначальный код с ошибкой "деление на 0"

    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? y : x / y;   //с исправлением ошибки

    /*
   либо:

    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? dev(x, y) : x / y;

    private static Integer dev(Integer x, Integer y) {
        if(y == 0) {
            return 0;
        }
        return x;
    }
    */

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
