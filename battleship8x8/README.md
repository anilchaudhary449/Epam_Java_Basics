# Battleship 8x8

The purpose of this exercise is to train you to work with wrapper classes and their static methods.

Estimated workload of this exercise is _3 hours_.

### Description
Please, implement methods in [Battleship8x8](src/main/java/com/epam/rd/autotasks/Battleship8x8.java) class.

Battleship8x8 represents a 8x8 map for [Battleship game](https://en.wikipedia.org/wiki/Battleship_(game)).
An important detail is that Battleship8x8 uses a `ships` field of long type to store ships locations 
and a `shots` field of long type to register shots.

Fields of long type value store 64 bits each. Consider them as 8 rows per 8 cells.
'0' bits represent empty cells, '1' bits represent cells seized by ships or registered shots.

- `public boolean shoot(String shot)` - Registers a shot and returns `true` if the shot hits a ship. 
A shot is a combination of one of A-H letters and one of 1-8 digits
- `public String state()` - Returns a string representing state of the map.
Map string is 8 lines per 8 characters separated by "\n". Use following symbols: 
  - '.' - an empty cell
  - '×' - an empty cell that has been shot
  - '☐' - a cell seized by a ship
  - '☒'- a cell seized by a ship that has been shot

You must not add or change new fields.
Consider using static methods of wrapper classes.

### Example
Consider a map information encoded as a long value: 
```java
long map = -1150950973573693440L;
```
You may consider it represented as binary literal:
```java
/*
    11110000
    00000111
    00000000
    00110000
    00000010
    01000000
    00000000
    00000000
 */
long map = 0b11110000_00000111_00000000_00110000_00000010_01000000_00000000_00000000L;
```
Consider rows be marked with digits and columns be marked with letters:
```java
/*
    ABCDEFGH
   ┌────────
  1│11110000
  2│00000111
  3│00000000
  4│00110000
  5│00000010
  6│01000000
  7│00000000
  8│00000000
 */
```
Consider the following list of shots:
```java
List<> shots = List.of("A1", "B2", "C3", "D4");
```
Then we could use `Battleship8x8` API:
```java
Battleship8x8 battle = new Battleship8x8(map);
shots.forEach(battle::shoot);
System.out.println(battle.state());
```
The result would be the following:
```
☒☐☐☐....
.×...☐☐☐
..×.....
..☐☒....
......☐.
.☐......
........
........
```
