# Words

Цель задания - научить вас работать со строками. 

Примерное время выполнения задания: 60 мин.

### Описание

Реализуйте методы класса [`StringUtil`](src/main/java/com/epam/rd/autotasks/words/StringUtil.java):

#### 1. countEqualIgnoreCaseAndSpaces
Сигнатура метода:
```java
public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample)
```
Возвращает количество слов из массива `words` которые равны `sample` без учета регистра символов, а так же начальных и конечных пробелов.\
Если `sample` равен `null`, или `words` имеет значение `null` или пустое значение, необходимо вернуть `0`. `words` гарантированно не содержит значений `null`.

#### 2. splitWords
Сигнатура метода:
```java
public static String[] splitWords(String text)
```
Разделяет строку `text` на массив слов, используя следующие разделительные символы: `",", ".", ";", ":", " ", "?", "!"`.\
Для пустой строки, строки `null`, и строки, состоящей только из разделительных символов, возвращается значение `null`.

#### 3. convertPath
Сигнатура метода:
```java
public static String convertPath(String path, boolean toWin)
```
Преобразовывает путь `path` в путь в нотации Unix\Windows в зависимости от логического параметра.

Путь в Unix может начинаться `~` или `/`. Каждый подкаталог должен заканчиваться символом `/` кроме последнего.
Элементы пути `.` и `..` относятся к текущему каталогу и родительскому каталогy.
Имя файла не обязательно имеет расширение.\
Примеры пути Unix:
- `/folder/../folder/file.txt`
- `/dev/null`
- `file.txt`
- `folder/logs/`
- `~/user/some_logs`

Путь в Windows может начинаться с `C:`. Каждый подкаталог должен заканчиваться символом `\ ` кроме последнего.
Элементы пути `.` и `..` относятся к текущему каталогу и родительскому каталогу.
Имя файла не обязательно имеет расширение.\
Примеры путей Windows:
- `file.txt`
- `\Program Files\some_file.exe`
- `.\to_do_list.txt`
- `C:\Users\..\Cygwin`
- `.\file`

Пусть путь Unix  `~` соответствует пути Windows `C:\User` и наоборот.\
Рассмотрим корневую папку Unix `/` (то есть, когда путь начинается с `/`), которая соответствует Windows `C:\ ` и наоборот 
(но `C:\User` по-прежнему соответствует  `~`).

Если `path` уже соответствует требуемому формату (например, это путь Windows, когда требуются пути Windows и логический параметр `toWin` имеет значение `true`) возвращается `path`.\
Если `path` равен `null`, пуст, или не соответствует какому-либо формату пути (Unix, Windows), необходимо вернуть `null`.\
Гарантируется, что `path` либо является правильным, либо содержит некоторые из следующих ошибокs:
- более одного `~`
- `~` находится не вначале
- `~` смешан с `\ ` (`~` в пути Windows)
- более одного`C:`
- `C:` находится не вначале
- `C:` смешан с `/` (`C:` в пути Unix)
- `\ ` смешан с `/`

Примеры неправильных путей:
- `/folder1/folder2\folder3`
- `C:\User/root`
- `/dev/~/`
- `C:/a/b/c/d`
- `~\folder`
- `~/~`
- `~~`
- `C:\Folder\Subfolder\C:\ `

#### 4.joinWords
Сигнатура метода:
```java
public static String joinWords(String[] words)
```
Соединяет слова из массива `words` и возвращает в виде строки в следующем формате: `"[str_1, str_2, ..., str_n]"`.

Если значение `words` равно `null` или является пустым необходимо вернуть `null`. `words` гарантированно не содержат значиений `null`. `words` могут содержать пустые строки, игнорируйте их, то есть не помещайте их в результирующую строку. Если `words` содержат только пустые строки, верните `null`.

#### Подсказки
- При реализации методов вам может понадобиться использование `регулярных выражений`. Можно использовать [regex101.com](https://regex101.com/) для упрощения разработки регулярных выражений.
- Вы можете и должны использовать следующие методы и классы (кликните по названию):
    - [`String.strip`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#strip())
    - [`String.split`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#split(java.lang.String))
    - [`String.replaceAll`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#replaceAll(java.lang.String,java.lang.String))
    - [`String.replaceFirst`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#replaceFirst(java.lang.String,java.lang.String))
    - [`String.toLowerCase`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#toLowerCase())
    - [`String.equalsIgnoreCase`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#equalsIgnoreCase(java.lang.String))
    - [`String.startsWith`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#startsWith(java.lang.String))
    - [`String.matches`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String))
    - [`String.join`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#join(java.lang.CharSequence,java.lang.CharSequence...))
    - [`StringBuilder`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html)
    - [`StringJoiner`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/StringJoiner.html)
    - [`StringTokenizer`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/StringTokenizer.html)

### Примеры 
Вы можете использовать метод `main` класса [`StringUtil`](src/main/java/com/epam/rd/autotasks/words/StringUtil.java)
для проверки реализации.

```java
String[] words = new String[] {"   nice ", "nICE", "nic3"};
String sample = "NICE";
int result = StringUtil.countEqualIgnoreCaseAndSpaces(words, sample); // 2
words = new String[]{" zoOm ", " z oom", " Z O O M "};
sample = "ZOOM";
result = StringUtil.countEqualIgnoreCaseAndSpaces(words, sample); // 1
```

```java
String text = " go with ...the:;        FLOW ";
String[] result = StringUtil.splitWords(text); // ["go", "with", "the", "FLOW"]
text = ":..,,,::: ;;;      ";
result = StringUtil.splitWords(text); // null
```

```java
String winPath = "C:\\Program Files\\my_prog_file.py";
String unixPath = StringUtil.convertPath(winPath, false); // "/Program Files/my_prog_file.py"
unixPath = "../script.sh";
winPath = StringUtil.convertPath(unixPath, true); // "..\\script.sh"
unixPath = StringUtil.convertPath(unixPath, false); // "../script.sh"
unixPath = "//home/user/somefile";
winPath = StringUtil.convertPath(unixPath, true); // "C:\\home\\user\\somefile"
```

```java
String[] words = new String[]{"go", "with", "the", "", "FLOW"};
String result = StringUtil.joinWords(words); // "[go, with, the, FLOW]"
```

