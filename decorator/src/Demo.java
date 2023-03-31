import java.awt.*;

public class Demo {
    public static void main(String[] args) {

        Shape circle = new Circle(); // добавляем форму.
        Shape redCircle = new RedShapeDecorator(new Circle());//навешваем декорацию
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redTriangle = new RedShapeDecorator(new Triangle());

        System.out.println("\n Обычный круг: ");
        circle.draw();

        System.out.println("\n Круг с красной границей: ");
        redCircle.draw();

        System.out.println("\n Прямоугольник с красной границей: ");
        redRectangle.draw();

        System.out.println("\n Треугольник с красной границей: ");
        redTriangle.draw();

    }
}