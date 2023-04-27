/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import net.M0;
import net.P8;
import net.WN;
import net.aGR;
import net.aWB;
import net.aZN;
import net.aZX;
import net.aqp_1;
import net.ea_1;

public class aZ8
extends aZN {
    private String a;

    public aZ8(String string) {
        this.a = string;
    }

    @Override
    public void b() {
        String[] stringArray;
        aZX.a();
        ArrayList arrayList = new ArrayList();
        String[] stringArray2 = stringArray = StringInvoker.g(this.a, aWB.c);
        int n = stringArray2.length;
        int n2 = 0;
        if (n2 < n) {
            String string = stringArray2[n2];
            String[] stringArray3 = StringInvoker.g(string, aWB.a);
            ListInvoker.add(arrayList, aqp_1.a(aqp_1.b(aqp_1.a(aqp_1.a(), stringArray3[0]), stringArray3[1]), P8.a(stringArray3[2])));
            ea_1.a(System.out, stringArray3[0]);
            ++n2;
            ListInvoker.b(new ListInvoker[2]);
        }
        aGR.a(NovolineInvoker.n(NovolineInvoker.getInstance()), arrayList);
    }

    @Override
    public aZN a(JsonObject jsonObject) {
        return new aZ8(WN.f(M0.d(jsonObject, aWB.b)));
    }

    @Override
    public JsonObject a() {
        return null;
    }

    public aZ8() {
    }
}

