package com.btmatthews.havoc.task.impl;

import com.btmatthews.havoc.java.tasks.CompileJavaTask;
import com.btmatthews.havoc.java.tasks.PackageJarTask;
import com.btmatthews.havoc.task.Task;
import com.btmatthews.havoc.task.processor.TaskProcessor;
import com.btmatthews.havoc.task.processor.impl.DefaultTaskProcessor;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by bmatthews68 on 19/12/2013.
 */
public class TestDefaultTaskProcessor {

    @Test
    public void x() {
        final TaskProcessor taskProcessor = new DefaultTaskProcessor();
        final Task compileJavaTask = new CompileJavaTask();
        final Task packageJarTask = new PackageJarTask();
        taskProcessor.addTask(Collections.EMPTY_LIST, compileJavaTask);
        taskProcessor.addTask(Arrays.asList(compileJavaTask), packageJarTask);
        taskProcessor.performTasks(null);
    }
}
