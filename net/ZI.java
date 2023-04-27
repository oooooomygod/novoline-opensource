/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.TileEntity;
import java.util.List;
import java.util.Random;

public class ZI
extends YJ {
    private boolean e;

    public ZI(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, aVA.b, this.e);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.e = tn_0.c(nBTTagCompound, aVA.a);
    }

    public ZI() {
    }

    public static ZI a(List<Y_> list, Random random, int n, int n2, int n3, int n4, EnumFacing enumFacing) {
        HF hF = aqu_2.a(n, n2, n3, -2, 0, 0, 7, 8, 9, enumFacing);
        return ZI.a(hF) && Y_.a(list, hF) == null ? new ZI(n4, random, hF, enumFacing) : null;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        BlockPos blockPos;
        this.a(world, hF, 0, 2, 0, 6, 7, 7, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 1, 0, 0, 5, 1, 7, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 2, 1, 5, 2, 7, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 3, 2, 5, 3, 7, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 4, 3, 5, 4, 7, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 2, 0, 1, 4, 2, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 5, 2, 0, 5, 4, 2, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 5, 2, 1, 5, 3, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 5, 5, 2, 5, 5, 3, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 5, 3, 0, 5, 8, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 6, 5, 3, 6, 5, 8, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 5, 8, 5, 5, 8, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.b(world, BlocksInvoker.t(Blocks.a6), 1, 6, 3, hF);
        this.b(world, BlocksInvoker.t(Blocks.a6), 5, 6, 3, hF);
        this.a(world, hF, 0, 6, 3, 0, 6, 8, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 6, 6, 3, 6, 6, 8, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 1, 6, 8, 5, 7, 8, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 2, 8, 8, 4, 8, 8, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        if (!this.e && aqu_2.a(hF, blockPos = new BlockPos(this.b(3, 5), this.a(5), this.a(3, 5)))) {
            this.e = true;
            aV8.a(world, blockPos, BlocksInvoker.t(Blocks.p), 2);
            TileEntity tileEntity = aV8.z(world, blockPos);
            if (tileEntity instanceof a6f_0) {
                apq_1.a(kk_1.a((a6f_0)tileEntity), aVA.c);
            }
        }
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(world, BlocksInvoker.t(Blocks.ak), n, -1, n2, hF);
            ++n2;
        }
    }
}

