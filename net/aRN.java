/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.thealtening.api.retriever.AsynchronousDataRetriever
 */
package net;

import com.thealtening.api.retriever.AsynchronousDataRetriever;
import java.util.concurrent.CompletableFuture;

public class aRN {
    private static int[] b;

    public static CompletableFuture a(AsynchronousDataRetriever asynchronousDataRetriever) {
        return asynchronousDataRetriever.getAccountDataAsync();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    static {
        if (aRN.b() == null) {
            aRN.b(new int[4]);
        }
    }
}

