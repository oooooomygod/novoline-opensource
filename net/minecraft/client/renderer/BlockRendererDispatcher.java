/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.IBlockState;
import net.IResourceManagerReloadListener;
import net.J8;
import net.JE;
import net.KM;
import net.MU;
import net.MathHelper;
import net.WorldType;
import net.X6;
import net.a5w_0;
import net.aC8;
import net.aDb;
import net.aG3;
import net.aHT;
import net.aI_;
import net.aYS;
import net.aav_0;
import net.aie_1;
import net.ail_0;
import net.ap__0;
import net.atF;
import net.ka_1;
import net.mq_1;
import net.mv_0;
import net.os_2;
import net.xq_2;
import net.ys_2;

public class BlockRendererDispatcher
implements IResourceManagerReloadListener {
    private static String d = "CL_00002520";
    private MU a;
    private aHT c;
    private atF e;
    private GameSettings f;
    private X6 b = new X6();

    @Override
    public void b(aI_ aI_2) {
        this.a.a();
    }

    /*
     * Unable to fully structure code
     */
    public boolean a(IBlockState var1_1, BlockPos var2_2, IBlockAccess var3_3, WorldRenderer var4_4) {
        block14: {
            try {
                var5_5 = BlocksInvoker.y(BlockStateInvoker.getBlock(var1_1));
                if (var5_5 != -1) break block14;
                return false;
            }
            catch (Throwable var5_6) {
                var6_8 = CrashInvoker.makeCrashReport(var5_6, J8.a);
                var7_9 = CrashInvoker.a(var6_8, J8.b);
                CrashReportCategoryInvoker.a((CrashReportCategory)var7_9, var2_2, BlockStateInvoker.getBlock(var1_1), BlocksInvoker.c(BlockStateInvoker.getBlock(var1_1), var1_1));
                throw new ReportedException(var6_8);
            }
        }
        switch (var5_5) {
            case 1: {
                if (!ys_2.aC()) ** GOTO lbl18
                aav_0.a(var1_1, var2_2, var3_3, var4_4);
lbl18:
                // 3 sources

                var6_7 = mv_0.a(this.a, var3_3, var1_1, var2_2, var4_4);
                if (ys_2.aC()) {
                    aav_0.d(var4_4);
                }
                return var6_7;
            }
            case 2: {
                return false;
            }
            case 3: {
                var7_9 = this.a(var1_1, var3_3, var2_2);
                if (!ys_2.aC()) ** GOTO lbl30
                aav_0.a(var1_1, var2_2, var3_3, var4_4);
lbl30:
                // 3 sources

                var8_10 = mq_1.a(this.b, var3_3, (JE)var7_9, var1_1, var2_2, var4_4);
                if (ys_2.aC()) {
                    aav_0.d(var4_4);
                }
                return var8_10;
            }
        }
        return false;
    }

    public BlockRendererDispatcher(atF atF2, GameSettings gameSettings) {
        this.c = new aHT();
        this.a = new MU();
        this.e = atF2;
        this.f = gameSettings;
    }

    public void a(IBlockState iBlockState, BlockPos blockPos, KM kM, IBlockAccess iBlockAccess) {
        Block block = BlockStateInvoker.getBlock(iBlockState);
        int n = BlocksInvoker.y(block);
        if (n == 3) {
            JE jE = ap__0.b(this.e, iBlockState = BlocksInvoker.a(block, iBlockState, iBlockAccess, blockPos));
            if (aC8.a(ail_0.am, jE)) {
                IBlockState iBlockState2 = (IBlockState)aDb.f(block, ail_0.cB, new Object[]{iBlockState, iBlockAccess, blockPos});
                for (a5w_0 a5w_02 : a5w_0.values()) {
                    if (!aDb.e(block, ail_0.a0, new Object[]{a5w_02})) continue;
                    aDb.c(ail_0.b0, new Object[]{a5w_02});
                    JE jE2 = (JE)aDb.f(jE, ail_0.q, new Object[]{iBlockState2});
                    JE jE3 = aie_1.a(new os_2(jE2, kM));
                    mq_1.a(this.b, iBlockAccess, jE3, iBlockState, blockPos, TessellatorInvoker.getWorldRenderer(TessellatorInvoker.getInstance()));
                }
                return;
            }
            JE jE4 = aie_1.a(new os_2(jE, kM));
            mq_1.a(this.b, iBlockAccess, jE4, iBlockState, blockPos, TessellatorInvoker.getWorldRenderer(TessellatorInvoker.getInstance()));
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private JE a(IBlockState iBlockState, BlockPos blockPos) {
        JE jE = ap__0.b(this.e, iBlockState);
        if (this.f.aV && jE instanceof xq_2) {
            jE = ka_1.a((xq_2)jE, MathHelper.a(blockPos));
        }
        return jE;
    }

    public boolean a(Block block, int n) {
        return false;
    }

    public X6 b() {
        return this.b;
    }

    public void a(IBlockState iBlockState, float f) {
        int n = BlocksInvoker.y(BlockStateInvoker.getBlock(iBlockState));
        if (n != -1) {
            switch (n) {
                default: {
                    break;
                }
                case 2: {
                    aYS.a(this.c, BlockStateInvoker.getBlock(iBlockState), f);
                    break;
                }
                case 3: {
                    JE jE = this.a(iBlockState, null);
                    mq_1.a(this.b, jE, iBlockState, f, true);
                }
            }
        }
    }

    public JE a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (aG3.a(iBlockAccess) != WorldType.l) {
            try {
                iBlockState = BlocksInvoker.a(block, iBlockState, iBlockAccess, blockPos);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        JE jE = ap__0.b(this.e, iBlockState);
        if (this.f.aV && jE instanceof xq_2) {
            jE = ka_1.a((xq_2)jE, MathHelper.a(blockPos));
        }
        if (aC8.a(ail_0.am, jE)) {
            IBlockState iBlockState2 = (IBlockState)aDb.f(block, ail_0.cB, new Object[]{iBlockState, iBlockAccess, blockPos});
            jE = (JE)aDb.f(jE, ail_0.q, new Object[]{iBlockState2});
        }
        return jE;
    }

    public atF a() {
        return this.e;
    }
}

