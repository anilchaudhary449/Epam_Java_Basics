# Requirements

The purpose of this exercise is to train you to work with exceptions, to raise them in particular.

Estimated workload of this exercise is _30 min_.

### Description
Please, implement [Requirements](src/main/java/com/epam/rd/autotasks/requirements/Requirements.java) methods: 
1. `requireNonNull(Object)` should throw new NullPointerException if object is `null`
1. `requireNonNull(Object, String)` should throw new NullPointerException with message if object is `null`
1. `checkArgument(boolean)` if boolean is `false` should throw new IllegalArgumentException 
1. `checkArgument(boolean, String)` if boolean is `false` should throw new IllegalArgumentException with message 
1. `checkState(boolean)` if boolean is `false` should throw new IllegalStateException 
1. `checkState(boolean, String)` if boolean is `false` should throw new IllegalStateException with message 
1. `checkIndex(int, int)` if index out of bounds throw new IndexOutOfBoundsException. Index must be inside `[0, size)` section. 

Such methods might be helpful to check arguments, object states. 
