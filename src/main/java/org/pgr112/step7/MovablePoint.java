package org.pgr112.step7;

public class MovablePoint implements Movable {
    private double x;
    private double y;


    public MovablePoint(double x, double y){
        this.x = x;
        this.y = y;

    }
    @Override
    public void moveUp(double distance) {
        this.y -= distance;
    }

    @Override
    public void moveDown(double distance) {
        this.y += distance;
    }

    @Override
    public void moveRight(double distance) {
        this.x += distance;
    }

    @Override
    public void moveLeft(double distance) {
        this.x -= distance;
    }

    @Override
    public String toString(){
        return
        "This is the y-coordinates: " + y +
        "This is the x-coordinates: " + x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
