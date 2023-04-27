/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Matrix4f
 *  org.apache.commons.lang3.NotImplementedException
 */
package net;

import cc.novoline.invoke.ListInvoker;
import javax.vecmath.Matrix4f;
import net.aL2;
import org.apache.commons.lang3.NotImplementedException;

/*
 * Renamed from net.a4s
 */
public class a4s_0 {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public a4s_0(Matrix4f matrix4f) {
        throw new NotImplementedException(aL2.a);
    }

    static {
        if (a4s_0.b() == null) {
            a4s_0.b(new ListInvoker[3]);
        }
    }
}

