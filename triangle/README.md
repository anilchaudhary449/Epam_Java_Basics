# Triangle

The purpose of this exercise is to train you to work with classes and methods.

Estimated workload of this exercise is _45 min_.

### Description

Please, implement methods of class [`Triangle`](src/main/java/com/epam/rd/autotasks/triangle/Triangle.java):

* constructor, which has three points as parameters.\
  Consider these points as vertices of the triangle.\
  Ensure that the created triangle exists and it is not degenerative.\
  If it is, use `throw new IllegalArgumentException()` to raise an error.
* `double area()`\
  Return the area of the triangle.
* `Point centroid()`\
  Return the centroid of the triangle.

Class [`Point`](src/main/java/com/epam/rd/autotasks/triangle/Point.java) is already there.

Hints:
* [Triangle existence reference](https://en.wikipedia.org/wiki/Triangle#Existence_of_a_triangle)
* [Triangle area reference](https://en.wikipedia.org/wiki/Triangle#Computing_the_area_of_a_triangle)
* [Centroid reference](https://en.wikipedia.org/wiki/Centroid)

Please note that you may benefit from introducing more classes.
 
## Examples
You may use [Main](src/test/java/com/epam/rd/autotasks/triangle/Main.java) class to try your code.
There are some examples below.
---
Sample code:
```java
...
new Triangle(new Point(0,0), new Point(1, 0), new Point(2, 0));
```

Result: Exception because such a triangle would be degenerative.

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
Point centroid = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 3)).centroid();

System.out.println(centroid.getX());
System.out.println(centroid.getY());
```

Output:

```
1
1
```
