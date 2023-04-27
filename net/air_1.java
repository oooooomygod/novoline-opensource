/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.TimerUtil;
import java.util.Iterator;
import java.util.List;
import net.aMF;
import net.ajn_0;
import net.dz_0;
import net.oc_1;
import net.we_0;

/*
 * Renamed from net.aiR
 */
public class air_1 {
    we_0 a;
    private List<ajn_0> c;
    private String b;

    public void a(boolean bl) {
        TimerUtil.e();
        Iterator iterator = ListInvoker.iterator(this.c);
        if (dz_0.c(iterator)) {
            ajn_0 ajn_02 = (ajn_0)dz_0.b(iterator);
            ajn_02.b(bl);
        }
    }

    private static boolean lambda$getRecipeByName$0(String string, ajn_0 ajn_02) {
        return StringInvoker.d(ajn_02.c(), string);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public air_1(we_0 we_02, String string, List list) {
        this.a = we_02;
        this.b = string;
        this.c = list;
    }

    public String a() {
        return this.b;
    }

    public ajn_0 a(String string) {
        return (ajn_0)oc_1.a(aMF.b(aMF.b(ListInvoker.stream(this.c), arg_0 -> air_1.lambda$getRecipeByName$0(string, arg_0))), null);
    }

    public List<ajn_0> b() {
        return this.c;
    }
}

