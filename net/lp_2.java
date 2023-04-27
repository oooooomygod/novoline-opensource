/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.renderer.chunk.RenderChunk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Renamed from net.lp
 */
public class lp_2 {
    private boolean e;
    private List<Runnable> c;
    private RenderChunk g;
    private a49 d;
    private ReentrantLock h = new ReentrantLock();
    private amx_0 f;
    private uj_1 a;
    private ud_2 b;

    public ReentrantLock c() {
        return this.h;
    }

    public amx_0 g() {
        return this.f;
    }

    public void h() {
        akg_2.a(this.h);
        try {
            if (this.b == ud_2.REBUILD_CHUNK && this.d != a49.DONE) {
                afq_2.a(this.g, true);
            }
            this.e = true;
            this.d = a49.DONE;
            Iterator iterator = ListInvoker.iterator(this.c);
            while (dz_0.c(iterator)) {
                Runnable runnable = (Runnable)dz_0.b(iterator);
                sj_1.a(runnable);
            }
            return;
        }
        finally {
            akg_2.b(this.h);
        }
    }

    public RenderChunk f() {
        return this.g;
    }

    public uj_1 a() {
        return this.a;
    }

    public void a(amx_0 amx_02) {
        this.f = amx_02;
    }

    public ud_2 e() {
        return this.b;
    }

    public lp_2(RenderChunk renderChunk, ud_2 ud_22) {
        this.c = my_0.c();
        this.d = a49.PENDING;
        this.g = renderChunk;
        this.b = ud_22;
    }

    public void a(a49 a492) {
        akg_2.a(this.h);
        try {
            this.d = a492;
            return;
        }
        finally {
            akg_2.b(this.h);
        }
    }

    public void a(uj_1 uj_12) {
        this.a = uj_12;
    }

    public boolean d() {
        return this.e;
    }

    public void a(Runnable runnable) {
        akg_2.a(this.h);
        try {
            ListInvoker.add(this.c, runnable);
            if (this.e) {
                sj_1.a(runnable);
            }
            return;
        }
        finally {
            akg_2.b(this.h);
        }
    }

    public a49 b() {
        return this.d;
    }
}

