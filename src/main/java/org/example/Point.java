package org.example;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
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

    //Bu işlemin matematiksel olarak yapımı: √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA) şeklindedir.
    public double distance(){
        int x1 = getX();
        int y1 = getY();
        int a = 0;
        int b = 0;

        double power = ((x1 -a) * (x1 -a)) + ((y1 -b) * (y1 -b));

        return Math.sqrt(power);
    }
    public double distance(Point p){
        int x1 = getX();
        int y1 = getY();
        int x2 = p.getX();
        int y2 = p.getY();

        double power = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        return Math.sqrt(power);
    }
    public double distance(int a, int b){
        int x1 = getX();
        int y1 = getY();

        double power = ((x1 -a) * (x1 -a)) + ((y1 -b) * (y1 -b));

        return Math.sqrt(power);
    }
}
