/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import net.IProgressUpdate;
import net.nt_0;

/*
 * Renamed from net.p1
 */
public class p1_0 {
    public static String a(URL uRL) {
        return nt_0.a(uRL);
    }

    public static String a(URL uRL, Map map, boolean bl) {
        return nt_0.a(uRL, map, bl);
    }

    public static ListenableFuture a(File file, String string, Map map, int n, IProgressUpdate iProgressUpdate, Proxy proxy) {
        return nt_0.a(file, string, map, n, iProgressUpdate, proxy);
    }

    public static int a() {
        return nt_0.a();
    }
}

