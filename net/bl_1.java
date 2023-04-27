/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.Result;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import net.minecraft.block.BlockPos;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.bL
 */
public class bl_1
extends am_0 {
    private static Logger b = LogManagerInvoker.c();
    private long c;
    private int d;

    @Override
    public String b() {
        return NP.a;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private String b(long l4, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        aL0.a(stringBuilder, NP.U);
        aL0.a(stringBuilder, NP.v);
        aL0.a(stringBuilder, bl_1.a());
        aL0.a(stringBuilder, NP.N);
        aL0.a(aL0.a(aL0.a(stringBuilder, NP.q), l4), NP.d);
        aL0.a(aL0.c(aL0.a(stringBuilder, NP.B), n), NP.s);
        aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(stringBuilder, NP.E), StringInvoker.a(NP.F, new Object[]{axx_1.a((float)n / ((float)l4 / 1000.0f))})), NP.e), 20), NP.R);
        aL0.a(stringBuilder, NP.u);
        this.a(0, NP.G, stringBuilder);
        aL0.a(stringBuilder, NP.af);
        return stringBuilder.toString();
    }

    private void a(long l4, int n) {
        File file = new File(ServerInvoker.b(ServerInvoker.d(), NP.Q), aL0.a(aL0.a(aL0.a(new StringBuilder(), NP.h), aZ2.a(new SimpleDateFormat(NP.V), new Date())), NP.f).toString());
        zq_2.a(zq_2.b(file));
        try {
            FileWriter fileWriter = new FileWriter(file);
            l2.a(fileWriter, this.b(l4, n));
            l2.a(fileWriter);
        }
        catch (Throwable throwable) {
            LoggerInvoker.a(b, aL0.a(aL0.a(new StringBuilder(), NP.l), file).toString(), throwable);
        }
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bl_1.a(stringArray, NP.X, NP.P) : null;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return NP.H;
    }

    private void a(int n, String string, StringBuilder stringBuilder) {
        List list = ProfilerInvoker.b(ServerInvoker.d().m, string);
        if (ListInvoker.size(list) >= 3) {
            for (int i = 1; i < ListInvoker.size(list); ++i) {
                Result result = (Result)ListInvoker.get(list, i);
                aL0.a(stringBuilder, StringInvoker.a(NP.y, new Object[]{P8.d(n)}));
                for (int j = 0; j < n; ++j) {
                    aL0.a(stringBuilder, NP.b);
                }
                aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(stringBuilder, result.c), NP.Y), StringInvoker.a(NP.ad, new Object[]{db_0.a(result.field_76332_a)})), NP.m), StringInvoker.a(NP.I, new Object[]{db_0.a(result.a)})), NP.W);
                if (result.c.equals(NP.o)) continue;
                try {
                    this.a(n + 1, aL0.a(aL0.a(aL0.a(new StringBuilder(), string), NP.C), result.c).toString(), stringBuilder);
                    continue;
                }
                catch (Exception exception) {
                    aL0.a(aL0.a(aL0.a(stringBuilder, NP.x), exception), NP.w);
                }
            }
        }
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 1) {
            throw new ip_2(NP.O, new Object[0]);
        }
        if (stringArray[0].equals(NP.ab)) {
            if (stringArray.length != 1) {
                throw new ip_2(NP.A, new Object[0]);
            }
            bl_1.a(iCommandSender, (ICommand)this, NP.J, new Object[0]);
            ServerInvoker.I(ServerInvoker.d());
            this.c = ServerInvoker.c();
            this.d = ServerInvoker.H(ServerInvoker.d());
        } else {
            if (!stringArray[0].equals(NP.z)) {
                throw new ip_2(NP.aa, new Object[0]);
            }
            if (stringArray.length != 1) {
                throw new ip_2(NP.D, new Object[0]);
            }
            if (!ServerInvoker.d().m.g) {
                throw new ht_1(NP.K, new Object[0]);
            }
            long l5 = ServerInvoker.c();
            int n = ServerInvoker.H(ServerInvoker.d());
            long l6 = l5 - this.c;
            int n2 = n - this.d;
            this.a(l6, n2);
            ServerInvoker.d().m.g = false;
            bl_1.a(iCommandSender, (ICommand)this, NP.t, axx_1.a((float)l6 / 1000.0f), P8.d(n2));
        }
    }

    private static String a() {
        String[] stringArray = new String[]{NP.L, NP.j, NP.i, NP.Z, NP.ae, NP.M, NP.T, NP.c, NP.k, NP.p, NP.ac, NP.g, NP.S, NP.r};
        try {
            return stringArray[(int)(SystemInvoker.nanoTime() % (long)stringArray.length)];
        }
        catch (Throwable throwable) {
            return NP.n;
        }
    }
}

