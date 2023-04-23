# Spiral

Цель задания – научить вас работать с массивами.

Примерное время выполнения задания: 45 минут.

### Описание
Перейдите в класс [`Spiral`](src/main/java/com/epam/rd/autotasks/Spiral.java)
и реализуйте его статический метод:

* `int[][] spiral(int rows, int columns)`\
  Возвращает двумерный массив в виде таблицы, содержащий числа от `1` до `rows * columns`. Размер таблицы будет определяться заданными параметрами.\
  Числа заполняют "таблицу" по часовой стрелке от верхнего угла по спирали.\
  Например, для значений параметров `(3, 4)`, выходной массив должен быть:
    ```
     1  2  3  4
    10 11 12  5
     9  8  7  6
    ```

### Примеры

---
Code Sample:
```java
...
int[][] spiral = Spiral.spiral(3, 4);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}

```

Output:
```
   1   2   3   4
  10  11  12   5
   9   8   7   6
```

---
Code Sample:
```java
...
int[][] spiral = Spiral.spiral(4, 3);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}

```

Output:
```
   1   2   3
  10  11   4
   9  12   5
   8   7   6
```

---
Code Sample:
```java
...
int[][] spiral = Spiral.spiral(5, 6);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}

```

Output:
```
   1   2   3   4   5   6
  18  19  20  21  22   7
  17  28  29  30  23   8
  16  27  26  25  24   9
  15  14  13  12  11  10
```

---
Code Sample:
```java
...
int[][] spiral = Spiral.spiral(5, 5);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}

```

Output:
```
   1   2   3   4   5
  16  17  18  19   6
  15  24  25  20   7
  14  23  22  21   8
  13  12  11  10   9
```

