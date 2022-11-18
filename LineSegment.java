/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7_minipaint;
import java.awt.*;
/**
 *
 * @author mohdn
 */
public class LineSegment extends Polygons{
    private Point endPosition;

   

    

    public void setEndPosition(Point endPosition) {
        this.endPosition = endPosition;
    }

    public Point getEndPosition() {
        return endPosition;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        canvas.drawLine(getPosition().x, getPosition().y, getEndPosition().x, getEndPosition().y);
        
    }
    
    
}
