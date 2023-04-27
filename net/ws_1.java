/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a7M;

/*
 * Renamed from net.wS
 */
public enum ws_1 {
    FORWARDS,
    BACKWARDS;


    public ws_1 a() {
        a7M.f();
        if (this == FORWARDS) {
            return BACKWARDS;
        }
        return FORWARDS;
    }
}

