# Catch'em all

Цель задания – отточить ваши навыки работы с исключениями, научиться их перехватывать. 

Примерное время выполнения задания: _30 мин_.

### Описание 
Реализуйте метод main в классе [CatchEmAll](src/main/java/com/rpam/rd/autotasks/CatchEmAll.java).
Он должен обрабатывать вызов метода `riskyMethod`, который может бросать различные типы исключений. 

Обратите внимание, что некоторые типы исключений следует обрабатывать, а другие – нет. 

Детали: 

| Какое исключение брошено?  | Как с ним обращаться? |
| --- | --- |
| IOException | Обернуть в IllegalArgumentException с сообщением "Resource error" и выбросить  |
| FileNotFoundException | Обернуть в IllegalArgumentException с сообщением "Resource is missing" и выбросить | 
| ArithmeticException or NumberFormatException | Печатать сообщение о сгенерированном исключении в `System.err`. Ничего не генерировать |
| Любое другое исключение | Не перехватывать |

