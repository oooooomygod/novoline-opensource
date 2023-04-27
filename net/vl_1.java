/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

import deobf.EnumFacing;
import org.lwjgl.util.vector.Vector3f;

/*
 * Renamed from net.vL
 */
class vl_1
implements JsonDeserializer<IE> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    private Vector3f c(JsonObject jsonObject) {
        Vector3f vector3f = this.a(jsonObject, adh_2.q);
        if (vector3f.x >= -16.0f && vector3f.y >= -16.0f && vector3f.z >= -16.0f && vector3f.x <= 32.0f && vector3f.y <= 32.0f && vector3f.z <= 32.0f) {
            return vector3f;
        }
        throw new JsonParseException(aL0.a(aL0.a(new StringBuilder(), adh_2.x), vector3f).toString());
    }

    private Map<EnumFacing, aL1> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        EnumMap enumMap = MapsInvoker.a(EnumFacing.class);
        JsonObject jsonObject2 = Ei.a(jsonObject, adh_2.w);
        Iterator iterator = aS0.f(M0.a(jsonObject2));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            EnumFacing enumFacing = this.a((String)FG.b(entry));
            MapInvoker.c(enumMap, enumFacing, (aL1)aN0.a(jsonDeserializationContext, (JsonElement)FG.a(entry), aL1.class));
        }
        return enumMap;
    }

    private float e(JsonObject jsonObject) {
        float f = Ei.i(jsonObject, adh_2.h);
        if (f != 0.0f && MathHelper.d(f) != 22.5f && MathHelper.d(f) != 45.0f) {
            throw new JsonParseException(aL0.a(aL0.a(aL0.a(new StringBuilder(), adh_2.i), f), adh_2.v).toString());
        }
        return f;
    }

    private WJ d(JsonObject jsonObject) {
        WJ wJ = null;
        if (M0.c(jsonObject, adh_2.f)) {
            JsonObject jsonObject2 = Ei.a(jsonObject, adh_2.c);
            Vector3f vector3f = this.a(jsonObject2, adh_2.u);
            ady_2.a(vector3f, 0.0625f);
            kl_1 kl_12 = this.a(jsonObject2);
            float f = this.e(jsonObject2);
            boolean bl = Ei.a(jsonObject2, adh_2.m, false);
            wJ = new WJ(vector3f, kl_12, f, bl);
        }
        return wJ;
    }

    private Vector3f a(JsonObject jsonObject, String string) {
        JsonArray jsonArray = Ei.b(jsonObject, string);
        if (aem.a(jsonArray) != 3) {
            throw new JsonParseException(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), adh_2.o), string), adh_2.n), aem.a(jsonArray)).toString());
        }
        float[] fArray = new float[3];
        int n = 0;
        while (true) {
            int cfr_ignored_0 = fArray.length;
            fArray[n] = Ei.b(aem.a(jsonArray, n), aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), string), adh_2.e), n), adh_2.r).toString());
            ++n;
        }
    }

    vl_1() {
    }

    private kl_1 a(JsonObject jsonObject) {
        String string = Ei.f(jsonObject, adh_2.a);
        eh_0.a(StringInvoker.i(string));
        throw new JsonParseException(aL0.a(aL0.a(new StringBuilder(), adh_2.d), string).toString());
    }

    private EnumFacing a(String string) {
        SJ.a(string);
        throw new JsonParseException(aL0.a(aL0.a(new StringBuilder(), adh_2.t), string).toString());
    }

    private Map<EnumFacing, aL1> b(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        Map<EnumFacing, aL1> map = this.a(jsonDeserializationContext, jsonObject);
        if (MapInvoker.e(map)) {
            throw new JsonParseException(adh_2.j);
        }
        return map;
    }

    public IE a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        Vector3f vector3f = this.b(jsonObject);
        Vector3f vector3f2 = this.c(jsonObject);
        WJ wJ = this.d(jsonObject);
        Map<EnumFacing, aL1> map = this.b(jsonDeserializationContext, jsonObject);
        if (M0.c(jsonObject, adh_2.g) && !Ei.h(jsonObject, adh_2.b)) {
            throw new JsonParseException(adh_2.s);
        }
        boolean bl = Ei.a(jsonObject, adh_2.l, true);
        return new IE(vector3f, vector3f2, map, wJ, bl);
    }

    private Vector3f b(JsonObject jsonObject) {
        Vector3f vector3f = this.a(jsonObject, adh_2.p);
        if (vector3f.x >= -16.0f && vector3f.y >= -16.0f && vector3f.z >= -16.0f && vector3f.x <= 32.0f && vector3f.y <= 32.0f && vector3f.z <= 32.0f) {
            return vector3f;
        }
        throw new JsonParseException(aL0.a(aL0.a(new StringBuilder(), adh_2.k), vector3f).toString());
    }
}

