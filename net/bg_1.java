/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.PlayerInvoker;
import deobf.EntityPlayerSP;
import deobf.MCInvoker;
import net.a0_0;
import net.aO7;
import net.amv_2;
import net.ht_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.bg
 */
public class bg_1
extends a0_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1 {
        amv_2.b();
        if (stringArray.length != 1) {
            this.b(aO7.a);
            return;
        }
        EntityPlayerSP entityPlayerSP = MCInvoker.f().player;
        double d = this.c(stringArray[0]);
        PlayerInvoker.a(entityPlayerSP, entityPlayerSP.posX, entityPlayerSP.posY + d, entityPlayerSP.posZ);
    }

    public bg_1(@NonNull Novoline novoline, String string, String string2) {
        super(novoline, string, string2);
    }
}

