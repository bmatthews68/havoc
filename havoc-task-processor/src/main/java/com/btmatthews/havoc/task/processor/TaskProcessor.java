package com.btmatthews.havoc.task.processor;

import com.btmatthews.havoc.task.Task;
import com.btmatthews.havoc.task.TaskContext;

/**
 * Created by bmatthews68 on 19/12/2013.
 */
public interface TaskProcessor {

    void addTask(Iterable<Task> preRequisiteTasks, Task task);

    void performTasks(TaskContext context);
}
