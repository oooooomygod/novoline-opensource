/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.SettableFuture
 */
package net;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import net.minecraft.resources.ResourcePackRepository;
import java.io.File;

/*
 * Renamed from net.aLj
 */
class alj_0
implements FutureCallback<Object> {
    File c;
    SettableFuture a;
    ResourcePackRepository b;

    public void onFailure(Throwable throwable) {
        aaw_1.a(this.a, throwable);
    }

    public void onSuccess(Object object) {
        this.b.a(this.c);
        aaw_1.a(this.a, null);
    }

    alj_0(ResourcePackRepository resourcePackRepository, File file, SettableFuture settableFuture) {
        this.b = resourcePackRepository;
        this.c = file;
        this.a = settableFuture;
    }
}

