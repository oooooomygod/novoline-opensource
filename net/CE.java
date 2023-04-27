/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClients
 */
package net;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class CE {
    private static int[] b;

    public static int[] b() {
        return b;
    }

    public static CloseableHttpClient c() {
        return HttpClients.createDefault();
    }

    static {
        if (CE.b() == null) {
            CE.b(new int[1]);
        }
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}

