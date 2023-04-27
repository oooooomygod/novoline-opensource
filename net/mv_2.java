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
import net.Ei;
import net.ResourceLocation;
import net.WN;
import net.aD3;
import net.aL0;
import net.aao_0;
import net.ahs_0;
import net.alt_0;
import net.axw_1;

/*
 * Renamed from net.mv
 */
public class mv_2
implements JsonDeserializer<ahs_0> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    protected String b(JsonObject jsonObject) {
        return Ei.f(jsonObject, aao_0.g);
    }

    protected int a(JsonObject jsonObject) {
        return Ei.a(jsonObject, aao_0.c, 1);
    }

    private ResourceLocation a(String string) {
        ResourceLocation resourceLocation = new ResourceLocation(string);
        resourceLocation = new ResourceLocation(axw_1.a(resourceLocation), aL0.a(aL0.a(new StringBuilder(), aao_0.b), axw_1.b(resourceLocation)).toString());
        return resourceLocation;
    }

    public ahs_0 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        String string = this.b(jsonObject);
        alt_0 alt_02 = this.c(jsonObject);
        boolean bl = this.d(jsonObject);
        int n = this.a(jsonObject);
        return new ahs_0(this.a(string), alt_02, bl, n);
    }

    private boolean d(JsonObject jsonObject) {
        return Ei.a(jsonObject, aao_0.e, false);
    }

    protected alt_0 c(JsonObject jsonObject) {
        int n = Ei.a(jsonObject, aao_0.h, 0);
        int n2 = Ei.a(jsonObject, aao_0.d, 0);
        aD3.a(n, n2);
        throw new JsonParseException(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), aao_0.f), n), aao_0.a), n2).toString());
    }
}

