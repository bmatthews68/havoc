package com.btmatthews.havoc.java.tasks;

import com.btmatthews.havoc.task.Task;
import com.btmatthews.havoc.task.TaskContext;

public class PackageJarTask implements Task {

    @Override
    public String getTaskName() {
        return "Package JAR";
    }

    @Override
    public void perform(final TaskContext context) {
    }
}
