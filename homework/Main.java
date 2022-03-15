package homework;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}
   /*
   Код не работает, потому что возникает арифметическая ошибка, которая заключается в том, что на 0 делить нельзя.
   Исправить ошибку можно, если заменить:
     BinaryOperator<Integer> devide = (x, y) -> x / y;
   на:
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? y : x / y;
   либо:
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? dev(x, y) : x / y;

    private static Integer dev(Integer x, Integer y) {
        if(y == 0) {
            return 0;
        }
        return x;
    }

    В обоих случаях при деление на 0 в консоли будет выводиться 0, а исключение ArithmeticException не будет выскакивать.
    */