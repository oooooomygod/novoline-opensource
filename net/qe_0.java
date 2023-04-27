/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.QG;
import net.aj2;

/*
 * Renamed from net.Qe
 */
public class qe_0
extends QG {
    private aj2 p;

    public qe_0(int n, int n2, int n3, int n4, int n5, String string) {
        super(n, n2, n3, n4, n5, string);
        this.p = null;
    }

    public aj2 b() {
        return this.p;
    }

    public qe_0(int n, int n2, int n3, aj2 aj22, String string) {
        super(n, n2, n3, 150, 20, string);
        this.p = aj22;
    }

    public qe_0(int n, int n2, int n3, String string) {
        this(n, n2, n3, null, string);
    }
}

