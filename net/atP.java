/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.MapInvoker;
import deobf.OpenGlHelper;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.JH;
import net.ResourceLocation;
import net.UE;
import net.WG;
import net.a8q_0;
import net.a9w_0;
import net.aI_;
import net.aL0;
import net.aVQ;
import net.aWP;
import net.aak_2;
import net.apl_1;
import net.atp_0;
import net.aw__0;
import net.axh_1;
import net.axw_1;
import net.dw_0;
import net.j6_0;

public class atP {
    private int a = 0;
    private String b;
    private int c;
    private aWP d;

    protected static byte[] a(BufferedInputStream bufferedInputStream) throws IOException {
        try {
            byte[] byArray = IOUtilsInvoker.a(bufferedInputStream);
            return byArray;
        }
        finally {
            aVQ.a(bufferedInputStream);
        }
    }

    public void b(atp_0 atp_02) {
        ++this.a;
        OpenGlHelper.c(aak_2.b(atp_02), this.c);
    }

    public static atP a(aI_ aI_2, aWP aWP2, String string) throws IOException {
        atP atP2 = (atP)MapInvoker.c(aWP2.d(), string);
        ResourceLocation resourceLocation = new ResourceLocation(aL0.a(aL0.a(aL0.a(new StringBuilder(), axh_1.b), string), aWP2.b()).toString());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(dw_0.b(j6_0.b(aI_2, resourceLocation)));
        byte[] byArray = atP.a(bufferedInputStream);
        ByteBuffer byteBuffer = a9w_0.d(byArray.length);
        a8q_0.a(byteBuffer, byArray);
        a8q_0.c(byteBuffer, 0);
        int n = OpenGlHelper.c(aWP2.c());
        OpenGlHelper.a(n, byteBuffer);
        OpenGlHelper.b(n);
        if (OpenGlHelper.i(n, apl_1.q) == 0) {
            String string2 = aw__0.a(OpenGlHelper.g(n, 32768));
            JH jH = new JH(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), axh_1.a), WG.a(aWP2)), axh_1.c), string2).toString());
            UE.b(jH, axw_1.b(resourceLocation));
            throw jH;
        }
        atP2 = new atP(aWP2, n, string);
        MapInvoker.c(aWP2.d(), string, atP2);
        return atP2;
    }

    public void a(atp_0 atp_02) {
        --this.a;
        if (this.a <= 0) {
            OpenGlHelper.l(this.c);
            MapInvoker.a(this.d.d(), this.b);
        }
    }

    public String a() {
        return this.b;
    }

    private atP(aWP aWP2, int n, String string) {
        this.d = aWP2;
        this.c = n;
        this.b = string;
    }
}

