import java.awt.*;
import java.awt.Graphics;
public class Shapes implements Shape
{
    private Point position;
    private Color color;

    public Shapes(Point position, Color color)
    {
        this.position = position;
        this.color = color;
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
    public lineSegment(Point position, Color color)
    {
        super(position, color);
    }
    public void draw(Graphics canvas)
    {

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
