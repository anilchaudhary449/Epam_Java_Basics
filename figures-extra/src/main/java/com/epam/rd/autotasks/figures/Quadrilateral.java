package com.epam.rd.autotasks.figures;

import static java.lang.Math.*;

class Quadrilateral extends Figure {
    public Point a;
    public Point b;
    public Point c;
    public Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d){
        if(a == null || b == null || c == null || d == null) throw new IllegalArgumentException();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if(length(a,b)==0 || length(b, c)==0 || length(c, a)==0 || length(a, d)==0)throw new IllegalArgumentException();
        if(area()==0) throw new IllegalArgumentException();
        if(checkDirectionalFactors(a,b,c)) throw new IllegalArgumentException();
        if(checkDirectionalFactors(b,c,d)) throw new IllegalArgumentException();
        double points[][] = {{a.getX(),a.getY()},{b.getX(),b.getY()},{c.getX(),c.getY()},{d.getX(),d.getY()}};
        if (!isConvex(points)) throw new IllegalArgumentException();
    }

    @Override
    public Point centroid(){
        Point centroidOfTriangle1 = centroidOfTriangle(a, b, c);
        Point centroidOfTriangle2 = centroidOfTriangle(a, c, d);
        Point centroidOfTriangle3 = centroidOfTriangle(a, b, d);
        Point centroidOfTriangle4 = centroidOfTriangle(c, b, d);
        return getIntersectionPoint(centroidOfTriangle1, centroidOfTriangle2, centroidOfTriangle3, centroidOfTriangle4);

    }
    @Override
    public boolean isTheSame(Figure figure){
        if(figure instanceof Quadrilateral){
            Quadrilateral other = (Quadrilateral) figure;
            return arePointsEqual(other);
        }
        else return false;

    }

    public double roundTo3DecimalPlace(double value) {
        return Math.round(value * 1000.0) / 1000.0;
    }

    private boolean arePointsEqual(Quadrilateral A){
        double counter = 4;
        Point aPoints[] = {A.a, A.b, A.c, A.d};
        Point bPoints[] = {a, b, c, d};
        for(int i =0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(roundTo3DecimalPlace(aPoints[i].getX()) == roundTo3DecimalPlace(bPoints[j].getX()) && roundTo3DecimalPlace(aPoints[i].getY()) == roundTo3DecimalPlace(bPoints[j].getY()))counter--;
            }
        }
        if(counter<=0)return true;
        else return false;
    }

    private Point getIntersectionPoint(Point A, Point B, Point C, Point D){
        double a1 = B.getY() - A.getY();
        double b1 = A.getX() - B.getX();
        double c1 = a1*(A.getX()) + b1*(A.getY());

        double a2 = D.getY() - C.getY();
        double b2 = C.getX() - D.getX();
        double c2 = a2*(C.getX())+ b2*(C.getY());
        double determinant = a1*b2 - a2*b1;

        double x = (b2*c1 - b1*c2)/determinant;
        double y = (a1*c2 - a2*c1)/determinant;
        return new Point(x, y);

    }

    private Point centroidOfTriangle(Point a, Point b, Point c){
        return new Point((a.getX()+b.getX()+c.getX())/3,(a.getY()+b.getY()+c.getY())/3);
    }

    private double length(Point A, Point B) {
        double length= sqrt(pow(B.getX()-A.getX(),2)+pow(B.getY()-A.getY(),2));
        return length;
    }

    private double areaOfTriangle(Point a,Point b, Point c){
        double area =  a.getX()* (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY());
        return area;
    }

    private double area(){
        return areaOfTriangle(a, b, c) + areaOfTriangle(a, c, d);
    }

    private boolean checkDirectionalFactors(Point x1,Point x2,Point x3){
        //calculate the directional factors
        double directionalFactor1 = (x2.getY()-x1.getY())/(x2.getX()-x1.getX());
        double directionalFactor2 = (x3.getY()-x1.getY())/(x3.getX()-x1.getX());
        if(directionalFactor1==directionalFactor2) return true;
        else return false;
    }

    private double CrossProduct(double A[][]){
        double X1 = (A[1][0] - A[0][0]);
        double Y1 = (A[1][1] - A[0][1]);
        double X2 = (A[2][0] - A[0][0]);
        double Y2 = (A[2][1] - A[0][1]);
        return (X1 * Y2 - Y1 * X2);
    }

    private boolean isConvex(double points[][]){
        int n = points.length;
        //direction of cross product of previous traversed edges
        double prev = 0;
        //direction of cross product of current traversed edges
        double curr = 0;

        for (int i = 0; i < n; i++) {
            double temp[][]= { points[i],points[(i + 1) % n],points[(i + 2) % n] };
            curr = CrossProduct(temp);
            if (curr != 0) {
                if (curr * prev < 0) return false;
                else prev = curr;
            }
        }
        return true;
    }

}