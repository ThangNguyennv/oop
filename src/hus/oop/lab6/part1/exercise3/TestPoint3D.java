package hus.oop.lab6.part1.exercise3;

public class TestPoint3D {
    public static void main(String[] args) {
        MovablePoint movablePoint3d = new MovablePoint(1, 2, 3, 3, 4, 5);
        System.out.println("Initial position: " + movablePoint3d);
        movablePoint3d.move();
        System.out.println("After moving: " + movablePoint3d);

        movablePoint3d.setSpeed(5, 6, 7);
        movablePoint3d.move();
        System.out.println("After changing Speed and moving: " + movablePoint3d);

        movablePoint3d.setXYZ(2, 3, 4);
        movablePoint3d.setxSpeed(5);
        movablePoint3d.setySpeed(6);
        movablePoint3d.setzSpeed(7);

        System.out.println(movablePoint3d.getX());
        System.out.println(movablePoint3d.getY());
        System.out.println(movablePoint3d.getZ());
        System.out.println(movablePoint3d.getZ());
        System.out.println(movablePoint3d.getxSpeed());
        System.out.println(movablePoint3d.getySpeed());
        System.out.println(movablePoint3d.getzSpeed());
    }
}
