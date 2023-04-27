/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import net.H6;
import net.aAR;
import net.aL0;

/*
 * Renamed from net.aMn
 */
public class amn_0 {
    private H6 a;
    private IChatComponent b;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            amn_0 amn_02 = (amn_0)object;
            if (this.a != amn_02.a) {
                return false;
            }
            if (this.b != null) {
                return this.b.equals(amn_02.b);
            }
            return amn_02.b == null;
        }
        return false;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aAR.b), (Object)this.a), aAR.a), this.b), '\''), '}').toString();
    }

    public int hashCode() {
        int n = this.a.hashCode();
        n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
        return n;
    }

    public IChatComponent b() {
        return this.b;
    }

    public amn_0(H6 h6, IChatComponent iChatComponent) {
        this.a = h6;
        this.b = iChatComponent;
    }

    public H6 a() {
        return this.a;
    }
}

