package com.btmatthews.havoc.task;

public interface Task {

    String getTaskName();

    void perform(TaskContext context);
}
