/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.al_1;

enum a9Y implements ab9_0
{
    UP(al_1.e),
    SIDE(al_1.d),
    NONE(al_1.f);

    private String a;

    private a9Y(String string2) {
        this.a = string2;
    }

    @Override
    public String a() {
        return this.a;
    }

    public String toString() {
        return this.a();
    }
}

