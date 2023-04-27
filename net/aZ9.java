/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.gson.JsonObject;
import net.ID;
import net.M0;
import net.aZN;
import net.aZS;

public class aZ9
extends aZN {
    private String a;

    @Override
    public void b() {
    }

    @Override
    public aZN a(JsonObject jsonObject) {
        return null;
    }

    public aZ9() {
    }

    @Override
    public JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        aZS.a();
        M0.a(jsonObject, ID.a, this.a);
        if (ListInvoker.b() != null) {
            aZS.b(new int[3]);
        }
        return jsonObject;
    }

    public aZ9(String string) {
        this.a = string;
    }
}

