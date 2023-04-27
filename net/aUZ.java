/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Comparator;
import net.KO;
import net.anq_1;

public class aUZ
implements Comparator<anq_1> {
    KO a;

    public int a(anq_1 anq_12, anq_1 anq_13) {
        return (int)(anq_12.d() + anq_12.a() - (anq_13.d() + anq_13.a()));
    }

    public aUZ(KO kO) {
        this.a = kO;
    }
}

