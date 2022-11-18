import com.mycompany.lab7_minipaint.DrawingFrame;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.*;
import java.util.*;
        
public class Shapes implements Shape
{
    private Point position;
    private Color color;
    private ArrayList<Shape> allShapes ;
    public Shapes(Point position, Color color)
    {
        this.position = position;
        this.color = color;
        allShapes = new ArrayList<Shape> ();
    }

    @Override
    public void setPosition(Point position)
    {
        this.position = position;
    }

    @Override
    public Point getPosition()
    {
        return this.position;
    }

    @Override
    public void setColor(Color color)
    {
        this.color = color;
    }

    @Override
    public Color getColor()
    {
        return this.color;
    }

    @Override
    public void setFillColor(Color color)
    {

    }

    @Override
    public Color getFillColor()
    {
       return null;
    }

    @Override
    public void draw(Graphics canvas)
    {

    }
}
class lineSegment extends Shapes
{
    private Point endPosition;
    public lineSegment(Point position, Color color, Point endPosition)
    {
        super(position, color);
        this.endPosition = endPosition;
    }
    public void draw(Graphics canvas)
    {
        canvas.drawLine(0, 0, 5, 5);
        
    }

}
class Circle extends Shapes
{
    private Color fillColor;
    private double radius;
    public Circle(Point position, Color color, Color fillColor, double radius)
    {
        super(position, color);
        this.fillColor = fillColor;
        this.radius = radius;
    }
    public void setFillColor(Color color)
    {
        this.fillColor = color;
    }
    public Color getFillColor()
    {
        return this.fillColor;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public void draw(Graphics canvas)
    {

    }
}
class Rectangle extends Shapes
{
    private Color fillColor;
    public Rectangle(Point position, Color color, Color fillColor)
    {
        super(position, color);
        this.fillColor = fillColor;
    }
    public void draw(Graphics canvas)
    {

    }
}
class Square extends Shapes
{
    private Color fillColor;
    private double sideLength;
    public Square(Point position, Color color, Color fillColor,double sideLength)
    {
        super(position, color);
        this.fillColor = fillColor;
        this.sideLength = sideLength;
    }
    public void draw(Graphics canvas)
    {

    }
}
