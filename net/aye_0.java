/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import net.Session;
import net.apt_0;
import net.dx_0;

/*
 * Renamed from net.aYe
 */
public abstract class aye_0
implements dx_0 {
    private static int[] b;

    static {
        if (aye_0.b() != null) {
            aye_0.b(new int[3]);
        }
    }

    public static int[] b() {
        return b;
    }

    @Override
    public void a(apt_0 apt_02, Session session) {
        this.a(session);
    }

    private void a(Session session) {
        MCInvoker.f().session = session;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}

