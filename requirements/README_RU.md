# Requirements

Цель задания – отточить ваши навыки работы с исключениями и их выбрасыванием. 

Примерное время выполнения задания: _30 мин_. 

### Описание 
Реализуйте методы класса [Requirements](src/main/java/com/epam/rd/autotasks/requirements/Requirements.java): 
1. `requireNonNull(Object)` должен генерировать исключение NullPointerException, если объект равен `null`
1. `requireNonNull(Object, String)` должен генерировать исключение NullPointerException с сообщением, если объект имеет значение `null`
1. `checkArgument(boolean)` должен вызывать исключение IllegalArgumentException, если значение параметра `false`
1. `checkArgument(boolean, String)` должен выбрасывать исключение IllegalArgumentException, если значение параметра `false`
1. `checkState(boolean)` должен вызывать исключение IllegalStateException с сообщением, если значение параметра `false`
1. `checkState(boolean, String)` должен генерировать исключение IllegalStateException с сообщением, если значение параметра `false`
1. `checkIndex(int, int)` генерирует исключение IndexOutOfBoundsException, если индекс выходит за границы адресного пространства. Индексное пространство ограничено: `[0; size)`.

Эти методы могут быть полезны для проверки аргументов или состояния объекта перед его использованием.  
