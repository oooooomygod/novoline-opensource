/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NovolineInvoker;
import com.google.gson.JsonObject;
import net.M0;
import net.WN;
import net.aGR;
import net.aZN;
import net.aat_0;
import net.ea_1;


public class aZX
extends aZN {
    private String e;
    private static boolean a;

    static {
        if (!aZX.a()) {
            aZX.b(true);
        }
    }

    @Override
    public void b() {
        aZX.b();
        aGR.a(NovolineInvoker.n(NovolineInvoker.getInstance()), this.e);
        ea_1.a(System.out, aat_0.a);
        if (ListInvoker.b() != null) {
            aZX.b(false);
        }
    }

    @Override
    public aZN a(JsonObject jsonObject) {
        return new aZX(WN.f(M0.d(jsonObject, aat_0.b)));
    }

    public aZX() {
    }

    public static boolean a() {
        return a;
    }

    public aZX(String string) {
        this.e = string;
    }

    public static boolean b() {
        aZX.a();
        return true;
    }

    public static void b(boolean bl) {
        a = bl;
    }

    @Override
    public JsonObject a() {
        return null;
    }
}

