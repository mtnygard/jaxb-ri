/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.bind.v2.model.annotation;

import com.sun.xml.bind.v2.model.nav.Navigator;
import com.sun.xml.bind.v2.runtime.Location;

/**
 * {@link Locatable} implementation for a field.
 *
 * @author Kohsuke Kawaguchi
 */
public class FieldLocatable<F> implements Locatable {
    private final Locatable upstream;
    private final F field;
    private final Navigator<?,?,F,?> nav;

    public FieldLocatable(Locatable upstream, F field, Navigator<?,?,F,?> nav) {
        this.upstream = upstream;
        this.field = field;
        this.nav = nav;
    }

    public Locatable getUpstream() {
        return upstream;
    }

    public Location getLocation() {
        return nav.getFieldLocation(field);
    }
}
