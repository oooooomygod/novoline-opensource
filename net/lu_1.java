/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.FG;
import net.M0;
import net.P8;
import net.WN;
import net.aL0;
import net.aS0;
import net.aZ8;
import net.aZ9;
import net.aZM;
import net.aZN;
import net.aZS;
import net.aZX;
import net.acz_2;
import net.ara_2;
import net.azi_0;
import net.dz_0;
import net.pg_1;

/*
 * Renamed from net.lU
 */
public class lu_1 {
    private Map<Integer, Class<? extends aZN>> a = new HashMap<Integer, Class<? extends aZN>>();

    public int a(aZN aZN2) {
        aZN.c();
        Iterator iterator = aS0.f(MapInvoker.b(this.a));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (aZN2.getClass() == FG.a(entry)) {
                return P8.b((Integer)FG.b(entry));
            }
        }
        throw new UnsupportedOperationException(acz_2.a);
    }

    public Class<? extends aZN> a(int n) {
        aZN.c();
        if (!MapInvoker.b(this.a, P8.d(n))) {
            throw new UnsupportedOperationException(acz_2.g);
        }
        return (Class)MapInvoker.c(this.a, P8.d(n));
    }

    public String b(aZN aZN2) {
        JsonObject jsonObject = new JsonObject();
        M0.a(jsonObject, acz_2.b, P8.d(this.a(aZN2)));
        M0.a(jsonObject, acz_2.d, (JsonElement)pg_1.b(aZN2));
        return jsonObject.toString();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public aZN a(JsonObject jsonObject) throws IllegalAccessException, InstantiationException {
        aZN.c();
        int n = WN.e(M0.d(jsonObject, acz_2.c));
        Class<? extends aZN> clazz = this.a(n);
        if (clazz == null) {
            throw new UnsupportedOperationException(aL0.c(aL0.a(new StringBuilder(), acz_2.e), n).toString());
        }
        aZN aZN2 = (aZN)ara_2.q(clazz);
        aZN aZN3 = pg_1.a(aZN2, WN.c(M0.d(jsonObject, acz_2.f)));
        if (ListInvoker.b() != null) {
            aZN.b("W4P54b");
        }
        return aZN3;
    }

    public lu_1() {
        MapInvoker.c(this.a, P8.d(0), aZS.class);
        aZN.c();
        MapInvoker.c(this.a, P8.d(1), aZX.class);
        MapInvoker.c(this.a, P8.d(2), aZM.class);
        MapInvoker.c(this.a, P8.d(3), azi_0.class);
        MapInvoker.c(this.a, P8.d(4), aZ9.class);
        MapInvoker.c(this.a, P8.d(5), aZ8.class);
        ListInvoker.b(new ListInvoker[3]);
    }
}

