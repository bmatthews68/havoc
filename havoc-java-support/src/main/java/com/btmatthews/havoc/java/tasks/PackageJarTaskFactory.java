package com.btmatthews.havoc.java.tasks;

import com.btmatthews.havoc.task.Task;
import com.btmatthews.havoc.task.TaskFactory;

public class PackageJarTaskFactory implements TaskFactory {
    @Override
    public Task createTask() {
        return new PackageJarTask();
    }
}
