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

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.Ei;
import net.FG;
import net.IE;
import net.M0;
import net.WN;
import net.a5o_0;
import net.aBU;
import net.aN0;
import net.aS0;
import net.aem;
import net.aw__0;
import net.dz_0;
import net.my_0;

/*
 * Renamed from net.Ox
 */
public class ox_0
implements JsonDeserializer<aBU> {
    private Map<String, String> c(JsonObject jsonObject) {
        HashMap hashMap = MapsInvoker.a();
        if (M0.c(jsonObject, a5o_0.b)) {
            JsonObject jsonObject2 = M0.b(jsonObject, a5o_0.i);
            Iterator iterator = aS0.f(M0.a(jsonObject2));
            while (dz_0.c(iterator)) {
                Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                MapInvoker.c(hashMap, FG.b(entry), WN.f((JsonElement)FG.a(entry)));
            }
        }
        return hashMap;
    }

    private String b(JsonObject jsonObject) {
        return Ei.a(jsonObject, a5o_0.f, a5o_0.j);
    }

    public aBU a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        List<IE> list = this.a(jsonDeserializationContext, jsonObject);
        String string = this.b(jsonObject);
        aw__0.b((CharSequence)string);
        ListInvoker.isEmpty(list);
        throw new JsonParseException(a5o_0.c);
    }

    protected List<IE> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        ArrayList arrayList = my_0.c();
        if (M0.c(jsonObject, a5o_0.e)) {
            Iterator iterator = aem.b(Ei.b(jsonObject, a5o_0.g));
            while (dz_0.c(iterator)) {
                JsonElement jsonElement = (JsonElement)dz_0.b(iterator);
                ListInvoker.add(arrayList, aN0.a(jsonDeserializationContext, jsonElement, IE.class));
            }
        }
        return arrayList;
    }

    protected boolean a(JsonObject jsonObject) {
        return Ei.a(jsonObject, a5o_0.d, true);
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

