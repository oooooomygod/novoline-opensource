/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.MCInvoker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class aZD {
    public Entity i;
    public j7_0 f;
    public Class<? extends Entity> c;
    public boolean a = true;
    public static Map e;
    public String d;
    public static kp_2 k;
    public static List<aZD> b;
    public List<a9k_0> g = new ArrayList<a9k_0>();
    private static ListInvoker[] h;
    public String j;

    public static kp_2 a(AbstractClientPlayer abstractClientPlayer) {
        String string = aUi.n(abstractClientPlayer);
        aZD.b();
        kp_2 kp_22 = (kp_2)MapInvoker.c(e, string);
        return kp_22 != null ? kp_22 : k;
    }

    public static void a() {
        abr_0.a(axj_2.e, B9.INFO);
        ListInvoker.clear(b);
        aZD.b();
        aZD.a(new aZD(axj_2.b, axj_2.f, MCInvoker.f().player, EntityPlayer.class, new kp_2(MCInvoker.j(MCInvoker.f()))).a(new a9A()).a(new a9G()).a(new a9a_0()).a(new a9R()).a(new a94()).a(new a92()).a(new a9h_0()).a(new a9U()).a(new a9D()).a(new a95()).a(new a9L()));
        int n = 0;
        if (n < ListInvoker.size(b)) {
            ((aZD)ListInvoker.get(aZD.b, (int)n)).a = true;
            ++n;
            ListInvoker.b(new ListInvoker[2]);
        }
        if ((n = 0) < ListInvoker.size(b)) {
            if (((aZD)ListInvoker.get(aZD.b, (int)n)).a) {
                MapInvoker.c(MCInvoker.j((Minecraft)MCInvoker.f()).i, ((aZD)ListInvoker.get(aZD.b, (int)n)).c, ((aZD)ListInvoker.get(aZD.b, (int)n)).f);
            }
            ++n;
        }
        k = new kp_2(MCInvoker.j(MCInvoker.f()));
        MapInvoker.c(e, axj_2.c, k);
        MapInvoker.c(e, axj_2.a, new kp_2(MCInvoker.j(MCInvoker.f()), true));
    }

    public static void b(ListInvoker[] listInvokerArray) {
        h = listInvokerArray;
    }

    public aZD(String string, String string2, Entity entity, Class<? extends Entity> clazz, j7_0 j7_02) {
        this.j = string;
        aZD.b();
        this.d = string2;
        this.c = clazz;
        this.f = j7_02;
        this.i = entity;
        this.a = true;
        if (ListInvoker.b() != null) {
            aZD.b(new ListInvoker[1]);
        }
    }

    public static aZD a(Entity entity) {
        aZD.b();
        int n = 0;
        if (n < ListInvoker.size(b)) {
            if (ara_2.b(((aZD)ListInvoker.get(aZD.b, (int)n)).c, entity)) {
                return (aZD)ListInvoker.get(b, n);
            }
            ++n;
        }
        return null;
    }

    public static ListInvoker[] b() {
        return h;
    }

    public static void a(aZD aZD2) {
        abr_0.a(aL0.a(aL0.a(new StringBuilder(), axj_2.d), aZD2.d).toString(), B9.INFO);
        ListInvoker.add(b, aZD2);
    }

    public static void c() {
        ListInvoker.clear(b);
        MapInvoker.d(e);
    }

    public aZD a(a9k_0 a9k_02) {
        ListInvoker.add(this.g, a9k_02);
        return this;
    }

    static {
        b = new ArrayList<aZD>();
        aZD.b(null);
        e = MapsInvoker.a();
    }

    public a9k_0 a(String string) {
        aZD.b();
        int n = 0;
        if (n < ListInvoker.size(this.g)) {
            if (StringInvoker.d(DJ.a((a9k_0)ListInvoker.get(this.g, n)), string)) {
                return (a9k_0)ListInvoker.get(this.g, n);
            }
            ++n;
        }
        return null;
    }
}

