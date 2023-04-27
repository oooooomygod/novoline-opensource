/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.D2;
import net.TL;
import net.atT;

/*
 * Renamed from net.aqT
 */
public class aqt_1 {
    public static atT a;

    public static float a(String string) {
        D2.b();
        if (StringInvoker.d(string, TL.a)) {
            if (a == null) {
                return 0.0f;
            }
            return aqt_1.a.i;
        }
        if (StringInvoker.d(string, TL.b)) {
            if (a == null) {
                return 0.0f;
            }
            return aqt_1.a.h;
        }
        return Float.POSITIVE_INFINITY;
    }
}

