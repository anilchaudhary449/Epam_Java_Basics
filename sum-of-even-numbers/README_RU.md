# Sum of even numbers

Цель задания – научить вас работать с массивами.

Примерное время выполнения задания: 20 минут.

### Описание

Перейдите в класс [SumOfEvenNumbers](src/main/java/com/epam/rd/autotasks/arrays/SumOfEvenNumbers.java) и реализуйте метод `sum`.

Правильная реализация должна получить массив значений `int` и вернуть сумму четных чисел.

Подробности:

- Если данный массив равен нулю или пуст, метод возвращает 0.
- Метод `sum` не должен изменять массив.
- Входной массив может содержать любое значение типа `int` от `Integer.MIN_VALUE` до `Integer.MAX_VALUE`.

### Пример

```java
int[]vals = new int[]{-2,10,0,5};
int result = SumOfEvenNumbers.sum(vals);
System.out.println(result == 8); // true
```
