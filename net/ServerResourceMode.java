/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import net.aES;
import net.aL0;
import net.aoz_1;

public enum ServerResourceMode {
    ENABLED(aES.e),
    DISABLED(aES.b),
    PROMPT(aES.f);

    private IChatComponent a;

    private ServerResourceMode(String string2) {
        this.a = new aoz_1(aL0.a(aL0.a(new StringBuilder(), aES.c), string2).toString(), new Object[0]);
    }

    public IChatComponent a() {
        return this.a;
    }
}

