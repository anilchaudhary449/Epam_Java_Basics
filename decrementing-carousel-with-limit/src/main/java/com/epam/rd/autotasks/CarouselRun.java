package com.epam.rd.autotasks;

public class CarouselRun {

    private int[] array;
    private int capacity;
    private int currentIndex = 0;
    private int actions = 0;
    private int actionLimit = -1;
    private boolean checkFinish = false;

    public CarouselRun(DecrementingCarousel dc, int actionLimit) {
        array = dc.array;
        capacity = dc.maxIndex;
        this.actionLimit = actionLimit;
    }


    public int next() {
        actions++;
        if (capacity == 0 || isFinished()) {
            return -1;
        }
        while (array[currentIndex] == 0) {
            currentIndex++;
            currentIndex%=capacity;
        }
        int a = array[currentIndex];
        if (actionLimit == -1) {
            array[currentIndex]--;
        } else {
            if(actions < actionLimit) {
                array[currentIndex]--;
            } else {
                checkFinish = true;
                return a;
            }
        }
        currentIndex++;
        currentIndex%=capacity;
        return a;
    }

    public boolean isFinished() {
        if(checkFinish) {
            return true;
        }
        for(int i = 0; i < capacity; i++) {
            if(array[i] > 0) {
                return false;
            }
        }
        return true;
    }
}