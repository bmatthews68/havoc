package com.btmatthews.havoc.core.resources;

/**
 * Created by bmatthews68 on 20/12/2013.
 */
public interface ResourceResolver<T> {

    void resolve(ResourceResolutionCallback<T> callback);
}
