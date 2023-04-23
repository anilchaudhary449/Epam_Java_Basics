package com.epam.rd.autotasks;

import java.util.Objects;

public class CompleteByRequestTask implements Task {
    String isComplete = "no";
    String isExecute = "no";
    String isSecondExecute = "no";

    @Override
    public void execute() {
        isExecute = "yes";
        if (Objects.equals(isComplete, "yes")) {
            isSecondExecute = "yes";
        }
    }

    @Override
    public boolean isFinished() {
        return Objects.equals(isComplete, "yes") && Objects.equals(isExecute, "yes") && Objects.equals(isSecondExecute, "yes");
    }

    public void complete() {
        isComplete = "yes";
    }
}