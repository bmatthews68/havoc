package com.btmatthews.havoc.core.resources.local;

import com.btmatthews.havoc.core.resources.ResourceResolutionCallback;
import com.btmatthews.havoc.core.resources.ResourceResolver;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by bmatthews68 on 20/12/2013.
 */
public class TestLocalFileResolver {

    @Test
    public void resolveThisProject() {
        final ResourceResolver<File> fileResolver = new LocalFileResolver(
                Arrays.asList(new File("src/main/java")),
                Collections.EMPTY_LIST,
                Collections.EMPTY_LIST
        );
        fileResolver.resolve(new ResourceResolutionCallback<File>() {
            @Override
            public void resolved(final File resource) {
                System.out.println(resource.getPath());
            }
        });
    }
}
