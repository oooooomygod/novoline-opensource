/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Predicate;
import deobf.Entity;
import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;
import net.minecraft.world.GameType;
import deobf.IChatComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from net.a0l
 */
public class a0l_0 {
    private static Pattern d;
    private static Pattern a;
    private static Pattern c;
    private static Set<String> b;

    static {
        c = ow_1.c(alt_1.al);
        a = ow_1.c(alt_1.V);
        d = ow_1.c(alt_1.l);
        b = axe_2.a(new String[]{alt_1.z, alt_1.f, alt_1.an, alt_1.x, alt_1.H, alt_1.j, alt_1.y, alt_1.w});
    }

    public static boolean b(String string) {
        return wk_2.a(ow_1.a(c, string));
    }

    public static int a(int n) {
        if ((n %= 360) >= 160) {
            n -= 360;
        }
        return n += 360;
    }

    private static List<Predicate<Entity>> c(Map<String, String> map) {
        ArrayList arrayList = my_0.c();
        int n = a0l_0.a(map, alt_1.Y, -1);
        int n2 = a0l_0.a(map, alt_1.au, -1);
        if (n > -1 || n2 > -1) {
            ListInvoker.add(arrayList, new k3_0(n, n2));
        }
        return arrayList;
    }

    private static int a(Map<String, String> map, String string, int n) {
        return MapInvoker.b(map, string) ? MathHelper.a((String)MapInvoker.c(map, string), n) : n;
    }

    private static boolean h(Map<String, String> map) {
        Iterator iterator = aS0.f(b);
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            if (!MapInvoker.b(map, string)) continue;
            return true;
        }
        return false;
    }

    public static Map<String, Integer> b(Map<String, String> map) {
        HashMap hashMap = MapsInvoker.a();
        Iterator iterator = aS0.f(MapInvoker.c(map));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            if (!StringInvoker.e(string, alt_1.P) || StringInvoker.c(string) <= StringInvoker.c(alt_1.o)) continue;
            MapInvoker.c(hashMap, StringInvoker.a(string, StringInvoker.c(alt_1.Q)), P8.d(MathHelper.a((String)MapInvoker.c(map, string), 1)));
        }
        return hashMap;
    }

    private static List<Predicate<Entity>> g(Map<String, String> map) {
        int n;
        int n2;
        ArrayList arrayList = my_0.c();
        if (MapInvoker.b(map, alt_1.J) || MapInvoker.b(map, alt_1.W)) {
            n2 = a0l_0.a(a0l_0.a(map, alt_1.af, 0));
            n = a0l_0.a(a0l_0.a(map, alt_1.Z, 359));
            ListInvoker.add(arrayList, new x7_0(n2, n));
        }
        if (MapInvoker.b(map, alt_1.g) || MapInvoker.b(map, alt_1.B)) {
            n2 = a0l_0.a(a0l_0.a(map, alt_1.p, 0));
            n = a0l_0.a(a0l_0.a(map, alt_1.K, 359));
            ListInvoker.add(arrayList, new ao0_0(n2, n));
        }
        return arrayList;
    }

    private static List<Predicate<Entity>> a(Map<String, String> map, BlockPos blockPos) {
        ArrayList arrayList = my_0.c();
        int n = a0l_0.a(map, alt_1.I, -1);
        int n2 = a0l_0.a(map, alt_1.ad, -1);
        int n3 = n * n;
        int n4 = n2 * n2;
        ListInvoker.add(arrayList, new axu_2(blockPos, n, n3, n2, n4));
        return arrayList;
    }

    private static String a(Map<String, String> map, String string) {
        return (String)MapInvoker.c(map, string);
    }

    public static IChatComponent a(ICommandSender iCommandSender, String string) {
        List<Entity> list = a0l_0.a(iCommandSender, string, Entity.class);
        if (ListInvoker.isEmpty(list)) {
            return null;
        }
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            ListInvoker.add(arrayList, ayj_0.P(entity));
        }
        return ays_0.a(arrayList);
    }

    private static List<World> a(ICommandSender iCommandSender, Map<String, String> map) {
        ArrayList arrayList = my_0.c();
        if (a0l_0.h(map)) {
            ListInvoker.add(arrayList, alj_1.a(iCommandSender));
        } else {
            asg_0.a((Collection)arrayList, ServerInvoker.d().r);
        }
        return arrayList;
    }

    private static List<Predicate<Entity>> e(Map<String, String> map) {
        ArrayList arrayList = my_0.c();
        String string = a0l_0.a(map, alt_1.am);
        boolean bl = StringInvoker.e(string, alt_1.ah);
        String string2 = string = StringInvoker.a(string, 1);
        ListInvoker.add(arrayList, new anp_2(string2, bl));
        return arrayList;
    }

    private static List<Predicate<Entity>> f(Map<String, String> map) {
        ArrayList arrayList = my_0.c();
        Map<String, Integer> map2 = a0l_0.b(map);
        if (!MapInvoker.e(map2)) {
            ListInvoker.add(arrayList, new AR(map2));
        }
        return arrayList;
    }

    public static boolean c(String string) {
        Matcher matcher = ow_1.a(c, string);
        if (!wk_2.a(matcher)) {
            return false;
        }
        Map<String, String> map = a0l_0.a(wk_2.b(matcher, 2));
        String string2 = wk_2.b(matcher, 1);
        int n = !alt_1.C.equals(string2) && !alt_1.av.equals(string2) ? 1 : 0;
        return a0l_0.a(map, alt_1.q, n) != 1;
    }

    private static BlockPos b(Map<String, String> map, BlockPos blockPos) {
        return new BlockPos(a0l_0.a(map, alt_1.ap, amv_2.j(blockPos)), a0l_0.a(map, alt_1.aa, amv_2.h(blockPos)), a0l_0.a(map, alt_1.U, amv_2.i(blockPos)));
    }

    private static List<Predicate<Entity>> b(Map<String, String> map, String string) {
        ArrayList arrayList = my_0.c();
        String string2 = a0l_0.a(map, alt_1.i);
        boolean bl = StringInvoker.e(string2, alt_1.h);
        string2 = StringInvoker.a(string2, 1);
        boolean bl2 = !string.equals(alt_1.c);
        boolean bl3 = string.equals(alt_1.G);
        if (!string.equals(alt_1.d)) {
            ListInvoker.add(arrayList, new VR());
        } else {
            String string3 = string2;
            ListInvoker.add(arrayList, new aOU(string3, bl));
        }
        return arrayList;
    }

    public static EntityPlayerMP b(ICommandSender iCommandSender, String string) {
        return a0l_0.b(iCommandSender, string, EntityPlayerMP.class);
    }

    private static <T extends Entity> List<T> a(Map<String, String> map, Class<? extends T> clazz, List<Predicate<Entity>> list, String string, World world, BlockPos blockPos) {
        ArrayList arrayList = my_0.c();
        String string2 = a0l_0.a(map, alt_1.S);
        string2 = StringInvoker.e(string2, alt_1.X) ? StringInvoker.a(string2, 1) : string2;
        boolean bl = !string.equals(alt_1.r);
        boolean bl2 = string.equals(alt_1.ab);
        int n = a0l_0.a(map, alt_1.T, 0);
        int n2 = a0l_0.a(map, alt_1.aw, 0);
        int n3 = a0l_0.a(map, alt_1.s, 0);
        int n4 = a0l_0.a(map, alt_1.n, -1);
        Predicate predicate = an7_0.a(list);
        Predicate predicate2 = an7_0.a(od_2.b, predicate);
        int n5 = ListInvoker.size(aV8.e(world));
        int n6 = ListInvoker.size(aV8.u(world));
        boolean bl3 = n5 < n6 / 16;
        if (!(MapInvoker.b(map, alt_1.a) || MapInvoker.b(map, alt_1.L) || MapInvoker.b(map, alt_1.ak))) {
            rm_2 rm_22 = new rm_2(amv_2.j(blockPos) - n4, amv_2.h(blockPos) - n4, amv_2.i(blockPos) - n4, amv_2.j(blockPos) + n4 + 1, amv_2.h(blockPos) + n4 + 1, amv_2.i(blockPos) + n4 + 1);
            ListInvoker.addAll(arrayList, aV8.a(world, clazz, predicate2));
        } else {
            rm_2 rm_23 = a0l_0.a(blockPos, n, n2, n3);
            ahs_2 ahs_22 = new ahs_2(rm_23);
            ListInvoker.addAll(arrayList, aV8.a(world, clazz, an7_0.a(predicate2, ahs_22)));
        }
        return arrayList;
    }

    public static <T extends Entity> T b(ICommandSender iCommandSender, String string, Class<? extends T> clazz) {
        List<? extends T> list = a0l_0.a(iCommandSender, string, clazz);
        return (T)(ListInvoker.size(list) == 1 ? (Entity)ListInvoker.get(list, 0) : null);
    }

    private static rm_2 a(BlockPos blockPos, int n, int n2, int n3) {
        int n4 = amv_2.j(blockPos) + n;
        int n5 = amv_2.h(blockPos) + n2;
        int n6 = amv_2.i(blockPos) + n3;
        int n7 = amv_2.j(blockPos) + 1;
        int n8 = amv_2.h(blockPos) + 1;
        int n9 = amv_2.i(blockPos) + 1;
        return new rm_2(n4, n5, n6, n7, n8, n9);
    }

    private static List<Predicate<Entity>> a(Map<String, String> map) {
        ArrayList arrayList = my_0.c();
        String string = a0l_0.a(map, alt_1.ae);
        boolean bl = StringInvoker.e(string, alt_1.ac);
        String string2 = string = StringInvoker.a(string, 1);
        ListInvoker.add(arrayList, new aPH(string2, bl));
        return arrayList;
    }

    public static <T extends Entity> List<T> a(ICommandSender iCommandSender, String string, Class<? extends T> clazz) {
        Matcher matcher = ow_1.a(c, string);
        if (wk_2.a(matcher) && alj_1.a(iCommandSender, 1, alt_1.e)) {
            Map<String, String> map = a0l_0.a(wk_2.b(matcher, 2));
            if (!a0l_0.b(iCommandSender, map)) {
                return asg_0.e();
            }
            String string2 = wk_2.b(matcher, 1);
            BlockPos blockPos = a0l_0.b(map, alj_1.d(iCommandSender));
            List<World> list = a0l_0.a(iCommandSender, map);
            ArrayList arrayList = my_0.c();
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                World world = (World)dz_0.b(iterator);
                ArrayList arrayList2 = my_0.c();
                ListInvoker.addAll(arrayList2, a0l_0.b(map, string2));
                ListInvoker.addAll(arrayList2, a0l_0.c(map));
                ListInvoker.addAll(arrayList2, a0l_0.d(map));
                ListInvoker.addAll(arrayList2, a0l_0.e(map));
                ListInvoker.addAll(arrayList2, a0l_0.f(map));
                ListInvoker.addAll(arrayList2, a0l_0.a(map));
                ListInvoker.addAll(arrayList2, a0l_0.a(map, blockPos));
                ListInvoker.addAll(arrayList2, a0l_0.g(map));
                ListInvoker.addAll(arrayList, a0l_0.a(map, clazz, arrayList2, string2, world, blockPos));
            }
            return a0l_0.a(arrayList, map, iCommandSender, clazz, string2, blockPos);
        }
        return asg_0.e();
    }

    private static Map<String, String> a(String string) {
        HashMap hashMap = MapsInvoker.a();
        int n = 0;
        int n2 = -1;
        Matcher matcher = ow_1.a(a, string);
        while (wk_2.c(matcher)) {
            String string2 = null;
            ++n;
            string2 = alt_1.m;
            if (!StringInvoker.g(wk_2.b(matcher, 1))) {
                MapInvoker.c(hashMap, string2, wk_2.b(matcher, 1));
            }
            n2 = wk_2.d(matcher);
        }
        if (n2 < StringInvoker.c(string)) {
            matcher = ow_1.a(d, string);
            while (wk_2.c(matcher)) {
                MapInvoker.c(hashMap, wk_2.b(matcher, 1), wk_2.b(matcher, 2));
            }
        }
        return hashMap;
    }

    private static List<Predicate<Entity>> d(Map<String, String> map) {
        ArrayList arrayList = my_0.c();
        int n = a0l_0.a(map, alt_1.ag, ar3_0.a(GameType.NOT_SET));
        if (n != ar3_0.a(GameType.NOT_SET)) {
            ListInvoker.add(arrayList, new iy_1(n));
        }
        return arrayList;
    }

    private static <T extends Entity> List<T> a(List<T> list, Map<String, String> map, ICommandSender iCommandSender, Class<? extends T> clazz, String string, BlockPos blockPos) {
        Entity entity;
        int n = a0l_0.a(map, alt_1.O, !string.equals(alt_1.R) && !string.equals(alt_1.u) ? 1 : 0);
        if (!(string.equals(alt_1.A) || string.equals(alt_1.F) || string.equals(alt_1.ai))) {
            if (string.equals(alt_1.as)) {
                asg_0.a(list);
            }
        } else {
            asg_0.a(list, new aui_1(blockPos));
        }
        if (ara_2.a(clazz, (entity = alj_1.e(iCommandSender)).getClass()) && n == 1 && ListInvoker.contains(list, entity) && !alt_1.M.equals(string)) {
            list = my_0.a(new Entity[]{entity});
        }
        asg_0.e(list);
        list = ListInvoker.subList(list, 0, MathInvoker.b(MathInvoker.a(n), ListInvoker.size(list)));
        return list;
    }

    private static <T extends Entity> boolean b(ICommandSender iCommandSender, Map<String, String> map) {
        String string = a0l_0.a(map, alt_1.v);
        String string2 = string = StringInvoker.e(string, alt_1.aq) ? StringInvoker.a(string, 1) : string;
        if (!ub_1.b(string)) {
            aoz_1 aoz_12 = new aoz_1(alt_1.aj, string);
            HX.a(aIW.a(aoz_12), anw_0.RED);
            alj_1.a(iCommandSender, aoz_12);
            return false;
        }
        return true;
    }
}

