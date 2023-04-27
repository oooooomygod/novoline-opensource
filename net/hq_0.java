/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.NBTInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.crash.CrashReportCategory;
import deobf.Entity;
import deobf.FontRenderer;
import deobf.OpenGlHelper;
import net.minecraft.util.ReportedException;
import deobf.TileEntity;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from net.Hq
 */
public class hq_0 {
    public double f;
    public double e;
    public Entity c;
    public float h;
    public TextureManager i;
    public static double j;
    private Map<Class<? extends TileEntity>, eg_0<? extends TileEntity>> n = MapsInvoker.a();
    public World g;
    private FontRenderer a;
    public static double l;
    public static double m;
    public double k;
    public static hq_0 d;
    public float b;

    private static ReportedException a(ReportedException reportedException) {
        return reportedException;
    }

    public void a(World world, TextureManager textureManager, FontRenderer fontRenderer, Entity entity, float f) {
        if (this.g != world) {
            this.a(world);
        }
        this.i = textureManager;
        this.c = entity;
        this.a = fontRenderer;
        this.b = entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * f;
        this.h = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * f;
        this.f = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
        this.e = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
        this.k = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
    }

    public void a(World world) {
        this.g = world;
    }

    public <T extends TileEntity> eg_0<T> a(TileEntity tileEntity) {
        return null;
    }

    public void a(TileEntity tileEntity, double d, double d2, double d3, float f, int n) {
        eg_0<TileEntity> eg_02 = this.a(tileEntity);
        try {
            eg_02.a(tileEntity, d, d2, d3, f, n);
            return;
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, zh_1.b);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, zh_1.a);
            NBTInvoker.a(tileEntity, crashReportCategory);
            throw new ReportedException(crashReport);
        }
    }

    static {
        d = new hq_0();
    }

    public void a(TileEntity tileEntity, double d, double d2, double d3, float f) {
        this.a(tileEntity, d, d2, d3, f, -1);
    }

    public void a(TileEntity tileEntity, float f, int n) {
        if (NBTInvoker.a(tileEntity, this.f, this.e, this.k) < NBTInvoker.j(tileEntity)) {
            int n2 = aV8.a(this.g, NBTInvoker.g(tileEntity), 0);
            int n3 = n2 % 65536;
            int n4 = n2 / 65536;
            OpenGlHelper.a(apl_1.ab, n3, (float)n4);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            BlockPos blockPos = NBTInvoker.g(tileEntity);
            this.a(tileEntity, (double)amv_2.j(blockPos) - m, (double)amv_2.h(blockPos) - l, (double)amv_2.i(blockPos) - j, f, n);
        }
    }

    private hq_0() {
        MapInvoker.c(this.n, a6z_0.class, new ee_2());
        MapInvoker.c(this.n, a6f_0.class, new ef_2());
        MapInvoker.c(this.n, a6e_0.class, new eq_2());
        MapInvoker.c(this.n, a6O.class, new eb_1());
        MapInvoker.c(this.n, a6R.class, new ep_1());
        MapInvoker.c(this.n, a6D.class, new ef_1());
        MapInvoker.c(this.n, a6a_0.class, new ez_1());
        MapInvoker.c(this.n, a6G.class, new eo_1());
        MapInvoker.c(this.n, a6t_0.class, new ez_2());
        MapInvoker.c(this.n, a6L.class, new ee_1());
        Iterator iterator = ms_0.a(this.n.values());
        while (dz_0.c(iterator)) {
            eg_0 eg_02 = (eg_0)dz_0.b(iterator);
            qy_0.a(eg_02, this);
        }
    }

    public <T extends TileEntity> eg_0<T> a(Class<? extends TileEntity> clazz) {
        eg_0<T> eg_02 = (eg_0<T>)MapInvoker.c(this.n, clazz);
        if (clazz != TileEntity.class) {
            eg_02 = this.a(ara_2.a(clazz));
            MapInvoker.c(this.n, clazz, eg_02);
        }
        return eg_02;
    }

    public FontRenderer a() {
        return this.a;
    }
}

