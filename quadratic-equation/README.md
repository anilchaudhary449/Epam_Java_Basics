# Quadratic Equation

The purpose of this exercise is to train you to design programs that need decision trees. 

Estimated workload of this exercise is _30 min_.

### Description

Please, proceed to the [QuadraticEquation](src/main/java/com/epam/rd/autotasks/QuadraticEquation.java)
class and implement a program to solve quadratic equations.

For the given quadratic equation coefficients (**ax<sup>2</sup> + bx + c = 0**),
return one or two roots of the equation if there is any in the set of real numbers.

Input value is given via `System.in`. Output value must be printed to `System.out`.

Output format is:
* *"x<sub>1</sub> x<sub>2</sub>"* (two roots in any order separated by space) if there are two roots,
* *"x"* (just the value of the root) if there is the only root,
* *"no roots"* (just a string value "no roots") if there is no root.

The `a` parameter is guaranteed to be not zero.

Hint: [Quadratic formula reference](https://en.wikipedia.org/wiki/Quadratic_formula)

### Examples

---
Input: `1 -2 1`

Output: `1`

---
Input: `2 5 -3`

Output: `-3 0.5`

---
Input: `2 2 2`

Output: `no roots`

---
