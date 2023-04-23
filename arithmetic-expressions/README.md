# Arithmetic Expressions

The purpose of this exercise is to train using nested classes.

Estimated workload of this exercise is _60 min_.

### Description

In this exercise we are going to design a DSL of arithmetic expressions.

An [`Expression`](src/main/java/com/epam/rd/autotasks/arithmeticexpressions/Expression.java) is an interface.
It describes two methods:
- `int evaluate()` - returns the result of evaluating of the expression.
- `String toExpressionString()` - returns string representation of the expression.

The only non-anonymous implementation of the `Expression` is
the [`Variable`](src/main/java/com/epam/rd/autotasks/arithmeticexpressions/Variable.java) class. 
Please, implement its methods:
- `public Variable(String name, int value)` - a constructor of the `Variable` class.
  Sets name and value of the variable.
- `public void setValue(int value)` - a method to change the value of the variable.
- `public int evaluate()` - returns the value of the variable.
- `public String toExpressionString()` - returns the name of the variable.

All other implementations of the `Expression` interface must be anonymous, defined in static methods of
the [`Expressions`](src/main/java/com/epam/rd/autotasks/arithmeticexpressions/Expressions.java) class:
- `Variable var(String name, int value)` - returns a `Variable` with given name and value. A simple convenience method.
- `Expression val(int value)` - returns an `Expression` holding a value. 
  Consider following methods' implementation  details:
    - `int evaluate()` - returns the given value.
    - `String toExpressionString()` - returns a string representation of the given value.
      Enclose with `(`, `)` braces if the value is negative.
- `Expression sum(Expression... members)` - returns an `Expression` holding a sum of the given members.
  Consider that it is guaranteed that at least two members will be given each method call.
  Consider following methods' implementation  details:
  - `int evaluate()` - returns the sum of evaluation result of all the given members.
  - `String toExpressionString()` - returns a string representation of the given sum.
    Example: `sum(val(1), val(2), val(3)).toExpressionString()` results to `(1 + 2 + 3)`.
- `Expression product(Expression... members)` - returns an `Expression` holding a product of the given members.
  Consider that it is guaranteed that at least two members will be given each method call.
  Consider following methods' implementation  details:
  - `int evaluate()` - returns the product of evaluation result of all the given members.
  - `String toExpressionString()` - returns a string representation of the given product.
    Example: `product(val(1), val(2), val(3)).toExpressionString()` results to `(1 * 2 * 3)`.
- `Expression difference(Expression minuend, Expression subtrahend)` - returns an `Expression` holding a difference
  between the given minuend and the given subtrahend.
  Consider following methods' implementation  details:
  - `int evaluate()` - returns the difference between 
    the given minuend evaluation result and 
    the given subtrahend evaluation result.
  - `String toExpressionString()` - returns a string representation of the given difference.
    Example: `product(val(1), val(2)).toExpressionString()` results to `(1 - 3)`.
- `Expression fraction(Expression dividend, Expression divisor)` - returns an `Expression` holding a ratio
  of the given dividend to the given divisor.
  Note that it refers to an *integer* division operation, i.e. `fraction(val(3), val(4)).evaluate()` result to `0`.
  Consider following methods' implementation  details:
  - `int evaluate()` - returns the ratio of the given dividend evaluation result to the given divisor evaluation result.
  - `String toExpressionString()` - returns a string representation of the given fraction.
    Example: `fraction(val(1), val(2)).toExpressionString()` results to `(1 / 2)`.


**Important restriction:** Note that in this exercise you **may not** add more non-anonymous classes.

### Examples

See usage examples in tests inside [src/test/java](src/test/java).
