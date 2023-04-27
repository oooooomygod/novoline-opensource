/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.QG;
import net.RQ;
import net.aea_1;
import net.ain_2;

class QZ
extends QG {
    RQ q;
    private aea_1 p;

    private QZ(RQ rQ, int n, int n2, int n3, int n4, int n5, aea_1 aea_12) {
        this.q = rQ;
        super(n, n2, n3, n4, n5, RQ.a(rQ, aea_12));
        this.p = aea_12;
    }

    static aea_1 a(QZ qZ) {
        return qZ.p;
    }

    QZ(RQ rQ, int n, int n2, int n3, int n4, int n5, aea_1 aea_12, ain_2 ain_22) {
        this(rQ, n, n2, n3, n4, n5, aea_12);
    }
}

