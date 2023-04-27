/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.modules.visual.HUD;
import deobf.ModuleRegistry;
import java.io.IOException;

import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aJ
 */
public class aj_1
extends a0_0 {
    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1, IOException {
        amv_2.b();
        if (stringArray.length == 1) {
            HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
            cw_2.a(hUD, stringArray[0]);
            cw_2.z(hUD);
        }
        this.a(u7_0.d, u7_0.a, azo_1.a(u7_0.b, u7_0.c));
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    public aj_1(@NotNull Novoline novoline, String string) {
        super(novoline, string);
    }
}

