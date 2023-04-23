# Validations. EPAM Email

Цель задания - научить вас работать со строками.

Примерное время выполнения задания: 45 мин.

### Описание 

Реализуйте метод `validateEpamEmail`
в [`EpamEmailValidation`](src/main/java/com/epam/rd/autotasks/validations/EpamEmailValidation.java):

Этот метод проверяет входную строку на соответствие правилам для обычного электронного адреса EPAM. Определим их: 

- Стандартный электронный адрес в EPAM включает имя и фамилию (на английском языке), разделенные знаком подчеркивания("_").
- Электронные адреса EPAM всегда заканчиваются на "@epam.com".
- Если человек получает новый электронный адрес в EPAM, а адрес с таким именем и фамилией уже зарегистрирован, необходимо добавить "1" к новому электронному адресу. Если такой адрес электронной почты так же уже существует, используйте "2" и так далее.

При реализации методов вам может понадобиться использовать *регулярные выражения*. . Вы можете использовать [regex101.com](https://regex101.com/) чтобы упростить их создание.

Обратите внимание, что входная строка может быть равна `null`.

Вы можете и должны использовать следующие методы и классы:

- [`matches`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String))
- [`Pattern`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html)
- [`Matcher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#matcher(java.lang.CharSequence))

### Примеры  

- Корректные примеры: 

      william_shakespeare@epam.com
      lu_e@epam.com
      william_shakespeare1@epam.com 
      william_shakespeare2@epam.com

- Некорректные примеры: 

       william@epam.com
       william.shakespeare@epam.com
       william...shakespeare@epam.com
       william-shakespeare@epam.com
       shakespeare123@epam.com
       william_$hakespeare@epam.com
