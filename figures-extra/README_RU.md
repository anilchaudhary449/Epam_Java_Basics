# Figures. Extra Challenge

Цель задания – научить вас работать с классами, методами и наследованием. 

Примерное время выполнения задания: 60 мин.  

Дано: класс `Point`, абстрактный класс `Figure` и классы `Triangle`, `Quadrilateral`, `Circle`.

Сделайте `Triangle`, `Quadrilateral`, `Circle` наследниками класса `Figure`.

Реализуйте методы классов `Triangle`, `Quadrilateral`, `Circle`:

1. Конструкторы со следующими параметрами:  
   * `Triangle` - три вершины (точки) в качестве параметров.  
   * `Quadrilateral` - четыре вершины (точки) в качестве параметров.
   * `Circle` - точка центра и двойное значение радиуса.  

     Убедитесь, что фигуры невырожденные.\
     Все фигуры должны иметь ненулевую площадь.\
     Четырехугольник должен быть выпуклым.\
     Если фигура не соответствует условиям, бросьте исключение IllegalArgumentException.\
     *Примечание*: невырожденный выпуклый четырехугольник делится на четыре невырожденных треугольника своими диагоналями.\
     *Примечание*: вычисления в `double` не совсем точны. Используйте *error delta*, где необходимо.
2. `public Point centroid()`\
  Возвращает геометрический центр фигуры.\
  Геометрический центр лежит в центре масс плоской фигуры, но не в барицентре.\
  Другими словами, это должен быть *"центр массы по площади"*. 
3. `public boolean isTheSame(Figure figure)`\
  Две фигуры считаются одинаковыми, только если:  
   * они одного типа 
   * они совпадают (например, имеют одинаковые вершины). 
     
     *Примечание*: порядок вершин одинаковых фигур может не быть одинаковым.\
     *Примечание*: вычисления в `double` не совсем точны. Используйте *error delta*, где необходимо.

  *Примечание для любознательных: Может показаться, что этот метод практически такой же, как и метод `equals()`, но это не так. Метод `equals` требует согласованного поведения вместе с методом `hashCode()`, и его довольно сложно установить с точки зрения приблизительного равенства, как в этом задании.*

Вы можете использовать метод `main` класса `Figure`, чтобы опробовать ваш код. 

Полезные ссылки:  
* [Degeneracy reference](https://en.wikipedia.org/wiki/Degeneracy_(mathematics))
* [Convex quadrilateral reference](https://en.wikipedia.org/wiki/Quadrilateral#Convex_quadrilaterals)
* [Circle centroid reference](https://www.engineeringintro.com/mechanics-of-structures/centre-of-gravity/centroid-of-circle/)
* [Triangle centroid reference](https://en.wikipedia.org/wiki/Centroid#Of_a_triangle)
* [Quadrilateral centroid reference](https://en.wikipedia.org/wiki/Quadrilateral#Remarkable_points_and_lines_in_a_convex_quadrilateral)
* [Quadrilateral centroid reference 2](https://sites.math.washington.edu/~king/java/gsp/center-mass-quad.html)

