package com.epam.rd.autotasks.figures;

import static java.lang.Math.*;

class Triangle extends Figure {
    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c){
        if(a == null || b == null || c == null) throw new IllegalArgumentException();
        this.a = a;
        this.b = b;
        this.c = c;

        if (area() == 0) throw new IllegalArgumentException();

    }
    @Override
    public Point centroid(){
        return new Point((a.getX()+b.getX()+c.getX())/3,(a.getY()+b.getY()+c.getY())/3);
    }
    @Override
    public boolean isTheSame(Figure figure){
        if(figure instanceof Triangle){
            Triangle other = (Triangle) figure;
            return arePointsEqual(other);
        }
        else return false;
    }
    public double roundTo3DecimalPlace(double value) {
        return Math.round(value * 1000.0) / 1000.0;
    }

    private boolean arePointsEqual(Triangle A){
        double counter = 3;
        Point aPoints[] = {A.a, A.b, A.c};
        Point bPoints[] = {a, b, c};
        for(int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                if(roundTo3DecimalPlace(aPoints[i].getX()) == roundTo3DecimalPlace(bPoints[j].getX()) && roundTo3DecimalPlace(aPoints[i].getY()) == roundTo3DecimalPlace(bPoints[j].getY()))counter--;
            }
        }
        if(counter<=0)return true;
        else return false;
    }

    double length(Point A, Point B) {
        double length= sqrt(pow(B.getX()-A.getX(),2)+pow(B.getY()-A.getY(),2));
        return length;
    }


    public double area(){
        double area =  a.getX()* (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY());
        return area;
    }

}