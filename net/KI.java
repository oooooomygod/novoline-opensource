/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import deobf.Vec3;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockPos;

public class KI {
    private int h = -1;
    private World b;
    private int e;
    private int a;
    private int i;
    private int c;
    private int d;
    private boolean g;
    private aym_1 f;

    private boolean a() {
        this.a(new BlockPos(this.d, this.c, this.a));
        return false;
    }

    private boolean c() {
        aym_1 aym_12;
        List list = aV8.e(this.b);
        Iterator iterator = ListInvoker.iterator(list);
        while (true) {
            if (!dz_0.c(iterator)) {
                return false;
            }
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            if (a6w_0.l(entityPlayer)) continue;
            this.f = EX.a(aV8.o(this.b), new BlockPos(entityPlayer), 1);
            if (this.f != null && xx_2.e(this.f) >= 10 && xx_2.a(this.f) >= 20 && xx_2.i(this.f) >= 20) break;
        }
        BlockPos blockPos = xx_2.c(this.f);
        float f = xx_2.f(this.f);
        boolean bl = false;
        float f2 = a5_0.e(this.b.o) * (float)Math.PI * 2.0f;
        this.d = amv_2.j(blockPos) + (int)((double)(MathHelper.cos(f2) * f) * 0.9);
        this.c = amv_2.h(blockPos);
        this.a = amv_2.i(blockPos) + (int)((double)(MathHelper.sin(f2) * f) * 0.9);
        Iterator iterator2 = ListInvoker.iterator(EX.a(aV8.o(this.b)));
        while (dz_0.c(iterator2) && ((aym_12 = (aym_1)dz_0.b(iterator2)) == this.f || !xx_2.a(aym_12, new BlockPos(this.d, this.c, this.a)))) {
        }
        return false;
    }

    public KI(World world) {
        this.b = world;
    }

    public void b() {
        if (aV8.t(this.b)) {
            this.h = 0;
        } else if (this.h != 2) {
            if (this.h == 0) {
                float f = aV8.b(this.b, 0.0f);
                if ((double)f < 0.5 || (double)f > 0.501) {
                    return;
                }
                this.h = a5_0.a(this.b.o, 10) == 0 ? 1 : 2;
                this.g = false;
                if (this.h == 2) {
                    return;
                }
            }
            if (this.h != -1) {
                if (!this.g) {
                    if (!this.c()) {
                        return;
                    }
                    this.g = true;
                }
                if (this.e > 0) {
                    --this.e;
                } else {
                    this.e = 2;
                    if (this.i > 0) {
                        this.a();
                        --this.i;
                    } else {
                        this.h = 2;
                    }
                }
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private Vec3 a(BlockPos blockPos) {
        int n = 0;
        BlockPos blockPos2;
        while (!xx_2.a(this.f, blockPos2 = amv_2.a(blockPos, a5_0.a(this.b.o, 16) - 8, a5_0.a(this.b.o, 6) - 3, a5_0.a(this.b.o, 16) - 8)) || !yj_1.a(adr_2.ON_GROUND, this.b, blockPos2)) {
            ++n;
        }
        return new Vec3(amv_2.j(blockPos2), amv_2.h(blockPos2), amv_2.i(blockPos2));
    }
}

