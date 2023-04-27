/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

import deobf.EnumFacing;

/*
 * Renamed from net.Vf
 */
class vf_0
implements JsonDeserializer<aL1> {
    private String a(JsonObject jsonObject) {
        return Ei.f(jsonObject, aH6.a);
    }

    vf_0() {
    }

    protected int b(JsonObject jsonObject) {
        return Ei.a(jsonObject, aH6.d, -1);
    }

    public aL1 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        EnumFacing enumFacing = this.c(jsonObject);
        int n = this.b(jsonObject);
        String string = this.a(jsonObject);
        a4M a4M2 = (a4M)aN0.a(jsonDeserializationContext, (JsonElement)jsonObject, a4M.class);
        return new aL1(enumFacing, n, string, a4M2);
    }

    private EnumFacing c(JsonObject jsonObject) {
        String string = Ei.a(jsonObject, aH6.c, aH6.b);
        return SJ.a(string);
    }
}

