/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.Zq
 */
public class zq_0
extends ZA {
    private boolean e;

    public static zq_0 a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, -7, 0, 5, 11, 5, enumFacing);
        return zq_0.a(hF) && Y_.a(list, hF) == null ? new zq_0(n4, random, hF, enumFacing) : null;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        this.a(world, hF, 0, 0, 0, 4, 10, 4, true, random, aPZ.c());
        this.a(world, random, hF, this.d, 1, 7, 0);
        this.a(world, random, hF, aB6.OPENING, 1, 1, 4);
        this.b(world, BlocksInvoker.t(Blocks.z), 2, 6, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.z), 1, 5, 1, hF);
        this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.STONE)), 1, 6, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.z), 1, 5, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.z), 1, 4, 3, hF);
        this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.STONE)), 1, 5, 3, hF);
        this.b(world, BlocksInvoker.t(Blocks.z), 2, 4, 3, hF);
        this.b(world, BlocksInvoker.t(Blocks.z), 3, 3, 3, hF);
        this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.STONE)), 3, 4, 3, hF);
        this.b(world, BlocksInvoker.t(Blocks.z), 3, 3, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.z), 3, 2, 1, hF);
        this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.STONE)), 3, 3, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.z), 2, 2, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.z), 1, 1, 1, hF);
        this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.STONE)), 1, 2, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.z), 1, 1, 2, hF);
        this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.STONE)), 1, 1, 3, hF);
        return true;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, aRL.b, this.e);
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        if (this.e) {
            aPZ.a(ZE.class);
        }
        this.c((ze_0)y_, list, random, 1, 1);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.e = tn_0.c(nBTTagCompound, aRL.a);
    }

    public zq_0() {
    }

    public zq_0(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.e = false;
        this.c = enumFacing;
        this.d = this.a(random);
        this.b = hF;
    }

    public zq_0(int n, Random random, int n2, int n3) {
        super(n);
        this.e = true;
        this.c = abw_2.a(cs_1.HORIZONTAL, random);
        this.d = aB6.OPENING;
        switch (this.c) {
            case SOUTH: 
            case NORTH: {
                this.b = new HF(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
                break;
            }
            default: {
                this.b = new HF(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
            }
        }
    }
}

