/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

abstract class ZA
extends Y_ {
    protected aB6 d = aB6.OPENING;

    protected static boolean a(HF hF) {
        return hF.c > 10;
    }

    protected aB6 a(Random random) {
        int n = a5_0.a(random, 5);
        switch (n) {
            default: {
                return aB6.OPENING;
            }
            case 2: {
                return aB6.WOOD_DOOR;
            }
            case 3: {
                return aB6.GRATES;
            }
            case 4: 
        }
        return aB6.IRON_DOOR;
    }

    public ZA() {
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, awb_2.b, this.d.name());
    }

    protected Y_ b(ze_0 ze_02, List<Y_> list, Random random, int n, int n2) {
        if (this.c != null) {
            switch (this.c) {
                case NORTH: {
                    return aPZ.c(ze_02, list, random, this.b.f - 1, this.b.c + n, this.b.b + n2, EnumFacing.WEST, this.a());
                }
                case SOUTH: {
                    return aPZ.c(ze_02, list, random, this.b.f - 1, this.b.c + n, this.b.b + n2, EnumFacing.WEST, this.a());
                }
                case WEST: {
                    return aPZ.c(ze_02, list, random, this.b.f + n2, this.b.c + n, this.b.b - 1, EnumFacing.NORTH, this.a());
                }
                case EAST: {
                    return aPZ.c(ze_02, list, random, this.b.f + n2, this.b.c + n, this.b.b - 1, EnumFacing.NORTH, this.a());
                }
            }
        }
        return null;
    }

    protected Y_ c(ze_0 ze_02, List<Y_> list, Random random, int n, int n2) {
        if (this.c != null) {
            switch (this.c) {
                case NORTH: {
                    return aPZ.c(ze_02, list, random, this.b.f + n, this.b.c + n2, this.b.b - 1, this.c, this.a());
                }
                case SOUTH: {
                    return aPZ.c(ze_02, list, random, this.b.f + n, this.b.c + n2, this.b.e + 1, this.c, this.a());
                }
                case WEST: {
                    return aPZ.c(ze_02, list, random, this.b.f - 1, this.b.c + n2, this.b.b + n, this.c, this.a());
                }
                case EAST: {
                    return aPZ.c(ze_02, list, random, this.b.d + 1, this.b.c + n2, this.b.b + n, this.c, this.a());
                }
            }
        }
        return null;
    }

    protected ZA(int n) {
        super(n);
    }

    protected void a(World world, Random random, HF hF, aB6 aB62, int n, int n2, int n3) {
        switch (aB62) {
            default: {
                this.a(world, hF, n, n2, n3, n + 3 - 1, n2 + 3 - 1, n3, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
                break;
            }
            case WOOD_DOOR: {
                this.b(world, BlocksInvoker.t(Blocks.z), n, n2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n, n2 + 1, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n, n2 + 2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n + 1, n2 + 2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n + 2, n2 + 2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n + 2, n2 + 1, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n + 2, n2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.bh), n + 1, n2, n3, hF);
                this.b(world, BlocksInvoker.a(Blocks.bh, 8), n + 1, n2 + 1, n3, hF);
                break;
            }
            case GRATES: {
                this.b(world, BlocksInvoker.t(Blocks.air), n + 1, n2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.air), n + 1, n2 + 1, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.by), n, n2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.by), n, n2 + 1, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.by), n, n2 + 2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.by), n + 1, n2 + 2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.by), n + 2, n2 + 2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.by), n + 2, n2 + 1, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.by), n + 2, n2, n3, hF);
                break;
            }
            case IRON_DOOR: {
                this.b(world, BlocksInvoker.t(Blocks.z), n, n2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n, n2 + 1, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n, n2 + 2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n + 1, n2 + 2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n + 2, n2 + 2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n + 2, n2 + 1, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), n + 2, n2, n3, hF);
                this.b(world, BlocksInvoker.t(Blocks.bb), n + 1, n2, n3, hF);
                this.b(world, BlocksInvoker.a(Blocks.bb, 8), n + 1, n2 + 1, n3, hF);
                this.b(world, BlocksInvoker.a(Blocks.bF, this.a(Blocks.bF, 4)), n + 2, n2 + 1, n3 + 1, hF);
                this.b(world, BlocksInvoker.a(Blocks.bF, this.a(Blocks.bF, 3)), n + 2, n2 + 1, n3 - 1, hF);
            }
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        this.d = O1.a(tn_0.m(nBTTagCompound, awb_2.a));
    }

    protected Y_ a(ze_0 ze_02, List<Y_> list, Random random, int n, int n2) {
        if (this.c != null) {
            switch (this.c) {
                case NORTH: {
                    return aPZ.c(ze_02, list, random, this.b.d + 1, this.b.c + n, this.b.b + n2, EnumFacing.EAST, this.a());
                }
                case SOUTH: {
                    return aPZ.c(ze_02, list, random, this.b.d + 1, this.b.c + n, this.b.b + n2, EnumFacing.EAST, this.a());
                }
                case WEST: {
                    return aPZ.c(ze_02, list, random, this.b.f + n2, this.b.c + n, this.b.e + 1, EnumFacing.SOUTH, this.a());
                }
                case EAST: {
                    return aPZ.c(ze_02, list, random, this.b.f + n2, this.b.c + n, this.b.e + 1, EnumFacing.SOUTH, this.a());
                }
            }
        }
        return null;
    }
}

