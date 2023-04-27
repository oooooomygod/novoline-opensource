/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;

/*
 * Renamed from net.Fw
 */
public class fw_0
extends F0 {
    @Override
    protected void c() {
        super.c();
    }

    public fw_0(nl_1 nl_12, World world) {
        super(nl_12, world);
    }

    @Override
    protected boolean a(Vec3 vec3, Vec3 vec32, int n, int n2, int n3) {
        MovingObjectPosition movingObjectPosition = aV8.a(this.d, vec3, new Vec3(vec32.xCoord, vec32.yCoord + (double)this.e.n * 0.5, vec32.zCoord), false, true, false);
        return movingObjectPosition.typeOfHit == I.MISS;
    }

    @Override
    protected void a() {
        Vec3 vec3 = this.i();
        float f = this.e.width * this.e.width;
        int n = 6;
        if (aNE.e(vec3, afG.a(this.h, this.e, afG.e(this.h))) < (double)f) {
            afG.b(this.h);
        }
        for (int i = MathInvoker.b(afG.e(this.h) + n, afG.c(this.h) - 1); i > afG.e(this.h); --i) {
            Vec3 vec32 = afG.a(this.h, this.e, i);
            if (!(aNE.e(vec32, vec3) <= 36.0) || !this.a(vec3, vec32, 0, 0, 0)) continue;
            afG.c(this.h, i);
            break;
        }
        this.a(vec3);
    }

    @Override
    protected boolean h() {
        return this.d();
    }

    @Override
    protected ana_2 e() {
        return new ana_2(new apx_1());
    }

    @Override
    protected Vec3 i() {
        return new Vec3(this.e.posX, this.e.posY + (double)this.e.n * 0.5, this.e.posZ);
    }
}

