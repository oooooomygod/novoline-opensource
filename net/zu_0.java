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
 * Renamed from net.Zu
 */
public class zu_0
extends YJ {
    private int e;

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.e = tn_0.g(nBTTagCompound, df_2.b);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        Random random2 = new Random(this.e);
        int n = 0;
        int n2 = 3;
        while (true) {
            int n3 = a5_0.a(random2, 8);
            this.a(world, hF, n, n2, 0, n, n2, n3, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
            ++n2;
        }
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.b(nBTTagCompound, df_2.a, this.e);
    }

    public zu_0() {
    }

    public static zu_0 a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, -3, 0, 5, 10, 8, enumFacing);
        return zu_0.a(hF) && Y_.a(list, hF) == null ? new zu_0(n4, random, hF, enumFacing) : null;
    }

    public zu_0(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
        this.e = a5_0.d(random);
    }
}

