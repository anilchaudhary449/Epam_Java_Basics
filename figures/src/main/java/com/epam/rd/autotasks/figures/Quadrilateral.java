package com.epam.rd.autotasks.figures;


class Quadrilateral extends Figure{
    private final Point point1;
    private final Point point2;
    private final Point point3;
    private final Point point4;


    public Quadrilateral (Point point1, Point point2, Point point3, Point point4){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    @Override
    public double area() {
        double operation1 = (point1.getX() * point2.getY() - point1.getY() * point2.getX());
        double operation2 = (point2.getX() * point3.getY() - point2.getY() * point3.getX());
        double operation3 = (point3.getX() * point4.getY() - point3.getY() * point4.getX());
        double operation4 = (point4.getX() * point1.getY() - point4.getY() * point1.getX());
        return Math.abs((operation1 + operation2 + operation3 + operation4) / 2);
    }

    @Override
    public String pointsToString() {
        return String.format("%s%s%s%s", point1,point2,point3,point4);
    }

    @Override
    public Point leftmostPoint() {
        double minX = Math.min(point1.getX(), Math.min(point2.getX(), Math.min(point3.getX(), point4.getX())));

        if (point1.getX() == minX) {
            return point1;
        }

        if (point2.getX() == minX) {
            return point2;
        }
        if(point3.getX() == minX){
            return point3;
        }

        return point4;
    }
}