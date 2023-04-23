# Segments

Цель задания - научить вас работать с классами и методами.

Примерное время выполнения задания: 45 минут. 

### Описание
Реализуйте следующие методы класса [`Segment`](src/main/java/com/epam/rd/autotasks/segments/Segment.java): 

* Конструктор, в который в качестве параметров передаются координаты точек начала и конца отрезка.\
  Убедитесь, что созданный отрезок существует и не является вырожденным - начало и конец отрезка не являются одной и той же точкой.\
  Если это так, используйте `throw new IllegalArgumentException()`, чтобы вызвать ошибку.
* `double length()`\
  Возвращает длину отрезка.
* `Point middle()`\
  Возвращает среднюю точку отрезка.
* `Point intersection(Segment another)`\
  Возвращает точку пересечения текущего отрезка с другим.\
  Возвращает `null`, если такой точки нет.\
  Возвращает `null`, если отрезки коллинеарны.\
  Обратите внимание, что точка пересечения должна лежать на обоих отрезках.

Класс [`Point`](src/main/java/com/epam/rd/autotasks/segments/Point.java) уже существует. 

Полезные ссылки: 
* [Length reference](https://www.wikihow.com/Use-Distance-Formula-to-Find-the-Length-of-a-Line)
* [Midpoint reference](https://www.wikihow.com/Find-the-Midpoint-of-a-Line-Segment#Use-the-Midpoint-Formula)
* [Intersection reference](https://en.wikipedia.org/wiki/Line–line_intersection)
 
### Примеры
Вы можете использовать класс [Main](src/test/java/com/epam/rd/autotasks/segments/Main.java), чтобы опробовать ваш код. Внизу приведено несколько примеров.

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


