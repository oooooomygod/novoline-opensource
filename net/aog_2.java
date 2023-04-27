/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.PlatformTask
 */
package net;

import com.viaversion.viaversion.api.platform.PlatformTask;
import java.util.concurrent.Future;
import net.a3k_0;

/*
 * Renamed from net.aog
 */
public class aog_2
implements PlatformTask<Future<?>> {
    private Future<?> a;

    public Future<?> a() {
        return this.a;
    }

    public aog_2(Future<?> future) {
        this.a = future;
    }

    public void cancel() {
        a3k_0.a(this.a, false);
    }
}

