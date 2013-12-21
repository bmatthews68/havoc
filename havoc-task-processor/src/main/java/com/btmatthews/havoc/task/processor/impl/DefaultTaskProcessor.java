package com.btmatthews.havoc.task.processor.impl;

import com.btmatthews.havoc.task.Task;
import com.btmatthews.havoc.task.TaskContext;
import com.btmatthews.havoc.task.processor.TaskProcessor;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.BreadthFirstIterator;

import java.util.Iterator;

public class DefaultTaskProcessor implements TaskProcessor {

    private DirectedGraph<Task, DefaultEdge> graph = new DefaultDirectedGraph<Task, DefaultEdge>(DefaultEdge.class);

    public void addTask(final Iterable<Task> preRequisiteTasks,
                        final Task task) {
        graph.addVertex(task);
        for (final Task preRequisiteTask : preRequisiteTasks) {
            graph.addEdge(preRequisiteTask, task);
        }
    }

    public void performTasks(final TaskContext context) {
        final Iterator<Task> taskIterator = new BreadthFirstIterator<Task, DefaultEdge>(graph);
        while (taskIterator.hasNext()) {
            final Task task = taskIterator.next();
            task.perform(context);
        }
    }
}
