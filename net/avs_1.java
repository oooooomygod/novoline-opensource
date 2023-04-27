/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Renamed from net.avS
 */
public class avs_1 {
    public static boolean a(CompletableFuture completableFuture, Object object) {
        return completableFuture.complete(object);
    }

    public static CompletableFuture a(Runnable runnable, Executor executor) {
        return CompletableFuture.runAsync(runnable, executor);
    }

    public static CompletableFuture a(CompletableFuture completableFuture, Function function) {
        return completableFuture.exceptionally(function);
    }

    public static CompletableFuture b(CompletableFuture completableFuture, BiConsumer biConsumer) {
        return completableFuture.whenCompleteAsync(biConsumer);
    }

    public static CompletableFuture a(CompletableFuture completableFuture, BiConsumer biConsumer) {
        return completableFuture.whenComplete(biConsumer);
    }

    public static CompletableFuture a(Supplier supplier, Executor executor) {
        return CompletableFuture.supplyAsync(supplier, executor);
    }

    public static CompletableFuture a(Supplier supplier) {
        return CompletableFuture.supplyAsync(supplier);
    }
}

