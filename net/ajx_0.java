/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.EnumFacing;
import net.minecraft.item.ArmorMaterial;
import deobf.ITextureObject;
import net.minecraft.item.ItemArmor;
import net.minecraft.renderer.texture.TextureMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.ajx
 */
public class ajx_0 {
    public int D;
    public JE j;
    public static int u = 3;
    private int s;
    public static int m = 2;
    public float v;
    public a0W f;
    public int e;
    public int t;
    public Map<String, JE> r;
    public a0W d;
    public int q;
    public a0W n;
    public Map<String, String> B;
    public boolean b;
    public static int h = 1;
    public KM a;
    public String k;
    public Map y;
    public static int E = 0;
    private int i;
    public ResourceLocation l;
    public float x;
    public int A;
    public a0W p;
    public aei_1[] g;
    public float w;
    public int[] c;
    public Map C;
    public String z;
    public String o;

    public void a(TextureMap textureMap) {
        Object object;
        aP2.b();
        if (this.k != null) {
            this.l = this.f(this.k);
            if (this.t == 1) {
                object = this.a(this.l);
                this.a = h9.a(textureMap, (ResourceLocation)object);
            }
        }
        if (this.B != null) {
            this.y = new HashMap();
            this.C = new HashMap();
            object = aS0.f(MapInvoker.c(this.B));
            if (dz_0.c((Iterator)object)) {
                String string = (String)dz_0.b((Iterator)object);
                String string2 = (String)MapInvoker.c(this.B, string);
                ResourceLocation resourceLocation = this.f(string2);
                MapInvoker.c(this.y, string, resourceLocation);
                if (this.t == 1) {
                    ResourceLocation resourceLocation2 = this.a(resourceLocation);
                    KM kM = h9.a(textureMap, resourceLocation2);
                    MapInvoker.c(this.C, string, kM);
                }
            }
        }
    }

    private static JE a(TextureMap textureMap, aBU aBU2, boolean bl) {
        aP2.b();
        alt_0 alt_02 = alt_0.X0_Y0;
        boolean bl2 = false;
        KM kM = h9.a(textureMap, ayl_0.b(aBU2, ab_1.at));
        os_2 os_22 = aie_1.a(new os_2(aBU2), kM);
        Iterator iterator = ListInvoker.iterator(ayl_0.b(aBU2));
        if (dz_0.c(iterator)) {
            IE iE = (IE)dz_0.b(iterator);
            Iterator iterator2 = aS0.f(MapInvoker.c(iE.d));
            if (dz_0.c(iterator2)) {
                EnumFacing enumFacing = (EnumFacing)dz_0.b(iterator2);
                aL1 aL12 = (aL1)MapInvoker.c(iE.d, enumFacing);
                if (!bl) {
                    aL12 = new aL1(aL12.e, -1, aL12.b, aL12.a);
                }
                KM kM2 = h9.a(textureMap, ayl_0.b(aBU2, aL12.b));
                a9Z a9Z2 = ajx_0.a(iE, aL12, kM2, enumFacing, alt_02, bl2);
                if (aL12.e == null) {
                    aie_1.a(os_22, a9Z2);
                }
                aie_1.a(os_22, aD3.a(alt_02, aL12.e), a9Z2);
            }
        }
        return aie_1.a(os_22);
    }

    public ajx_0(Properties properties, String string) {
        aP2.b();
        this.z = null;
        this.o = null;
        this.t = 1;
        this.c = null;
        this.k = null;
        this.B = null;
        this.d = null;
        this.b = false;
        this.q = 0;
        this.n = null;
        this.f = null;
        this.p = null;
        this.g = null;
        this.A = 1;
        this.x = 0.0f;
        this.v = 0.0f;
        this.e = 0;
        this.w = 1.0f;
        this.D = 0;
        this.l = null;
        this.y = null;
        this.a = null;
        this.C = null;
        this.j = null;
        this.r = null;
        this.i = 0;
        this.s = 0;
        this.z = ajx_0.c(string);
        this.o = ajx_0.a(string);
        this.t = this.d(dk_1.a(properties, ab_1.N));
        this.c = this.b(dk_1.a(properties, ab_1.Q), dk_1.a(properties, ab_1.H));
        this.B = ajx_0.a(properties, this.o);
        this.k = ajx_0.a(dk_1.a(properties, ab_1.j), dk_1.a(properties, ab_1.aE), dk_1.a(properties, ab_1.u), string, this.o, this.t, this.B);
        String string2 = dk_1.a(properties, ab_1.ae);
        this.b = StringInvoker.a(string2, (CharSequence)ab_1.aq);
        StringInvoker.a(string2, (CharSequence)ab_1.f, (CharSequence)ab_1.aS);
        this.d = this.b(string2);
        this.q = this.a(dk_1.a(properties, ab_1.x), 0);
        this.n = this.b(dk_1.a(properties, ab_1.l));
        this.f = this.b(dk_1.a(properties, ab_1.U));
        this.p = this.b(dk_1.a(properties, ab_1.e));
        this.g = this.a(properties);
        this.A = c0.a(dk_1.a(properties, ab_1.D));
        this.x = this.a(dk_1.a(properties, ab_1.g), 0.0f);
        this.v = this.a(dk_1.a(properties, ab_1.aR), 0.0f);
        this.e = this.a(dk_1.a(properties, ab_1.V), 0);
        this.D = this.a(dk_1.a(properties, ab_1.r), 0);
        this.w = this.a(dk_1.a(properties, ab_1.I), 1.0f);
        if (ListInvoker.b() != null) {
            aP2.b("puoD5");
        }
    }

    public void a(TextureMap textureMap, apm_1 apm_12) {
        Iterator iterator;
        aP2.b();
        String[] stringArray = this.b();
        boolean bl = this.a();
        this.j = ajx_0.a(textureMap, apm_12, stringArray, bl);
        if (this.t == 1 && this.B != null && dz_0.c(iterator = aS0.f(MapInvoker.c(this.B)))) {
            String string = (String)dz_0.b(iterator);
            String string2 = (String)MapInvoker.c(this.B, string);
            String string3 = MZ.a(string, ab_1.k);
            if (StringInvoker.e(string3, ab_1.Y) || StringInvoker.e(string3, ab_1.R)) {
                String[] stringArray2 = new String[]{string2};
                JE jE = ajx_0.a(textureMap, apm_12, stringArray2, bl);
                if (this.r == null) {
                    this.r = new HashMap<String, JE>();
                }
                MapInvoker.c(this.r, string3, jE);
            }
        }
    }

    private static String a(String string, String string2, String string3, String string4, String string5, int n, Map<String, String> map) {
        String string6;
        aP2.b();
        if (string == null) {
            string = string2;
        }
        if (string == null) {
            string = string3;
        }
        if (string != null) {
            String string7 = ab_1.B;
            if (StringInvoker.c(string, string7)) {
                string = StringInvoker.b(string, 0, StringInvoker.c(string) - StringInvoker.c(string7));
            }
            string = ajx_0.a(string, string5);
            return string;
        }
        if (n == 3) {
            return null;
        }
        if (map != null && (string6 = (String)MapInvoker.c(map, ab_1.aw)) != null) {
            return string6;
        }
        string6 = string4;
        int n2 = StringInvoker.c(string4, 47);
        if (n2 >= 0) {
            string6 = StringInvoker.a(string4, n2 + 1);
        }
        int n3 = StringInvoker.c(string6, 46);
        string6 = StringInvoker.b(string6, 0, n3);
        string6 = ajx_0.a(string6, string5);
        return string6;
    }

    private ResourceLocation f(String string) {
        aP2.b();
        return null;
    }

    private static String a(String string, String string2) {
        String string3;
        aP2.b();
        string = aH3.a(string, string2);
        if (!(StringInvoker.e(string, string2) || StringInvoker.e(string, ab_1.ad) || StringInvoker.e(string, ab_1.p))) {
            string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string2), ab_1.ag), string).toString();
        }
        if (StringInvoker.c(string, ab_1.az)) {
            string = StringInvoker.b(string, 0, StringInvoker.c(string) - 4);
        }
        if (StringInvoker.e(string, string3 = ab_1.aG)) {
            string = StringInvoker.a(string, StringInvoker.c(string3));
        }
        if (StringInvoker.e(string, ab_1.G)) {
            string = StringInvoker.a(string, 1);
        }
        return string;
    }

    private boolean a() {
        return true;
    }

    private static String a(String string) {
        StringInvoker.c(string, 47);
        return ab_1.aJ;
    }

    public float b(TextureManager textureManager) {
        aP2.b();
        if (this.s <= 0) {
            if (this.l != null) {
                ITextureObject iTextureObject = TextureManagerInvoker.b(textureManager, this.l);
                int n = u3_0.c(iTextureObject);
                int n2 = GlStateManagerInvoker.E();
                GlStateManagerInvoker.k(n);
                this.s = GL11.glGetTexLevelParameteri((int)3553, (int)0, (int)4097);
                GlStateManagerInvoker.k(n2);
            }
            if (this.s <= 0) {
                this.s = 16;
            }
        }
        return this.s;
    }

    private ResourceLocation a(ResourceLocation resourceLocation) {
        String string = axw_1.b(resourceLocation);
        string = MZ.a(string, ab_1.al);
        string = MZ.b(string, ab_1.ah);
        ResourceLocation resourceLocation2 = new ResourceLocation(axw_1.a(resourceLocation), string);
        return resourceLocation2;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ab_1.aH), this.o), ab_1.S), this.z), ab_1.W), this.t), ab_1.a), ys_2.a(this.c)), ab_1.ap), this.k).toString();
    }

    private act_0 g(String string) {
        aP2.b();
        if (string == null) {
            return null;
        }
        int n = StringInvoker.c(string = StringInvoker.h(string)) - StringInvoker.c(StringInvoker.a(string, (CharSequence)ab_1.T, (CharSequence)ab_1.d));
        if (n > 1) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.z), string).toString());
            return null;
        }
        String[] stringArray = ys_2.a(string, ab_1.aD);
        int[] nArray = new int[stringArray.length];
        int n2 = 0;
        if (n2 < stringArray.length) {
            String string2 = stringArray[n2];
            int n3 = tf_0.a(string2, -1);
            if (n3 < 0) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.b), string).toString());
                return null;
            }
            nArray[n2] = n3;
            ++n2;
        }
        if (nArray.length == 1) {
            n2 = nArray[0];
            if (StringInvoker.e(string, ab_1.am)) {
                return new act_0(0, n2);
            }
            if (StringInvoker.c(string, ab_1.aC)) {
                return new act_0(n2, 255);
            }
            return new act_0(n2, n2);
        }
        if (nArray.length == 2) {
            n2 = MathInvoker.b(nArray[0], nArray[1]);
            int n4 = MathInvoker.max(nArray[0], nArray[1]);
            return new act_0(n2, n4);
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.ab), string).toString());
        return null;
    }

    private aei_1[] a(Properties properties) {
        aP2.b();
        String string = ab_1.s;
        Map map = ajx_0.b(properties, string);
        if (MapInvoker.a(map) <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aei_1[] aei_1Array = aS0.f(MapInvoker.c(map));
        if (dz_0.c((Iterator)aei_1Array)) {
            Object object = dz_0.b((Iterator)aei_1Array);
            String string2 = (String)MapInvoker.c(map, object);
            String string3 = StringInvoker.a((String)object, StringInvoker.c(string));
            aei_1 aei_12 = new aei_1(string3, string2);
            ListInvoker.add(arrayList, aei_12);
        }
        aei_1Array = (aei_1[])ListInvoker.toArray(arrayList, new aei_1[ListInvoker.size(arrayList)]);
        return aei_1Array;
    }

    private static a9Z a(IE iE, aL1 aL12, KM kM, EnumFacing enumFacing, alt_0 alt_02, boolean bl) {
        x9_0 x9_02 = new x9_0();
        return abj_1.a(x9_02, iE.e, iE.b, aL12, kM, enumFacing, alt_02, iE.c, bl, iE.a);
    }

    private static JE a(TextureMap textureMap, apm_1 apm_12, String[] stringArray, boolean bl) {
        aBU aBU2 = ajx_0.a(stringArray);
        aBU aBU3 = mz_1.a(apm_12, textureMap, aBU2);
        JE jE = ajx_0.a(textureMap, aBU3, bl);
        return jE;
    }

    private static aBU a(String[] stringArray) {
        Object object;
        aP2.b();
        StringBuffer stringBuffer = new StringBuffer();
        adw_2.a(stringBuffer, ab_1.af);
        int n = 0;
        if (n < stringArray.length) {
            object = stringArray[n];
            adw_2.a(stringBuffer, ab_1.h);
            adw_2.a(stringBuffer, aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), ab_1.X), n), ab_1.K), (String)object), ab_1.aN).toString());
            ++n;
        }
        adw_2.a(stringBuffer, ab_1.aM);
        String string = stringBuffer.toString();
        object = ayl_0.a(string);
        return object;
    }

    public JE a(aRJ aRJ2) {
        aP2.b();
        if (this.B != null) {
            JE jE;
            String string = s9_0.a(aRJ2);
            if (this.r != null && (jE = (JE)MapInvoker.c(this.r, string)) != null) {
                return jE;
            }
        }
        return this.j;
    }

    private int a(String string, int n) {
        aP2.b();
        if (string == null) {
            return n;
        }
        int n2 = tf_0.a(string = StringInvoker.h(string), Integer.MIN_VALUE);
        if (n2 == Integer.MIN_VALUE) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.i), string).toString());
            return n;
        }
        return n2;
    }

    private int d(String string) {
        aP2.b();
        if (string == null) {
            return 1;
        }
        if (string.equals(ab_1.q)) {
            return 1;
        }
        if (string.equals(ab_1.aj)) {
            return 2;
        }
        if (string.equals(ab_1.P)) {
            return 3;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.v), string).toString());
        return 0;
    }

    private String[] b() {
        aP2.b();
        if (this.t == 1 && this.c.length == 1) {
            ItemArmor itemArmor;
            Item item = px_0.a(this.c[0]);
            if (item == Items.potionitem && this.d != null && pe_1.a(this.d) > 0) {
                act_0 act_02 = pe_1.b(this.d, 0);
                int n = a2Y.a(act_02);
                boolean bl = (n & 0x4000) != 0;
                String string = this.a(this.B, ab_1.ay, ab_1.aP);
                String string2 = null;
                string2 = this.a(this.B, ab_1.aA, ab_1.m);
                return new String[]{string, string2};
            }
            if (item instanceof ItemArmor && xs_2.a(itemArmor = (ItemArmor)item) == ArmorMaterial.LEATHER) {
                String string = ab_1.y;
                String string3 = ab_1.c;
                if (itemArmor.n == 0) {
                    string3 = ab_1.E;
                }
                if (itemArmor.n == 1) {
                    string3 = ab_1.aQ;
                }
                if (itemArmor.n == 2) {
                    string3 = ab_1.aI;
                }
                if (itemArmor.n == 3) {
                    string3 = ab_1.n;
                }
                String string4 = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), ab_1.F), string3).toString();
                String string5 = this.a(this.B, aL0.a(aL0.a(new StringBuilder(), ab_1.o), string4).toString(), aL0.a(aL0.a(new StringBuilder(), ab_1.M), string4).toString());
                String string6 = this.a(this.B, aL0.a(aL0.a(aL0.a(new StringBuilder(), ab_1.ax), string4), ab_1.ar).toString(), aL0.a(aL0.a(aL0.a(new StringBuilder(), ab_1.av), string4), ab_1.aB).toString());
                return new String[]{string5, string6};
            }
        }
        return new String[]{this.k};
    }

    private float a(String string, float f) {
        aP2.b();
        if (string == null) {
            return f;
        }
        float f2 = tf_0.a(string = StringInvoker.h(string), Float.MIN_VALUE);
        if (f2 == Float.MIN_VALUE) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.aK), string).toString());
            return f;
        }
        return f2;
    }

    private static String c(String string) {
        aP2.b();
        String string2 = string;
        int n = StringInvoker.c(string, 47);
        if (n >= 0) {
            string2 = StringInvoker.a(string, n + 1);
        }
        int n2 = StringInvoker.c(string2, 46);
        string2 = StringInvoker.b(string2, 0, n2);
        return string2;
    }

    public float a(TextureManager textureManager) {
        aP2.b();
        if (this.i <= 0) {
            if (this.l != null) {
                ITextureObject iTextureObject = TextureManagerInvoker.b(textureManager, this.l);
                int n = u3_0.c(iTextureObject);
                int n2 = GlStateManagerInvoker.E();
                GlStateManagerInvoker.k(n);
                this.i = GL11.glGetTexLevelParameteri((int)3553, (int)0, (int)4096);
                GlStateManagerInvoker.k(n2);
            }
            if (this.i <= 0) {
                this.i = 16;
            }
        }
        return this.i;
    }

    private static Map b(Properties properties, String string) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        aP2.b();
        Iterator iterator = aS0.f(dk_1.c(properties));
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            String string2 = dk_1.a(properties, (String)object);
            if (StringInvoker.e((String)object, string)) {
                MapInvoker.c(linkedHashMap, object, string2);
            }
        }
        return linkedHashMap;
    }

    public boolean e(String string) {
        aP2.b();
        if (this.z != null && StringInvoker.c(this.z) > 0) {
            if (this.o == null) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.A), string).toString());
                return false;
            }
            if (this.t == 0) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.an), string).toString());
                return false;
            }
            if ((this.t == 1 || this.t == 3) && this.c == null) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.ac), string).toString());
                return false;
            }
            if (this.k == null && this.B == null) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.C), string).toString());
                return false;
            }
            if (this.t == 2 && this.f == null) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.w), string).toString());
                return false;
            }
            return true;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.aO), string).toString());
        return false;
    }

    private int[] b(String string, String string2) {
        Integer[] integerArray;
        int n;
        Object object;
        aP2.b();
        if (string == null) {
            string = string2;
        }
        if (string == null) {
            return null;
        }
        string = StringInvoker.h(string);
        TreeSet treeSet = new TreeSet();
        int n2 = 0;
        String[] stringArray = ys_2.a(string, ab_1.ai);
        if (n2 < stringArray.length) {
            int n3;
            String[] stringArray2;
            object = stringArray[n2];
            n = tf_0.a((String)object, -1);
            if (n >= 0) {
                aS0.b(treeSet, new Integer(n));
            }
            if (StringInvoker.a((String)object, (CharSequence)ab_1.aa) && (stringArray2 = ys_2.a((String)object, ab_1.as)).length == 2) {
                n3 = tf_0.a(stringArray2[0], -1);
                int n4 = tf_0.a(stringArray2[1], -1);
                if (n4 >= 0) {
                    int n5;
                    int n6 = MathInvoker.b(n3, n4);
                    int n7 = n6;
                    if (n7 > (n5 = MathInvoker.max(n3, n4))) {
                        // empty if block
                    }
                    aS0.b(treeSet, new Integer(n7));
                    ++n7;
                }
            }
            if ((stringArray2 = px_0.a((String)object)) == null) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.t), (String)object).toString());
            }
            if ((n3 = px_0.a((Item)stringArray2)) < 0) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.L), (String)object).toString());
            }
            aS0.b(treeSet, new Integer(n3));
            ++n2;
        }
        if ((n = 0) < ((Object)(object = (Object)new int[(integerArray = (Integer[])aS0.a(treeSet, new Integer[aS0.d(treeSet)])).length])).length) {
            object[n] = P8.b(integerArray[n]);
            ++n;
        }
        return object;
    }

    private a0W b(String string) {
        aP2.b();
        if (string == null) {
            return null;
        }
        String[] stringArray = ys_2.a(string, ab_1.aL);
        a0W a0W2 = new a0W();
        int n = 0;
        if (n < stringArray.length) {
            String string2 = stringArray[n];
            this.g(string2);
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), ab_1.O), string).toString());
            return null;
        }
        return a0W2;
    }

    private String a(Map<String, String> map, String string, String string2) {
        aP2.b();
        if (map == null) {
            return string2;
        }
        String string3 = (String)MapInvoker.c(map, string);
        return string3 == null ? string2 : string3;
    }

    private static Map a(Properties properties, String string) {
        aP2.b();
        String string2 = ab_1.aF;
        Map map = ajx_0.b(properties, string2);
        if (MapInvoker.a(map) <= 0) {
            return null;
        }
        Set set = MapInvoker.c(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator iterator = aS0.f(set);
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            String string3 = (String)MapInvoker.c(map, object);
            string3 = ajx_0.a(string3, string);
            MapInvoker.c(linkedHashMap, object, string3);
        }
        return linkedHashMap;
    }
}

