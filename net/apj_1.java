/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import deobf.Framebuffer;
import deobf.OpenGlHelper;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.HD;
import net.a9w_0;
import net.aCH;
import net.aL0;
import net.afo_0;
import net.ai__0;
import net.zq_2;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.apJ
 */
public class apj_1 {
    private static Logger a = LogManagerInvoker.c();
    private static int[] d;
    private static IntBuffer b;
    private static DateFormat c;

    static File b(File file) {
        return apj_1.a(file);
    }

    static int[] a() {
        return d;
    }

    static IntBuffer b() {
        return b;
    }

    public static void a(File file, int n, int n2, Framebuffer framebuffer) {
        apj_1.a(file, null, n, n2, framebuffer);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(File file, String string, int n, int n2, Framebuffer framebuffer) {
        try {
            File file2 = new File(file, aCH.b);
            zq_2.p(file2);
            if (OpenGlHelper.g()) {
                n = framebuffer.i;
                n2 = framebuffer.c;
            }
            int n3 = n * n2;
            if (b == null || HD.a(b) < n3) {
                b = a9w_0.b(n3);
                d = new int[n3];
            }
            GL11.glPixelStorei((int)3333, (int)1);
            GL11.glPixelStorei((int)3317, (int)1);
            HD.h(b);
            if (OpenGlHelper.g()) {
                GlStateManagerInvoker.k(framebuffer.e);
                GL11.glGetTexImage((int)3553, (int)0, (int)32993, (int)33639, (IntBuffer)b);
            } else {
                GL11.glReadPixels((int)0, (int)0, (int)framebuffer.g, (int)framebuffer.d, (int)32993, (int)33639, (IntBuffer)b);
            }
            new afo_0(aCH.d, framebuffer, string, file2).start();
            return;
        }
        catch (Exception exception) {
            LoggerInvoker.b(a, aCH.c, exception);
        }
    }

    private static File a(File file) {
        String string = ai__0.a(c, new Date());
        int n = 1;
        File file2;
        while (zq_2.m(file2 = new File(file, aL0.a(aL0.a(aL0.a(new StringBuilder(), string), aCH.a), aCH.f).toString()))) {
            ++n;
        }
        return file2;
    }

    static {
        c = new SimpleDateFormat(aCH.e);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

