/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import java.net.URL;
import net.aL0;
import net.aew_0;
import net.afr_0;
import net.ars_0;
import net.ayb_0;
import net.lv_2;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.ah6
 */
public class ah6_0 {
    private static String c = "com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication";
    private static String a = "com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService";
    private lv_2 d;
    private lv_2 b = new lv_2(ars_0.t);
    private static Logger e;

    public ayb_0 a(ayb_0 ayb_02) {
        try {
            String string = afr_0.a(ayb_02);
            lv_2 lv_22 = this.d;
            aew_0.a(lv_22, ars_0.m, string);
            aew_0.a(lv_22, ars_0.f, new URL(aL0.a(aL0.a(new StringBuilder(), string), ars_0.h).toString()));
            aew_0.a(lv_22, ars_0.r, new URL(aL0.a(aL0.a(new StringBuilder(), string), ars_0.p).toString()));
            aew_0.a(lv_22, ars_0.c, new URL(aL0.a(aL0.a(new StringBuilder(), string), ars_0.o).toString()));
            aew_0.a(lv_22, ars_0.d, new URL(aL0.a(aL0.a(new StringBuilder(), string), ars_0.j).toString()));
            aew_0.a(lv_22, ars_0.w, new URL(aL0.a(aL0.a(new StringBuilder(), string), ars_0.i).toString()));
            String string2 = afr_0.b(ayb_02);
            lv_2 lv_23 = this.b;
            aew_0.a(lv_23, ars_0.u, aL0.a(aL0.a(new StringBuilder(), string2), ars_0.b).toString());
            aew_0.a(lv_23, ars_0.v, new URL(aL0.a(aL0.a(new StringBuilder(), string2), ars_0.l).toString()));
            aew_0.a(lv_23, ars_0.s, new URL(aL0.a(aL0.a(new StringBuilder(), string2), ars_0.n).toString()));
            return ayb_02;
        }
        catch (Exception exception) {
            LoggerInvoker.b(e, exception);
            return ayb_0.MOJANG;
        }
    }

    public ah6_0() {
        this.d = new lv_2(ars_0.e);
        try {
            String[] stringArray = new String[]{ars_0.q, ars_0.a, ars_0.k};
            aew_0.a(this.b, ars_0.g, stringArray);
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(e, throwable);
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[2];
        int n = 0;
        String string = "7;l)l655:f)`,+<8he/ 830sfr03z\rf`e+>'=mJh7:7&`au\n:''hho\n:&\"hdd87;l)l655:f)`,+<8he/ 830sfr03z\rf`e+>'=mRr<-\u0015!uod7+=7`sh61";
        int n2 = "7;l)l655:f)`,+<8he/ 830sfr03z\rf`e+>'=mJh7:7&`au\n:''hho\n:&\"hdd87;l)l655:f)`,+<8he/ 830sfr03z\rf`e+>'=mRr<-\u0015!uod7+=7`sh61".length();
        int n3 = 61;
        int n4 = -1;
        while (true) {
            char[] cArray;
            block5: {
                int n5;
                char[] cArray2;
                int n6;
                int n7;
                block4: {
                    int n8 = ++n4;
                    char[] cArray3 = string.substring(n8, n8 + n3).toCharArray();
                    int n9 = cArray3.length;
                    n7 = 0;
                    n6 = 30;
                    cArray2 = cArray3;
                    n5 = n9;
                    if (n9 <= 1) break block4;
                    cArray = cArray2;
                    n5 = n5;
                    if (n5 <= n7) break block5;
                }
                do {
                    cArray2 = cArray2;
                    int n10 = n7;
                    int cfr_ignored_0 = n7 % 7;
                    cArray2[n10] = (char)(cArray2[n10] ^ (n6 ^ 0x4A));
                    ++n7;
                    n6 = n6;
                    cArray = cArray2;
                    n5 = n5;
                } while (n5 > n7);
            }
            stringArray[n++] = new String(cArray).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                c = stringArray2[1];
                a = stringArray2[0];
                e = LogManagerInvoker.c();
                return;
            }
            n3 = string.charAt(n4);
        }
    }
}

