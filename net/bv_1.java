/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.combat.AntiBot;
import cc.novoline.modules.exploits.Disabler;
import deobf.ModuleHolder;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;

import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.bV
 */
public class bv_1
extends a0_0 {
    public bv_1(@NonNull Novoline novoline, String string, String string2, String string3) {
        super(novoline, string, string2, string3);
    }

    @Override
    public void a(String[] stringArray, int n, int n2) {
        block13: {
            boolean bl;
            AbstractModule abstractModule;
            ListInvoker[] listInvokerArray;
            block16: {
                block15: {
                    block14: {
                        ModuleHolder moduleHolder;
                        ObjectIterator objectIterator;
                        block9: {
                            block10: {
                                boolean bl2;
                                block12: {
                                    block11: {
                                        listInvokerArray = amv_2.b();
                                        if (stringArray.length > 1) {
                                            this.b(aS5.a);
                                            return;
                                        }
                                        if (stringArray.length != 0) break block9;
                                        objectIterator = uw_0.b(aen_2.c(NovolineInvoker.l(this.g)).values());
                                        if (!dz_0.c((Iterator)objectIterator)) break block10;
                                        moduleHolder = (ModuleHolder)dz_0.b((Iterator)objectIterator);
                                        abstractModule = akk_0.b(moduleHolder);
                                        bl2 = wc_1.g(abstractModule);
                                        if (listInvokerArray != null) break block11;
                                        if (!bl2) break block10;
                                        bl2 = abstractModule instanceof AntiBot;
                                    }
                                    if (listInvokerArray != null) break block12;
                                    if (bl2) break block10;
                                    bl2 = abstractModule instanceof Disabler;
                                }
                                if (listInvokerArray == null && !bl2) {
                                    bl2 = wc_1.k(abstractModule);
                                }
                            }
                            if (listInvokerArray == null) break block13;
                        }
                        if (!dz_0.c((Iterator)(objectIterator = uw_0.b(aen_2.c(NovolineInvoker.l(this.g)).values())))) break block13;
                        moduleHolder = (ModuleHolder)dz_0.b((Iterator)objectIterator);
                        abstractModule = akk_0.b(moduleHolder);
                        bl = wc_1.g(abstractModule);
                        if (listInvokerArray != null) break block14;
                        if (!bl) break block13;
                        bl = abstractModule instanceof AntiBot;
                    }
                    if (listInvokerArray != null) break block15;
                    if (bl) break block13;
                    bl = abstractModule instanceof Disabler;
                }
                if (listInvokerArray != null) break block16;
                if (bl) break block13;
                bl = StringInvoker.d(wc_1.d(abstractModule).toString(), stringArray[0]);
            }
            if (listInvokerArray == null && bl) {
                bl = wc_1.k(abstractModule);
            }
        }
    }
}

