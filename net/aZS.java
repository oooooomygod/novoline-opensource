/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.gson.JsonObject;
import net.M0;
import net.aO1;
import net.aZN;


public class aZS
extends aZN {
    private static int[] a;
    private String e;

    @Override
    public void b() {
    }

    @Override
    public aZN a(JsonObject jsonObject) {
        return null;
    }

    public static void b(int[] nArray) {
        a = nArray;
    }

    public aZS() {
    }

    static {
        if (aZS.a() == null) {
            aZS.b(new int[1]);
        }
    }

    public static int[] a() {
        return a;
    }

    public aZS(String string) {
        this.e = string;
    }

    @Override
    public JsonObject a() {
        aZS.a();
        JsonObject jsonObject = new JsonObject();
        M0.a(jsonObject, aO1.a, this.e);
        ListInvoker.b(new ListInvoker[4]);
        return jsonObject;
    }
}

