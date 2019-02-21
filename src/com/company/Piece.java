package com.company;


public class Piece {

    private int x;
    private int y;
    private int id;

    public Piece(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "x=" + x +
                ", y=" + y +
                ", id=" + id +
                '}';
    }
}
