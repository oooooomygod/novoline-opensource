/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import net.ResourceLocation;
import net.a4E;
import net.aL0;
import net.aP2;
import net.aS0;
import net.asv_0;
import net.axw_1;
import net.dk_1;
import net.dz_0;
import net.ys_2;

/*
 * Renamed from net.aqD
 */
public class aqd_1 {
    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }

    public static float a(Properties properties, String string, float f) {
        aP2.b();
        String string2 = dk_1.a(properties, string);
        if (string2 == null) {
            return f;
        }
        float f2 = ys_2.a(string2, Float.MIN_VALUE);
        if (f2 == Float.MIN_VALUE) {
            ys_2.d(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), asv_0.f), string), asv_0.a), string2).toString());
            return f;
        }
        return f2;
    }

    public static Properties a(ResourceLocation resourceLocation) {
        String string = axw_1.b(resourceLocation);
        Properties properties = new Properties();
        aP2.b();
        String string2 = asv_0.b;
        if (!StringInvoker.c(string, string2)) {
            return properties;
        }
        String string3 = aL0.a(aL0.a(new StringBuilder(), StringInvoker.b(string, 0, StringInvoker.c(string) - StringInvoker.c(string2))), asv_0.e).toString();
        try {
            ResourceLocation resourceLocation2 = new ResourceLocation(axw_1.a(resourceLocation), string3);
            ys_2.b(ys_2.W(), resourceLocation2);
            return properties;
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
        return properties;
    }

    public static ResourceLocation b(ResourceLocation resourceLocation) {
        aP2.b();
        if (!ys_2.aq()) {
            return resourceLocation;
        }
        if (resourceLocation == null) {
            return resourceLocation;
        }
        String string = axw_1.b(resourceLocation);
        String string2 = asv_0.c;
        String string3 = asv_0.g;
        if (!StringInvoker.e(string, string2)) {
            return resourceLocation;
        }
        string = StringInvoker.a(string, StringInvoker.c(string2));
        string = aL0.a(aL0.a(new StringBuilder(), string3), string).toString();
        ResourceLocation resourceLocation2 = new ResourceLocation(axw_1.a(resourceLocation), string);
        return ys_2.a(ys_2.W(), resourceLocation2) ? resourceLocation2 : resourceLocation;
    }

    public static void a(Properties properties, float[] fArray) {
        String string;
        float f;
        String string2;
        int n;
        String string3;
        Object object;
        String string4;
        aP2.b();
        Iterator iterator = aS0.f(dk_1.c(properties));
        if (dz_0.c(iterator) && StringInvoker.e(string4 = (String)(object = dz_0.b(iterator)), string3 = asv_0.d) && (n = ys_2.a(string2 = StringInvoker.a(string4, StringInvoker.c(string3)), -1)) >= 0 && n < fArray.length && (f = ys_2.a(string = dk_1.a(properties, string4), -1.0f)) >= 0.0f) {
            fArray[n] = f;
        }
    }
}

