package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Rectangle(5, 8);
        figures[1] = new RightTriangle(3, 4);
        figures[2] = new Rectangle(11, 20);
        figures[3] = new RightTriangle(67, 81);

        for (Figure figure : figures) {
            System.out.println("Тип фигуры: " + figure.figureName());
            System.out.println("Площадь фигуры = " + figure.area());
            System.out.println("Периметр фигуры = " +figure.perimeter());

            System.out.println();
        }
    }
}
