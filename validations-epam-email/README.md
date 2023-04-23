# Validations. EPAM Email

The purpose of this exercise is to train you to work with string values.

Estimated workload of this exercise is _45 min_.

### Description

Please, implement `validateEpamEmail` method
in [`EpamEmailValidation`](src/main/java/com/epam/rd/autotasks/validations/EpamEmailValidation.java):

This method checks the input string for compliance with the rules for a regular EPAM email. Let us define them:

- A regular EPAM email includes firstname and lastname (in English), separated by underscore ("_").
- EPAM email always ends with "@epam.com"
- When a person gets new EPAM email, but email with this firstname and lastname is already registered, we add "1" to the
  new email. If such email is registered as well, we use "2" and so on.

While implementing the method you might need to come up with *regular expressions*. You may consider
using [regex101.com](https://regex101.com/) to ease designing them.

Note that input value may be null.

You can and should use following methods\classes:

- [`matches`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String))
- [`Pattern`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html)
- [`Matcher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#matcher(java.lang.CharSequence))

### Examples

- Valid examples

      william_shakespeare@epam.com
      lu_e@epam.com
      william_shakespeare1@epam.com 
      william_shakespeare2@epam.com

- Invalid examples

       william@epam.com
       william.shakespeare@epam.com
       william...shakespeare@epam.com
       william-shakespeare@epam.com
       shakespeare123@epam.com
       william_$hakespeare@epam.com