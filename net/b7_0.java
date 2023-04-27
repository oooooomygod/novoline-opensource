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
import net.aSP;
import net.aa2_0;
import net.amv_2;
import net.asl_0;
import net.aza_0;
import net.ms_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.b7
 */
public class b7_0
extends a0_0 {
    private static boolean lambda$process$0(Map.Entry entry) {
        return true;
    }

    public void c(String string) {
        asl_0.a(string, aSP.B);
        amv_2.b();
        String string2 = StringInvoker.i(string);
        PlayerManager playerManager = NovolineInvoker.A(this.g);
        EnumPlayerType enumPlayerType = a8F.a(playerManager, string2);
        switch (aza_0.a[enumPlayerType.ordinal()]) {
            case 1: {
                this.b(aL0.a(aL0.a(new StringBuilder(), string), aSP.P).toString());
                return;
            }
            case 2: {
                this.b(aL0.a(aL0.a(new StringBuilder(), string), aSP.d).toString());
                return;
            }
        }
        a8F.c(playerManager, string2, EnumPlayerType.TARGET);
        this.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), aSP.E), string), aSP.F).toString());
        try {
            aa2_0.c(a8F.a(playerManager));
        }
        catch (IOException iOException) {
            this.b(aSP.i);
            LoggerInvoker.b(playerManager.d(), aSP.y, iOException);
            this.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), aSP.a), string), aSP.T).toString());
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void a(String string) {
        asl_0.a(string, aSP.L);
        amv_2.b();
        String string2 = StringInvoker.i(string);
        PlayerManager playerManager = NovolineInvoker.A(this.g);
        if (a8F.a(playerManager, string2) != EnumPlayerType.TARGET) {
            this.b(aL0.a(aL0.a(new StringBuilder(), string), aSP.x).toString());
            return;
        }
        a8F.b(playerManager, string2);
        this.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), aSP.v), string), aSP.c).toString());
        try {
            aa2_0.c(a8F.a(playerManager));
        }
        catch (IOException iOException) {
            this.b(aSP.f);
            LoggerInvoker.b(playerManager.d(), aSP.q, iOException);
            this.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), aSP.M), string), aSP.p).toString());
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(String[] var1_1, int var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 16[SWITCH]
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

    @Override
    public @Nullable List<String> b(String[] stringArray) {
        amv_2.b();
        switch (stringArray.length) {
            case 1: {
                return this.a(aMF.a(new String[]{aSP.Q, aSP.o, aSP.r}), stringArray[0], true);
            }
            case 2: {
                PlayerManager playerManager = NovolineInvoker.A(this.g);
                if (StringInvoker.d(stringArray[0], aSP.S)) {
                    return this.a(aMF.b(aMF.a(aMF.a(ms_0.b(NetHandlerPlayClient.a.values()), NetworkPlayerInfo::l), GameProfile::getName), arg_0 -> b7_0.lambda$completeTabOptions$2(playerManager, arg_0)), stringArray[1], true);
                }
                if (StringInvoker.d(stringArray[0], aSP.J)) {
                    return this.a(a8F.a(playerManager, EnumPlayerType.TARGET), stringArray[1], true);
                }
                return null;
            }
        }
        return null;
    }

    private static boolean lambda$process$1(Map.Entry entry) {
        return true;
    }

    private static boolean lambda$completeTabOptions$2(PlayerManager playerManager, String string) {
        amv_2.b();
        EnumPlayerType enumPlayerType = a8F.a(playerManager, string);
        return enumPlayerType != EnumPlayerType.TARGET && enumPlayerType != EnumPlayerType.FRIEND;
    }

    public b7_0(@NonNull Novoline novoline, String string, List<String> list) {
        super(novoline, string, list);
    }
}

