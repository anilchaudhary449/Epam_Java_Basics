package com.epam.rd.autotasks;

import java.util.ArrayList;

public class TaskCarousel {

    private final int capacity;
    private int execute_pointer;

    public TaskCarousel(int capacity) {
        this.capacity = capacity;
        execute_pointer = -1;
    }

    ArrayList<Task> taskArrayList = new ArrayList<>();

    public boolean addTask(Task task) {
        if (task instanceof CountDownTask && ((CountDownTask) task).getValue() == 0) {
            return false;
        }
        if (task.isFinished() || isFull() || taskArrayList.size() >= capacity) {
            return false;
        }

        taskArrayList.add(task);
        return true;

    }

    public void deleteTask(int cindex) {
        taskArrayList.remove(cindex);
    }

    public boolean execute() {
        if (isEmpty()) return false;
        execute_pointer++;

        if (execute_pointer >= taskArrayList.size()) {
            execute_pointer = 0;
        }
        Task currentTask = taskArrayList.get(execute_pointer);

        if (currentTask != null && !currentTask.isFinished()) {
            currentTask.execute();
            if (currentTask.isFinished()) {
                deleteTask(execute_pointer);
                execute_pointer--;
            }
            return true;
        } else return execute();
    }

    public boolean isFull() {
        return capacity == taskArrayList.size();
    }

    public boolean isEmpty() {
        return taskArrayList.isEmpty();
    }

    public static void main(String[] args) {
        TaskCarousel carousel = new TaskCarousel(4);

        System.out.println(carousel.isEmpty()); //true
        System.out.println(carousel.isFull()); //false
        System.out.println(carousel.execute()); //false

        CountDownTask task = new CountDownTask(2);
        System.out.println(carousel.addTask(task)); //true

        System.out.println(carousel.isEmpty()); //false //no
        System.out.println(carousel.isFull()); // false

        System.out.println(task.getValue()); //2
        System.out.println(carousel.execute()); //true //no
        System.out.println(task.getValue()); //1 //no
        System.out.println(carousel.execute()); //true //no
        //System.out.println(0, task.getValue()); //0

        System.out.println(carousel.execute()); //false
        System.out.println(carousel.isEmpty()); //true
    }
}
