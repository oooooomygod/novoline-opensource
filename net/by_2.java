/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.visual.HUD;
import deobf.ModuleRegistry;
import java.util.List;

import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.by
 */
public class by_2
extends a0_0 {
    @Override
    public void a(String[] stringArray, int n, int n2) {
        amv_2.b();
        if (stringArray.length == 1) {
            String string = stringArray[0];
            AbstractModule abstractModule = aen_2.a(NovolineInvoker.l(this.g), string);
            if (abstractModule == null) {
                this.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), aml_1.e), string), aml_1.d).toString());
                return;
            }
            HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
            wc_1.a(abstractModule, !wc_1.e(abstractModule));
            cw_2.z(hUD);
            this.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), wc_1.e(abstractModule) ? aml_1.b : aml_1.f), aml_1.c), wc_1.a(abstractModule)).toString());
        }
        this.b(aml_1.a);
    }

    public by_2(@NonNull Novoline novoline, String string, String string2, List<String> list) {
        super(novoline, string, string2, list);
    }
}

