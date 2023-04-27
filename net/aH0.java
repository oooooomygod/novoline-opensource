/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.IChatComponent;
import deobf.StatBase;
import net.aQG;
import net.aop_1;

public class aH0
extends StatBase {
    public aH0(String string, IChatComponent iChatComponent, aQG aQG2) {
        super(string, iChatComponent, aQG2);
    }

    public aH0(String string, IChatComponent iChatComponent) {
        super(string, iChatComponent);
    }

    @Override
    public StatBase b() {
        super.b();
        ListInvoker.add(aop_1.g, this);
        return this;
    }
}

