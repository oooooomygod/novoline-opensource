/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.FileDialog;
import java.awt.Frame;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.aFW;
import net.avs_1;
import net.avt_1;
import net.gh_0;

public class MP {
    private CompletableFuture<String> a;

    private CompletableFuture<String> b() {
        return avs_1.a(MP::lambda$doRequest$0, (Executor)aFW.a());
    }

    private static String lambda$doRequest$0() {
        FileDialog fileDialog = new FileDialog((Frame)null, gh_0.a);
        avt_1.a(fileDialog, 0);
        avt_1.a(fileDialog, true);
        return avt_1.b(fileDialog);
    }

    public void a() {
        avs_1.b(this.b(), MP::lambda$start$1);
    }

    private static void lambda$start$1(String string, Throwable throwable) {
    }
}

