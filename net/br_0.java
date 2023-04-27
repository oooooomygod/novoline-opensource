/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PlayerInvoker;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.br
 */
public class br_0
extends a0_0 {
    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1, IOException {
        String string = (String)ListInvoker.get(aod_2.a(tv_1.a, 1, 8), 0);
        PlayerInvoker.b(((Minecraft)ui_0.a((qf_2)this.b)).player, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), tv_1.b), string), tv_1.c), string).toString());
    }

    public br_0(@NotNull Novoline novoline, String string, List<String> list) {
        super(novoline, string, list);
    }
}

