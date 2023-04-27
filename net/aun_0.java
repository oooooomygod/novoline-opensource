/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import net.a4E;
import net.a8_;
import net.aBJ;
import net.aL0;
import net.aqz_2;
import net.dz_0;
import net.ms_0;

/*
 * Renamed from net.aUn
 */
public class aun_0 {
    private static Map<File, aBJ> a = MapsInvoker.a();

    public static DataInputStream c(File file, int n, int n2) {
        aBJ aBJ2 = aun_0.a(file, n, n2);
        return a8_.a(aBJ2, n & 0x1F, n2 & 0x1F);
    }

    public static synchronized aBJ a(File file, int n, int n2) {
        File file2 = new File(file, aqz_2.b);
        File file3 = new File(file2, aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), aqz_2.c), n >> 5), aqz_2.a), n2 >> 5), aqz_2.d).toString());
        aBJ aBJ2 = (aBJ)MapInvoker.c(a, file3);
        return aBJ2;
    }

    public static synchronized void a() {
        Iterator iterator = ms_0.a(a.values());
        while (dz_0.c(iterator)) {
            aBJ aBJ2 = (aBJ)dz_0.b(iterator);
            try {
                a8_.a(aBJ2);
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
        MapInvoker.d(a);
    }

    public static DataOutputStream b(File file, int n, int n2) {
        aBJ aBJ2 = aun_0.a(file, n, n2);
        return a8_.c(aBJ2, n & 0x1F, n2 & 0x1F);
    }
}

