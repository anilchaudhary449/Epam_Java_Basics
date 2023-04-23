# Figures

Цель задания – научить вас работать с классами, методами и наследованием. 

Примерное время выполнения задания:60 мин. 

### Описание
Нужно сделать так, чтобы классы  [`Triangle`](src/main/java/com/epam/rd/autotasks/figures/Triangle.java),
[`Quadrilateral`](src/main/java/com/epam/rd/autotasks/figures/Quadrilateral.java),
[`Circle`](src/main/java/com/epam/rd/autotasks/figures/Circle.java) расширяли абстрактный класс [`Figure`](src/main/java/com/epam/rd/autotasks/figures/Figure.java).

Реализуйте методы классов `Triangle`, `Quadrilateral`, `Circle`:

1. конструкторы со следующими параметрами: 
    * `Triangle` - три вершины (точки) в качестве параметров. 
    * `Quadrilateral` - четыре вершины (точки) в качестве параметров. 
    * `Circle` - точка центра и `double` значение радиуса. 
   
    Все входные наборы данных в тестах гарантированно образуют невырожденные фигуры. 
    Для четырехугольников гарантируется, что все тестовые наборы данных будут образовывать выпуклые четырехугольники. 

2. `public double area()`\
    Возвращает площадь фигуры.\
    *Примечание:* выпуклые четырехугольники можно разделить на два треугольника по любой из их диагоналей.  

3. `public String pointsToString()`\
    Возвращает значение String в следующих форматах: 
    * `Triangle` - 
        * Формат: `(a.x,a.y)(b.x,b.y)(c.x,c.y)`
        * Пример: `(0.0,0.0)(0.1,5.8)(7.0,7.0)`    
    * `Quadrilateral` - 
        * Формат: `(a.x,a.y)(b.x,b.y)(c.x,c.y)(d.x, d.y)`
        * Пример: `(0.0,0.0)(0.0,7.1)(7.0,7.0)(7.0,0.0)`    
    * `Circle` - 
        * Формат: `(center.x,center.y)`
        * Пример: `(0.0,0.6)`
        
    *Примечание:* можно реализовать toString () в классе [`Point`](src/main/java/com/epam/rd/autotasks/figures/Point.java).

4. `public String toString()`\
    Возвращает значение String в следующих форматах: 
    * `Triangle` - 
        * Формат: `Triangle[(a.x,a.y)(b.x,b.y)(c.x,c.y)]`
        * Пример: `Triangle[(0.0,0.0)(0.1,5.8)(7.0,7.0)]`    
    * `Quadrilateral` - 
        * Формат: `Quadrilateral[(a.x,a.y)(b.x,b.y)(c.x,c.y)(d.x, d.y)]`
        * Пример: `Quadrilateral[(0.0,0.0)(0.0,7.1)(7.0,7.0)(7.0,0.0)]`    
    * `Circle` - 
        * Формат: `Circle[(center.x,center.y)radius]`
        * Пример: `Circle[(0.0,0.6)4.5]`
        
    *Примечание:* можно использовать реализацию по умолчанию в классе `Figure`, если она подходит для конкретного случая. 

5. `public Point leftmostPoint()`\
   Возвращает крайнюю левую точку фигуры: ту, которая имеет наименьшую координату `X`.\
   Если крайних левых точек много, возвращает любую из них.  

Класс [`Point`](src/main/java/com/epam/rd/autotasks/figures/Point.java) уже реализован.

Полезные ссылки:
* [Degeneracy reference](https://en.wikipedia.org/wiki/Degeneracy_(mathematics))
* [Convex quadrilateral reference](https://en.wikipedia.org/wiki/Quadrilateral#Convex_quadrilaterals)
* [Triangle area reference](https://en.wikipedia.org/wiki/Triangle#Computing_the_area_of_a_triangle)
* [Circle area reference](https://en.wikipedia.org/wiki/Circle#Area_enclosed)
* [Quadrilateral area reference](https://en.wikipedia.org/wiki/Quadrilateral#Area_of_a_convex_quadrilateral)

## Примеры
Вы можете использовать класс [Main](src/test/java/com/epam/rd/autotasks/figures/Main.java), чтобы опробовать свой код. Далее приведено несколько примеров.  

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

