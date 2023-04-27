/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.UnmodifiableIterator
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.IntegratedServerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import com.google.common.collect.UnmodifiableIterator;
import deobf.*;
import deobf.Chunk;
import deobf.Entity;
import deobf.FontRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.multiplayer.WorldClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class QY
extends Gui {
    private FontRenderer g;
    private Minecraft f;
    private static String h = "CL_00001956";

    private int a(int n, int n2, float f) {
        int n3 = n >> 24 & 0xFF;
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n2 >> 24 & 0xFF;
        int n8 = n2 >> 16 & 0xFF;
        int n9 = n2 >> 8 & 0xFF;
        int n10 = n2 & 0xFF;
        int n11 = MathHelper.a((int)((float)n3 + (float)(n7 - n3) * f), 0, 255);
        int n12 = MathHelper.a((int)((float)n4 + (float)(n8 - n4) * f), 0, 255);
        int n13 = MathHelper.a((int)((float)n5 + (float)(n9 - n5) * f), 0, 255);
        int n14 = MathHelper.a((int)((float)n6 + (float)(n10 - n6) * f), 0, 255);
        return n11 << 24 | n12 << 16 | n13 << 8 | n14;
    }

    protected void a(ScaledResolution scaledResolution) {
        List list = this.c();
        for (int i = 0; i < ListInvoker.size(list); ++i) {
            String string = (String)ListInvoker.get(list, i);
            if (sy_2.a(string)) continue;
            int n = FontRendererInvoker.d(this.g);
            int n2 = FontRendererInvoker.a(this.g, string);
            int n3 = ScaledResolutionInvoker.getScaledWidth(scaledResolution) - 2 - n2;
            int n4 = 2 + n * i;
            this.a(n3 - 1, n4 - 1, n3 + n2 + 1, n4 + n - 1, -1873784752);
            FontRendererInvoker.a(this.g, string, n3, n4, 0xE0E0E0);
        }
    }

    protected void d() {
        List list = this.a();
        for (int i = 0; i < ListInvoker.size(list); ++i) {
            String string = (String)ListInvoker.get(list, i);
            if (sy_2.a(string)) continue;
            int n = FontRendererInvoker.d(this.g);
            int n2 = FontRendererInvoker.a(this.g, string);
            int n3 = 2 + n * i;
            this.a(1, n3 - 1, 2 + n2 + 1, n3 + n - 1, -1873784752);
            FontRendererInvoker.a(this.g, string, 2.0f, n3, 0xE0E0E0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u000ed\rZv>3|\u0011g\\".toCharArray();
        int n2 = 0;
        int n3 = 16;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x5D));
            n3 = n3;
        }
    }

    private void b() {
        GlStateManagerInvoker.disableDepth();
        FrameTimer frameTimer = MCInvoker.K(this.f);
        int n = anr_1.b(frameTimer);
        int n2 = anr_1.a(frameTimer);
        long[] lArray = anr_1.c(frameTimer);
        ScaledResolution scaledResolution = new ScaledResolution(this.f);
        int n3 = n;
        int n4 = 0;
        this.a(0, ScaledResolutionInvoker.i(scaledResolution) - 60, 240, ScaledResolutionInvoker.i(scaledResolution), -1873784752);
        while (n3 != n2) {
            int n5 = anr_1.a(frameTimer, lArray[n3], 30);
            int n6 = this.a(MathHelper.a(n5, 0, 60), 0, 30, 60);
            this.a(n4, ScaledResolutionInvoker.i(scaledResolution), ScaledResolutionInvoker.i(scaledResolution) - n5, n6);
            ++n4;
            n3 = anr_1.a(frameTimer, n3 + 1);
        }
        this.a(1, ScaledResolutionInvoker.i(scaledResolution) - 30 + 1, 14, ScaledResolutionInvoker.i(scaledResolution) - 30 + 10, -1873784752);
        FontRendererInvoker.a(this.g, wt_1.j, 2.0f, ScaledResolutionInvoker.i(scaledResolution) - 30 + 2, 0xE0E0E0);
        this.b(0, 239, ScaledResolutionInvoker.i(scaledResolution) - 30, -1);
        this.a(1, ScaledResolutionInvoker.i(scaledResolution) - 60 + 1, 14, ScaledResolutionInvoker.i(scaledResolution) - 60 + 10, -1873784752);
        FontRendererInvoker.a(this.g, wt_1.P, 2.0f, ScaledResolutionInvoker.i(scaledResolution) - 60 + 2, 0xE0E0E0);
        this.b(0, 239, ScaledResolutionInvoker.i(scaledResolution) - 60, -1);
        this.b(0, 239, ScaledResolutionInvoker.i(scaledResolution) - 1, -1);
        this.a(0, ScaledResolutionInvoker.i(scaledResolution) - 60, ScaledResolutionInvoker.i(scaledResolution), -1);
        this.a(239, ScaledResolutionInvoker.i(scaledResolution) - 60, ScaledResolutionInvoker.i(scaledResolution), -1);
        if (this.f.gameSettings.bI <= 120) {
            this.b(0, 239, ScaledResolutionInvoker.i(scaledResolution) - 60 + this.f.gameSettings.bI / 2, -16711681);
        }
        GlStateManagerInvoker.enableDepth();
    }

    private int a(int n, int n2, int n3, int n4) {
        return n < n3 ? this.a(-16711936, -256, (float)n / (float)n3) : this.a(-256, -65536, (float)(n - n3) / (float)(n4 - n3));
    }

    public void b(ScaledResolution scaledResolution) {
        ProfilerInvoker.startSection(this.f.mcProfiler, wt_1.C);
        GlStateManagerInvoker.pushMatrix();
        this.d();
        this.a(scaledResolution);
        GlStateManagerInvoker.popMatrix();
        ProfilerInvoker.endSection(this.f.mcProfiler);
    }

    public QY(Minecraft minecraft) {
        this.f = minecraft;
        this.g = minecraft.fontRendererObj;
    }

    private boolean e() {
        return PlayerInvoker.J(this.f.player) || this.f.gameSettings.az;
    }

    private static long a(long l4) {
        return l4 / 1024L / 1024L;
    }

    protected List c() {
        Object object;
        long l4 = als_2.d(als_2.a());
        long l5 = als_2.b(als_2.a());
        long l6 = als_2.a(als_2.a());
        long l7 = l5 - l6;
        ArrayList arrayList = my_0.a(new String[]{StringInvoker.a(wt_1.B, new Object[]{SystemInvoker.c(wt_1.a), P8.d(MCInvoker.J(this.f) ? 64 : 32)}), StringInvoker.a(wt_1.F, new Object[]{lx_2.b(l7 * 100L / l4), lx_2.b(QY.a(l7)), lx_2.b(QY.a(l4))}), StringInvoker.a(wt_1.z, new Object[]{lx_2.b(l5 * 100L / l4), lx_2.b(QY.a(l5))}), wt_1.n, StringInvoker.a(wt_1.f, new Object[]{OpenGlHelper.h()}), wt_1.E, StringInvoker.a(wt_1.w, new Object[]{P8.d(DisplayInvoker.getWidth()), P8.d(DisplayInvoker.getHeight()), GL11.glGetString((int)7936)}), GL11.glGetString((int)7937), GL11.glGetString((int)7938)});
        if (ayy_0.d(ail_0.b8)) {
            object = aDb.f(ail_0.bC, new Object[0]);
            akr_1.a(arrayList, wt_1.l);
            akr_1.a(arrayList, (Collection)aDb.f(object, ail_0.b8, new Object[]{Boolean.FALSE}));
        }
        if (!this.e() && this.f.objectMouseOver != null && this.f.objectMouseOver.typeOfHit == I.BLOCK && ObjectMouseOverInvoker.getBlockPos(this.f.objectMouseOver) != null) {
            object = ObjectMouseOverInvoker.getBlockPos(this.f.objectMouseOver);
            IBlockState iBlockState = BlockInvoker.getMaterial(this.f.world, (BlockPos)object);
            if (BlockInvoker.n(this.f.world) != WorldType.l) {
                iBlockState = BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), iBlockState, (IBlockAccess)this.f.world, (BlockPos)object);
            }
            akr_1.a(arrayList, wt_1.I);
            akr_1.a(arrayList, StringInvoker.a(a82.b(Block.m, BlockStateInvoker.getBlock(iBlockState))));
            UnmodifiableIterator unmodifiableIterator = MV.a(da_1.b(BlockStateInvoker.b(iBlockState)));
            while (dz_0.c((Iterator)unmodifiableIterator)) {
                Map.Entry entry = (Map.Entry)dz_0.b((Iterator)unmodifiableIterator);
                String string = FG.a(entry).toString();
                if (FG.a(entry) == Boolean.TRUE) {
                    string = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), string).toString();
                } else if (FG.a(entry) == Boolean.FALSE) {
                    string = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), string).toString();
                }
                akr_1.a(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), aPS.a((a4_0)FG.b(entry))), wt_1.c), string).toString());
            }
        }
        return arrayList;
    }

    protected List a() {
        Object object;
        BlockPos blockPos = new BlockPos(MCInvoker.v((Minecraft)this.f).posX, ayj_0.u((Entity)MCInvoker.v((Minecraft)this.f)).a, MCInvoker.v((Minecraft)this.f).posZ);
        if (this.e()) {
            return my_0.a(new String[]{aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), wt_1.e), MCInvoker.C(this.f)), wt_1.s), pm_1.a()), wt_1.o).toString(), this.f.debug, jv_0.i(this.f.renderGlobal), jv_0.h(this.f.renderGlobal), aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), wt_1.h), ayx_2.b(this.f.effectRenderer)), wt_1.y), BlockInvoker.v(this.f.world)).toString(), BlockInvoker.k(this.f.world), wt_1.g, StringInvoker.a(wt_1.q, new Object[]{P8.d(amv_2.j(blockPos) & 0xF), P8.d(amv_2.h(blockPos) & 0xF), P8.d(amv_2.i(blockPos) & 0xF)})});
        }
        Entity entity = MCInvoker.v(this.f);
        EnumFacing enumFacing = ayj_0.I(entity);
        String string = wt_1.r;
        switch (ao9_0.a[enumFacing.ordinal()]) {
            case 1: {
                string = wt_1.G;
                break;
            }
            case 2: {
                string = wt_1.L;
                break;
            }
            case 3: {
                string = wt_1.b;
                break;
            }
            case 4: {
                string = wt_1.J;
            }
        }
        ArrayList arrayList = my_0.a(new String[]{aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), wt_1.A), MCInvoker.C(this.f)), wt_1.d), pm_1.a()), wt_1.m).toString(), this.f.debug, jv_0.i(this.f.renderGlobal), jv_0.h(this.f.renderGlobal), aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), wt_1.v), ayx_2.b(this.f.effectRenderer)), wt_1.Q), BlockInvoker.v(this.f.world)).toString(), BlockInvoker.k(this.f.world), wt_1.i, StringInvoker.a(wt_1.p, new Object[]{db_0.a(MCInvoker.v((Minecraft)this.f).posX), db_0.a(MCInvoker.v((Minecraft)this.f).posY), db_0.a(MCInvoker.v((Minecraft)this.f).posZ)}), StringInvoker.a(wt_1.x, new Object[]{P8.d(amv_2.j(blockPos)), P8.d(amv_2.h(blockPos)), P8.d(amv_2.i(blockPos))}), StringInvoker.a(wt_1.R, new Object[]{P8.d(amv_2.j(blockPos) & 0xF), P8.d(amv_2.h(blockPos) & 0xF), P8.d(amv_2.i(blockPos) & 0xF), P8.d(amv_2.j(blockPos) >> 4), P8.d(amv_2.h(blockPos) >> 4), P8.d(amv_2.i(blockPos) >> 4)}), StringInvoker.a(wt_1.N, new Object[]{enumFacing, string, axx_1.a(MathHelper.a(entity.rotationYaw)), axx_1.a(MathHelper.a(entity.rotationPitch))})});
        if (this.f.world != null && BlockInvoker.g(this.f.world, blockPos)) {
            object = BlockInvoker.b(this.f.world, blockPos);
            akr_1.a(arrayList, aL0.a(aL0.a(new StringBuilder(), wt_1.O), aqp_2.a((Chunk)object, (BlockPos)blockPos, (ct_2)BlockInvoker.a((WorldClient)this.f.world)).Y).toString());
            akr_1.a(arrayList, aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), wt_1.H), aqp_2.a((Chunk)object, blockPos, 0)), wt_1.u), aqp_2.a((Chunk)object, YG.SKY, blockPos)), wt_1.D), aqp_2.a((Chunk)object, YG.BLOCK, blockPos)), wt_1.M).toString());
            ach_0 ach_02 = BlockInvoker.f(this.f.world, blockPos);
            if (MCInvoker.B(this.f) && MCInvoker.q(this.f) != null) {
                EntityPlayerMP entityPlayerMP = aek_1.a(IntegratedServerInvoker.a(MCInvoker.q(this.f)), PlayerInvoker.D(this.f.player));
                ach_02 = aV8.b(entityPlayerMP.worldObj, new BlockPos(entityPlayerMP));
            }
            akr_1.a(arrayList, StringInvoker.a(wt_1.k, new Object[]{axx_1.a(v8_0.a(ach_02)), lx_2.b(BlockInvoker.f(this.f.world) / 24000L)}));
        }
        if (this.f.entityRenderer != null && EntityRendererInvoker.f(this.f.entityRenderer)) {
            akr_1.a(arrayList, aL0.a(aL0.a(new StringBuilder(), wt_1.t), ada_2.b(EntityRendererInvoker.e(this.f.entityRenderer))).toString());
        }
        if (this.f.objectMouseOver != null && this.f.objectMouseOver.typeOfHit == I.BLOCK && ObjectMouseOverInvoker.getBlockPos(this.f.objectMouseOver) != null) {
            object = ObjectMouseOverInvoker.getBlockPos(this.f.objectMouseOver);
            akr_1.a(arrayList, StringInvoker.a(wt_1.K, new Object[]{P8.d(amv_2.j((BlockPos)object)), P8.d(amv_2.h((BlockPos)object)), P8.d(amv_2.i((BlockPos)object))}));
        }
        return arrayList;
    }
}

