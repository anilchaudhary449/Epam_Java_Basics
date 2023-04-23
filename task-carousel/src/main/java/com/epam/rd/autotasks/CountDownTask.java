package com.epam.rd.autotasks;

public class CountDownTask implements Task {
    public int value;

    public CountDownTask(int value) {
        this.value = value;
        if (value < 0) this.value = 0;
        else if (this.value == 0) {
            isFinished();
        }
    }

    public int getValue() {
        return value;
    }


    @Override
    public void execute() {
        if (value > 0) {
            value--;
        }
        if (getValue() == 0) {
            isFinished();
        }
    }

    @Override
    public boolean isFinished() {
        return value == 0;
    }
}