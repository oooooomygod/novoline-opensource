/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.ServerInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.ChunkCoordIntPair;
import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.avP
 */
public class avp_1 {
    private List<Ad> i;
    private List<Ad> a;
    private aac_1 d;
    private int b;
    private long e;
    private int[][] h;
    private List<EntityPlayerMP> c = my_0.c();
    private WorldServer g;
    private static Logger f = LogManagerInvoker.c();

    static Logger a() {
        return f;
    }

    private boolean a(int n, int n2, int n3, int n4, int n5) {
        int n6 = n - n3;
        int n7 = n2 - n4;
        return n6 >= -n5 && n6 <= n5 && n7 >= -n5 && n7 <= n5;
    }

    public void a(int n) {
        if ((n = MathHelper.a(n, 3, 32)) != this.b) {
            int cfr_ignored_0 = n - this.b;
            Iterator iterator = akr_1.a(my_0.a(this.c));
            while (dz_0.c(iterator)) {
                EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
                int n2 = (int)entityPlayerMP.posX >> 4;
                int n3 = (int)entityPlayerMP.posZ >> 4;
                for (int i = n2 - n; i <= n2 + n; ++i) {
                    for (int j = n3 - n; j <= n3 + n; ++j) {
                        Ad ad = this.a(i, j, true);
                        if (ListInvoker.contains(Ad.b(ad), entityPlayerMP)) continue;
                        ad.a(entityPlayerMP);
                    }
                }
            }
            this.b = n;
        }
    }

    public static int b(int n) {
        return n * 16 - 16;
    }

    public boolean a(EntityPlayerMP entityPlayerMP, int n, int n2) {
        Ad ad = this.a(n, n2, false);
        return ListInvoker.contains(Ad.b(ad), entityPlayerMP) && !ListInvoker.contains(entityPlayerMP.b2, Ad.a(ad));
    }

    public void b() {
        Object object;
        long l4 = a3V.k(this.g);
        if (l4 - this.e > 8000L) {
            this.e = l4;
            object = ListInvoker.iterator(this.a);
            while (dz_0.c((Iterator)object)) {
                Ad ad;
                Ad ad2 = ad = (Ad)dz_0.b((Iterator)object);
                ad2.b();
                ad2.a();
            }
        } else {
            object = ListInvoker.iterator(this.i);
            while (dz_0.c((Iterator)object)) {
                Ad ad;
                Ad ad3 = ad = (Ad)dz_0.b((Iterator)object);
                ad3.b();
            }
        }
        ListInvoker.clear(this.i);
        if (ListInvoker.isEmpty(this.c) && !qq_2.l((a9K)(object = this.g.d))) {
            rh_0.b(this.g.Z);
        }
    }

    private Ad a(int n, int n2, boolean bl) {
        long l4 = (long)n + Integer.MAX_VALUE | (long)n2 + Integer.MAX_VALUE << 32;
        Ad ad = (Ad)IX.c(this.d, l4);
        ad = new Ad(this, n, n2);
        IX.a(this.d, l4, ad);
        ListInvoker.add(this.a, ad);
        return ad;
    }

    public boolean a(int n, int n2) {
        long l4 = (long)n + Integer.MAX_VALUE | (long)n2 + Integer.MAX_VALUE << 32;
        return IX.c(this.d, l4) != null;
    }

    static List d(avp_1 avp_12) {
        return avp_12.a;
    }

    public void a(EntityPlayerMP entityPlayerMP) {
        int n;
        ArrayList arrayList = my_0.a(entityPlayerMP.b2);
        int n2 = 0;
        int n3 = this.b;
        int n4 = (int)entityPlayerMP.posX >> 4;
        int n5 = (int)entityPlayerMP.posZ >> 4;
        int n6 = 0;
        int n7 = 0;
        ChunkCoordIntPair chunkCoordIntPair = Ad.a(this.a(n4, n5, true));
        ListInvoker.clear(entityPlayerMP.b2);
        if (ListInvoker.contains(arrayList, chunkCoordIntPair)) {
            ListInvoker.add(entityPlayerMP.b2, chunkCoordIntPair);
        }
        if ((n = 1) <= n3 * 2) {
            boolean bl = false;
            int[] nArray = this.h[n2++ % 4];
            int n8 = 0;
            while (true) {
                if (ListInvoker.contains(arrayList, chunkCoordIntPair = Ad.a(this.a(n4 + (n6 += nArray[0]), n5 + (n7 += nArray[1]), true)))) {
                    ListInvoker.add(entityPlayerMP.b2, chunkCoordIntPair);
                }
                ++n8;
            }
        }
        n2 %= 4;
        for (n = 0; n < n3 * 2; ++n) {
            chunkCoordIntPair = Ad.a(this.a(n4 + (n6 += this.h[n2][0]), n5 + (n7 += this.h[n2][1]), true));
            if (!ListInvoker.contains(arrayList, chunkCoordIntPair)) continue;
            ListInvoker.add(entityPlayerMP.b2, chunkCoordIntPair);
        }
    }

    public avp_1(WorldServer worldServer) {
        this.d = new aac_1();
        this.i = my_0.c();
        this.a = my_0.c();
        this.h = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        this.g = worldServer;
        this.a(aek_1.e(ServerInvoker.R(a3V.m(worldServer))));
    }

    static List a(avp_1 avp_12) {
        return avp_12.i;
    }

    public void d(EntityPlayerMP entityPlayerMP) {
        int n = (int)entityPlayerMP.posX >> 4;
        int n2 = (int)entityPlayerMP.posZ >> 4;
        double d = entityPlayerMP.cb - entityPlayerMP.posX;
        double d2 = entityPlayerMP.b5 - entityPlayerMP.posZ;
        double d3 = d * d + d2 * d2;
        if (d3 >= 64.0) {
            int n3 = (int)entityPlayerMP.cb >> 4;
            int n4 = (int)entityPlayerMP.b5 >> 4;
            int n5 = this.b;
            int n6 = n - n3;
            int n7 = n2 - n4;
            for (int i = n - n5; i <= n + n5; ++i) {
                for (int j = n2 - n5; j <= n2 + n5; ++j) {
                    if (!this.a(i, j, n3, n4, n5)) {
                        this.a(i, j, true).a(entityPlayerMP);
                    }
                    if (this.a(i - n6, j - n7, n, n2, n5)) continue;
                    Ad ad = this.a(i - n6, j - n7, false);
                    ad.b(entityPlayerMP);
                }
            }
            this.a(entityPlayerMP);
            entityPlayerMP.cb = entityPlayerMP.posX;
            entityPlayerMP.b5 = entityPlayerMP.posZ;
        }
    }

    public void c(EntityPlayerMP entityPlayerMP) {
        int n = (int)entityPlayerMP.posX >> 4;
        int n2 = (int)entityPlayerMP.posZ >> 4;
        entityPlayerMP.cb = entityPlayerMP.posX;
        entityPlayerMP.b5 = entityPlayerMP.posZ;
        for (int i = n - this.b; i <= n + this.b; ++i) {
            for (int j = n2 - this.b; j <= n2 + this.b; ++j) {
                this.a(i, j, true).a(entityPlayerMP);
            }
        }
        ListInvoker.add(this.c, entityPlayerMP);
        this.a(entityPlayerMP);
    }

    static WorldServer b(avp_1 avp_12) {
        return avp_12.g;
    }

    public void a(BlockPos blockPos) {
        int n = amv_2.j(blockPos) >> 4;
        int n2 = amv_2.i(blockPos) >> 4;
        Ad ad = this.a(n, n2, false);
        ad.a(amv_2.j(blockPos) & 0xF, amv_2.h(blockPos), amv_2.i(blockPos) & 0xF);
    }

    public void b(EntityPlayerMP entityPlayerMP) {
        int n = (int)entityPlayerMP.cb >> 4;
        int n2 = (int)entityPlayerMP.b5 >> 4;
        for (int i = n - this.b; i <= n + this.b; ++i) {
            for (int j = n2 - this.b; j <= n2 + this.b; ++j) {
                Ad ad = this.a(i, j, false);
                ad.b(entityPlayerMP);
            }
        }
        ListInvoker.remove(this.c, entityPlayerMP);
    }

    static aac_1 c(avp_1 avp_12) {
        return avp_12.d;
    }

    public WorldServer c() {
        return this.g;
    }
}

