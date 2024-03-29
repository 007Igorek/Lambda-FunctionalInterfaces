public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b); // Деление на ноль. Чтобы избежать этой ошибки можно возвращать ноль

        calc.println.accept(c);
    }
}
