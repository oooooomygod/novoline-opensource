/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Vec3;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.abA
 */
public class aba_1 {
    private static Vec3 a = new Vec3(0.0, 0.0, 0.0);

    public static Vec3 a(nu_1 nu_12, int n, int n2) {
        return aba_1.b(nu_12, n, n2, null);
    }

    private static Vec3 b(nu_1 nu_12, int n, int n2, Vec3 vec3) {
        Random random = aMY.o(nu_12);
        float f = -99999.0f;
        if (aMY.i(nu_12)) {
            double d;
            double d2 = amv_2.c(aMY.f(nu_12), MathHelper.floor_double(nu_12.posX), MathHelper.floor_double(nu_12.posY), MathHelper.floor_double(nu_12.posZ)) + 4.0;
            boolean bl = d2 < (d = (double)(aMY.g(nu_12) + (float)n)) * d;
        }
        int n3 = 0;
        while (true) {
            int n4 = a5_0.a(random, 2 * n + 1) - n;
            int n5 = a5_0.a(random, 2 * n2 + 1) - n2;
            int n6 = a5_0.a(random, 2 * n + 1) - n;
            if ((double)n4 * vec3.xCoord + (double)n6 * vec3.zCoord >= 0.0) {
                float f2;
                BlockPos blockPos;
                if (aMY.i(nu_12) && n > 1) {
                    blockPos = aMY.f(nu_12);
                    n4 = nu_12.posX > (double)amv_2.j(blockPos) ? (n4 -= a5_0.a(random, n / 2)) : (n4 += a5_0.a(random, n / 2));
                    n6 = nu_12.posZ > (double)amv_2.i(blockPos) ? (n6 -= a5_0.a(random, n / 2)) : (n6 += a5_0.a(random, n / 2));
                }
                if (aMY.b(nu_12, blockPos = new BlockPos(n4 += MathHelper.floor_double(nu_12.posX), n5 += MathHelper.floor_double(nu_12.posY), n6 += MathHelper.floor_double(nu_12.posZ))) && (f2 = aMY.c(nu_12, blockPos)) > f) {
                    f = f2;
                }
            }
            ++n3;
        }
    }

    public static Vec3 a(nu_1 nu_12, int n, int n2, Vec3 vec3) {
        a = aNE.b(vec3, nu_12.posX, nu_12.posY, nu_12.posZ);
        return aba_1.b(nu_12, n, n2, a);
    }

    public static Vec3 c(nu_1 nu_12, int n, int n2, Vec3 vec3) {
        a = aNE.b(new Vec3(nu_12.posX, nu_12.posY, nu_12.posZ), vec3);
        return aba_1.b(nu_12, n, n2, a);
    }
}

