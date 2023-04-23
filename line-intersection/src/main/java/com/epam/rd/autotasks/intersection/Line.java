package com.epam.rd.autotasks.intersection;
class Line {
    public int k1;
    public int k2;
    public int b1;
    public int b2;

    public Line(int k, int b) {
        this.k1 = k;
        this.k2 = k;
        this.b1 = b;
        this.b2 = b;

    }

    public Point intersection(Line other) {
        if(k1 == other.k1){
            return null;
        }
        int x =(other.b2-b1)/(k1 - other.k2);
        int y = k1*x +b1;
        return new Point(x,y);
    }

}