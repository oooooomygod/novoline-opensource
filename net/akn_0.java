/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import net.a0o_0;
import net.aWg;
import net.aY_;
import net.aZ6;
import net.ara_2;
import net.ea_1;

/*
 * Renamed from net.aKn
 */
public class akn_0 {
    private int f;
    private int g;
    private int c;
    private int h;
    private int e;
    private static int b;
    private int d;
    private int a;

    private int a(InputStream inputStream, int n) throws IOException {
        int n2 = aY_.e(n);
        aY_.b(n2, this.a(inputStream));
        akn_0.a();
        aY_.d(n2);
        int n3 = aY_.b(n2, 35713);
        if (n3 == 0) {
            ea_1.a(System.err, aY_.c(n2, aY_.b(n2, 35716)));
            throw new IllegalStateException(aWg.i);
        }
        return n2;
    }

    private String a(InputStream inputStream) throws IOException {
        akn_0.a();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[512];
        int n = aZ6.a(inputStream, byArray, 0, byArray.length);
        if (n != -1) {
            a0o_0.a(byteArrayOutputStream, byArray, 0, n);
        }
        return new String(a0o_0.a(byteArrayOutputStream), StandardCharsets.UTF_8);
    }

    public akn_0(String string) throws IOException {
        akn_0.a();
        int n = aY_.a();
        aY_.f(n, this.a(ara_2.b(akn_0.class, aWg.c), 35633));
        aY_.f(n, this.a(ara_2.b(akn_0.class, string), 35632));
        aY_.a(n);
        int n2 = aY_.a(n, 35714);
        if (n2 == 0) {
            ea_1.a(System.err, aY_.e(n, aY_.a(n, 35716)));
            throw new IllegalStateException(aWg.h);
        }
        this.a = n;
        aY_.b(n);
        this.e = aY_.a(n, aWg.e);
        this.f = aY_.a(n, aWg.d);
        this.d = aY_.a(n, aWg.b);
        this.c = aY_.a(n, aWg.a);
        this.g = aY_.a(n, aWg.f);
        this.h = aY_.a(n, aWg.g);
        aY_.b(0);
        ListInvoker.b(new ListInvoker[1]);
    }

    public static void b(int n) {
        b = n;
    }

    public void a(int n, int n2, float f, float f2, float f3, float[] fArray) {
        aY_.b(this.a);
        aY_.a(this.d, (float)n, (float)n2);
        int n3 = akn_0.b();
        aY_.a(this.f, f / (float)n, 1.0f - f2 / (float)n2);
        aY_.a(this.e, f3);
        int n4 = n3;
        aY_.a(this.c, fArray[0]);
        aY_.a(this.g, fArray[1]);
        aY_.a(this.h, fArray[2]);
        if (ListInvoker.b() != null) {
            akn_0.b(++n4);
        }
    }

    static {
        if (akn_0.a() == 0) {
            akn_0.b(36);
        }
    }

    public static int a() {
        akn_0.b();
        return 19;
    }

    public void a(int n, int n2, float f, float f2, float f3) {
        aY_.b(this.a);
        aY_.a(this.d, (float)n, (float)n2);
        aY_.a(this.f, f / (float)n, 1.0f - f2 / (float)n2);
        aY_.a(this.e, f3);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static int b() {
        return b;
    }
}

