/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import net.SO;
import net.a2P;
import net.a4E;
import net.auk_2;

public class aBJ {
    private List<Boolean> f;
    private static byte[] a = new byte[4096];
    private int c;
    private int[] g;
    private long b;
    private File e;
    private RandomAccessFile d;
    private int[] h;

    private int b(int n, int n2) {
        return this.g[n + n2 * 32];
    }

    public DataOutputStream d(int n, int n2) {
        return this.c(n, n2) ? null : new DataOutputStream(new DeflaterOutputStream(new a2P(this, n, n2)));
    }

    public boolean e(int n, int n2) {
        return this.b(n, n2) != 0;
    }

    public void a() throws IOException {
        if (this.d != null) {
            this.d.close();
        }
    }

    private void a(int n, byte[] byArray, int n2) throws IOException {
        SO.a(this.d, (long)(n * 4096));
        SO.a(this.d, n2 + 1);
        SO.c(this.d, 2);
        SO.a(this.d, byArray, 0, n2);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private boolean c(int n, int n2) {
        return n >= 32 || n2 >= 32;
    }

    private void a(int n, int n2, int n3) throws IOException {
        this.g[n + n2 * 32] = n3;
        SO.a(this.d, (long)((n + n2 * 32) * 4));
        SO.a(this.d, n3);
    }

    private void b(int n, int n2, int n3) throws IOException {
        this.h[n + n2 * 32] = n3;
        SO.a(this.d, (long)(4096 + (n + n2 * 32) * 4));
        SO.a(this.d, n3);
    }

    /*
     * Exception decompiling
     */
    public aBJ(File var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 9[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    protected synchronized void a(int var1_1, int var2_2, byte[] var3_3, int var4_4) {
        block15: {
            block14: {
                var5_5 = this.b(var1_1, var2_2);
                var6_7 = var5_5 >> 8;
                var7_8 = var5_5 & 255;
                var8_9 = (var4_4 + 5) / 4096 + 1;
                if (var8_9 >= 256) {
                    return;
                }
                if (var7_8 != var8_9) break block14;
                this.a(var6_7, var3_3, var4_4);
                ** GOTO lbl50
            }
            for (var9_10 = 0; var9_10 < var7_8; ++var9_10) {
                ListInvoker.set(this.f, var6_7 + var9_10, Boolean.TRUE);
                continue;
            }
            var9_10 = ListInvoker.indexOf(this.f, Boolean.TRUE);
            var10_11 = 0;
            if (var9_10 == -1) break block15;
            ** for (var11_12 = var9_10;
            ; var11_12 < ListInvoker.size(this.f); ++var11_12)
lbl-1000:
            // 1 sources

            {
                var10_11 = auk_2.a((Boolean)ListInvoker.get(this.f, var11_12)) ? ++var10_11 : 0;
                if (var10_11 >= var8_9) break;
                continue;
            }
        }
        if (var10_11 < var8_9) ** GOTO lbl39
        var6_7 = var9_10;
        this.a(var1_1, var2_2, var9_10 << 8 | var8_9);
        for (var11_12 = 0; var11_12 < var8_9; ++var11_12) {
            ListInvoker.set(this.f, var6_7 + var11_12, Boolean.FALSE);
        }
        this.a(var6_7, var3_3, var4_4);
        ** GOTO lbl50
lbl39:
        // 1 sources

        SO.a(this.d, SO.c(this.d));
        var6_7 = ListInvoker.size(this.f);
        for (var11_12 = 0; var11_12 < var8_9; ++var11_12) {
            SO.a(this.d, aBJ.a);
            ListInvoker.add(this.f, Boolean.FALSE);
        }
        this.c += 4096 * var8_9;
        try {
            this.a(var6_7, var3_3, var4_4);
            this.a(var1_1, var2_2, var6_7 << 8 | var8_9);
lbl50:
            // 3 sources

            this.b(var1_1, var2_2, (int)(ServerInvoker.c() / 1000L));
        }
        catch (IOException var5_6) {
            a4E.b(var5_6);
        }
    }

    public synchronized DataInputStream a(int n, int n2) {
        if (this.c(n, n2)) {
            return null;
        }
        try {
            this.b(n, n2);
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }
}

