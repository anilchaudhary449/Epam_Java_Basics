# Catch'em all

The purpose of this exercise is to train you to work with exceptions, to handle them in particular.

Estimated workload of this exercise is _30 min_.

### Description
Please, implement the main method in [CatchEmAll](src/main/java/com/rpam/rd/autotasks/CatchEmAll.java) class.
It must handle a call to a risky method that can throw different types of exceptions.

Please, note that some types of exceptions should be handled, while others – shouldn’t.

Details:

| What is thrown | How to handle |
| --- | --- |
| IOException | Wrap in an IllegalArgumentException with a message "Resource error" and throw it |
| FileNotFoundException | Wrap in an IllegalArgumentException with a message "Resource is missing" and throw it | 
| ArithmeticException or NumberFormatException | Print a message of the thrown exception to System.err and do not throw anything |
| Any other Exceptions | Should not be caught |