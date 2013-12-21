package com.btmatthews.havoc.project;

import java.io.InputStream;

/**
 * Created by bmatthews68 on 21/12/2013.
 */
public interface ProjectModelCompiler {

    ProjectModel compileProjectModel(InputStream inputStream);
}
