/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import deobf.OpenGlHelper;
import java.io.IOException;
import net.JH;
import net.aL0;
import net.aak_2;
import net.aoy_2;
import net.apl_1;
import net.atp_0;
import net.bm_0;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.vs
 */
public class vs_2 {
    private static Logger b = LogManagerInvoker.c();
    private static vs_2 a;

    public static vs_2 a() {
        return a;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public int b() throws JH {
        int n = OpenGlHelper.c();
        throw new JH(aL0.a(aL0.c(aL0.a(new StringBuilder(), bm_0.d), n), bm_0.a).toString());
    }

    public static void c() {
        a = new vs_2();
    }

    public void b(atp_0 atp_02) {
        aak_2.c(atp_02).a(atp_02);
        aak_2.a(atp_02).a(atp_02);
        OpenGlHelper.e(aak_2.b(atp_02));
    }

    public void a(atp_0 atp_02) throws IOException {
        aoy_2.a(aak_2.c(atp_02), atp_02);
        aoy_2.a(aak_2.a(atp_02), atp_02);
        OpenGlHelper.d(aak_2.b(atp_02));
        OpenGlHelper.e(aak_2.b(atp_02), apl_1.Y);
        LoggerInvoker.warn(b, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), bm_0.c), aoy_2.a(aak_2.a(atp_02))), bm_0.b), aoy_2.a(aak_2.c(atp_02))), bm_0.e).toString());
        LoggerInvoker.warn(b, OpenGlHelper.h(aak_2.b(atp_02), 32768));
    }
}

