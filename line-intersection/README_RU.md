# Line Intersection

Цель задания – научить вас работать с классами и методами.

Примерное время выполнения задания: 45 минут. 

### Описание

Вам необходимо реализовать метод `intersection(Line)` в классе [`Line`](src/main/java/com/epam/rd/autotasks/intersection/Line.java).
Он должен возвращать точку пересечения двух линий [`Point`](src/main/java/com/epam/rd/autotasks/intersection/Point.java).

Обратите внимание, что линии определяются линейными уравнениями: `y = k * x + b`.
Конструктор `Line` принимает в качестве параметров коэффициенты `k` и `b`.

Если линии совпадают или не пересекаются, метод должен возвращать значение null. 
Вас может удивить, что в задании используется `int` для аргументов и полей координат. 
Дело в том, что использование `double` внесет некоторые дополнительные сложности, которых авторы хотели избежать в этом базовом упражнении. Все тесты выбраны так, чтобы производить вычисления без остатков.

Вы можете проверить свой результат в классе [`Main`](src/main/java/com/epam/rd/autotasks/intersection/Main.java).

### Пример

```java
public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1,1);
        Line line2 = new Line(-1,3);

        System.out.println(line1.intersection(line2)); // (1;2)
    }
}
```


