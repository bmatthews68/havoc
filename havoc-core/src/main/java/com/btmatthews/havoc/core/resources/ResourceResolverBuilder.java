package com.btmatthews.havoc.core.resources;

/**
 * Created by bmatthews68 on 20/12/2013.
 */
public interface ResourceResolverBuilder<R, M> {

    ResourceResolverBuilder<R,M> addRoot(R root);

    ResourceResolverBuilder<R,M> addInclusionMask(M mask);

    ResourceResolverBuilder<R,M> addExclusionMask(M mask);

    ResourceResolver<R> build();
}
