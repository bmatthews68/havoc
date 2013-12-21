package com.btmatthews.havoc.java.tasks;

import com.btmatthews.havoc.task.Task;
import com.btmatthews.havoc.task.TaskContext;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.*;
import javax.tools.JavaCompiler.CompilationTask;
import java.io.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class CompileJavaTask implements Task {

    @Override
    public String getTaskName() {
        return "Compile Java";
    }

    @Override
    public void perform(final TaskContext context) {
        final StringWriter compilerOutput = new StringWriter();
        final DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
        final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        final StandardJavaFileManager stdFileManager = compiler.getStandardFileManager(diagnostics, null, null);
        final CompilationTask compilerTask = compiler.getTask(
                compilerOutput,
                stdFileManager,
                diagnostics,
                getCompilationOptions(context),
                null,
                getCompilationUnits(context));
        if (compilerTask.call()) {
        } else {
        }
    }

    private Iterable<String> getCompilationOptions(final TaskContext context) {
        return new ArrayList<String>();
    }

    private Iterable<JavaFileObject> getCompilationUnits(final TaskContext context) {
        final List<JavaFileObject> compilationUnits = new ArrayList<JavaFileObject>();
        //compilationUnits.add(new SimpleJavaFileObject("a.java"));
        return compilationUnits;
    }
}
