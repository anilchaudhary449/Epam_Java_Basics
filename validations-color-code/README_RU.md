# Validations. Color Code

Цель задания - научить вас работать со строками.

Примерное время выполнения задания: 45 мин.

### Описание 
Реализуйте метод `validateColorCode` в [`ColorCodeValidation`](src/main/java/com/epam/rd/autotasks/validations/ColorCodeValidation.java):

Он проверяет входную строку на соответствие правилам написания [HTML Color Codes](https://htmlcolorcodes.com/).

При реализации методов вам может понадобиться использовать *регулярные выражения*.
Вы можете использовать [regex101.com](https://regex101.com/), чтобы облегчить их создание.

Обратите внимание, что входная строка может быть равна `null`.

Вы можете и должны использовать следующие методы и классы: 
- [`matches`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String))
- [`Pattern`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html)
- [`Matcher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#matcher(java.lang.CharSequence))

### Примеры
- Пример действительных шестнадцатеричных кодов:

      #0B79E1 
      #6a8daf 
      #002950
      #FFF

- Пример недействительных шестнадцатеричных кодов:

      123456
      #afafah 
      #-123 

