package com.epam.rd.autotasks.segments;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {
    double xStart;
    double yStart;
    double xEnd;
    double yEnd;

    public Segment(Point start, Point end) {
        if (start.getX() == end.getX() && start.getY() == end.getY()) {
            throw new IllegalArgumentException();
        }
        xStart = start.getX();
        yStart = start.getY();
        xEnd = end.getX();
        yEnd = end.getY();

    }

    double length() {

        return sqrt(pow((xEnd-xStart), 2)+pow((yEnd-yStart), 2));
    }

    Point middle() {

        return new Point((xStart+xEnd)/2,(yStart+yEnd)/2);

    }

    Point intersection(Segment another) {

        Point point;
        if ((xStart-xEnd)*(another.yStart-another.yEnd)-(yStart-yEnd)*(another.xStart-another.xEnd) != 0){
            double xPoint = (((xStart*yEnd-yStart*xEnd)*(another.xStart- another.xEnd)-(xStart-xEnd)*(another.xStart* another.yEnd-another.yStart*another.xEnd)))/((xStart-xEnd)*(another.yStart-another.yEnd)-(yStart-yEnd)*(another.xStart-another.xEnd));
            double yPoint = (((xStart*yEnd-yStart*xEnd)*(another.yStart- another.yEnd)-(yStart-yEnd)*(another.xStart* another.yEnd-another.yStart*another.xEnd)))/((xStart-xEnd)*(another.yStart-another.yEnd)-(yStart-yEnd)*(another.xStart-another.xEnd));
            int checkPoint = (int) (((xPoint-xStart)*(yEnd-yStart))-((yPoint-yStart)*(xEnd-xStart)));
            int checkPointAnother = (int) (((xPoint-another.xStart)*(another.yEnd-another.yStart))-((yPoint-another.yStart)*(another.xEnd-another.xStart)));
            if (checkPoint == 0 && checkPointAnother == 0){
                if(xPoint >= xStart && xPoint <= xEnd || xPoint >= xEnd && xPoint <= xStart){
                    if (xPoint >= another.xStart && xPoint <= another.xEnd || xPoint >= another.xEnd && xPoint <= another.xStart){
                        point = new Point(xPoint, yPoint);
                    }else{
                        point = null;
                    }
                } else {
                    point = null;
                }
            } else {
                point = null;
            }
        } else {
            point = null;
        }
        return point;
    }

}