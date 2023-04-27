/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.TileEntity;
import java.util.List;
import java.util.Random;

public class YK
extends Y_ {
    private boolean d;
    private boolean g;
    private boolean f;
    private int e;

    @Override
    protected boolean a(World world, HF hF, Random random, int n, int n2, int n3, List<C6> list, int n4) {
        BlockPos blockPos = new BlockPos(this.b(n, n3), this.a(n2), this.a(n, n3));
        if (aqu_2.a(hF, blockPos) && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))) == Material.air) {
            int n5 = a5_0.a(random) ? 1 : 0;
            aV8.a(world, blockPos, BlocksInvoker.a(Blocks.bQ, this.a(Blocks.bQ, n5)), 2);
            o2_0 o2_02 = new o2_0(world, (float)amv_2.j(blockPos) + 0.5f, (float)amv_2.h(blockPos) + 0.5f, (float)amv_2.i(blockPos) + 0.5f);
            aiq_2.a(random, list, o2_02, n4);
            aV8.b(world, o2_02);
            return true;
        }
        return false;
    }

    public static HF a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing) {
        HF hF = new HF(n, n2, n3, n, n2 + 2, n3);
        int n4 = a5_0.a(random, 3) + 2;
        while (true) {
            int n5 = n4 * 5;
            switch (aRI.a[enumFacing.ordinal()]) {
                case 1: {
                    hF.d = n + 2;
                    hF.b = n3 - (n5 - 1);
                    break;
                }
                case 2: {
                    hF.d = n + 2;
                    hF.e = n3 + n5 - 1;
                    break;
                }
                case 3: {
                    hF.f = n - (n5 - 1);
                    hF.e = n3 + 2;
                    break;
                }
                case 4: {
                    hF.d = n + n5 - 1;
                    hF.e = n3 + 2;
                }
            }
            if (Y_.a(list, hF) == null) {
                return hF;
            }
            --n4;
        }
    }

    public YK() {
    }

    public YK(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
        this.g = a5_0.a(random, 3) == 0;
        this.f = !this.g && a5_0.a(random, 23) == 0;
        this.e = this.c != EnumFacing.NORTH && this.c != EnumFacing.SOUTH ? aqu_2.e(hF) / 5 : aqu_2.d(hF) / 5;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, aQN.i, this.g);
        tn_0.a(nBTTagCompound, aQN.h, this.f);
        tn_0.a(nBTTagCompound, aQN.d, this.d);
        tn_0.b(nBTTagCompound, aQN.g, this.e);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.a(world, hF)) {
            return false;
        }
        int n5 = this.e * 5 - 1;
        this.a(world, hF, 0, 0, 0, 2, 1, n5, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, random, 0.8f, 0, 2, 0, 2, 2, n5, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        if (this.f) {
            this.a(world, hF, random, 0.6f, 0, 0, 0, 2, 1, n5, BlocksInvoker.t(Blocks.bI), BlocksInvoker.t(Blocks.air), false);
        }
        for (n4 = 0; n4 < this.e; ++n4) {
            n3 = 2 + n4 * 5;
            this.a(world, hF, 0, 0, n3, 0, 1, n3, BlocksInvoker.t(Blocks.Z), BlocksInvoker.t(Blocks.air), false);
            this.a(world, hF, 2, 0, n3, 2, 1, n3, BlocksInvoker.t(Blocks.Z), BlocksInvoker.t(Blocks.air), false);
            if (a5_0.a(random, 4) == 0) {
                this.a(world, hF, 0, 2, n3, 0, 2, n3, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.air), false);
                this.a(world, hF, 2, 2, n3, 2, 2, n3, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.air), false);
            } else {
                this.a(world, hF, 0, 2, n3, 2, 2, n3, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.air), false);
            }
            this.a(world, hF, random, 0.1f, 0, 2, n3 - 1, BlocksInvoker.t(Blocks.bI));
            this.a(world, hF, random, 0.1f, 2, 2, n3 - 1, BlocksInvoker.t(Blocks.bI));
            this.a(world, hF, random, 0.1f, 0, 2, n3 + 1, BlocksInvoker.t(Blocks.bI));
            this.a(world, hF, random, 0.1f, 2, 2, n3 + 1, BlocksInvoker.t(Blocks.bI));
            this.a(world, hF, random, 0.05f, 0, 2, n3 - 2, BlocksInvoker.t(Blocks.bI));
            this.a(world, hF, random, 0.05f, 2, 2, n3 - 2, BlocksInvoker.t(Blocks.bI));
            this.a(world, hF, random, 0.05f, 0, 2, n3 + 2, BlocksInvoker.t(Blocks.bI));
            this.a(world, hF, random, 0.05f, 2, 2, n3 + 2, BlocksInvoker.t(Blocks.bI));
            this.a(world, hF, random, 0.05f, 1, 2, n3 - 1, BlocksInvoker.a(Blocks.bD, SJ.i(EnumFacing.UP)));
            this.a(world, hF, random, 0.05f, 1, 2, n3 + 1, BlocksInvoker.a(Blocks.bD, SJ.i(EnumFacing.UP)));
            if (a5_0.a(random, 100) == 0) {
                this.a(world, hF, random, 2, 0, n3 - 1, aiq_2.a(acq_0.a(), new C6[]{arw_2.a(Items.enchanted_book, random)}), 3 + a5_0.a(random, 4));
            }
            if (a5_0.a(random, 100) == 0) {
                this.a(world, hF, random, 0, 0, n3 + 1, aiq_2.a(acq_0.a(), new C6[]{arw_2.a(Items.enchanted_book, random)}), 3 + a5_0.a(random, 4));
            }
            if (!this.f || this.d) continue;
            n2 = this.a(0);
            int n6 = n3 - 1 + a5_0.a(random, 3);
            n = this.b(1, n6);
            BlockPos blockPos = new BlockPos(n, n2, n6 = this.a(1, n6));
            if (!aqu_2.a(hF, blockPos)) continue;
            this.d = true;
            aV8.a(world, blockPos, BlocksInvoker.t(Blocks.p), 2);
            TileEntity tileEntity = aV8.z(world, blockPos);
            if (!(tileEntity instanceof a6f_0)) continue;
            apq_1.a(kk_1.a((a6f_0)tileEntity), aQN.b);
        }
        n4 = 0;
        while (true) {
            for (n3 = 0; n3 <= n5; ++n3) {
                n2 = -1;
                IBlockState iBlockState = this.b(world, n4, n2, n3, hF);
                if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)) != Material.air) continue;
                n = -1;
                this.b(world, BlocksInvoker.t(Blocks.planks), n4, n, n3, hF);
            }
            ++n4;
        }
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        block19: {
            int n = this.a();
            int n2 = a5_0.a(random, 4);
            if (this.c != null) {
                switch (aRI.a[this.c.ordinal()]) {
                    case 1: {
                        if (n2 <= 1) {
                            acq_0.a(y_, list, random, this.b.f, this.b.c - 1 + a5_0.a(random, 3), this.b.b - 1, this.c, n);
                            break;
                        }
                        if (n2 == 2) {
                            acq_0.a(y_, list, random, this.b.f - 1, this.b.c - 1 + a5_0.a(random, 3), this.b.b, EnumFacing.WEST, n);
                            break;
                        }
                        acq_0.a(y_, list, random, this.b.d + 1, this.b.c - 1 + a5_0.a(random, 3), this.b.b, EnumFacing.EAST, n);
                        break;
                    }
                    case 2: {
                        if (n2 <= 1) {
                            acq_0.a(y_, list, random, this.b.f, this.b.c - 1 + a5_0.a(random, 3), this.b.e + 1, this.c, n);
                            break;
                        }
                        if (n2 == 2) {
                            acq_0.a(y_, list, random, this.b.f - 1, this.b.c - 1 + a5_0.a(random, 3), this.b.e - 3, EnumFacing.WEST, n);
                            break;
                        }
                        acq_0.a(y_, list, random, this.b.d + 1, this.b.c - 1 + a5_0.a(random, 3), this.b.e - 3, EnumFacing.EAST, n);
                        break;
                    }
                    case 3: {
                        if (n2 <= 1) {
                            acq_0.a(y_, list, random, this.b.f - 1, this.b.c - 1 + a5_0.a(random, 3), this.b.b, this.c, n);
                            break;
                        }
                        if (n2 == 2) {
                            acq_0.a(y_, list, random, this.b.f, this.b.c - 1 + a5_0.a(random, 3), this.b.b - 1, EnumFacing.NORTH, n);
                            break;
                        }
                        acq_0.a(y_, list, random, this.b.f, this.b.c - 1 + a5_0.a(random, 3), this.b.e + 1, EnumFacing.SOUTH, n);
                        break;
                    }
                    case 4: {
                        if (n2 <= 1) {
                            acq_0.a(y_, list, random, this.b.d + 1, this.b.c - 1 + a5_0.a(random, 3), this.b.b, this.c, n);
                            break;
                        }
                        if (n2 == 2) {
                            acq_0.a(y_, list, random, this.b.d - 3, this.b.c - 1 + a5_0.a(random, 3), this.b.b - 1, EnumFacing.NORTH, n);
                            break;
                        }
                        acq_0.a(y_, list, random, this.b.d - 3, this.b.c - 1 + a5_0.a(random, 3), this.b.e + 1, EnumFacing.SOUTH, n);
                    }
                }
            }
            if (n >= 8) break block19;
            if (this.c != EnumFacing.NORTH && this.c != EnumFacing.SOUTH) {
                int n3 = this.b.f + 3;
                while (n3 + 3 <= this.b.d) {
                    a5_0.a(random, 5);
                    acq_0.a(y_, list, random, n3, this.b.c, this.b.b - 1, EnumFacing.NORTH, n + 1);
                    n3 += 5;
                }
            } else {
                int n4 = this.b.b + 3;
                while (n4 + 3 <= this.b.e) {
                    a5_0.a(random, 5);
                    acq_0.a(y_, list, random, this.b.f - 1, this.b.c, n4, EnumFacing.WEST, n + 1);
                    n4 += 5;
                }
            }
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        this.g = tn_0.c(nBTTagCompound, aQN.f);
        this.f = tn_0.c(nBTTagCompound, aQN.c);
        this.d = tn_0.c(nBTTagCompound, aQN.e);
        this.e = tn_0.g(nBTTagCompound, aQN.a);
    }
}

