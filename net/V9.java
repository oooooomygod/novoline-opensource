/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.Header
 *  org.apache.http.HttpEntity
 *  org.apache.http.HttpResponse
 */
package net;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

public class V9 {
    private static int[] b;

    public static HttpEntity a(HttpResponse httpResponse) {
        return httpResponse.getEntity();
    }

    static {
        if (V9.b() != null) {
            V9.b(new int[4]);
        }
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    public static Header a(HttpResponse httpResponse, String string) {
        return httpResponse.getFirstHeader(string);
    }
}

