/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.EventManagerInvoker;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.as
 */
public class as_2
extends a0_0 {
    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1, IOException {
        long l4 = (long)n << 32 | (long)n2 << 32 >>> 32;
        long l5 = l4 ^ 0x6E1A895ED65DL;
        int n3 = (int)(l5 >>> 32);
        int n4 = (int)(l5 << 32 >>> 48);
        int n5 = (int)(l5 << 48 >>> 48);
        EventManagerInvoker.a(new pf_0(n3, (short)n4, n5, (Minecraft)ui_0.a(this.b)));
    }

    public as_2(@NotNull Novoline novoline, String string) {
        super(novoline, string);
    }
}

