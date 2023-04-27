/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.SoundHandlerInvoker;
import net.G2;
import net.N6;
import net.QG;
import net.RD;
import net.SoundHandler;
import net.aih_1;
import net.ajZ;
import org.checkerframework.checker.nullness.qual.NonNull;

class QN
extends QG {
    RD p;

    QN(RD rD, int n, int n2, int n3, int n4, int n5, String string) {
        this.p = rD;
        super(n, n2, n3, n4, n5, string);
    }

    @Override
    public void a(@NonNull SoundHandler soundHandler) {
        ajZ ajZ2 = SoundHandlerInvoker.a(soundHandler, new N6[]{N6.ANIMALS, N6.BLOCKS, N6.MOBS, N6.PLAYERS, N6.WEATHER});
        SoundHandlerInvoker.c(soundHandler, aih_1.a(G2.b(ajZ2), 0.5f));
    }
}

