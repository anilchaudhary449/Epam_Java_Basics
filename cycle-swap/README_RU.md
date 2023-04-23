# Cycle Swap

Цель задания – научить вас работать с массивами.

Примерное время выполнения задания: 30 минут.

### Описание
Перейдите в класс [`CycleSwap`](src/main/java/com/epam/rd/autotasks/CycleSwap.java) и реализуйте его статические методы:

* `void cycleSwap(int[] array)`\
  Сдвигает все элементы в данном массиве вправо на 1 позицию. \
  В этом случае последний элемент массива становится первым.\
  Например, `1 3 2 7 4` становится `4 1 3 2 7`.

* `void cycleSwap(int[] array, int shift)`\
  Сдвигает все элементы в заданном массиве вправо на `shift` позиций.\
  Гарантируется, что значение сдвига неотрицательное и не больше длины массива.\
  Например, `1 3 2 7 4` со сдвигом `3` становится `2 7 4 1 3`.

Для большего интереса при выполнении задания попробуйте не использовать циклы в своем коде (это не обязательно).

Обратите внимание, что входной массив может быть пустым.

### Примеры

---
Code Sample:
```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array);
System.out.println(Arrays.toString(array));
```

Output:
```
[4, 1, 3, 2, 7]
```

---
Code Sample:
```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array, 2);
System.out.println(Arrays.toString(array));
```

Output:
```
[7, 4, 1, 3, 2]
```

---
Code Sample:
```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array, 5);
System.out.println(Arrays.toString(array));
```

Output:
```
[1, 3, 2, 7, 4]
```

