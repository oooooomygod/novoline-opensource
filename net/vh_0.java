/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.Entity;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.CG;
import net.RenderGlobal;
import net.ResourceLocation;
import net.World;
import net.WorldServer;
import net.a3V;
import net.a4E;
import net.aL0;
import net.aP2;
import net.aV8;
import net.aol_0;
import net.atf_0;
import net.awc_1;
import net.axw_1;
import net.ayj_0;
import net.nl_1;
import net.s3_0;
import net.ys_2;

/*
 * Renamed from net.Vh
 */
public class vh_0 {
    public static String a = "mcpatcher/mob/";
    private static boolean j;
    public static String d = "textures/entity/";
    private static Random i;
    private static Map h;
    private static String[] e;
    private static boolean b;
    public static String g = ".properties";
    public static String c = ".png";
    private static RenderGlobal f;

    public static ResourceLocation d(ResourceLocation resourceLocation) {
        block10: {
            ResourceLocation resourceLocation2;
            Entity entity;
            block11: {
                ResourceLocation resourceLocation3;
                aP2.b();
                if (j) {
                    return resourceLocation;
                }
                j = true;
                if (!b) {
                    vh_0.a();
                }
                if (f == null) break block10;
                entity = vh_0.f.j;
                if (entity instanceof nl_1) break block11;
                ResourceLocation resourceLocation4 = resourceLocation3 = resourceLocation;
                j = false;
                return resourceLocation4;
            }
            nl_1 nl_12 = (nl_1)entity;
            String string = axw_1.b(resourceLocation);
            if (!StringInvoker.e(string, s3_0.ar)) {
                ResourceLocation resourceLocation5;
                ResourceLocation resourceLocation6 = resourceLocation5 = resourceLocation;
                return resourceLocation6;
            }
            aol_0 aol_02 = vh_0.b(resourceLocation);
            if (aol_02 == null) {
                ResourceLocation resourceLocation7;
                ResourceLocation resourceLocation8 = resourceLocation7 = resourceLocation;
                return resourceLocation8;
            }
            ResourceLocation resourceLocation9 = resourceLocation2 = atf_0.a(aol_02, resourceLocation, nl_12);
            return resourceLocation9;
        }
        ResourceLocation resourceLocation10 = resourceLocation;
        j = false;
        return resourceLocation10;
        finally {
            j = false;
        }
    }

    private static aol_0 a(ResourceLocation resourceLocation) {
        aP2.b();
        String string = axw_1.b(resourceLocation);
        ResourceLocation resourceLocation2 = vh_0.c(resourceLocation);
        if (resourceLocation2 != null) {
            aol_0 aol_02 = vh_0.a(resourceLocation2, resourceLocation);
            return aol_02;
        }
        ResourceLocation[] resourceLocationArray = vh_0.f(resourceLocation);
        return new aol_0(string, resourceLocationArray);
    }

    public static void a(World world, World world2) {
        List list;
        int n;
        aP2.b();
        if (world2 != null && (n = 0) < ListInvoker.size(list = aV8.u(world2))) {
            Entity entity = (Entity)ListInvoker.get(list, n);
            vh_0.a(entity, world2);
            ++n;
        }
    }

    public static ResourceLocation e(ResourceLocation resourceLocation) {
        aP2.b();
        String string = axw_1.b(resourceLocation);
        if (!StringInvoker.e(string, s3_0.af)) {
            return null;
        }
        String string2 = aL0.a(aL0.a(new StringBuilder(), s3_0.r), StringInvoker.a(string, StringInvoker.c(s3_0.X))).toString();
        return new ResourceLocation(axw_1.a(resourceLocation), string2);
    }

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }

    public static void a(Entity entity, World world) {
        aP2.b();
        if (entity instanceof nl_1) {
            Entity entity2;
            nl_1 nl_12 = (nl_1)entity;
            nl_12.bu = CG.d(nl_12);
            nl_12.bp = aV8.o(world, nl_12.bu);
            WorldServer worldServer = ys_2.S();
            if (worldServer != null && (entity2 = a3V.a(worldServer, ayj_0.B(entity))) instanceof nl_1) {
                int n;
                nl_1 nl_13 = (nl_1)entity2;
                UUID uUID = CG.E(nl_13);
                long l4 = awc_1.a(uUID);
                nl_12.bh = n = (int)(l4 & Integer.MAX_VALUE);
            }
        }
    }

    private static aol_0 b(ResourceLocation resourceLocation) {
        aP2.b();
        String string = axw_1.b(resourceLocation);
        aol_0 aol_02 = (aol_0)MapInvoker.c(h, string);
        if (aol_02 == null) {
            aol_02 = vh_0.a(resourceLocation);
            MapInvoker.c(h, string, aol_02);
        }
        return aol_02;
    }

    public static ResourceLocation a(ResourceLocation resourceLocation, int n) {
        aP2.b();
        if (resourceLocation == null) {
            return null;
        }
        String string = axw_1.b(resourceLocation);
        StringInvoker.c(string, 46);
        return null;
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[4];
        int n = 0;
        String string = "\u000fE{x\u000b\u000fEgp*VfU\\pl";
        int n2 = "\u000fE{x\u000b\u000fEgp*VfU\\pl".length();
        int n3 = 4;
        int n4 = -1;
        while (true) {
            int n5 = 10;
            int n6 = ++n4;
            String string2 = string.substring(n6, n6 + n3);
            int n7 = -1;
            boolean bl = true;
            do {
                char[] cArray;
                block7: {
                    int n8;
                    char[] cArray2;
                    int n9;
                    int n10;
                    block6: {
                        if (!bl || (bl = false) || !true) {
                            string = "\u0011\u0014)/k\u00055\u0016^45j\u001e$\u001c^\u000e\b\u0012!:j\u00148\u0000\u0003~6q\u0015\u007f";
                            n2 = "\u0011\u0014)/k\u00055\u0016^45j\u001e$\u001c^\u000e\b\u0012!:j\u00148\u0000\u0003~6q\u0015\u007f".length();
                            n3 = 16;
                            n4 = -1;
                            n5 = 78;
                            int n11 = ++n4;
                            string2 = string.substring(n11, n11 + n3);
                            n7 = 0;
                        }
                        char[] cArray3 = string2.toCharArray();
                        int n12 = cArray3.length;
                        n10 = 0;
                        n9 = n5;
                        cArray2 = cArray3;
                        n8 = n12;
                        if (n12 <= 1) break block6;
                        cArray = cArray2;
                        n8 = n8;
                        if (n8 <= n10) break block7;
                    }
                    do {
                        cArray2 = cArray2;
                        int n13 = n10;
                        int cfr_ignored_1 = n10 % 7;
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x2B));
                        ++n10;
                        n9 = n9;
                        cArray = cArray2;
                        n8 = n8;
                    } while (n8 > n10);
                }
                stringArray[n++] = new String(cArray).intern();
            } while ((n4 += n3) >= n2);
            n3 = string.charAt(n4);
        }
    }

    private static void a() {
        aP2.b();
        f = ys_2.aO();
        if (f != null) {
            b = true;
            ArrayList arrayList = new ArrayList();
            ListInvoker.add(arrayList, s3_0.F);
            ListInvoker.add(arrayList, s3_0.Q);
            ListInvoker.add(arrayList, s3_0.J);
            ListInvoker.add(arrayList, s3_0.B);
            ListInvoker.add(arrayList, s3_0.l);
            ListInvoker.add(arrayList, s3_0.E);
            ListInvoker.add(arrayList, s3_0.aj);
            ListInvoker.add(arrayList, s3_0.k);
            ListInvoker.add(arrayList, s3_0.aa);
            ListInvoker.add(arrayList, s3_0.t);
            ListInvoker.add(arrayList, s3_0.i);
            ListInvoker.add(arrayList, s3_0.q);
            ListInvoker.add(arrayList, s3_0.D);
            ListInvoker.add(arrayList, s3_0.H);
            ListInvoker.add(arrayList, s3_0.u);
            ListInvoker.add(arrayList, s3_0.N);
            ListInvoker.add(arrayList, s3_0.e);
            ListInvoker.add(arrayList, s3_0.ak);
            ListInvoker.add(arrayList, s3_0.K);
            ListInvoker.add(arrayList, s3_0.ae);
            ListInvoker.add(arrayList, s3_0.am);
            ListInvoker.add(arrayList, s3_0.s);
            ListInvoker.add(arrayList, s3_0.h);
            ListInvoker.add(arrayList, s3_0.T);
            ListInvoker.add(arrayList, s3_0.b);
            ListInvoker.add(arrayList, s3_0.ai);
            ListInvoker.add(arrayList, s3_0.o);
            ListInvoker.add(arrayList, s3_0.ap);
            ListInvoker.add(arrayList, s3_0.Z);
            ListInvoker.add(arrayList, s3_0.n);
            ListInvoker.add(arrayList, s3_0.y);
            ListInvoker.add(arrayList, s3_0.x);
            ListInvoker.add(arrayList, s3_0.Y);
            ListInvoker.add(arrayList, s3_0.ac);
            ListInvoker.add(arrayList, s3_0.O);
            ListInvoker.add(arrayList, s3_0.as);
            ListInvoker.add(arrayList, s3_0.w);
            ListInvoker.add(arrayList, s3_0.A);
            ListInvoker.add(arrayList, s3_0.j);
            ListInvoker.add(arrayList, s3_0.P);
            ListInvoker.add(arrayList, s3_0.V);
            ListInvoker.add(arrayList, s3_0.ab);
            ListInvoker.add(arrayList, s3_0.C);
            ListInvoker.add(arrayList, s3_0.v);
            int n = 0;
            if (n < ListInvoker.size(arrayList)) {
                String string = (String)ListInvoker.get(arrayList, n);
                String string2 = aL0.a(aL0.a(aL0.a(new StringBuilder(), s3_0.f), string), s3_0.I).toString();
                ResourceLocation resourceLocation = new ResourceLocation(string2);
                if (!ys_2.d(resourceLocation)) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), s3_0.ao), resourceLocation).toString());
                }
                vh_0.b(resourceLocation);
                ++n;
            }
        }
    }

    private static String a(String string) {
        aP2.b();
        int n = 0;
        if (n < e.length) {
            String string2 = e[n];
            if (StringInvoker.c(string, string2)) {
                String string3 = StringInvoker.b(string, 0, StringInvoker.c(string) - StringInvoker.c(string2));
                return string3;
            }
            ++n;
        }
        return null;
    }

    public static void b() {
        MapInvoker.d(h);
        if (ys_2.t()) {
            vh_0.a();
        }
    }

    private static aol_0 a(ResourceLocation resourceLocation, ResourceLocation resourceLocation2) {
        aP2.b();
        String string = axw_1.b(resourceLocation);
        ys_2.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), s3_0.g), axw_1.b(resourceLocation2)), s3_0.al), string).toString());
        ys_2.b(resourceLocation);
        try {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), s3_0.m), string).toString());
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), s3_0.ag), axw_1.b(resourceLocation2)).toString());
            return null;
        }
        catch (IOException iOException) {
            a4E.b(iOException);
            return null;
        }
    }

    private static ResourceLocation c(ResourceLocation resourceLocation) {
        String string;
        ResourceLocation resourceLocation2;
        String string2;
        aP2.b();
        ResourceLocation resourceLocation3 = vh_0.e(resourceLocation);
        if (resourceLocation3 == null) {
            return null;
        }
        String string3 = axw_1.a(resourceLocation3);
        String string4 = string2 = axw_1.b(resourceLocation3);
        if (StringInvoker.c(string2, s3_0.W)) {
            string4 = StringInvoker.b(string2, 0, StringInvoker.c(string2) - StringInvoker.c(s3_0.an));
        }
        if (ys_2.d(resourceLocation2 = new ResourceLocation(string3, string = aL0.a(aL0.a(new StringBuilder(), string4), s3_0.ah).toString()))) {
            return resourceLocation2;
        }
        vh_0.a(string4);
        return null;
    }

    private static ResourceLocation[] f(ResourceLocation resourceLocation) {
        aP2.b();
        ArrayList arrayList = new ArrayList();
        ListInvoker.add(arrayList, resourceLocation);
        vh_0.e(resourceLocation);
        return null;
    }
}

