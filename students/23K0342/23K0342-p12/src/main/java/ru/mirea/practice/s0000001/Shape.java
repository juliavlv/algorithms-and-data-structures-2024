package ru.mirea.practice.s0000001;

import java.awt.Color;
import java.awt.Graphics;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;// Позиция

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}
