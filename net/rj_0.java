/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.GuiScreen;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import net.GL;
import net.MathHelper;
import net.QQ;
import net.ScaledResolution;
import net.W0;
import net.a0x_0;
import net.a4E;
import net.aB0;
import net.aFW;
import net.aG7;
import net.aL0;
import net.aMF;
import net.adp_0;
import net.aev_1;
import net.akq_1;
import net.aol_1;
import net.arn_1;
import net.avs_1;
import net.da_0;
import net.dz_0;
import net.kr_1;
import net.l2;
import net.on_0;
import net.on_1;
import net.yg_1;
import net.zq_2;

/*
 * Renamed from net.Rj
 */
public class rj_0
extends GuiScreen {
    private double w;
    private double E;
    private String z;
    private boolean y;
    private List<String> B;
    private double v = 0.0;
    private on_1 A;
    private double D;
    private on_0 C;
    private List<aG7> x = new CopyOnWriteArrayList<aG7>();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void l() {
        Object object;
        block6: {
            String string;
            kr_1.b();
            if (!aev_1.b(da_0.a(this.z, new String[0]), new LinkOption[0])) {
                try {
                    object = new FileWriter(this.z);
                    l2.a((FileWriter)object);
                    break block6;
                }
                catch (IOException iOException) {
                    a4E.b(iOException);
                }
            }
            object = null;
            try {
                object = new Scanner(da_0.a(this.z, new String[0]));
                if (!GL.b((Scanner)object) || (string = GL.a((Scanner)object)) == null || StringInvoker.g(string)) break block6;
            }
            catch (IOException iOException) {
                a4E.b(iOException);
                break block6;
            }
            {
                ListInvoker.add(this.B, string);
            }
        }
        object = avs_1.a(this::lambda$initGui$1, (Executor)aFW.a());
    }

    @Override
    protected void a(char c, int n) throws IOException {
        akq_1.a(this.C, c, n);
        super.a(c, n);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        kr_1.a();
        double d = 250.0;
        double d2 = 300.0;
        ScaledResolution scaledResolution = new ScaledResolution(this.t);
        double d3 = (double)(ScaledResolutionInvoker.a(scaledResolution) / 2) - d / 2.0;
        double d4 = (double)(ScaledResolutionInvoker.g(scaledResolution) / 2) - d2 / 2.0;
        double d5 = d2 - 32.0;
        if (n3 == 0 && (double)n >= d3 + d - 12.0 && (double)n <= d3 + d - 7.0 && (double)n2 >= d4 + 8.0 && (double)n2 <= d4 + 8.0 + d5) {
            this.y = true;
            this.w = n2;
        }
        if ((double)n >= d3 + 5.0 && (double)n <= d3 + d - 5.0 && (double)n2 >= d4 + 5.0 && (double)n2 <= d4 + d2 - 22.0) {
            Iterator iterator;
            List list = (List)aMF.a(aMF.b(ListInvoker.stream(this.x), this::lambda$mouseClicked$3), aB0.a());
            if (yg_1.a(this.A) == kr_1.FAVORITE) {
                list = (List)aMF.a(aMF.b(ListInvoker.stream(list), aG7::a), aB0.a());
            }
            if (dz_0.c(iterator = ListInvoker.iterator(list))) {
                aG7 aG72 = (aG7)dz_0.b(iterator);
                W0.a(aG72, n3, n, n2);
            }
        }
        akq_1.a(this.C, n3, n, n2);
        yg_1.a(this.A, n3, n, n2);
        super.b(n, n2, n3);
    }

    @Override
    protected void a(int n, int n2, int n3) {
        this.y = false;
    }

    public rj_0() {
        this.B = new CopyOnWriteArrayList<String>();
        this.C = new on_0();
        this.A = new on_1(QQ.a, rj_0::lambda$new$0);
        this.z = aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), QQ.g).toString();
    }

    private String lambda$initGui$1() {
        String string = SystemInvoker.d(QQ.c);
        File file = new File(string, QQ.f);
        a0x_0.a(this, zq_2.j(file), QQ.b);
        a0x_0.a(this, QQ.d, QQ.h);
        return QQ.e;
    }

    public String a() {
        return this.z;
    }

    private boolean lambda$mouseClicked$3(aG7 aG72) {
        return StringInvoker.a(W0.a(aG72), (CharSequence)akq_1.a(this.C));
    }

    @Override
    public void a(int n, int n2, float f) {
        kr_1.a();
        double d = 250.0;
        double d2 = 300.0;
        ScaledResolution scaledResolution = new ScaledResolution(this.t);
        double d3 = (double)(ScaledResolutionInvoker.a(scaledResolution) / 2) - d / 2.0;
        double d4 = (double)(ScaledResolutionInvoker.g(scaledResolution) / 2) - d2 / 2.0;
        arn_1.d(d3, d4, d3 + d, d4 + d2, -16777216);
        arn_1.d(d3 + 1.0, d4 + 1.0, d3 + d - 1.0, d4 + d2 - 1.0, aol_1.b(new Color(60, 60, 60)));
        arn_1.d(d3 + 2.0, d4 + 2.0, d3 + d - 2.0, d4 + d2 - 2.0, aol_1.b(new Color(40, 40, 40)));
        arn_1.d(d3 + 4.0, d4 + 4.0, d3 + d - 4.0, d4 + d2 - 4.0, aol_1.b(new Color(60, 60, 60)));
        arn_1.d(d3 + 5.0, d4 + 5.0, d3 + d - 5.0, d4 + d2 - 5.0, aol_1.b(new Color(22, 22, 22)));
        adp_0.b(true);
        arn_1.d(d3 + 5.0, d4 + 6.0, d3 + d - 5.0, d4 + d2 - 5.0, aol_1.b(new Color(22, 22, 22)));
        adp_0.a(true);
        List list = (List)aMF.a(aMF.b(ListInvoker.stream(this.x), this::lambda$drawScreen$2), aB0.a());
        if (yg_1.a(this.A) == kr_1.FAVORITE) {
            list = (List)aMF.a(aMF.b(ListInvoker.stream(list), aG7::a), aB0.a());
        }
        double d5 = d2 - 32.0;
        double d6 = d2 - 32.0;
        double d7 = ListInvoker.size(list) * 27;
        double d8 = d6 / d7 * d5;
        double d9 = d5 - d8;
        double d10 = d7 - d5;
        double d11 = d10 / d9;
        this.v = this.E * d11;
        double d12 = d4 + 8.0;
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            aG7 aG72 = (aG7)dz_0.b(iterator);
            W0.a(aG72, n, n2, d, d2, d3 + 7.0, d12 - this.v, d7 > d6);
            d12 += 27.0;
            ListInvoker.b(new ListInvoker[5]);
        }
        if (d7 > d6) {
            arn_1.d(d3 + d - 12.0, d4 + 8.0, d3 + d - 7.0, d4 + 8.0 + d5, aol_1.b(new Color(40, 40, 40)));
            arn_1.d(d3 + d - 11.0, d4 + 9.0 + this.E, d3 + d - 8.0, d4 + 9.0 + this.E + d8 - 2.0, aol_1.b(new Color(62, 62, 62)));
            if ((double)n >= d3 && (double)n <= d3 + d && (double)n2 >= d4 && (double)n2 <= d4 + d2) {
                int n3 = MouseInvoker.m();
                if (n3 != 0) {
                    if (n3 < 0) {
                        this.E += 5.0;
                    }
                    this.E -= 5.0;
                }
                this.E = MathHelper.b(this.E, 0.0, d5 - d8);
            }
        } else {
            this.v = 0.0;
            this.E = 0.0;
        }
        if (this.y && (double)n2 - this.w != 0.0) {
            this.E += (double)n2 - this.w;
            this.E = MathHelper.b(this.E, 0.0, d5 - d8);
            this.w = n2;
        }
        arn_1.d(d3 + 5.0, d4 + d2 - 22.0, d3 + d - 5.0, d4 + d2 - 5.0, aol_1.b(new Color(22, 22, 22)));
        akq_1.a(this.C, d3 + 7.0, d4 + d2 - 22.0, 15.0, d / 2.0 + 10.0, n, n2);
        yg_1.a(this.A, d3 + d / 2.0 + 12.0 + 7.0, d4 + d2 - 22.0, d - (d / 2.0 + 12.0 + 7.0) - 7.0, 15.0, n, n2);
        adp_0.a();
    }

    public void a(String string) {
        aG7 aG72;
        aG7 aG73 = new aG7(this, string, ListInvoker.contains(this.B, string));
        kr_1.b();
        Iterator iterator = ListInvoker.iterator(this.x);
        if (dz_0.c(iterator) && W0.a(aG72 = (aG7)dz_0.b(iterator)).equals(W0.a(aG73))) {
            return;
        }
        ListInvoker.add(this.x, aG73);
    }

    private static void lambda$new$0(String string) {
    }

    private boolean lambda$drawScreen$2(aG7 aG72) {
        return StringInvoker.a(W0.a(aG72), (CharSequence)akq_1.a(this.C));
    }
}

