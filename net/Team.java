/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import net.aFJ;

public abstract class Team {
    public abstract Collection<String> c();

    public abstract boolean f();

    public abstract aFJ a();

    public abstract aFJ b();

    public abstract String d();

    public abstract String a(String var1);

    public abstract boolean e();

    public boolean a(Team team) {
        return this == team;
    }
}

