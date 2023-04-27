/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 */
package net;

import com.google.common.reflect.TypeToken;
import deobf.TypeSerializerCollection;
import java.net.URI;
import java.net.URL;
import java.util.UUID;
import java.util.regex.Pattern;
import net.DT;
import net.GC;
import net.GE;
import net.NS;
import net.O4;
import net.aIN;
import net.aZ4;
import net.afd_1;
import net.ahn_1;
import net.ak7_0;
import net.ake_0;
import net.akl_2;
import net.ara_2;
import net.asq_0;
import net.at6;
import net.aua_1;
import net.azg_2;
import net.i_0;
import net.pb_2;

/*
 * Renamed from net.aeg
 */
public class aeg_2 {
    private static TypeSerializerCollection a = new TypeSerializerCollection(null);

    public static TypeSerializerCollection b() {
        return a;
    }

    public static TypeSerializerCollection a() {
        return asq_0.a(a);
    }

    static {
        asq_0.a(a, ake_0.a(URI.class), (GE)new O4(null));
        asq_0.a(a, ake_0.a(URL.class), (GE)new pb_2(null));
        asq_0.a(a, ake_0.a(UUID.class), (GE)new i_0(null));
        asq_0.a(a, aeg_2::lambda$static$0, (GE)new aua_1(null));
        asq_0.a(a, aIN.a(), (GE)new aIN(null));
        asq_0.a(a, ake_0.a(String.class), (GE)new ak7_0(null));
        asq_0.a(a, ake_0.a(Boolean.class), (GE)new NS(null));
        asq_0.a(a, new at6(), (GE)new aZ4(null));
        asq_0.a(a, new afd_1(), (GE)new GC(null));
        asq_0.a(a, new DT(), (GE)new akl_2(null));
        asq_0.a(a, ake_0.a(Pattern.class), (GE)new azg_2(null));
    }

    private static boolean lambda$static$0(TypeToken typeToken) {
        return ara_2.c(ake_0.b(typeToken), ahn_1.class);
    }
}

