package academy.belhard;

/**
 * Класс Rectangle (Прямоугольник)
 * Наследник абстрактного класса Figure
 */
public class Rectangle extends Figure {
    private static final String FIGURE_NAME = "Прямоугольник";

    public Rectangle(double a, double b) {
        super(a, b); // вызов конструктора родительского класса
    }

    /**
     * Реализация абстрактного метода класса Figure
     */
    @Override
    public double area() {
        return a * b;
    }

    /**
     * Реализация абстрактного метода класса Figure
     */
    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    /**
     * Реализация абстрактного метода класса Figure
     */
    @Override
    public String figureName() {
        return FIGURE_NAME;
    }
}
