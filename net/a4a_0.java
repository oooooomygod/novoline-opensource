/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.ConfigParseOptions
 *  com.typesafe.config.ConfigRenderOptions
 */
package net;

import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigRenderOptions;
import net.ConfigurationOptions;
import net.H8;
import net.ad__0;
import net.ake_1;

/*
 * Renamed from net.a4a
 */
public class a4a_0 {
    private static boolean b;

    public static ad__0 a(ake_1 ake_12, ConfigurationOptions configurationOptions) {
        return ake_12.b(configurationOptions);
    }

    public static H8 c() {
        return ake_1.c();
    }

    public static boolean d() {
        a4a_0.e();
        return true;
    }

    public static ad__0 b(ake_1 ake_12) {
        return ake_12.c();
    }

    public static ad__0 a(ake_1 ake_12) {
        return ake_12.b();
    }

    public static ConfigurationOptions c(ake_1 ake_12) {
        return ake_12.d();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (a4a_0.d()) {
            a4a_0.b(true);
        }
    }

    public static boolean e() {
        return b;
    }

    public static ConfigRenderOptions a() {
        return ake_1.b();
    }

    public static void a(ake_1 ake_12, ad__0 ad__02) {
        ake_12.a(ad__02);
    }

    public static ConfigParseOptions b() {
        return ake_1.a();
    }
}

