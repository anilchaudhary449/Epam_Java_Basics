package com.epam.rd.autotasks.figures;

abstract class Figure{

    public abstract Point centroid();
    public abstract boolean isTheSame(Figure figure);
}