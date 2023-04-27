/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.NBTInvoker;
import deobf.Chunk;
import deobf.Entity;
import deobf.NBTBase;
import deobf.NBTTagList;
import deobf.TileEntity;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.ChunkCoordIntPair;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aue
 */
public class aue_2
implements ku_1,
a4o_0 {
    private File d;
    private Set<ChunkCoordIntPair> c;
    private static Logger a = LogManagerInvoker.c();
    private boolean b = false;
    private Map<ChunkCoordIntPair, NBTTagCompound> e = new ConcurrentHashMap<ChunkCoordIntPair, NBTTagCompound>();

    @Override
    public void a(World world, Chunk chunk) throws IOException {
    }

    @Override
    public Chunk a(World world, int n, int n2) throws IOException {
        ChunkCoordIntPair chunkCoordIntPair = new ChunkCoordIntPair(n, n2);
        NBTTagCompound cfr_ignored_0 = (NBTTagCompound)MapInvoker.c(this.e, chunkCoordIntPair);
        aW8.b(this.d, n, n2);
        return null;
    }

    private Chunk a(World world, NBTTagCompound nBTTagCompound) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n = tn_0.g(nBTTagCompound, PZ.ao);
        int n2 = tn_0.g(nBTTagCompound, PZ.I);
        Chunk chunk = new Chunk(world, n, n2);
        aqp_2.a(chunk, tn_0.i(nBTTagCompound, PZ.al));
        aqp_2.f(chunk, tn_0.c(nBTTagCompound, PZ.ad));
        aqp_2.d(chunk, tn_0.c(nBTTagCompound, PZ.ac));
        aqp_2.a(chunk, tn_0.f(nBTTagCompound, PZ.aq));
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, PZ.i, 10);
        ano_2[] ano_2Array = new ano_2[16];
        boolean bl = !qq_2.e(world.d);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
            byte by = tn_0.e(nBTTagCompound2, PZ.am);
            object4 = new ano_2(by << 4, bl);
            object3 = tn_0.j(nBTTagCompound2, PZ.an);
            object2 = new aqs_0(tn_0.j(nBTTagCompound2, PZ.Z));
            object = tn_0.a(nBTTagCompound2, PZ.ab, 7) ? new aqs_0(tn_0.j(nBTTagCompound2, PZ.v)) : null;
            char[] cArray = new char[((byte[])object3).length];
            for (int j = 0; j < cArray.length; ++j) {
                int n3 = j & 0xF;
                int n4 = j >> 8 & 0xF;
                int n5 = j >> 4 & 0xF;
                int n6 = awc_0.a((aqs_0)object, n3, n4, n5);
                cArray[j] = (char)(n6 << 12 | (object3[j] & 0xFF) << 4 | awc_0.a((aqs_0)object2, n3, n4, n5));
            }
            a4f_0.a((ano_2)object4, cArray);
            a4f_0.a((ano_2)object4, new aqs_0(tn_0.j(nBTTagCompound2, PZ.F)));
            a4f_0.b((ano_2)object4, new aqs_0(tn_0.j(nBTTagCompound2, PZ.aw)));
            a4f_0.c((ano_2)object4);
            ano_2Array[by] = object4;
        }
        aqp_2.a(chunk, ano_2Array);
        if (tn_0.a(nBTTagCompound, PZ.B, 7)) {
            aqp_2.a(chunk, tn_0.j(nBTTagCompound, PZ.j));
        }
        NBTTagList nBTTagList2 = tn_0.c(nBTTagCompound, PZ.ae, 10);
        for (int i = 0; i < kv_0.c(nBTTagList2); ++i) {
            NBTTagCompound nBTTagCompound3 = kv_0.g(nBTTagList2, i);
            object4 = ub_1.a(nBTTagCompound3, world);
            aqp_2.e(chunk, true);
            aqp_2.a(chunk, (Entity)object4);
            object3 = object4;
            object2 = nBTTagCompound3;
            while (tn_0.a((NBTTagCompound)object2, PZ.as, 10)) {
                object = ub_1.a(tn_0.d((NBTTagCompound)object2, PZ.ap), world);
                aqp_2.a(chunk, (Entity)object);
                ayj_0.b((Entity)object3, (Entity)object);
                object3 = object;
                object2 = tn_0.d((NBTTagCompound)object2, PZ.r);
            }
        }
        NBTTagList nBTTagList3 = tn_0.c(nBTTagCompound, PZ.J, 10);
        for (int i = 0; i < kv_0.c(nBTTagList3); ++i) {
            object4 = kv_0.g(nBTTagList3, i);
            object3 = NBTInvoker.a((NBTTagCompound)object4);
            aqp_2.a(chunk, (TileEntity)object3);
        }
        if (tn_0.a(nBTTagCompound, PZ.P, 9)) {
            NBTTagList nBTTagList4 = tn_0.c(nBTTagCompound, PZ.aa, 10);
            for (int i = 0; i < kv_0.c(nBTTagList4); ++i) {
                object3 = kv_0.g(nBTTagList4, i);
                object2 = tn_0.a((NBTTagCompound)object3, PZ.b, 8) ? BlocksInvoker.a(tn_0.m((NBTTagCompound)object3, PZ.w)) : BlocksInvoker.a(tn_0.g((NBTTagCompound)object3, PZ.D));
                aV8.c(world, new BlockPos(tn_0.g((NBTTagCompound)object3, PZ.ax), tn_0.g((NBTTagCompound)object3, PZ.Q), tn_0.g((NBTTagCompound)object3, PZ.p)), (Block)object2, tn_0.g((NBTTagCompound)object3, PZ.H), tn_0.g((NBTTagCompound)object3, PZ.m));
            }
        }
        return chunk;
    }

    @Override
    public void b(World world, Chunk chunk) throws cd_1, IOException {
        aV8.a(world);
        try {
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            tn_0.a(nBTTagCompound, PZ.V, (NBTBase)nBTTagCompound2);
            this.a(chunk, world, nBTTagCompound2);
            this.b(aqp_2.v(chunk), nBTTagCompound);
        }
        catch (Exception exception) {
            LoggerInvoker.a(a, PZ.u, exception);
        }
    }

    private void a(ChunkCoordIntPair chunkCoordIntPair, NBTTagCompound nBTTagCompound) throws IOException {
        DataOutputStream dataOutputStream = aW8.a(this.d, chunkCoordIntPair.b, chunkCoordIntPair.a);
        aR8.a(nBTTagCompound, dataOutputStream);
        HC.a(dataOutputStream);
    }

    private void a(Chunk chunk, World world, NBTTagCompound nBTTagCompound) {
        Object object;
        Object object2;
        Object object3;
        NBTTagCompound nBTTagCompound2;
        tn_0.a(nBTTagCompound, PZ.s, (byte)1);
        tn_0.b(nBTTagCompound, PZ.S, chunk.f);
        tn_0.b(nBTTagCompound, PZ.aj, chunk.v);
        tn_0.a(nBTTagCompound, PZ.c, aV8.d(world));
        tn_0.a(nBTTagCompound, PZ.ay, aqp_2.d(chunk));
        tn_0.a(nBTTagCompound, PZ.G, aqp_2.b(chunk));
        tn_0.a(nBTTagCompound, PZ.o, aqp_2.f(chunk));
        tn_0.a(nBTTagCompound, PZ.ak, aqp_2.e(chunk));
        ano_2[] ano_2Array = aqp_2.m(chunk);
        NBTTagList nBTTagList = new NBTTagList();
        boolean bl = !qq_2.e(world.d);
        ano_2[] object5 = ano_2Array;
        int nBTTagList2 = object5.length;
        for (int iterator = 0; iterator < nBTTagList2; ++iterator) {
            ano_2 l4 = object5[iterator];
            nBTTagCompound2 = new NBTTagCompound();
            tn_0.a(nBTTagCompound2, PZ.A, (byte)(a4f_0.e(l4) >> 4 & 0xFF));
            object3 = new byte[a4f_0.g(l4).length];
            object2 = new aqs_0();
            object = null;
            for (int i = 0; i < a4f_0.g(l4).length; ++i) {
                char c = a4f_0.g(l4)[i];
                int n = i & 0xF;
                int n2 = i >> 8 & 0xF;
                int n3 = i >> 4 & 0xF;
                if (c >> 12 != 0) {
                    object = new aqs_0();
                    awc_0.a((aqs_0)object, n, n2, n3, c >> 12);
                }
                object3[i] = (byte)(c >> 4 & 0xFF);
                awc_0.a((aqs_0)object2, n, n2, n3, c & 0xF);
            }
            tn_0.a(nBTTagCompound2, PZ.Y, object3);
            tn_0.a(nBTTagCompound2, PZ.ar, awc_0.a((aqs_0)object2));
            tn_0.a(nBTTagCompound2, PZ.a, awc_0.a(object));
            tn_0.a(nBTTagCompound2, PZ.t, awc_0.a(a4f_0.b(l4)));
            tn_0.a(nBTTagCompound2, PZ.q, awc_0.a(a4f_0.f(l4)));
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, PZ.g, nBTTagList);
        tn_0.a(nBTTagCompound, PZ.M, aqp_2.i(chunk));
        aqp_2.e(chunk, false);
        NBTTagList nBTTagList3 = new NBTTagList();
        for (nBTTagList2 = 0; nBTTagList2 < aqp_2.s(chunk).length; ++nBTTagList2) {
            Iterator object6 = ave_1.a(aqp_2.s(chunk)[nBTTagList2]);
            while (dz_0.c(object6)) {
                Entity entity = (Entity)dz_0.b(object6);
                if (!ayj_0.d(entity, nBTTagCompound2 = new NBTTagCompound())) continue;
                aqp_2.e(chunk, true);
                kv_0.a(nBTTagList3, nBTTagCompound2);
            }
        }
        tn_0.a(nBTTagCompound, PZ.R, nBTTagList3);
        NBTTagList nBTTagList4 = new NBTTagList();
        Object object4 = ms_0.a(aqp_2.g(chunk).values());
        while (dz_0.c((Iterator)object4)) {
            TileEntity tileEntity = (TileEntity)dz_0.b((Iterator)object4);
            nBTTagCompound2 = new NBTTagCompound();
            NBTInvoker.a(tileEntity, nBTTagCompound2);
            kv_0.a(nBTTagList4, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, PZ.C, nBTTagList4);
        object4 = aV8.a(world, chunk, false);
        long l4 = aV8.d(world);
        object3 = new NBTTagList();
        object2 = ListInvoker.iterator((List)object4);
        while (dz_0.c((Iterator)object2)) {
            object = (a5D)dz_0.b((Iterator)object2);
            NBTTagCompound nBTTagCompound3 = new NBTTagCompound();
            ResourceLocation resourceLocation = (ResourceLocation)a82.b(Block.m, aqj_1.a((a5D)object));
            tn_0.a(nBTTagCompound3, PZ.n, PZ.f);
            tn_0.b(nBTTagCompound3, PZ.aA, amv_2.j(((a5D)object).b));
            tn_0.b(nBTTagCompound3, PZ.ag, amv_2.h(((a5D)object).b));
            tn_0.b(nBTTagCompound3, PZ.ah, amv_2.i(((a5D)object).b));
            tn_0.b(nBTTagCompound3, PZ.at, (int)(((a5D)object).a - l4));
            tn_0.b(nBTTagCompound3, PZ.e, ((a5D)object).f);
            kv_0.a((NBTTagList)object3, nBTTagCompound3);
        }
        tn_0.a(nBTTagCompound, PZ.z, (NBTBase)object3);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a() {
        try {
            this.b = true;
            while (true) {
                this.a();
            }
        }
        catch (Throwable throwable) {
            this.b = false;
            throw throwable;
        }
    }

    public aue_2(File file) {
        this.c = asg_0.b(new ConcurrentHashMap());
        this.d = file;
    }

    @Override
    public boolean a() {
        if (MapInvoker.e(this.e)) {
            if (this.b) {
                LoggerInvoker.e(a, PZ.d, new Object[]{zq_2.q(this.d)});
            }
            return false;
        }
        ChunkCoordIntPair chunkCoordIntPair = (ChunkCoordIntPair)dz_0.b(aS0.f(MapInvoker.c(this.e)));
        try {
            aS0.b(this.c, chunkCoordIntPair);
            NBTTagCompound nBTTagCompound = (NBTTagCompound)MapInvoker.a(this.e, chunkCoordIntPair);
            try {
                this.a(chunkCoordIntPair, nBTTagCompound);
            }
            catch (Exception exception) {
                LoggerInvoker.a(a, PZ.k, exception);
            }
            return true;
        }
        finally {
            aS0.a(this.c, chunkCoordIntPair);
        }
    }

    protected void b(ChunkCoordIntPair chunkCoordIntPair, NBTTagCompound nBTTagCompound) {
        if (!aS0.c(this.c, chunkCoordIntPair)) {
            MapInvoker.c(this.e, chunkCoordIntPair, nBTTagCompound);
        }
        XB.a(XB.a(), this);
    }

    protected Chunk a(World world, int n, int n2, NBTTagCompound nBTTagCompound) {
        if (!tn_0.a(nBTTagCompound, PZ.h, 10)) {
            LoggerInvoker.f(a, aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), PZ.X), n), PZ.af), n2), PZ.N).toString());
            return null;
        }
        NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, PZ.x);
        if (!tn_0.a(nBTTagCompound2, PZ.W, 9)) {
            LoggerInvoker.f(a, aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), PZ.aB), n), PZ.U), n2), PZ.av).toString());
            return null;
        }
        Chunk chunk = this.a(world, nBTTagCompound2);
        if (!aqp_2.c(chunk, n, n2)) {
            LoggerInvoker.f(a, aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), PZ.ai), n), PZ.az), n2), PZ.O), n), PZ.K), n2), PZ.L), chunk.f), PZ.l), chunk.v), PZ.y).toString());
            tn_0.b(nBTTagCompound2, PZ.T, n);
            tn_0.b(nBTTagCompound2, PZ.au, n2);
            chunk = this.a(world, nBTTagCompound2);
        }
        return chunk;
    }

    @Override
    public void b() {
    }
}

