/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.ModuleHolder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import net.a0_0;
import net.aB0;
import net.aL0;
import net.aMF;
import net.aen_2;
import net.amv_2;
import net.axo_1;
import net.uw_0;
import net.wc_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.bI
 */
public class bi_1
extends a0_0 {
    @Override
    public @NonNull List<String> b(@NonNull String[] stringArray) {
        String string = StringInvoker.i(stringArray[stringArray.length - 1]);
        return (List)aMF.a(aMF.b(aMF.a(aMF.a(aMF.a(uw_0.a(aen_2.c(NovolineInvoker.l(this.g)).values()), ModuleHolder::c), AbstractModule::t), String::toLowerCase), arg_0 -> bi_1.lambda$completeTabOptions$0(string, arg_0)), aB0.a(ObjectArrayList::new));
    }

    @Override
    public void a(String[] stringArray, int n, int n2) {
        ListInvoker[] listInvokerArray = amv_2.b();
        if (stringArray.length < 1) {
            this.b(axo_1.d);
            return;
        }
        String[] stringArray2 = stringArray;
        int n3 = stringArray2.length;
        int n4 = 0;
        while (n4 < n3) {
            String string = stringArray2[n4];
            if (listInvokerArray == null) {
                AbstractModule abstractModule = aen_2.a(NovolineInvoker.l(NovolineInvoker.getInstance()), string);
                if (listInvokerArray == null) {
                    this.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), axo_1.a), string), axo_1.f).toString());
                }
                if (listInvokerArray != null) {
                    this.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), wc_1.k(abstractModule) ? axo_1.c : axo_1.b), axo_1.e), wc_1.a(abstractModule)).toString());
                }
                ++n4;
            }
            if (listInvokerArray == null) continue;
        }
    }

    private static boolean lambda$completeTabOptions$0(String string, String string2) {
        return StringInvoker.e(string2, string);
    }

    public bi_1(@NonNull Novoline novoline, String string, String string2, String string3) {
        super(novoline, string, string2, string3);
    }
}

