# Validations. Color Code

The purpose of this exercise is to train you to work with string values.

Estimated workload of this exercise is _45 min_.

### Description
Please, implement `validateColorCode` method in [`ColorCodeValidation`](src/main/java/com/epam/rd/autotasks/validations/ColorCodeValidation.java):

This method checks the input string for compliance with the rules for writing [HTML Color Codes](https://htmlcolorcodes.com/).

While implementing the methods you might need to come up with *regular expressions*.
You may consider using [regex101.com](https://regex101.com/) to ease designing them.

Note that input String may be null.

You can and should use following methods\classes:
- [`matches`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String))
- [`Pattern`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html)
- [`Matcher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#matcher(java.lang.CharSequence))

### Examples
- Examples of valid hex codes:

      #0B79E1 
      #6a8daf 
      #002950
      #FFF

- Examples of invalid hex codes:

      123456
      #afafah 
      #-123 
