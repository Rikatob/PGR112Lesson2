package org.pgr112.step7;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveTest {

    @Test
    void moveCircleUp(){
        Circle circle = new Circle(Color.RED, true,5,5,5);
        circle.moveUp(5);
        assertEquals(circle.center.getX(),5 );
        assertEquals(circle.center.getY(), 0);
    }

    @Test
    void moveSquareDown(){
        Square square = new Square(5,Color.RED,true,10,10);
        square.moveDown(5);
        assertEquals(square.topLeft.getX(),10);
        assertEquals(square.topLeft.getY(),15);
        assertEquals(square.bottomRight.getX(),15);
        assertEquals(square.bottomRight.getY(),20);
    }

    @Test
    void moveRectangleRight(){
        Rectangle rectangle = new Rectangle(5,10,Color.red,true,5,5);
        rectangle.moveRight(5);
        assertEquals(rectangle.topLeft.getX(),10);
        assertEquals(rectangle.topLeft.getY(),5);
        assertEquals(rectangle.bottomRight.getX(),15);
        assertEquals(rectangle.bottomRight.getY(),15);
    }
}
