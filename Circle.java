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
public class Circle extends Polygons{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public int getRadius() {
        return radius;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        canvas.drawOval(getPosition().x, getPosition().y, getRadius()*2, getRadius()*2);
        //refresh after fillColor
        canvas.setColor(getFillColor());
        
        
        
    }
    
}
