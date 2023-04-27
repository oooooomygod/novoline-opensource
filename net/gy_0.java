/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.G6;
import net.aL0;
import net.oe_2;

/*
 * Renamed from net.Gy
 */
public class gy_0 {
    private long a;
    public static gy_0 c = new G6(0L);
    private long b;

    public void a(long l4) {
        this.a += l4 / 8L;
        if (this.a > this.b) {
            throw new RuntimeException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), oe_2.b), this.a), oe_2.a), this.b).toString());
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public gy_0(long l4) {
        this.b = l4;
    }
}

