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
 * Renamed from net.Zz
 */
public class zz_0
extends ZA {
    public static zz_0 a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, -7, 0, 5, 11, 8, enumFacing);
        return zz_0.a(hF) && Y_.a(list, hF) == null ? new zz_0(n4, random, hF, enumFacing) : null;
    }

    public zz_0(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.d = this.a(random);
        this.b = hF;
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.c((ze_0)y_, list, random, 1, 1);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        this.a(world, hF, 0, 0, 0, 4, 10, 7, true, random, aPZ.c());
        this.a(world, random, hF, this.d, 1, 7, 0);
        this.a(world, random, hF, aB6.OPENING, 1, 1, 7);
        int n = this.a(Blocks.U, 2);
        int n2 = 0;
        while (true) {
            this.b(world, BlocksInvoker.a(Blocks.U, n), 1, 6 - n2, 1 + n2, hF);
            this.b(world, BlocksInvoker.a(Blocks.U, n), 2, 6 - n2, 1 + n2, hF);
            this.b(world, BlocksInvoker.a(Blocks.U, n), 3, 6 - n2, 1 + n2, hF);
            this.b(world, BlocksInvoker.t(Blocks.z), 1, 5 - n2, 1 + n2, hF);
            this.b(world, BlocksInvoker.t(Blocks.z), 2, 5 - n2, 1 + n2, hF);
            this.b(world, BlocksInvoker.t(Blocks.z), 3, 5 - n2, 1 + n2, hF);
            ++n2;
        }
    }

    public zz_0() {
    }
}

