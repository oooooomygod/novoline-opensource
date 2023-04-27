/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.MethodData;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Renamed from net.aHz
 */
class ahz_0
extends CopyOnWriteArrayList<MethodData> {
    MethodData a;
    private static long serialVersionUID = 666L;

    ahz_0(MethodData methodData) {
        this.a = methodData;
        this.add(this.a);
    }
}

