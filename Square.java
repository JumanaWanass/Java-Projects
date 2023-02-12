/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7_minipaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author mohdn
 */
public class Square extends Polygons{
    private int hieght;
    private int width;

  

    public void setHieght(int hieght) {
        this.hieght = hieght;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHieght() {
        return hieght;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        canvas.drawRect(getPosition().x, getPosition().y, getWidth(), getHieght());
        //refresh after fill color
        canvas.setColor(getFillColor());
    }
    
}
