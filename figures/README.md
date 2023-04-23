# Figures

The purpose of this exercise is to train you to work with classes, methods and inheritance.

Estimated workload of this exercise is _60 min_.

### Description
Please, make [`Triangle`](src/main/java/com/epam/rd/autotasks/figures/Triangle.java),
[`Quadrilateral`](src/main/java/com/epam/rd/autotasks/figures/Quadrilateral.java),
[`Circle`](src/main/java/com/epam/rd/autotasks/figures/Circle.java) classes
extend [`Figure`](src/main/java/com/epam/rd/autotasks/figures/Figure.java) abstract class.

Implement methods in `Triangle`, `Quadrilateral`, `Circle`:

1. constructors with following parameters:
    * `Triangle` - three vertices (points) as parameters.
    * `Quadrilateral` - four vertices (points) as parameters.
    * `Circle` - point of the center and `double` value of the radius.
   
    All the input datasets in tests are guaranteed to form a non-degenerative figures.
    For Quadrilaterals, it is guaranteed that all test datasets would form a convex quadrilaterals.

1. `public double area()`\
    Return the area of the figure.\
    *Note:* Convex quadrilaterals can be divided into two triangles by any of their diagonals. 

1. `public String pointsToString()`\
    Return a String value in following formats:
    * `Triangle` - 
        * Format: `(a.x,a.y)(b.x,b.y)(c.x,c.y)`
        * Example: `(0.0,0.0)(0.1,5.8)(7.0,7.0)`    
    * `Quadrilateral` - 
        * Format: `(a.x,a.y)(b.x,b.y)(c.x,c.y)(d.x, d.y)`
        * Example: `(0.0,0.0)(0.0,7.1)(7.0,7.0)(7.0,0.0)`    
    * `Circle` - 
        * Format: `(center.x,center.y)`
        * Example: `(0.0,0.6)`
        
    *Note:*: you may benefit from implementing toString() in the [`Point`](src/main/java/com/epam/rd/autotasks/figures/Point.java) class

1. `public String toString()`\
    Return a String value in following formats:
    * `Triangle` - 
        * Format: `Triangle[(a.x,a.y)(b.x,b.y)(c.x,c.y)]`
        * Example: `Triangle[(0.0,0.0)(0.1,5.8)(7.0,7.0)]`    
    * `Quadrilateral` - 
        * Format: `Quadrilateral[(a.x,a.y)(b.x,b.y)(c.x,c.y)(d.x, d.y)]`
        * Example: `Quadrilateral[(0.0,0.0)(0.0,7.1)(7.0,7.0)(7.0,0.0)]`    
    * `Circle` - 
        * Format: `Circle[(center.x,center.y)radius]`
        * Example: `Circle[(0.0,0.6)4.5]`
        
    *Note*: you may use default implementation given in the `Figure` class, when it suits a case well.

1. `public Point leftmostPoint()`\
   Return a leftmost point of the figure: the one having the least `X` coordinate.\
   If there are many leftmost points, return any of them. 

[`Point`](src/main/java/com/epam/rd/autotasks/figures/Point.java) class is already there.

Hints:
* [Degeneracy reference](https://en.wikipedia.org/wiki/Degeneracy_(mathematics))
* [Convex quadrilateral reference](https://en.wikipedia.org/wiki/Quadrilateral#Convex_quadrilaterals)
* [Triangle area reference](https://en.wikipedia.org/wiki/Triangle#Computing_the_area_of_a_triangle)
* [Circle area reference](https://en.wikipedia.org/wiki/Circle#Area_enclosed)
* [Quadrilateral area reference](https://en.wikipedia.org/wiki/Quadrilateral#Area_of_a_convex_quadrilateral)

## Examples
You may use [Main](src/test/java/com/epam/rd/autotasks/figures/Main.java) class to try your code.
There are some examples below.

---
Sample code:
```java
...
double area = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 4)).area();
System.out.println(area);
```
Output:
```
6
```

---
Sample code:
```java
...
double area = new Quarilateral(new Point(1,0), new Point(2, 1), new Point(1, 2), new Point(0, 1)).area();
System.out.println(area);
```
Output:
```
2
```

---
Sample code:
```java
...
double area = new Circle(new Point(1,1), 3).area();
System.out.println(area);
```
Output:
```
28.274333882308138
```
