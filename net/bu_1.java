/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.ModuleRegistry;
import java.util.Iterator;
import java.util.List;

import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.bu
 */
public class bu_1
extends a0_0 {
    public bu_1(@NonNull Novoline novoline, String string, String string2, List<String> list) {
        super(novoline, string, string2, list);
    }

    @Override
    public void a(String[] stringArray, int n, int n2) {
        block10: {
            Object object;
            block11: {
                ListInvoker[] listInvokerArray = amv_2.b();
                if (stringArray.length != 1 || !StringInvoker.d(stringArray[0], VH.a)) break block11;
                object = EnumModuleType.values();
                int n3 = ((EnumModuleType[])object).length;
                int n4 = 0;
                while (n4 < n3) {
                    block13: {
                        block12: {
                            EnumModuleType enumModuleType = object[n4];
                            if (listInvokerArray != null) break block10;
                            Iterator iterator = ListInvoker.iterator(awe_0.a(aen_2.c(NovolineInvoker.l(this.g)), enumModuleType));
                            if (!dz_0.c(iterator)) break block12;
                            AbstractModule abstractModule = (AbstractModule)dz_0.b(iterator);
                            wc_1.a(abstractModule, wc_1.c(abstractModule));
                            this.d(VH.m);
                            if (listInvokerArray != null) break block13;
                        }
                        ++n4;
                    }
                    if (listInvokerArray == null) continue;
                }
                object = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
                cw_2.z((HUD)object);
                if (listInvokerArray == null) break block10;
            }
            if (stringArray.length == 2 && aen_2.a(NovolineInvoker.l(this.g), stringArray[0]) != null) {
                object = aen_2.a(NovolineInvoker.l(this.g), stringArray[0]);
                if (StringInvoker.d(stringArray[1], VH.f)) {
                    wc_1.a((AbstractModule)object, wc_1.c((AbstractModule)object));
                    this.d(aL0.a(aL0.a(new StringBuilder(), stringArray[0]), VH.o).toString());
                }
                Object object2 = StringInvoker.a(StringInvoker.a(stringArray[1], (CharSequence)VH.p, (CharSequence)VH.n), (CharSequence)VH.g, (CharSequence)VH.c);
                wc_1.a((AbstractModule)object, (String)object2);
                this.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), stringArray[0]), VH.d), (String)object2).toString());
                object2 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
                cw_2.z((HUD)object2);
            }
            this.a(VH.l, VH.i, azo_1.a(VH.h, VH.b), azo_1.a(VH.k, VH.q), azo_1.a(VH.j, VH.e));
        }
        if (ListInvoker.b() != null) {
            amv_2.b(new ListInvoker[2]);
        }
    }
}

