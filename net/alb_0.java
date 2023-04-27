/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.TypeAdapter
 *  com.google.gson.TypeAdapterFactory
 *  com.google.gson.reflect.TypeToken
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;
import net.aEZ;
import net.ara_2;
import net.aze_1;

/*
 * Renamed from net.aLb
 */
public class alb_0
implements TypeAdapterFactory {
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class clazz = aEZ.a(typeToken);
        if (!ara_2.r(clazz)) {
            return null;
        }
        HashMap hashMap = MapsInvoker.a();
        for (Object object : ara_2.c(clazz)) {
            MapInvoker.c(hashMap, this.a(object), object);
        }
        return new aze_1(this, hashMap);
    }

    private String a(Object object) {
        return object instanceof Enum ? StringInvoker.a(((Enum)object).name(), Locale.US) : StringInvoker.a(object.toString(), Locale.US);
    }

    static String a(alb_0 alb_02, Object object) {
        return alb_02.a(object);
    }
}

