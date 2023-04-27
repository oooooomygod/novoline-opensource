/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.EntityLivingBase;
import deobf.IResourcePack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.NBTTagList;
import net.minecraft.renderer.entity.RenderItem;
import net.minecraft.renderer.texture.TextureMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class aQQ {
    private static ajx_0[][] l;
    private static boolean a;
    public static String d = "items/potion_bottle_drinkable";
    public static String j = "texture.potion_bottle_splash";
    public static String i = "items/potion_overlay";
    public static String b = "texture.potion_overlay";
    private static int[] h;
    public static int c = 16384;
    private static apm_1 e;
    private static int[][] m;
    private static Map n;
    public static String f = "texture.potion_bottle_drinkable";
    public static int o = 63;
    public static String k = "items/potion_bottle_splash";
    private static ajx_0[][] g;

    private static List a(ajx_0[][] ajx_0Array) {
        aP2.b();
        ArrayList arrayList = new ArrayList();
        int n = 0;
        if (n < ajx_0Array.length) {
            Object[] objectArray = ajx_0Array[n];
            ArrayList arrayList2 = null;
            arrayList2 = new ArrayList(a7r_0.a(objectArray));
            ListInvoker.add(arrayList, arrayList2);
            ++n;
        }
        return arrayList;
    }

    private static int[] a(int n) {
        return new int[]{n, n + 16, n + 32, n + 48};
    }

    private static void a(ajx_0 ajx_02, List list) {
        int n;
        aP2.b();
        if (ajx_02.c != null && (n = 0) < ajx_02.c.length) {
            int n2 = ajx_02.c[n];
            ys_2.d(aL0.c(aL0.a(new StringBuilder(), aeu_2.I), n2).toString());
            aQQ.a(ajx_02, list, n2);
            ++n;
        }
    }

    private static void a(ajx_0 ajx_02, List list, int n) {
        ArrayList arrayList;
        aP2.b();
        if (n >= ListInvoker.size(list)) {
            ListInvoker.add(list, null);
        }
        if ((arrayList = (ArrayList)ListInvoker.get(list, n)) == null) {
            arrayList = new ArrayList();
            ListInvoker.set(list, n, arrayList);
        }
        ListInvoker.add(arrayList, ajx_02);
    }

    public static JE a(ItemStack itemStack, JE jE, aRJ aRJ2) {
        aP2.b();
        if (aND.e(jE)) {
            return jE;
        }
        if (l == null) {
            return jE;
        }
        ajx_0 ajx_02 = aQQ.a(itemStack, 1);
        return ajx_02 == null ? jE : aBV.a(ajx_02, aRJ2);
    }

    private static void b(String string) {
        aP2.b();
        try {
            ResourceLocation resourceLocation = new ResourceLocation(string);
            ys_2.b(resourceLocation);
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            a4E.b(iOException);
            return;
        }
    }

    private static ajx_0 a(ItemStack itemStack, int n) {
        ajx_0[] ajx_0Array;
        int n2;
        aP2.b();
        if (l == null) {
            return null;
        }
        if (itemStack == null) {
            return null;
        }
        Item item = act_2.k(itemStack);
        int n3 = px_0.a(item);
        if (n3 >= 0 && n3 < l.length && (n2 = 0) < (ajx_0Array = l[n3]).length) {
            ajx_0 ajx_02 = ajx_0Array[n2];
            if (ajx_02.t == n && aQQ.a(ajx_02, itemStack, (int[][])null)) {
                return ajx_02;
            }
            ++n2;
        }
        return null;
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[6];
        int n = 0;
        String string = "Ah\u000b\"O>U\u001b}\u001c\"S#^jo\u001c\"N Uji\u0001?T'QWa\u0016\u001d\\y\u0016;Ic@Zy\u001a9T\u0013RZy\u0007:_\u0013TGd\u001d=[.\\P\u001cAh\u000b\"O>U\u001b}\u001c\"S#^jo\u001c\"N Uj~\u0003:[?X\u001a\\y\u0016;Ic@Zy\u001a9T\u0013RZy\u0007:_\u0013CEa\u0012%R";
        int n2 = "Ah\u000b\"O>U\u001b}\u001c\"S#^jo\u001c\"N Uji\u0001?T'QWa\u0016\u001d\\y\u0016;Ic@Zy\u001a9T\u0013RZy\u0007:_\u0013TGd\u001d=[.\\P\u001cAh\u000b\"O>U\u001b}\u001c\"S#^jo\u001c\"N Uj~\u0003:[?X\u001a\\y\u0016;Ic@Zy\u001a9T\u0013RZy\u0007:_\u0013CEa\u0012%R".length();
        int n3 = 31;
        int n4 = -1;
        while (true) {
            int n5 = 1;
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
                            string = "1\u0018{R?N%k\rlR#S.\u001a\u0012uC8P!<\u0014,\tfK9\u00130*\tjI$c/3\u0018qJ+E";
                            n2 = "1\u0018{R?N%k\rlR#S.\u001a\u0012uC8P!<\u0014,\tfK9\u00130*\tjI$c/3\u0018qJ+E".length();
                            n3 = 22;
                            n4 = -1;
                            n5 = 113;
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
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x34));
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

    private static Map a() {
        aP2.b();
        if (n == null) {
            n = new LinkedHashMap();
            MapInvoker.c(n, aeu_2.O, new int[]{0});
            MapInvoker.c(n, aeu_2.L, new int[]{16});
            MapInvoker.c(n, aeu_2.ao, new int[]{32});
            MapInvoker.c(n, aeu_2.Y, new int[]{48});
            MapInvoker.c(n, aeu_2.P, aQQ.a(1));
            MapInvoker.c(n, aeu_2.k, aQQ.a(2));
            MapInvoker.c(n, aeu_2.Z, aQQ.a(3));
            MapInvoker.c(n, aeu_2.al, aQQ.a(4));
            MapInvoker.c(n, aeu_2.e, aQQ.a(5));
            MapInvoker.c(n, aeu_2.o, aQQ.a(6));
            MapInvoker.c(n, aeu_2.a, aQQ.a(7));
            MapInvoker.c(n, aeu_2.V, aQQ.a(23));
            MapInvoker.c(n, aeu_2.R, aQQ.a(39));
            MapInvoker.c(n, aeu_2.C, aQQ.a(55));
            MapInvoker.c(n, aeu_2.v, aQQ.a(8));
            MapInvoker.c(n, aeu_2.q, aQQ.a(9));
            MapInvoker.c(n, aeu_2.d, aQQ.a(10));
            MapInvoker.c(n, aeu_2.p, aQQ.a(11));
            MapInvoker.c(n, aeu_2.w, aQQ.a(27));
            MapInvoker.c(n, aeu_2.G, aQQ.a(43));
            MapInvoker.c(n, aeu_2.c, aQQ.a(59));
            MapInvoker.c(n, aeu_2.K, aQQ.a(12));
            MapInvoker.c(n, aeu_2.H, aQQ.a(13));
            MapInvoker.c(n, aeu_2.j, aQQ.a(14));
            MapInvoker.c(n, aeu_2.Q, aQQ.a(15));
            MapInvoker.c(n, aeu_2.A, aQQ.a(31));
            MapInvoker.c(n, aeu_2.y, aQQ.a(47));
            MapInvoker.c(n, aeu_2.B, aQQ.a(63));
        }
        return n;
    }

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }

    private static Properties a(String string, boolean bl, String string2) {
        aP2.b();
        if (MZ.c(string, new String[]{aeu_2.ac, aeu_2.u})) {
            return null;
        }
        if (string.equals(aeu_2.ae) && !bl) {
            int n = px_0.a(Items.glass_bottle);
            Properties properties = new Properties();
            dk_1.a(properties, (Object)aeu_2.g, (Object)aeu_2.M);
            dk_1.a(properties, (Object)aeu_2.t, (Object)aL0.c(aL0.a(new StringBuilder(), aeu_2.ab), n).toString());
            return properties;
        }
        int n = px_0.a(Items.potionitem);
        int[] nArray = (int[])MapInvoker.c(aQQ.a(), string);
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), aeu_2.b), string2).toString());
        return null;
    }

    private static ajx_0[][] a(List list) {
        aP2.b();
        ajx_0[][] ajx_0Array = new ajx_0[ListInvoker.size(list)][];
        int n = 0;
        if (n < ListInvoker.size(list)) {
            List list2 = (List)ListInvoker.get(list, n);
            Object[] objectArray = (ajx_0[])ListInvoker.toArray(list2, new ajx_0[ListInvoker.size(list2)]);
            a7r_0.a(objectArray, new aZ0());
            ajx_0Array[n] = objectArray;
            ++n;
        }
        return ajx_0Array;
    }

    private static boolean a(ajx_0 ajx_02, ItemStack itemStack, int[][] nArray) {
        int n;
        aP2.b();
        Item item = act_2.k(itemStack);
        if (ajx_02.d != null) {
            int n2 = act_2.s(itemStack);
            if (ajx_02.q != 0) {
                n2 &= ajx_02.q;
            }
            if (ajx_02.b) {
                n = px_0.k(item);
                n2 = (int)((double)(n2 * 100) / (double)n);
            }
            if (!pe_1.a(ajx_02.d, n2)) {
                return false;
            }
        }
        if (ajx_02.n != null && !pe_1.a(ajx_02.n, itemStack.a)) {
            return false;
        }
        int[][] nArray2 = nArray;
        if (ajx_02.f != null) {
            if (nArray == null) {
                nArray2 = aQQ.a(itemStack);
            }
            n = 0;
            int n3 = 0;
            if (n3 < nArray2.length) {
                int n4 = nArray2[n3][0];
                if (pe_1.a(ajx_02.f, n4)) {
                    n = 1;
                }
                ++n3;
            }
            return false;
        }
        if (ajx_02.p != null) {
            if (nArray2 == null) {
                nArray2 = aQQ.a(itemStack);
            }
            n = 0;
            int n5 = 0;
            if (n5 < nArray2.length) {
                int n6 = nArray2[n5][1];
                if (pe_1.a(ajx_02.p, n6)) {
                    n = 1;
                }
                ++n5;
            }
            return false;
        }
        if (ajx_02.g != null) {
            NBTTagCompound nBTTagCompound = act_2.a(itemStack);
            int n7 = 0;
            if (n7 < ajx_02.g.length) {
                aei_1 aei_12 = ajx_02.g[n7];
                if (!aau_2.a(aei_12, nBTTagCompound)) {
                    return false;
                }
                ++n7;
            }
        }
        return true;
    }

    private static int a(String string) {
        String string2 = aL0.a(aL0.a(new StringBuilder(), aeu_2.U), string).toString();
        aP2.b();
        Potion[] potionArray = Potion.potionTypes;
        int n = 0;
        if (n < potionArray.length) {
            Potion potion = potionArray[n];
            String string3 = ari_0.d(potion);
            if (string2.equals(string3)) {
                return ari_0.f(potion);
            }
            ++n;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void a(TextureMap var0, IResourcePack var1_1) {
        block15: {
            block14: {
                aP2.b();
                var3_2 = amc_0.a(var1_1, aeu_2.af, aeu_2.X, null);
                var4_3 = aQQ.a(var1_1);
                if (MapInvoker.a(var4_3) > 0) {
                    var5_4 /* !! */  = MapInvoker.c(var4_3);
                    var6_5 = (String[])aS0.a(var5_4 /* !! */ , new String[aS0.d(var5_4 /* !! */ )]);
                    var3_2 = (String[])ys_2.a(var3_2, var6_5);
                }
                a7r_0.d(var3_2);
                var5_4 /* !! */  = aQQ.a(aQQ.l);
                var6_5 = aQQ.a(aQQ.g);
                var7_6 = 0;
                if (var7_6 >= var3_2.length) break block15;
                var8_8 = var3_2[var7_6];
                ys_2.a(aL0.a(aL0.a(new StringBuilder(), aeu_2.x), (String)var8_8).toString());
                var9_10 /* !! */  = null;
                if (!MapInvoker.b(var4_3, var8_8)) ** GOTO lbl21
                var9_10 /* !! */  = (ajx_0)MapInvoker.c(var4_3, var8_8);
lbl21:
                // 2 sources

                if (var9_10 /* !! */  != null) ** GOTO lbl31
                var10_13 = new ResourceLocation((String)var8_8);
                var11_14 = avv_0.a(var1_1, var10_13);
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), aeu_2.ap), (String)var8_8).toString());
                var12_15 = new Properties();
                dk_1.a(var12_15, var11_14);
                var9_10 /* !! */  = new ajx_0(var12_15, (String)var8_8);
lbl31:
                // 2 sources

                if (!aBV.a((ajx_0)var9_10 /* !! */ , (String)var8_8)) break block14;
                var9_10 /* !! */ .a(var0);
                aQQ.a((ajx_0)var9_10 /* !! */ , (List)var5_4 /* !! */ );
                v0 = var9_10 /* !! */ ;
                try {
                    aQQ.b((ajx_0)v0, (List)var6_5);
                }
                catch (FileNotFoundException var9_11) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), aeu_2.F), (String)var8_8).toString());
                }
                catch (Exception var9_12) {
                    ch_2.a(var9_12);
                }
            }
            ++var7_6;
        }
        aQQ.l = aQQ.a((List)var5_4 /* !! */ );
        aQQ.g = aQQ.a((List)var6_5);
        var7_7 = aQQ.b();
        var8_9 = 0;
        if (var8_9 < aQQ.l.length) {
            var9_10 /* !! */  = aQQ.l[var8_9];
            if (var9_10 /* !! */  != null) {
                a7r_0.a(var9_10 /* !! */ , var7_7);
            }
            ++var8_9;
        }
        if ((var8_9 = 0) < aQQ.g.length) {
            var9_10 /* !! */  = aQQ.g[var8_9];
            if (var9_10 /* !! */  != null) {
                a7r_0.a(var9_10 /* !! */ , var7_7);
            }
            ++var8_9;
        }
    }

    public static boolean a(RenderItem renderItem, ItemStack itemStack, JE jE) {
        aP2.b();
        if (g == null) {
            return false;
        }
        if (itemStack == null) {
            return false;
        }
        int[][] nArray = aQQ.a(itemStack);
        if (nArray.length <= 0) {
            return false;
        }
        HashSet hashSet = null;
        boolean bl = false;
        TextureManager textureManager = ys_2.l();
        int n = 0;
        if (n < nArray.length) {
            ajx_0[] ajx_0Array;
            int n2;
            int n3 = nArray[n][0];
            if (n3 >= 0 && n3 < g.length && (n2 = 0) < (ajx_0Array = g[n3]).length) {
                ajx_0 ajx_02 = ajx_0Array[n2];
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                if (aS0.b(hashSet, P8.d(n3)) && aQQ.a(ajx_02, itemStack, nArray) && ajx_02.l != null) {
                    TextureManagerInvoker.bindTexture(textureManager, ajx_02.l);
                    float f = aBV.a(ajx_02, textureManager);
                    bl = true;
                    GlStateManagerInvoker.c(false);
                    GlStateManagerInvoker.depthFunc(514);
                    GlStateManagerInvoker.disableLighting();
                    GlStateManagerInvoker.matrixMode(5890);
                    c0.a(ajx_02.A, 1.0f);
                    GlStateManagerInvoker.pushMatrix();
                    GlStateManagerInvoker.c(f / 2.0f, f / 2.0f, f / 2.0f);
                    float f2 = ajx_02.x * (float)(MCInvoker.a() % 3000L) / 3000.0f / 8.0f;
                    GlStateManagerInvoker.translate(f2, 0.0f, 0.0f);
                    GlStateManagerInvoker.b(ajx_02.v, 0.0f, 0.0f, 1.0f);
                    DU.a(renderItem, jE, -1);
                    GlStateManagerInvoker.popMatrix();
                }
                ++n2;
            }
            ++n;
        }
        return bl;
    }

    private static Map a(IResourcePack iResourcePack) {
        HashMap hashMap = new HashMap();
        MapInvoker.a(hashMap, aQQ.a(iResourcePack, false));
        MapInvoker.a(hashMap, aQQ.a(iResourcePack, true));
        return hashMap;
    }

    private static Map a(IResourcePack iResourcePack, boolean bl) {
        aP2.b();
        HashMap hashMap = new HashMap();
        String string = aeu_2.am;
        String[] stringArray = new String[]{aL0.a(aL0.a(new StringBuilder(), aeu_2.J), string).toString(), aL0.a(aL0.a(new StringBuilder(), aeu_2.ai), string).toString()};
        String[] stringArray2 = new String[]{aeu_2.s};
        String[] stringArray3 = amc_0.a(iResourcePack, stringArray, stringArray2);
        int n = 0;
        if (n < stringArray3.length) {
            String string2 = stringArray3[n];
            String string3 = MZ.a(string2, stringArray, stringArray2);
            Properties properties = aQQ.a(string3, bl, string2);
            String string4 = aL0.a(aL0.a(new StringBuilder(), MZ.a(string2, stringArray2)), aeu_2.S).toString();
            ajx_0 ajx_02 = new ajx_0(properties, string4);
            MapInvoker.c(hashMap, string4, ajx_02);
            ++n;
        }
        return hashMap;
    }

    public static boolean a(EntityLivingBase entityLivingBase, ItemStack itemStack, q1_0 q1_02, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        aP2.b();
        if (g == null) {
            return false;
        }
        if (ys_2.aC() && aVE.ch) {
            return false;
        }
        if (itemStack == null) {
            return false;
        }
        int[][] nArray = aQQ.a(itemStack);
        if (nArray.length <= 0) {
            return false;
        }
        HashSet hashSet = null;
        boolean bl = false;
        TextureManager textureManager = ys_2.l();
        int n = 0;
        if (n < nArray.length) {
            ajx_0[] ajx_0Array;
            int n2;
            int n3 = nArray[n][0];
            if (n3 >= 0 && n3 < g.length && (n2 = 0) < (ajx_0Array = g[n3]).length) {
                ajx_0 ajx_02 = ajx_0Array[n2];
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                if (aS0.b(hashSet, P8.d(n3)) && aQQ.a(ajx_02, itemStack, nArray) && ajx_02.l != null) {
                    TextureManagerInvoker.bindTexture(textureManager, ajx_02.l);
                    float f8 = aBV.a(ajx_02, textureManager);
                    bl = true;
                    if (ys_2.aC()) {
                        axw_2.f();
                    }
                    GlStateManagerInvoker.enableBlend();
                    GlStateManagerInvoker.depthFunc(514);
                    GlStateManagerInvoker.c(false);
                    c0.a(ajx_02.A, 1.0f);
                    GlStateManagerInvoker.disableLighting();
                    GlStateManagerInvoker.matrixMode(5890);
                    GlStateManagerInvoker.loadIdentity();
                    GlStateManagerInvoker.b(ajx_02.v, 0.0f, 0.0f, 1.0f);
                    float f9 = f8 / 8.0f;
                    GlStateManagerInvoker.c(f9, f9 / 2.0f, f9);
                    float f10 = ajx_02.x * (float)(MCInvoker.a() % 3000L) / 3000.0f / 8.0f;
                    GlStateManagerInvoker.translate(0.0f, f10, 0.0f);
                    GlStateManagerInvoker.matrixMode(5888);
                    aV7.a(q1_02, entityLivingBase, f, f2, f4, f5, f6, f7);
                }
                ++n2;
            }
            ++n;
        }
        return bl;
    }

    public static boolean d() {
        return a;
    }

    private static int[][] a(ItemStack itemStack) {
        NBTTagList nBTTagList;
        aP2.b();
        Item item = act_2.k(itemStack);
        NBTTagList nBTTagList2 = nBTTagList = item == Items.enchanted_book ? arw_2.a(Items.enchanted_book, itemStack) : act_2.h(itemStack);
        if (nBTTagList != null && kv_0.c(nBTTagList) > 0) {
            int[][] nArray = new int[kv_0.c(nBTTagList)][2];
            int n = 0;
            if (n < kv_0.c(nBTTagList)) {
                NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, n);
                short s = tn_0.o(nBTTagCompound, aeu_2.T);
                short s3 = tn_0.o(nBTTagCompound, aeu_2.ak);
                nArray[n][0] = s;
                nArray[n][1] = s3;
                ++n;
            }
            return nArray;
        }
        return m;
    }

    public static boolean a(ItemStack itemStack, int n, String string) {
        aP2.b();
        if (l == null) {
            return false;
        }
        aQQ.b(itemStack, n, string);
        return false;
    }

    private static ResourceLocation b(ItemStack itemStack, int n, String string) {
        aP2.b();
        ajx_0 ajx_02 = aQQ.a(itemStack, 3);
        if (ajx_02 == null) {
            return null;
        }
        if (ajx_02.y == null) {
            return null;
        }
        Item item = act_2.k(itemStack);
        if (!(item instanceof ItemArmor)) {
            return null;
        }
        ItemArmor itemArmor = (ItemArmor)item;
        String string2 = ax1_0.a(xs_2.a(itemArmor));
        StringBuffer stringBuffer = new StringBuffer();
        adw_2.a(stringBuffer, aeu_2.W);
        adw_2.a(stringBuffer, string2);
        adw_2.a(stringBuffer, aeu_2.aj);
        adw_2.a(stringBuffer, n);
        if (string != null) {
            adw_2.a(stringBuffer, aeu_2.an);
            adw_2.a(stringBuffer, string);
        }
        String string3 = stringBuffer.toString();
        ResourceLocation resourceLocation = (ResourceLocation)MapInvoker.c(ajx_02.y, string3);
        return resourceLocation;
    }

    private static void b(ajx_0 ajx_02, List list) {
        aP2.b();
        if (ajx_02.t == 2 && ajx_02.f != null) {
            int n = 0;
            if (pe_1.a(ajx_02.f, n)) {
                aQQ.a(ajx_02, list, n);
            }
            ++n;
        }
    }

    private static Comparator b() {
        pv_2 pv_22 = new pv_2();
        return pv_22;
    }

    public static void a(TextureMap textureMap) {
        l = null;
        g = null;
        aP2.b();
        a = true;
        if (ys_2.b()) {
            aQQ.b(aeu_2.r);
            IResourcePack[] iResourcePackArray = ys_2.d();
            int n = iResourcePackArray.length - 1;
            IResourcePack iResourcePack = iResourcePackArray[n];
            aQQ.a(textureMap, iResourcePack);
            --n;
            aQQ.a(textureMap, ys_2.g());
            if (l.length <= 0) {
                l = null;
            }
            if (g.length <= 0) {
                g = null;
            }
        }
    }

    public static void c() {
        int n;
        aP2.b();
        if (l != null && (n = 0) < l.length) {
            int n2 = 0;
            ajx_0[] ajx_0Array = l[n];
            if (n2 < ajx_0Array.length) {
                ajx_0 ajx_02 = ajx_0Array[n2];
                if (ajx_02.t == 1) {
                    TextureMap textureMap = MCInvoker.f(MCInvoker.f());
                    aBV.a(ajx_02, textureMap, e);
                }
                ++n2;
            }
            ++n;
        }
    }
}

