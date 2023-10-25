package dev3;

public class Vector2D {
    public double vX;
    public double vY;
    public static int count = 0;

    public Vector2D() {
        this.vX = 1.0;
        this.vY = 1.0;
        count++;
    }
    public Vector2D(double x, double y) {
        this.vX = x;
        this.vY = y;
        count++;
    }

    public Vector2D(Vector2D v2d) {
        this.vX = v2d.vX;
        this.vY = v2d.vY;
        count++;
    }

    public void print() {
        System.out.printf("(%.2f, %.2f)\n",vX,vY);
    }

    public double length() {
        return Math.sqrt(vX*vX + vY*vY);
    }

    public void add(Vector2D newvector) {
        this.vX = this.vX + newvector.vX;
        this.vY = this.vY + newvector.vY;
    }
    public void sub(Vector2D newvector) {
        this.vX -= newvector.vX;
        this.vY -= newvector.vY;
    }

    public void scale(double scaleFactor) {
        this.vX = this.vX * scaleFactor;
        this.vY = this.vY * scaleFactor; // this.vY *= scaleFactor;
    }

    public double dotProduct(Vector2D v) {
        return this.vX*v.vX + this.vY*v.vY;
    }

    public void normalized() {
        double length = length();
        this.vX /= length;
        this.vY /= length;
    }
}
