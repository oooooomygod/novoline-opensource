/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.FutureTaskInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.ThreadInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import net.minecraft.renderer.chunk.RenderChunk;
import net.minecraft.renderer.WorldRenderer;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class l {
    private WorldVertexBufferUploader a;
    private List<de_2> c = my_0.c();
    private de_2 e;
    private BlockingQueue<lp_2> b = ard_0.a(100);
    private Queue<ListenableFutureTask<?>> d;
    private static Logger g = LogManagerInvoker.c();
    private static ThreadFactory f = agg_0.a(agg_0.a(agg_0.a(new ThreadFactoryBuilder(), s2.a), true));
    private BlockingQueue<uj_1> i = ard_0.a(5);
    private anc_0 h;

    public boolean c(RenderChunk renderChunk) {
        akg_2.a(afq_2.h(renderChunk));
        try {
            boolean bl;
            afq_2.f(renderChunk);
            boolean bl2 = bl = true;
            return bl2;
        }
        finally {
            akg_2.b(afq_2.h(renderChunk));
        }
    }

    public void b() {
        this.e();
        while (this.a(0L)) {
        }
        ArrayList arrayList = my_0.c();
        while (ListInvoker.size(arrayList) != 5) {
            try {
                ListInvoker.add(arrayList, this.a());
            }
            catch (InterruptedException interruptedException) {}
        }
        aah_0.a(this.i, arrayList);
    }

    public void e() {
        while (!aah_0.d(this.b)) {
            lp_2 lp_22 = (lp_2)aah_0.a(this.b);
            aAI.f(lp_22);
        }
    }

    public uj_1 a() throws InterruptedException {
        return (uj_1)aah_0.c(this.i);
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    private void lambda$updateChunkLater$0(lp_2 lp_22) {
        aah_0.b(this.b, lp_22);
    }

    public void a(uj_1 uj_12) {
        aah_0.c(this.i, uj_12);
    }

    private void a(WorldRenderer worldRenderer, aH5 aH52) {
        a2j_0.a(this.h, aH52);
        a2j_0.a(this.h, worldRenderer);
    }

    public lp_2 c() throws InterruptedException {
        return (lp_2)aah_0.c(this.b);
    }

    public boolean b(RenderChunk renderChunk) {
        akg_2.a(afq_2.h(renderChunk));
        try {
            lp_2 lp_22 = afq_2.a(renderChunk);
            try {
                this.e.b(lp_22);
            }
            catch (InterruptedException interruptedException) {}
            boolean bl = true;
            return bl;
        }
        finally {
            akg_2.b(afq_2.h(renderChunk));
        }
    }

    public l() {
        this.a = new WorldVertexBufferUploader();
        this.h = new anc_0();
        this.d = ard_0.a();
        int n = 0;
        while (true) {
            de_2 de_22 = new de_2(this);
            Thread thread = aED.a(f, de_22);
            ThreadInvoker.e(thread);
            ListInvoker.add(this.c, de_22);
            ++n;
        }
    }

    public String d() {
        return StringInvoker.a(s2.b, new Object[]{P8.d(aah_0.b(this.b)), P8.d(FutureTaskInvoker.b(this.d)), P8.d(aah_0.b(this.i))});
    }

    public boolean a(RenderChunk renderChunk) {
        akg_2.a(afq_2.h(renderChunk));
        try {
            lp_2 lp_22 = afq_2.a(renderChunk);
            aAI.a(lp_22, () -> this.lambda$updateChunkLater$0(lp_22));
            boolean bl = aah_0.a(this.b, lp_22);
            aAI.f(lp_22);
            boolean bl2 = bl;
            return bl2;
        }
        finally {
            akg_2.b(afq_2.h(renderChunk));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean a(long l4) {
        boolean bl = false;
        Queue<ListenableFutureTask<?>> queue = this.d;
        // MONITORENTER : queue
        if (!FutureTaskInvoker.c(this.d)) {
            axk_1.a((ListenableFutureTask)FutureTaskInvoker.d(this.d));
            bl = true;
        }
        // MONITOREXIT : queue
        if (l4 == 0L) return bl;
        return bl;
    }

    private void lambda$updateTransparencyLater$1(lp_2 lp_22) {
        aah_0.b(this.b, lp_22);
    }

    private void a(WorldRenderer worldRenderer, int n, RenderChunk renderChunk) {
        GL11.glNewList((int)n, (int)4864);
        GlStateManagerInvoker.pushMatrix();
        afq_2.c(renderChunk);
        aij_0.a(this.a, worldRenderer);
        GlStateManagerInvoker.popMatrix();
        GL11.glEndList();
    }

    private void lambda$uploadChunk$2(a5w_0 a5w_02, WorldRenderer worldRenderer, RenderChunk renderChunk, amx_0 amx_02) {
        this.a(a5w_02, worldRenderer, renderChunk, amx_02);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ListenableFuture<Object> a(a5w_0 a5w_02, WorldRenderer worldRenderer, RenderChunk renderChunk, amx_0 amx_02) {
        if (!MCInvoker.X(MCInvoker.f())) {
            ListenableFutureTask listenableFutureTask = axk_1.a(() -> this.lambda$uploadChunk$2(a5w_02, worldRenderer, renderChunk, amx_02), null);
            Queue<ListenableFutureTask<?>> queue = this.d;
            synchronized (queue) {
                FutureTaskInvoker.a(this.d, listenableFutureTask);
                return listenableFutureTask;
            }
        }
        if (OpenGlHelper.f()) {
            this.a(worldRenderer, afq_2.b(renderChunk, a5w_02.ordinal()));
        } else {
            this.a(worldRenderer, ho_1.a((GR)renderChunk, a5w_02, amx_02), renderChunk);
        }
        WorldRendererInvoker.b(worldRenderer, 0.0, 0.0, 0.0);
        return aqo_2.a(null);
    }
}

