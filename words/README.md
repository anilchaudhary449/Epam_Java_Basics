# Words

The purpose of this exercise is to train you to work with strings.

Estimated workload of this exercise is _60 min_.

### Description

Please, implement [`StringUtil`](src/main/java/com/epam/rd/autotasks/words/StringUtil.java) class methods:

#### 1. countEqualIgnoreCaseAndSpaces
Method signature:
```java
public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample)
```
Return the number of words from `words` array that are equal to `sample` ignoring characters case and leading and trailing spaces.\
If `sample` is `null` or `words` is `null` or empty, return `0`. `words` is guaranteed to not contain `null` values.

#### 2. splitWords
Method signature:
```java
public static String[] splitWords(String text)
```
Split `text` string into array of words using following separating characters: `",", ".", ";", ":", " ", "?", "!"`.\
For empty string, `null` string, and string consisting only of separating characters return `null`

#### 3. convertPath
Method signature:
```java
public static String convertPath(String path, boolean toWin)
```
Convert `path` to Unix\Windows path depending on a boolean parameter.

Unix path may start with `~` or `/`. Every subdirectory must end with `/` character except the last one.
Path elements `.` and `..` refer to current directory and parent directory.
Filename doesn't necessarily have the extension.\
Unix path examples:
- `/folder/../folder/file.txt`
- `/dev/null`
- `file.txt`
- `folder/logs/`
- `~/user/some_logs`

Windows path may start with `C:`. Every subdirectory must end with `\ ` character except the last one.
Path elements `.` and `..` refer to current directory and parent directory.
Filename doesn't necessarily have the extension.\
Windows path examples:
- `file.txt`
- `\Program Files\some_file.exe`
- `.\to_do_list.txt`
- `C:\Users\..\Cygwin`
- `.\file`

Let's consider Unix `~` path to correspond to Windows `C:\User` path and vice versa.\
Let's consider Unix `/` root folder (i.e., when the path starts with `/`) to correspond to Windows `C:\ ` drive and vice
versa (but `C:\User` still corresponds to `~`).

If `path` already corresponds to the required format (for instance, is Windows path when Windows paths is needed and
`toWin` boolean parameter is `true`) return `path`.\
If `path` is `null`, empty, or doesn't correspond to any path format (Unix, Windows), return `null`.\
It is guaranteed that `path` is either a correct path, or it has some of the following errors:
- More than one `~`
- `~` is not at the start
- `~` mixed with `\ ` (`~` in Windows path)
- More than one `C:`
- `C:` is not at the start
- `C:` mixed with `/` (`C:` in Unix path)
- `\ ` mixed with `/`

Illegal paths example:
- `/folder1/folder2\folder3`
- `C:\User/root`
- `/dev/~/`
- `C:/a/b/c/d`
- `~\folder`
- `~/~`
- `~~`
- `C:\Folder\Subfolder\C:\ `

#### 4.joinWords
Method signature:
```java
public static String joinWords(String[] words)
```
Join words from `words` array and return as a string in the following format: `"[str_1, str_2, ..., str_n]"`.

If `words` is `null` or empty return `null`. `words` is guaranteed to not contain `null` values. `words` may contain empty strings, ignore them, i. e. don't put them in the resulting string. If `words` contains only empty strings return `null`.

#### Hints
- While implementing the methods you might need to come up with `regular expressions`. You may consider using [regex101.com](https://regex101.com/) to easier design of regular expressions.
- You can and should use following methods\classes (click on the name):
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

### Examples
You may use `main` method of [`StringUtil`](src/main/java/com/epam/rd/autotasks/words/StringUtil.java)
class to test your implementation.
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
