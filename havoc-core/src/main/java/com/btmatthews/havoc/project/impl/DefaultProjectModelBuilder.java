package com.btmatthews.havoc.project.impl;

import com.btmatthews.havoc.project.ProjectModel;
import com.btmatthews.havoc.project.ProjectModelBuilder;

/**
 * Created by bmatthews68 on 21/12/2013.
 */
public class DefaultProjectModelBuilder implements ProjectModelBuilder {

    private String groupId;
    private String artifactId;
    private String version;
    private String type = "jar";

    @Override
    public ProjectModelBuilder setGroupId(final String groupId) {
        this.groupId = groupId;
        return this;
    }

    @Override
    public ProjectModelBuilder setArtifactId(final String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    @Override
    public ProjectModelBuilder setVersion(final String version) {
        this.version = version;
        return this;
    }

    @Override
    public ProjectModelBuilder setType(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public ProjectModel build() {
        final DefaultProjectModel projectModel = new DefaultProjectModel();
        projectModel.setGroupId(groupId);
        projectModel.setArtifactId(artifactId);
        projectModel.setVersion(version);
        projectModel.setType(type);
        return projectModel;
    }
}
