/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;
import net.aS0;
import net.asg_0;

public class a5F
extends Properties {
    private Set<Object> a = new LinkedHashSet<Object>();

    @Override
    public synchronized Object put(Object object, Object object2) {
        aS0.b(this.a, object);
        return super.put(object, object2);
    }

    @Override
    public synchronized Enumeration<Object> keys() {
        return asg_0.b(this.keySet());
    }

    @Override
    public Set<Object> keySet() {
        Set set = super.keySet();
        aS0.c(this.a, set);
        return asg_0.a(this.a);
    }
}

