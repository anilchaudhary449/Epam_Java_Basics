package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    private final int actionLimit;

    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit = actionLimit;
    }

    public CarouselRun run(){
        if (run) {
            return null;
        } else {
            CarouselRun cr = new CarouselRun(this, actionLimit);
            run = true;
            return cr;
        }
    }
}