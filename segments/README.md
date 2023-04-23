# Segments

The purpose of this exercise is to train you to work with classes and methods.

Estimated workload of this exercise is _45 min_.

### Description
Please, implement the following methods of class [`Segment`](src/main/java/com/epam/rd/autotasks/segments/Segment.java): 

* constructor with start and end points as parameters\
  Ensure that a created segment exists and is not degenerative 
  which means that the start and the end of the segment is not the same point.\
  If it is, use `throw new IllegalArgumentException()` to raise an error.
* `double length()`\
  Return length of the segment.
* `Point middle()`\
  Return a middle point of the segment.
* `Point intersection(Segment another)`\
  Return a point of the intersection of the current segment and the given one.\
  Return `null` if there is no such point.\
  Return `null` if segments are collinear.\
  Please, note that intersection point must lay on both segments.

Class [`Point`](src/main/java/com/epam/rd/autotasks/segments/Point.java) is already there.

Hints:
* [Length reference](https://www.wikihow.com/Use-Distance-Formula-to-Find-the-Length-of-a-Line)
* [Midpoint reference](https://www.wikihow.com/Find-the-Midpoint-of-a-Line-Segment#Use-the-Midpoint-Formula)
* [Intersection reference](https://en.wikipedia.org/wiki/Line–line_intersection)
 
### Examples
You may use [Main](src/test/java/com/epam/rd/autotasks/segments/Main.java) class to try your code.
There are some examples below.

---
Sample code:
```java
...
double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
System.out.println(length);

```

Output: `5`

---
Sample code:
```java
...
Segment first = new Segment(new Point(0, 0), new Point(4, 4));
Segment second = new Segment(new Point(2, 0), new Point(0, 2));
Point intersection = first.intersection(second);

System.out.println(intersection.getX());
System.out.println(intersection.getY());

```

Output:

```
1
1
```
---
Sample code:
```java
...
Segment segment = new Segment(new Point(2, 0), new Point(0, 2));
Point midpoint = segment.middle();

System.out.println(midpoint.getX());
System.out.println(midpoint.getY());

```

Output:

```
1
1
```

---
Sample code:
```java
...
Segment first = new Segment(new Point(0, 0), new Point(4, 0));
Segment second = new Segment(new Point(2, 1), new Point(1, 2));
Point intersection = first.intersection(second);

System.out.println(intersection == null);

```

Output:

```
true
```

---

