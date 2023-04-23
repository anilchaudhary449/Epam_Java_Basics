# Triangle

Цель задания - научить вас работать с классами и методами.

Примерное время выполнения задания: 45 минут. 

### Описание

Реализуйте методы класса  [`Triangle`](src/main/java/com/epam/rd/autotasks/triangle/Triangle.java):

* Конструктор, принимающий в качестве параметров координаты трех вершин.\
  Проверьте, что созданный треугольник существует и не является вырожденным.\
  Если это так, используйте `throw new IllegalArgumentException()`, чтобы вызвать ошибку.
* `double area()`\
  Возвращает площадь треугольника.
* `Point centroid()`\
  Возвращает центроид треугольника.

Класс [`Point`](src/main/java/com/epam/rd/autotasks/triangle/Point.java) уже существует. 

Полезные ссылки: 
* [Triangle existence reference](https://en.wikipedia.org/wiki/Triangle#Existence_of_a_triangle)
* [Triangle area reference](https://en.wikipedia.org/wiki/Triangle#Computing_the_area_of_a_triangle)
* [Centroid reference](https://en.wikipedia.org/wiki/Centroid)

Обратите внимание, что можно ввести в решение и дополнительные классы.
 
## Примеры
Вы можете использовать класс  [Main](src/test/java/com/epam/rd/autotasks/triangle/Main.java), чтобы опробовать ваш код. Внизу приведено несколько примеров.
---
Sample code:
```java
...
new Triangle(new Point(0,0), new Point(1, 0), new Point(2, 0));
```

Результат: исключение, потому что такой треугольник будет вырожденным.

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

