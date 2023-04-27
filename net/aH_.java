/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import deobf.IChatComponent;
import deobf.StatBase;
import net.Item;
import net.aL0;
import net.aOA;
import net.px_0;

public class aH_
extends StatBase {
    private Item m;

    public Item a() {
        return this.m;
    }

    public aH_(String string, String string2, IChatComponent iChatComponent, Item item) {
        super(aL0.a(aL0.a(new StringBuilder(), string), string2).toString(), iChatComponent);
        this.m = item;
        int n = px_0.a(item);
        MapInvoker.c(aOA.c, aL0.c(aL0.a(new StringBuilder(), string), n).toString(), this.f());
    }
}

