/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StatListInvoker;
import deobf.StatBase;

public class a9Q {
    public int c;
    public int b;
    public int a;
    public StatBase d;
    public StatBase e;

    public a9Q(int n, int n2, int n3) {
        this.c = n;
        this.a = n2;
        this.b = n3;
        this.e = StatListInvoker.b(this);
        this.d = StatListInvoker.a(this);
    }
}

