package com.btmatthews.havoc.core.resources.local;

import com.btmatthews.havoc.core.resources.ResourceResolver;
import com.btmatthews.havoc.core.resources.ResourceResolverBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmatthews68 on 20/12/2013.
 */
public class LocalFileResolverBuilder implements ResourceResolverBuilder<File, String> {

    private final List<File> roots = new ArrayList<File>();
    private final List<String> inclusionMasks = new ArrayList<String>();
    private final List<String> exclusionMasks = new ArrayList<String>();

    @Override
    public ResourceResolverBuilder<File, String> addRoot(final File root) {
        return this;
    }

    @Override
    public ResourceResolverBuilder<File, String> addInclusionMask(final String mask) {
        inclusionMasks.add(mask);
        return this;
    }

    @Override
    public ResourceResolverBuilder<File, String> addExclusionMask(final String mask) {
        exclusionMasks.add(mask);
        return this;
    }

    @Override
    public ResourceResolver<File> build() {
        return new LocalFileResolver(roots, inclusionMasks, exclusionMasks);
    }
}
