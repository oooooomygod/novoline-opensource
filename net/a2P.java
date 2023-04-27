/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import net.aBJ;

class a2P
extends ByteArrayOutputStream {
    aBJ b;
    private int a;
    private int c;

    public a2P(aBJ aBJ2, int n, int n2) {
        this.b = aBJ2;
        super(8096);
        this.a = n;
        this.c = n2;
    }

    @Override
    public void close() throws IOException {
        this.b.a(this.a, this.c, this.buf, this.count);
    }
}

