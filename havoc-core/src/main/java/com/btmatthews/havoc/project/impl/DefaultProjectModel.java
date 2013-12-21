package com.btmatthews.havoc.project.impl;

import com.btmatthews.havoc.project.ProjectModel;

/**
 * Created by bmatthews68 on 21/12/2013.
 */
public class DefaultProjectModel implements ProjectModel {
    private String groupId;
    private String artifactId;
    private String version;
    private String type;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(final String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(final String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
