# Optional Max

Цель задания - научить вас работать с массивами и Optional. 

Примерное время выполнения задания: _45 мин_.

### Описание 
Реализуйте метод `max` класса [`MaxMethod`](src/main/java/com/epam/rd/autotasks/max/MaxMethod.java).

Правильная реализация должна получить массив значений типа `int` и вернуть его максимальное значение.

Детали:
- метод возвращает результат в виде OptionalInt
- если входящий массив пуст или равен `null`, возвращается пустой OptionalInt. 

### Пример
```java
int[] vals = new int[]{-2, 0, 10, 5};
OptionalInt result = MaxMethod.max(vals);
System.out.println(result.getAsInt() == 10); // true
```
