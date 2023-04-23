package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public double area() {
        double operand1 = (point1.getX() - point3.getX()) * (point2.getY() - point3.getY());
        double operand2 = (point2.getX() - point3.getX()) * (point1.getY() - point3.getY());
        return Math.abs(operand1 - operand2) / 2;
    }

    @Override
    public String pointsToString() {
        return String.format("%s%s%s", point1, point2, point3);
    }

    @Override
    public Point leftmostPoint() {
        double minX = Math.min(point1.getX(), Math.min(point2.getX(), point3.getX()));

        if (point1.getX() == minX) {
            return point1;
        }

        if (point2.getX() == minX) {
            return point2;
        }

        return point3;
    }
}