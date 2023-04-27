/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net;

import cc.novoline.invoke.StringInvoker;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.BW;
import net.Ei;
import net.FG;
import net.M0;
import net.WN;
import net.a3_;
import net.aL0;
import net.aS0;
import net.aeb_0;
import net.aoj_1;
import net.axe_2;
import net.dz_0;

public class a3s
extends a3_<aoj_1> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public aoj_1 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        HashSet hashSet = axe_2.a();
        Iterator iterator = aS0.f(M0.a(jsonObject));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            String string = (String)FG.b(entry);
            JsonObject jsonObject2 = Ei.d((JsonElement)FG.a(entry), BW.f);
            String string2 = Ei.f(jsonObject2, BW.g);
            String string3 = Ei.f(jsonObject2, BW.a);
            boolean bl = Ei.a(jsonObject2, BW.d, false);
            if (StringInvoker.g(string2)) {
                throw new JsonParseException(aL0.a(aL0.a(aL0.a(new StringBuilder(), BW.h), string), BW.j).toString());
            }
            if (StringInvoker.g(string3)) {
                throw new JsonParseException(aL0.a(aL0.a(aL0.a(new StringBuilder(), BW.i), string), BW.k).toString());
            }
            if (aS0.b((Set)hashSet, new aeb_0(string, string2, string3, bl))) continue;
            throw new JsonParseException(aL0.a(aL0.a(aL0.a(new StringBuilder(), BW.b), string), BW.e).toString());
        }
        return new aoj_1(hashSet);
    }

    @Override
    public String a() {
        return BW.c;
    }
}

