package com.btmatthews.havoc.core.resources.local;

import com.btmatthews.havoc.core.resources.ResourceResolutionCallback;
import com.btmatthews.havoc.core.resources.ResourceResolver;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmatthews68 on 20/12/2013.
 */
public class LocalFileResolver implements ResourceResolver<File> {

    private final List<File> roots = new ArrayList<File>();
    private final List<String> inclusions = new ArrayList<String>();
    private final List<String> exclusions = new ArrayList<String>();

    LocalFileResolver(final List<File> roots, final List<String> inclusions, final List<String> exclusions) {

        this.roots.addAll(roots);
        this.inclusions.addAll(inclusions);
        this.exclusions.addAll(exclusions);
    }

    @Override
    public void resolve(final ResourceResolutionCallback<File> callback) {
        for (final File root : roots) {
            if (root.exists()) {
                resolve(root, null, callback);
            }
        }
    }

    public void resolve(final File root,
                        final String path,
                        final ResourceResolutionCallback<File> callback) {
        final File folder = path != null ? new File(root, path) : root;
        for (final File file : folder.listFiles()) {
            final String newPath = new StringBuilder(path)
                    .append(File.pathSeparator)
                    .append(file.getName())
                    .toString();
            if (file.isDirectory()) {
                resolve(root, newPath, callback);
            } else {
                if (isIncluded(newPath) && !isExcluded(newPath)) {
                    callback.resolved(file);
                }
            }
        }
    }

    private boolean isIncluded(final String path) {
        if (inclusions.size() > 0) {
            return false;
        }
        return true;
    }

    private boolean isExcluded(final String path) {
        if (exclusions.size() > 0) {
        }
        return false;
    }
}
