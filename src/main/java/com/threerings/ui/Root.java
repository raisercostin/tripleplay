//
// Triple Play - utilities for use in ForPlay-based games
// Copyright (c) 2011, Three Rings Design, Inc. - All rights reserved.
// http://github.com/threerings/tripleplay/blob/master/LICENSE

package com.threerings.ui;

/**
 * The root of a display hierarchy. An application can have one or more roots, but they should not
 * overlap and will behave as if oblivious to one another's existence.
 */
public class Root extends Container
{
    @Override protected Root getRoot () {
        return this;
    }

    @Override protected void invalidate () {
        // TODO: revalidate everything on the next on the next paint/update
    }
}
