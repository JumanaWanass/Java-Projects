package com.mycompany.lab7_minipaint;


import java.awt.*;

        
public abstract class Polygons implements Shape
{
    private Point position;
    private Color borderColor;
    private Color fillColor;
    
    

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }

    @Override
    public void setColor(Color color) {
        this.borderColor = color;
    }

    @Override
    public Color getColor() {
        return this.borderColor;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

    @Override
    public abstract void draw(Graphics canvas);
        
    
   
   
}


