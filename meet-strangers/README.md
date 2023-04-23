# Meet Strangers

The purpose of this exercise is to train you in usage of simple cycles and conditional statements.

Estimated workload of this exercise is _20 min_.

### Description

Please, proceed to [HelloStrangers](src/main/java/com/epam/rd/autotasks/meetstrangers/HelloStrangers.java) class
and write a program that:
- asks for a number - amount of strangers to meet,
- then reads stranger names line by line 
- and, finally, prints line by line "Hello, _stranger name_" for each stranger.

It is guaranteed that the input is not null.
It is guaranteed that the input of strangers count is int number.

Consider special cases: 
- If strangers count is zero, then program must print "Oh, it looks like there is no one here".
- If strangers count is negative, then program must print "Seriously? Why so negative?".

*Hint*: In case you use the Scanner class, it might be helpful sure to check strings it reads be non-empty.

### Examples

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