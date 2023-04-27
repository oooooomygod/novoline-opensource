/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.ITextureObject;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import net.DG;
import net.Dl;
import net.ResourceLocation;
import net.TextureManager;
import net.World;
import net.a4E;
import net.aH3;
import net.aL0;
import net.aP2;
import net.aV8;
import net.aZ6;
import net.aqq_1;
import net.c0;
import net.dk_1;
import net.qq_2;
import net.u3_0;
import net.ys_2;

/*
 * Renamed from net.Pe
 */
public class pe_0 {
    private static DG[][] a = null;

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }

    private static DG[][] c() {
        aP2.b();
        DG[][] dGArray = new DG[10][0];
        String string = aqq_1.a;
        int n = -1;
        int n2 = 0;
        if (n2 < dGArray.length) {
            ArrayList arrayList;
            block10: {
                int n3;
                block9: {
                    String string2 = aL0.a(aL0.c(aL0.a(new StringBuilder(), string), n2), aqq_1.f).toString();
                    arrayList = new ArrayList();
                    n3 = 1;
                    String string3 = aL0.a(aL0.c(aL0.a(new StringBuilder(), string2), n3), aqq_1.e).toString();
                    ResourceLocation resourceLocation = new ResourceLocation(string3);
                    InputStream inputStream = ys_2.b(resourceLocation);
                    Properties properties = new Properties();
                    dk_1.a(properties, inputStream);
                    aZ6.b(inputStream);
                    ys_2.a(aL0.a(aL0.a(new StringBuilder(), aqq_1.b), string3).toString());
                    String string4 = aL0.a(aL0.c(aL0.a(new StringBuilder(), string2), n3), aqq_1.d).toString();
                    DG dG = new DG(properties, string4);
                    if (!Dl.a(dG, string3)) break block9;
                    ResourceLocation resourceLocation2 = new ResourceLocation(dG.d);
                    ITextureObject iTextureObject = aH3.a(resourceLocation2);
                    ys_2.e(aL0.a(aL0.a(new StringBuilder(), aqq_1.c), resourceLocation2).toString());
                    dG.j = u3_0.c(iTextureObject);
                    ListInvoker.add(arrayList, dG);
                    try {
                        aZ6.b(inputStream);
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        break block10;
                    }
                    catch (IOException iOException) {
                        a4E.b(iOException);
                    }
                }
                ++n3;
            }
            if (ListInvoker.size(arrayList) > 0) {
                DG[] dGArray2 = (DG[])ListInvoker.toArray(arrayList, new DG[ListInvoker.size(arrayList)]);
                dGArray[n2] = dGArray2;
                n = n2;
            }
            ++n2;
        }
        return null;
    }

    public static boolean a(World world) {
        aP2.b();
        if (a == null) {
            return false;
        }
        if (ys_2.ax().bp < 8) {
            return false;
        }
        int n = qq_2.j(world.d);
        if (n >= 0 && n < a.length) {
            DG[] dGArray = a[n];
            return dGArray == null ? false : dGArray.length > 0;
        }
        return false;
    }

    public static void b() {
        pe_0.a();
        if (ys_2.R()) {
            a = pe_0.c();
        }
    }

    public static void a(World world, TextureManager textureManager, float f, float f2) {
        int n;
        aP2.b();
        if (a != null && ys_2.ax().bp >= 8 && (n = qq_2.j(world.d)) >= 0 && n < a.length) {
            DG[] dGArray = a[n];
            long l4 = aV8.g(world);
            int n2 = (int)(l4 % 24000L);
            int n3 = 0;
            if (n3 < dGArray.length) {
                DG dG = dGArray[n3];
                if (Dl.a(dG, world, n2)) {
                    Dl.a(dG, n2, f, f2);
                }
                ++n3;
            }
            c0.a(f2);
        }
    }

    public static void a() {
        a = null;
    }
}

