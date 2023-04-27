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
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.Ei;
import net.FG;
import net.M0;
import net.WN;
import net.a38;
import net.aBY;
import net.aN0;
import net.aS0;
import net.aem;
import net.ahs_0;
import net.asr_2;
import net.dz_0;
import net.my_0;

/*
 * Renamed from net.ayn
 */
public class ayn_2
implements JsonDeserializer<asr_2> {
    protected List<a38> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        JsonObject jsonObject2 = Ei.a(jsonObject, aBY.a);
        ArrayList arrayList = my_0.c();
        Iterator iterator = aS0.f(M0.a(jsonObject2));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            ListInvoker.add(arrayList, this.a(jsonDeserializationContext, entry));
        }
        return arrayList;
    }

    public asr_2 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        List<a38> list = this.a(jsonDeserializationContext, jsonObject);
        return new asr_2((Collection<a38>)list);
    }

    protected a38 a(JsonDeserializationContext jsonDeserializationContext, Map.Entry<String, JsonElement> entry) {
        String string = (String)FG.b(entry);
        ArrayList arrayList = my_0.c();
        JsonElement jsonElement = (JsonElement)FG.a(entry);
        if (WN.a(jsonElement)) {
            Iterator iterator = aem.b(WN.g(jsonElement));
            while (dz_0.c(iterator)) {
                JsonElement jsonElement2 = (JsonElement)dz_0.b(iterator);
                ListInvoker.add(arrayList, (ahs_0)aN0.a(jsonDeserializationContext, jsonElement2, ahs_0.class));
            }
        } else {
            ListInvoker.add(arrayList, (ahs_0)aN0.a(jsonDeserializationContext, jsonElement, ahs_0.class));
        }
        return new a38(string, arrayList);
    }
}

