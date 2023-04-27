/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.IResourcePack;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import net.O0;
import net.ResourceLocation;
import net.Uu;
import net.a4E;
import net.a7r_0;
import net.aH3;
import net.aI8;
import net.aL0;
import net.aP2;
import net.aZ6;
import net.adz_0;
import net.amc_0;
import net.avv_0;
import net.axw_1;
import net.aza_1;
import net.ch_2;
import net.dk_1;
import net.jj_0;
import net.kS;
import net.ys_2;

/*
 * Renamed from net.lC
 */
public class lc_1 {
    private static O0[] a = null;

    public static O0 a(Properties properties, ResourceLocation resourceLocation) {
        String string = dk_1.a(properties, aza_1.b);
        aP2.b();
        String string2 = dk_1.a(properties, aza_1.c);
        int n = ys_2.a(dk_1.a(properties, aza_1.m), -1);
        int n2 = ys_2.a(dk_1.a(properties, aza_1.o), -1);
        int n3 = ys_2.a(dk_1.a(properties, aza_1.d), -1);
        int n4 = ys_2.a(dk_1.a(properties, aza_1.p), -1);
        if (string != null && string2 != null) {
            if (n >= 0 && n2 >= 0 && n3 >= 0 && n4 >= 0) {
                string = StringInvoker.h(string);
                string2 = StringInvoker.h(string2);
                String string3 = aH3.a(axw_1.b(resourceLocation));
                string = aH3.a(string, string3);
                string2 = aH3.a(string2, string3);
                lc_1.a(string, n3);
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), aza_1.a), string2).toString());
                return null;
            }
            ys_2.d(aza_1.f);
            return null;
        }
        ys_2.d(aza_1.l);
        return null;
    }

    public static O0[] a(IResourcePack iResourcePack) {
        aP2.b();
        String[] stringArray = amc_0.a(iResourcePack, aza_1.n, aza_1.k, null);
        if (stringArray.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int n = 0;
        if (n < stringArray.length) {
            O0 o0;
            block7: {
                String string = stringArray[n];
                ys_2.a(aL0.a(aL0.a(new StringBuilder(), aza_1.j), string).toString());
                ResourceLocation resourceLocation = new ResourceLocation(string);
                InputStream inputStream = avv_0.a(iResourcePack, resourceLocation);
                Properties properties = new Properties();
                dk_1.a(properties, inputStream);
                o0 = lc_1.a(properties, resourceLocation);
                ResourceLocation resourceLocation2 = new ResourceLocation(kS.a(o0));
                if (ys_2.a(resourceLocation2) == iResourcePack) break block7;
                ys_2.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aza_1.e), string), aza_1.g).toString());
            }
            try {
                ListInvoker.add(arrayList, o0);
            }
            catch (FileNotFoundException fileNotFoundException) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), aza_1.i), Uu.a(fileNotFoundException)).toString());
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
            ++n;
        }
        O0[] o0Array = (O0[])ListInvoker.toArray(arrayList, new O0[ListInvoker.size(arrayList)]);
        return o0Array;
    }

    public static void d() {
        a = null;
    }

    public static void a() {
        if (a != null && ys_2.az()) {
            lc_1.c();
        }
    }

    public static void b() {
        a = null;
        IResourcePack[] iResourcePackArray = ys_2.d();
        a = lc_1.a(iResourcePackArray);
        if (ys_2.az()) {
            lc_1.c();
        }
    }

    private static BufferedImage a(InputStream inputStream) throws IOException {
        BufferedImage bufferedImage = aI8.a(inputStream);
        aZ6.b(inputStream);
        return bufferedImage;
    }

    public static byte[] a(String string, int n) {
        aP2.b();
        byte[] byArray = lc_1.b(string, n);
        if (byArray == null) {
            byArray = lc_1.b(aL0.a(aL0.a(new StringBuilder(), aza_1.q), string).toString(), n);
        }
        return byArray;
    }

    private static byte[] b(String string, int n) {
        InputStream inputStream;
        block4: {
            aP2.b();
            ys_2.ax();
            ResourceLocation resourceLocation = new ResourceLocation(string);
            inputStream = ys_2.b(resourceLocation);
            if (inputStream != null) break block4;
            return null;
        }
        try {
            lc_1.a(inputStream);
            aZ6.b(inputStream);
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (Exception exception) {
            ch_2.a(exception);
            return null;
        }
    }

    public static void c() {
        int n;
        aP2.b();
        if (a != null && (n = 0) < a.length) {
            O0 o0 = a[n];
            kS.b(o0);
            ++n;
        }
    }

    public static BufferedImage a(BufferedImage bufferedImage, int n, int n2) {
        BufferedImage bufferedImage2 = new BufferedImage(n, n2, 2);
        Graphics2D graphics2D = jj_0.a(bufferedImage2);
        adz_0.a(graphics2D, RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        adz_0.a(graphics2D, bufferedImage, 0, 0, n, n2, null);
        return bufferedImage2;
    }

    public static O0[] a(IResourcePack[] iResourcePackArray) {
        aP2.b();
        ArrayList arrayList = new ArrayList();
        int n = 0;
        if (n < iResourcePackArray.length) {
            IResourcePack iResourcePack = iResourcePackArray[n];
            Object[] objectArray = lc_1.a(iResourcePack);
            if (objectArray != null) {
                ListInvoker.addAll(arrayList, a7r_0.a(objectArray));
            }
            ++n;
        }
        O0[] o0Array = (O0[])ListInvoker.toArray(arrayList, new O0[ListInvoker.size(arrayList)]);
        return o0Array;
    }

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }
}

