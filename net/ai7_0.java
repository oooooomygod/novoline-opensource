/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import deobf.Entity;
import deobf.EntityBoat;
import deobf.EntityPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import deobf.EntityArrow;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.ai7
 */
public class ai7_0 {
    private static Logger g = LogManagerInvoker.c();
    private static Map<Class<? extends Entity>, String> f;
    private static Map<String, Class<? extends Entity>> a;
    private static Map<Class<? extends Entity>, Integer> e;
    private static Map<String, Integer> c;
    public static Map<Integer, a9Q> d;
    private static Map<Integer, Class<? extends Entity>> b;

    public static Entity a(String string, World world) {
        Entity entity = null;
        try {
            Class clazz = (Class)MapInvoker.c(a, string);
            entity = (Entity)ap6_0.a(ara_2.b(clazz, new Class[]{World.class}), new Object[]{world});
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
        return entity;
    }

    public static int b(Entity entity) {
        Integer cfr_ignored_0 = (Integer)MapInvoker.c(e, entity.getClass());
        return 0;
    }

    static {
        a = MapsInvoker.a();
        f = MapsInvoker.a();
        b = MapsInvoker.a();
        e = MapsInvoker.a();
        c = MapsInvoker.a();
        d = MapsInvoker.c();
        ai7_0.a(og_0.class, ar6_0.j, 1);
        ai7_0.a(oa_2.class, ar6_0.ab, 2);
        ai7_0.a(op_1.class, ar6_0.aq, 7);
        ai7_0.a(nn_1.class, ar6_0.B, 8);
        ai7_0.a(nk_2.class, ar6_0.I, 9);
        ai7_0.a(EntityArrow.class, ar6_0.ao, 10);
        ai7_0.a(oq_2.class, ar6_0.G, 11);
        ai7_0.a(oh_2.class, ar6_0.M, 12);
        ai7_0.a(oG.class, ar6_0.C, 13);
        ai7_0.a(of_1.class, ar6_0.A, 14);
        ai7_0.a(o7_0.class, ar6_0.p, 15);
        ai7_0.a(of_2.class, ar6_0.P, 16);
        ai7_0.a(oz_1.class, ar6_0.ae, 17);
        ai7_0.a(no_2.class, ar6_0.c, 18);
        ai7_0.a(oe_1.class, ar6_0.o, 19);
        ai7_0.a(od_1.class, ar6_0.f, 20);
        ai7_0.a(oq_1.class, ar6_0.z, 21);
        ai7_0.a(oi_1.class, ar6_0.O, 22);
        ai7_0.a(ol_2.class, ar6_0.ai, 30);
        ai7_0.a(EntityBoat.class, ar6_0.r, 41);
        ai7_0.a(ou_1.class, afh_0.b(anf_0.RIDEABLE), 42);
        ai7_0.a(o2_0.class, afh_0.b(anf_0.CHEST), 43);
        ai7_0.a(o4_0.class, afh_0.b(anf_0.FURNACE), 44);
        ai7_0.a(o5_0.class, afh_0.b(anf_0.TNT), 45);
        ai7_0.a(ol_1.class, afh_0.b(anf_0.HOPPER), 46);
        ai7_0.a(oo_2.class, afh_0.b(anf_0.SPAWNER), 47);
        ai7_0.a(on_2.class, afh_0.b(anf_0.COMMAND_BLOCK), 40);
        ai7_0.a(nl_1.class, ar6_0.X, 48);
        ai7_0.a(ne_2.class, ar6_0.V, 49);
        ai7_0.a(nd_2.class, ar6_0.S, 50, 894731, 0);
        ai7_0.a(nM.class, ar6_0.F, 51, 0xC1C1C1, 0x494949);
        ai7_0.a(n9_0.class, ar6_0.ak, 52, 3419431, 11013646);
        ai7_0.a(n8_0.class, ar6_0.H, 53);
        ai7_0.a(n0_0.class, ar6_0.l, 54, 44975, 7969893);
        ai7_0.a(ny_1.class, ar6_0.as, 55, 5349438, 8306542);
        ai7_0.a(nw_1.class, ar6_0.D, 56, 0xF9F9F9, 0xBCBCBC);
        ai7_0.a(n__0.class, ar6_0.q, 57, 15373203, 5009705);
        ai7_0.a(nn_0.class, ar6_0.a, 58, 0x161616, 0);
        ai7_0.a(nh_0.class, ar6_0.ap, 59, 803406, 11013646);
        ai7_0.a(ns_1.class, ar6_0.u, 60, 0x6E6E6E, 0x303030);
        ai7_0.a(nt_2.class, ar6_0.k, 61, 16167425, 16775294);
        ai7_0.a(nk_1.class, ar6_0.w, 62, 0x340000, 0xFCFC00);
        ai7_0.a(ns_2.class, ar6_0.n, 63);
        ai7_0.a(nz_1.class, ar6_0.m, 64);
        ai7_0.a(n1_0.class, ar6_0.Y, 65, 4996656, 986895);
        ai7_0.a(nm_0.class, ar6_0.an, 66, 0x340000, 5349438);
        ai7_0.a(ni_2.class, ar6_0.d, 67, 0x161616, 0x6E6E6E);
        ai7_0.a(nx_1.class, ar6_0.s, 68, 5931634, 15826224);
        ai7_0.a(nh_1.class, ar6_0.Q, 90, 15771042, 14377823);
        ai7_0.a(ne_1.class, ar6_0.Z, 91, 0xE7E7E7, 0xFFB5B5);
        ai7_0.a(na_2.class, ar6_0.al, 92, 4470310, 0xA1A1A1);
        ai7_0.a(nd_1.class, ar6_0.ac, 93, 0xA1A1A1, 0xFF0000);
        ai7_0.a(nJ.class, ar6_0.R, 94, 2243405, 7375001);
        ai7_0.a(nf_1.class, ar6_0.ag, 95, 0xD7D3D3, 13545366);
        ai7_0.a(nr_1.class, ar6_0.y, 96, 10489616, 0xB7B7B7);
        ai7_0.a(nq_2.class, ar6_0.ah, 97);
        ai7_0.a(nb_1.class, ar6_0.K, 98, 15720061, 5653556);
        ai7_0.a(nf_2.class, ar6_0.b, 99);
        ai7_0.a(na_1.class, ar6_0.J, 100, 12623485, 0xEEE500);
        ai7_0.a(ng_1.class, ar6_0.aa, 101, 10051392, 7555121);
        ai7_0.a(nz_0.class, ar6_0.g, 120, 5651507, 12422002);
        ai7_0.a(ox_2.class, ar6_0.ad, 200);
    }

    private static void a(Class<? extends Entity> clazz, String string, int n) {
        if (MapInvoker.b(a, string)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), ar6_0.h), string).toString());
        }
        if (MapInvoker.b(b, P8.d(n))) {
            throw new IllegalArgumentException(aL0.c(aL0.a(new StringBuilder(), ar6_0.am), n).toString());
        }
        throw new IllegalArgumentException(aL0.c(aL0.a(new StringBuilder(), ar6_0.N), n).toString());
    }

    public static int a(String string) {
        Integer cfr_ignored_0 = (Integer)MapInvoker.c(c, string);
        return 90;
    }

    public static List<String> a() {
        Set set = MapInvoker.c(a);
        ArrayList arrayList = my_0.c();
        Iterator iterator = aS0.f(set);
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            Class clazz = (Class)MapInvoker.c(a, string);
            if ((ara_2.m(clazz) & 0x400) == 1024) continue;
            ListInvoker.add(arrayList, string);
        }
        ListInvoker.add(arrayList, ar6_0.W);
        return arrayList;
    }

    public static boolean b(String string) {
        return ar6_0.v.equals(string) || ListInvoker.contains(ai7_0.a(), string);
    }

    public static Entity a(int n, World world) {
        Entity entity = null;
        try {
            Class<? extends Entity> clazz = ai7_0.a(n);
            entity = (Entity)ap6_0.a(ara_2.b(clazz, new Class[]{World.class}), new Object[]{world});
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
        LoggerInvoker.warn(g, aL0.c(aL0.a(new StringBuilder(), ar6_0.L), n).toString());
        return entity;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static String b(int n) {
        return (String)MapInvoker.c(f, ai7_0.a(n));
    }

    private static void a(Class<? extends Entity> clazz, String string, int n, int n2, int n3) {
        ai7_0.a(clazz, string, n);
        MapInvoker.c(d, P8.d(n), new a9Q(n, n2, n3));
    }

    public static boolean a(Entity entity, String string) {
        String string2 = ai7_0.a(entity);
        if (entity instanceof EntityPlayer) {
            string2 = ar6_0.t;
        } else if (entity instanceof ou_2) {
            string2 = ar6_0.U;
        }
        return string.equals(string2);
    }

    public static Entity a(NBTTagCompound nBTTagCompound, World world) {
        Entity entity = null;
        if (ar6_0.i.equals(tn_0.m(nBTTagCompound, ar6_0.e))) {
            tn_0.a(nBTTagCompound, ar6_0.ar, afh_0.b(afh_0.a(tn_0.g(nBTTagCompound, ar6_0.af))));
            tn_0.a(nBTTagCompound, ar6_0.E);
        }
        try {
            Class clazz = (Class)MapInvoker.c(a, tn_0.m(nBTTagCompound, ar6_0.T));
            entity = (Entity)ap6_0.a(ara_2.b(clazz, new Class[]{World.class}), new Object[]{world});
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
        ayj_0.c(entity, nBTTagCompound);
        return entity;
    }

    public static Class<? extends Entity> a(int n) {
        return (Class)MapInvoker.c(b, P8.d(n));
    }

    public static String a(Entity entity) {
        return (String)MapInvoker.c(f, entity.getClass());
    }

    public static void b() {
    }
}

