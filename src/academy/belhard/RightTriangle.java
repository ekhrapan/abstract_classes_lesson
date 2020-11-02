package academy.belhard;

/**
 * Класс RightTriangle (Правильный треугольник)
 * Наследник абстрактного класса Figure
 */
public class RightTriangle extends Figure {
    private static final String FIGURE_NAME = "Прямоугольный треугольник";

    public RightTriangle(double a, double b) {
        super(a, b); // вызов конструктора родительского класса
    }

    /**
     * Реализация абстрактного метода класса Figure
     */
    @Override
    public double area() {
        return a * b / 2;
    }

    /**
     * Реализация абстрактного метода класса Figure
     */
    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(a * a + b * b);
        return (a + b) + hypotenuse;
    }

    /**
     * Реализация абстрактного метода класса Figure
     */
    @Override
    public String figureName() {
        return FIGURE_NAME;
    }
}
