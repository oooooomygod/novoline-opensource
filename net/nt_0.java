/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListeningExecutorService
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import net.FG;
import net.HC;
import net.IProgressUpdate;
import net.JB;
import net.JT;
import net.a5R;
import net.aL0;
import net.aS0;
import net.aVW;
import net.agg_0;
import net.ar5_0;
import net.asw_1;
import net.auq_0;
import net.awd_0;
import net.azh_1;
import net.dz_0;
import net.te_0;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.Nt
 */
public class nt_0 {
    private static AtomicInteger c;
    public static ListeningExecutorService b;
    private static Logger a;

    /*
     * Exception decompiling
     */
    private static void lambda$downloadResourcePack$0(IProgressUpdate var0, String var1_1, Proxy var2_2, Map var3_3, File var4_4, int var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 15[WHILELOOP]
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

    public static int a() throws IOException {
        int n;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(0);
            n = JT.a(serverSocket);
        }
        catch (Throwable throwable) {
            try {
                JT.b(serverSocket);
            }
            catch (IOException iOException) {}
            throw throwable;
        }
        try {
            JT.b(serverSocket);
        }
        catch (IOException iOException) {}
        return n;
    }

    public static ListenableFuture<Object> a(File file, String string, Map<String, String> map, int n, IProgressUpdate iProgressUpdate, Proxy proxy) {
        ListenableFuture listenableFuture = aVW.a(b, () -> nt_0.lambda$downloadResourcePack$0(iProgressUpdate, string, proxy, map, file, n));
        return listenableFuture;
    }

    public static String a(URL uRL) throws IOException {
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection)a5R.e(uRL);
        te_0.a(httpURLConnection, JB.b);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(te_0.c(httpURLConnection)));
        StringBuilder stringBuilder = new StringBuilder();
        while ((string = auq_0.c(bufferedReader)) != null) {
            aL0.a(stringBuilder, string);
            aL0.a(stringBuilder, '\r');
        }
        auq_0.a(bufferedReader);
        return stringBuilder.toString();
    }

    static {
        a = LogManagerInvoker.c();
        b = asw_1.a(awd_0.a(agg_0.a(agg_0.a(agg_0.a(new ThreadFactoryBuilder(), true), JB.n))));
        c = new AtomicInteger(0);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(URL uRL, String string, boolean bl) {
        StringBuilder stringBuilder;
        BufferedReader bufferedReader;
        try {
            String string2;
            Proxy proxy = ServerInvoker.d() == null ? null : ServerInvoker.p(ServerInvoker.d());
            proxy = Proxy.NO_PROXY;
            HttpURLConnection httpURLConnection = (HttpURLConnection)a5R.a(uRL, proxy);
            te_0.a(httpURLConnection, JB.i);
            te_0.b(httpURLConnection, JB.e, JB.z);
            te_0.b(httpURLConnection, JB.p, aL0.c(aL0.a(new StringBuilder(), JB.A), StringInvoker.e(string).length).toString());
            te_0.b(httpURLConnection, JB.d, JB.q);
            te_0.b(httpURLConnection, false);
            te_0.a(httpURLConnection, true);
            te_0.c(httpURLConnection, true);
            DataOutputStream dataOutputStream = new DataOutputStream(te_0.b(httpURLConnection));
            HC.a(dataOutputStream, string);
            HC.b(dataOutputStream);
            HC.a(dataOutputStream);
            bufferedReader = new BufferedReader(new InputStreamReader(te_0.c(httpURLConnection)));
            stringBuilder = new StringBuilder();
            while ((string2 = auq_0.c(bufferedReader)) != null) {
                aL0.a(stringBuilder, string2);
                aL0.a(stringBuilder, '\r');
            }
        }
        catch (Exception exception) {
            LoggerInvoker.a(a, aL0.a(aL0.a(new StringBuilder(), JB.w), uRL).toString(), exception);
            return JB.u;
        }
        auq_0.a(bufferedReader);
        return stringBuilder.toString();
    }

    public static String a(Map<String, Object> map) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = aS0.f(MapInvoker.b(map));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (aL0.a(stringBuilder) > 0) {
                aL0.a(stringBuilder, '&');
            }
            try {
                aL0.a(stringBuilder, azh_1.a((String)FG.b(entry), JB.l));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                ar5_0.a(unsupportedEncodingException);
            }
            if (FG.a(entry) == null) continue;
            aL0.a(stringBuilder, '=');
            try {
                aL0.a(stringBuilder, azh_1.a(FG.a(entry).toString(), JB.m));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                ar5_0.a(unsupportedEncodingException);
            }
        }
        return stringBuilder.toString();
    }

    public static String a(URL uRL, Map<String, Object> map, boolean bl) {
        return nt_0.a(uRL, nt_0.a(map), bl);
    }
}

