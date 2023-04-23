# Meet Strangers

Цель задания – научить вас пользоваться простыми циклами и условными выражениями.

Примерное время выполнения задания: 20 минут.

### Описание

Перейдите в класс [HelloStrangers](src/main/java/com/epam/rd/autotasks/meetstrangers/HelloStrangers.java) и напишите простую программу, которая:
- запрашивает количество незнакомцев, с которыми нужно встретиться
- построчно читает имена незнакомцев 
- построчно выводит: "Hello, (имя незнакомца)" для каждого незнакомца.

Гарантируется, что введенное количество незнакомцев - целое число.

Частные случаи:
- Если количество незнакомцев равно нулю, программа должна вывести: "Oh, it looks like there is no one here".
- Если количество незнакомцев отрицательное, программа должна вывести: "Seriously? Why so negative?".

### Примеры

---
Input: 
```
3
Athos
Porthos
Aramis
```

Output:
```
Hello, Athos
Hello, Porthos
Hello, Aramis
```

---
Input:
```
0
```

Output:
```
Oh, it looks like there is no one here
```

---
Input:
```
-3
```

Output:
```
Seriously? Why so negative?
```

---

