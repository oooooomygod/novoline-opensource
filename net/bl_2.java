/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import com.mojang.authlib.GameProfile;
import deobf.EnumPlayerType;
import deobf.NetHandlerPlayClient;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import net.NetworkPlayerInfo;
import net.PlayerManager;
import net.a0_0;
import net.a8F;
import net.aL0;
import net.aMF;
import net.aa2_0;
import net.amv_2;
import net.ari_1;
import net.asl_0;
import net.azo_1;
import net.ms_0;
import net.xk_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.bl
 */
public class bl_2
extends a0_0 {
    private void a() {
        this.a(xk_2.i, xk_2.r, azo_1.a(xk_2.H, xk_2.K), azo_1.a(xk_2.A, xk_2.h), azo_1.a(xk_2.v, xk_2.k));
    }

    public bl_2(@NonNull Novoline novoline, String string, String string2, String string3) {
        super(novoline, string, string2, string3);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(String[] var1_1, int var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 12[SWITCH]
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

    private boolean lambda$completeTabOptions$1(String string) {
        amv_2.b();
        return !a8F.a(NovolineInvoker.A(this.g), string, EnumPlayerType.FRIEND);
    }

    public void c(String string) {
        amv_2.b();
        asl_0.a(string, xk_2.P);
        String string2 = StringInvoker.i(string);
        PlayerManager playerManager = NovolineInvoker.A(this.g);
        if (a8F.a(playerManager, string2) != EnumPlayerType.FRIEND) {
            this.b(aL0.a(aL0.a(new StringBuilder(), string), xk_2.G).toString());
            return;
        }
        a8F.b(playerManager, string2);
        this.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), xk_2.d), string), xk_2.I).toString());
        try {
            aa2_0.c(a8F.a(playerManager));
        }
        catch (IOException iOException) {
            this.b(xk_2.L);
            LoggerInvoker.b(playerManager.d(), xk_2.D, iOException);
            this.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), xk_2.M), string), xk_2.t).toString());
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static boolean lambda$process$0(Map.Entry entry) {
        return true;
    }

    public void a(String string) {
        amv_2.b();
        asl_0.a(string, xk_2.E);
        String string2 = StringInvoker.i(string);
        PlayerManager playerManager = NovolineInvoker.A(this.g);
        EnumPlayerType enumPlayerType = a8F.a(playerManager, string2);
        switch (ari_1.a[enumPlayerType.ordinal()]) {
            case 1: {
                if (a8F.b(playerManager, string2, EnumPlayerType.TARGET)) {
                    this.f(aL0.a(aL0.a(aL0.a(new StringBuilder(), xk_2.j), string), xk_2.u).toString());
                }
                this.f(aL0.a(aL0.a(aL0.a(new StringBuilder(), xk_2.z), string), xk_2.O).toString());
            }
            case 2: {
                this.b(aL0.a(aL0.a(new StringBuilder(), string), xk_2.U).toString());
                return;
            }
        }
        a8F.c(playerManager, string2, EnumPlayerType.FRIEND);
        this.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), xk_2.B), string), xk_2.N).toString());
        try {
            aa2_0.c(a8F.a(playerManager));
        }
        catch (IOException iOException) {
            this.b(xk_2.F);
            LoggerInvoker.b(playerManager.d(), xk_2.x, iOException);
            this.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), xk_2.b), string), xk_2.f).toString());
        }
    }

    @Override
    public @Nullable List<String> b(String[] stringArray) {
        amv_2.b();
        switch (stringArray.length) {
            case 1: {
                return this.a(aMF.a(new String[]{xk_2.g, xk_2.V, xk_2.a}), stringArray[0], true);
            }
            case 2: {
                if (StringInvoker.d(stringArray[0], xk_2.l)) {
                    return this.a(aMF.b(aMF.a(aMF.a(ms_0.b(NetHandlerPlayClient.a.values()), NetworkPlayerInfo::l), GameProfile::getName), this::lambda$completeTabOptions$1), stringArray[1], true);
                }
                if (StringInvoker.d(stringArray[0], xk_2.p)) {
                    return this.a(a8F.a(NovolineInvoker.A(this.g), EnumPlayerType.FRIEND), stringArray[1], true);
                }
                return null;
            }
        }
        return null;
    }
}

