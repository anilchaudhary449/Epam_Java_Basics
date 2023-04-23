package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    private final Point point;
    private final double radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String pointsToString() {
        return point.toString();
    }

    @Override
    public Point leftmostPoint() {
        return new Point(point.getX() - radius, point.getY());
    }

    @Override
    public String toString() {
        return String.format("Circle[%s%s]", pointsToString(), radius);
    }
}