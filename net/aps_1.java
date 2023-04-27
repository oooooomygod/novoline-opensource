/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.IBlockAccess;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.apS
 */
public class aps_1
extends ap8_0 {
    private boolean i;
    private boolean j;
    private boolean h;
    private boolean g;
    private boolean f;

    private int a(Entity entity, int n, int n2, int n3) {
        return aps_1.a(this.d, entity, n, n2, n3, this.b, this.c, this.a, this.f, this.j, this.h);
    }

    public void b(boolean bl) {
        this.g = bl;
    }

    @Override
    public aQP a(Entity entity) {
        int n;
        if (this.g && ayj_0.q(entity)) {
            n = (int)ayj_0.u((Entity)entity).a;
            z6_0 z6_02 = new z6_0(MathHelper.floor_double(entity.posX), n, MathHelper.floor_double(entity.posZ));
            Block block = BlockStateInvoker.getBlock(aG3.c(this.d, z6_02));
            while (block == Blocks.flowing_water || block == Blocks.water) {
                ain_1.a(z6_02, MathHelper.floor_double(entity.posX), ++n, MathHelper.floor_double(entity.posZ));
                block = BlockStateInvoker.getBlock(aG3.c(this.d, z6_02));
            }
            this.f = false;
        } else {
            n = MathHelper.floor_double(ayj_0.u((Entity)entity).a + 0.5);
        }
        return this.a(MathHelper.floor_double(ayj_0.u((Entity)entity).e), n, MathHelper.floor_double(ayj_0.u((Entity)entity).f));
    }

    public boolean b() {
        return this.f;
    }

    private aQP a(Entity entity, int n, int n2, int n3, int n4) {
        aQP aQP2 = null;
        int n5 = this.a(entity, n, n2, n3);
        if (n5 == 2) {
            return this.a(n, n2, n3);
        }
        if (n5 == 1) {
            aQP2 = this.a(n, n2, n3);
        }
        if (n5 != -3 && n5 != -4 && this.a(entity, n, n2 + n4, n3) == 1) {
            aQP2 = this.a(n, n2 + n4, n3);
            n2 += n4;
        }
        int n6 = 0;
        int n7 = 0;
        n7 = this.a(entity, n, n2 - 1, n3);
        if (this.f && n7 == -1) {
            return null;
        }
        if (n7 != 1) {
            if (n7 == -2) {
                return null;
            }
        } else {
            if (n6++ >= ayj_0.d(entity)) {
                return null;
            }
            --n2;
            return null;
        }
        return aQP2;
    }

    @Override
    public void a() {
        super.a();
        this.f = this.i;
    }

    public static int a(IBlockAccess iBlockAccess, Entity entity, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2, boolean bl3) {
        BlockPos blockPos = new BlockPos(entity);
        z6_0 z6_02 = new z6_0();
        for (int i = n; i < n + n4; ++i) {
            for (int j = n2; j < n2 + n5; ++j) {
                for (int k = n3; k < n3 + n6; ++k) {
                    ain_1.a(z6_02, i, j, k);
                    Block block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, z6_02));
                    if (BlocksInvoker.getBlockState(block) == Material.air) continue;
                    if (block != Blocks.ac && block != Blocks.bt) {
                        if (block != Blocks.flowing_water && block != Blocks.water) {
                            if (block instanceof g7_0 && BlocksInvoker.getBlockState(block) == Material.wood) {
                                return 0;
                            }
                        } else {
                            return -1;
                        }
                    }
                    if (BlockStateInvoker.getBlock(aV8.q(entity.worldObj, z6_02)) instanceof g9_0) {
                        if (BlockStateInvoker.getBlock(aV8.q(entity.worldObj, blockPos)) instanceof g9_0 || BlockStateInvoker.getBlock(aV8.q(entity.worldObj, amv_2.g(blockPos))) instanceof g9_0) continue;
                        return -3;
                    }
                    if (BlocksInvoker.b(block, iBlockAccess, (BlockPos)z6_02) || block instanceof g7_0 && BlocksInvoker.getBlockState(block) == Material.wood) continue;
                    if (block instanceof g2_0 || block instanceof gv_2 || block instanceof hr_0) {
                        return -3;
                    }
                    if (block == Blocks.ac || block == Blocks.bt) {
                        return -4;
                    }
                    Material material = BlocksInvoker.getBlockState(block);
                    if (material != Material.e) {
                        return 0;
                    }
                    if (ayj_0.J(entity)) continue;
                    return -2;
                }
            }
        }
        return 2;
    }

    @Override
    public aQP a(Entity entity, double d, double d2, double d3) {
        return this.a(MathHelper.floor_double(d - (double)(entity.width / 2.0f)), MathHelper.floor_double(d2), MathHelper.floor_double(d3 - (double)(entity.width / 2.0f)));
    }

    @Override
    public int a(aQP[] aQPArray, Entity entity, aQP aQP2, aQP aQP3, float f) {
        int n = 0;
        int n2 = 0;
        if (this.a(entity, aQP2.c, aQP2.d + 1, aQP2.j) == 1) {
            n2 = 1;
        }
        aQP aQP4 = this.a(entity, aQP2.c, aQP2.d, aQP2.j + 1, n2);
        aQP aQP5 = this.a(entity, aQP2.c - 1, aQP2.d, aQP2.j, n2);
        aQP aQP6 = this.a(entity, aQP2.c + 1, aQP2.d, aQP2.j, n2);
        aQP aQP7 = this.a(entity, aQP2.c, aQP2.d, aQP2.j - 1, n2);
        if (!aQP4.a && axw_0.b(aQP4, aQP3) < f) {
            aQPArray[n++] = aQP4;
        }
        if (!aQP5.a && axw_0.b(aQP5, aQP3) < f) {
            aQPArray[n++] = aQP5;
        }
        if (!aQP6.a && axw_0.b(aQP6, aQP3) < f) {
            aQPArray[n++] = aQP6;
        }
        if (!aQP7.a && axw_0.b(aQP7, aQP3) < f) {
            aQPArray[n++] = aQP7;
        }
        return n;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, Entity entity) {
        super.a(iBlockAccess, entity);
        this.i = this.f;
    }

    public boolean a() {
        return this.g;
    }

    public void c(boolean bl) {
        this.h = bl;
    }

    public void d(boolean bl) {
        this.f = bl;
    }

    public boolean c() {
        return this.h;
    }
}

