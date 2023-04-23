package com.epam.rd.autotasks;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {
        degrees = degreesInRange(degrees);
        for (Direction dir : Direction.values()) {
            if (dir.degrees == degrees)
                return dir;
        }
        return null;
    }

    public static Direction closestToDegrees(int degrees) {
        degrees = degreesInRange(degrees);
        if (degrees < 23) return N;
        else if (degrees > 22 && degrees < 68) return NE;
        else if (degrees > 67 && degrees < 113) return E;
        else if (degrees > 112 && degrees < 158) return SE;
        else if (degrees > 157 && degrees < 203) return S;
        else if (degrees > 202 && degrees < 248) return SW;
        else if (degrees > 247 && degrees < 293) return W;
        else if (degrees > 292 && degrees < 338) return NW;
        else return N;
    }

    public Direction opposite() {
        switch (this) {
            case N:
                return S;
            case NE:
                return SW;
            case E:
                return W;
            case SE:
                return NW;
            case S:
                return N;
            case SW:
                return NE;
            case W:
                return E;
            case NW:
                return SE;
            default:
                return null;
        }
    }

    public int differenceDegreesTo(Direction direction) {
        degrees = degreesInRange(degrees);
        int difference = Math.abs(this.degrees - direction.degrees);
        return Math.min(difference, 360 - difference);
    }

    private static int degreesInRange(int deg) {
        deg += 36000;
        return deg % 360;
    }
}