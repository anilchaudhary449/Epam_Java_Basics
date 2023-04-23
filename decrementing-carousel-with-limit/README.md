# Decrementing Carousel With Limit

The purpose of this exercise is to train you to use extend classes with `extends` keyword.

Estimated workload of this exercise is _30 min_.

Note, that if you have not done the "Decrementing Carousel" exercise,
you have to implement `DecrementingCarousel` and `CarouselRun` classes.
Details are specified in [DC.md](DC.md).

### Description

In this exercise you need to extend [`DecrementingCarousel`](src/main/java/com/epam/rd/autotasks/DecrementingCarousel.java).
You need to implement [`DecrementingCarouselWithLimitedRun`](src/main/java/com/epam/rd/autotasks/DecrementingCarouselWithLimitedRun.java).
This subclass must decrement elements as a usual DecrementingCarousel.
The difference is that this implementation must produce a carousel run,
which limits number of calls to the `next` method.
When the limit of calls reached carousel run must consider itself finished.

### Examples

Empty case:
```java
CarouselRun run = new DecrementingCarouselWithLimitedRun(7, 5).run();
System.out.println(run.isFinished()); //true
System.out.println(run.next()); //-1
```

Regular case:
```java
DecrementingCarousel carousel = new DecrementingCarouselWithLimitedRun(7, 10);

carousel.addElement(20);
carousel.addElement(30);
carousel.addElement(10);

CarouselRun run = carousel.run();

System.out.println(run.isFinished()); //false

System.out.println(run.next()); //20
System.out.println(run.next()); //30
System.out.println(run.next()); //10

System.out.println(run.next()); //19
System.out.println(run.next()); //29
System.out.println(run.next()); //9

System.out.println(run.next()); //18
System.out.println(run.next()); //28
System.out.println(run.next()); //8

System.out.println(run.next()); //17

System.out.println(run.isFinished()); //true
System.out.println(run.next()); //-1
```