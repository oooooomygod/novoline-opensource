/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import com.google.gson.JsonObject;
import net.M0;
import net.aZN;
import net.ago_2;

public class aZM
extends aZN {
    private String a;

    @Override
    public void b() {
    }

    public aZM(String string) {
        this.a = string;
    }

    public aZM() {
    }

    @Override
    public JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        M0.a(jsonObject, ago_2.a, this.a);
        return jsonObject;
    }

    @Override
    public aZN a(JsonObject jsonObject) {
        return null;
    }
}

