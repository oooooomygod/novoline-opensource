/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aqt_2;

public enum aPX {
    POSITION(aqt_2.n),
    NORMAL(aqt_2.i),
    COLOR(aqt_2.a),
    UV(aqt_2.k),
    MATRIX(aqt_2.c),
    BLEND_WEIGHT(aqt_2.e),
    PADDING(aqt_2.j);

    private String b;

    private aPX(String string2) {
        this.b = string2;
    }

    public String a() {
        return this.b;
    }
}

