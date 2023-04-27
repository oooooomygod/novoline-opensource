/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.ITextureObject;
import net.aL0;
import net.atx_0;
import net.u3_0;

/*
 * Renamed from net.k5
 */
public class k5_0 {
    private int b = -1;
    private String c = null;
    private ITextureObject a = null;

    public k5_0(int n, String string, ITextureObject iTextureObject) {
        this.b = n;
        this.c = string;
        this.a = iTextureObject;
    }

    public ITextureObject b() {
        return this.a;
    }

    public String a() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public String toString() {
        return aL0.c(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), atx_0.c), this.b), atx_0.b), this.c), atx_0.a), u3_0.c(this.a)).toString();
    }
}

