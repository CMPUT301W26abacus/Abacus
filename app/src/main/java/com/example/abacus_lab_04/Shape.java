package com.example.abacus_lab_04;

public class Shape {

    private int x;
    private int y;

    public Shape() {
        this.x = 0;
        this.y = 0;
    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
