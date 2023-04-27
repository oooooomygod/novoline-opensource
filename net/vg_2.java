/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ForwardingSet
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 */
package net;

import com.google.common.collect.ForwardingSet;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.Set;
import net.WN;
import net.ac__0;
import net.aem;
import net.axe_2;
import net.dz_0;

/*
 * Renamed from net.vg
 */
public class vg_2
extends ForwardingSet<String>
implements ac__0 {
    private Set<String> a = axe_2.a();

    @Override
    public JsonElement a() {
        JsonArray jsonArray = new JsonArray();
        Iterator iterator = this.iterator();
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            aem.a(jsonArray, (JsonElement)new JsonPrimitive(string));
        }
        return jsonArray;
    }

    @Override
    public void a(JsonElement jsonElement) {
        if (WN.a(jsonElement)) {
            Iterator iterator = aem.b(WN.g(jsonElement));
            while (dz_0.c(iterator)) {
                JsonElement jsonElement2 = (JsonElement)dz_0.b(iterator);
                this.add(WN.f(jsonElement2));
            }
        }
    }

    protected Set<String> delegate() {
        return this.a;
    }
}

