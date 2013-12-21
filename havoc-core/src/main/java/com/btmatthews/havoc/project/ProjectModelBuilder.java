package com.btmatthews.havoc.project;

/**
 * Created by bmatthews68 on 21/12/2013.
 */
public interface ProjectModelBuilder {

    ProjectModelBuilder setGroupId(String groupId);

    ProjectModelBuilder setArtifactId(String artifactId);

    ProjectModelBuilder setVersion(String version);

    ProjectModelBuilder setType(String type);

    ProjectModel build();
}
