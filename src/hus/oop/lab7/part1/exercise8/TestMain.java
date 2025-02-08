package hus.oop.lab7.part1.exercise8;

public class TestMain {
    public static void main(String[] args) {
        Movable movablePoint1 = new MovablePoint(1, 2, 3, 4); // Upcast
        System.out.println(movablePoint1);
        if (movablePoint1 instanceof MovablePoint) {
            System.out.println(((MovablePoint) movablePoint1).getX());
            System.out.println(((MovablePoint) movablePoint1).getY());
            System.out.println(((MovablePoint) movablePoint1).getxSpeed());
            System.out.println(((MovablePoint) movablePoint1).getySpeed());
        }

        System.out.println("-------------------------------");

        MovablePoint movablePoint2 = (MovablePoint) movablePoint1; // Downcast
        System.out.println(movablePoint2);
        System.out.println(movablePoint2.getX());
        System.out.println(movablePoint2.getY());
        System.out.println(movablePoint2.getxSpeed());
        System.out.println(movablePoint2.getySpeed());

        System.out.println("-------------------------------");
        System.out.println("After moving:");
        movablePoint1.moveUp();
        System.out.println(movablePoint1);
        movablePoint1.moveDown();
        System.out.println(movablePoint1);
        movablePoint1.moveLeft();
        System.out.println(movablePoint1);
        movablePoint1.moveRight();

        System.out.println("-------------------------------");

        Movable movableRectangle1 = new MovableRectangle(1, 2, 3, 4, 5, 6);
        System.out.println(movableRectangle1);
        movableRectangle1.moveUp();
        System.out.println(movableRectangle1);
        movableRectangle1.moveDown();
        System.out.println(movableRectangle1);
        movableRectangle1.moveLeft();
        System.out.println(movableRectangle1);
        movableRectangle1.moveRight();
        System.out.println(movableRectangle1);
    }
}
