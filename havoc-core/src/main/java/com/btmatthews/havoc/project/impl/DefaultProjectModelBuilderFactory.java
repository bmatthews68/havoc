package com.btmatthews.havoc.project.impl;

import com.btmatthews.havoc.project.ProjectModelBuilder;
import com.btmatthews.havoc.project.ProjectModelBuilderFactory;

/**
 * Created by bmatthews68 on 21/12/2013.
 */
public class DefaultProjectModelBuilderFactory implements ProjectModelBuilderFactory {
    @Override
    public ProjectModelBuilder createBuilder() {
        return new DefaultProjectModelBuilder();
    }
}
