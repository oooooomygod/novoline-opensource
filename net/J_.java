/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package net;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import net.J0;
import net.MV;

public class J_
extends J0<Boolean> {
    private ImmutableSet<Boolean> c = MV.a(Boolean.TRUE, (Object)Boolean.FALSE);

    public static J_ a(String string) {
        return new J_(string);
    }

    protected J_(String string) {
        super(string, Boolean.class);
    }

    @Override
    public String a(Boolean bl) {
        return bl.toString();
    }

    @Override
    public Collection<Boolean> c() {
        return this.c;
    }
}

