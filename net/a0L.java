/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.nio.FloatBuffer;
import net.a0D;
import net.a7r_0;
import net.aHB;

public class a0L {
    static void a(float[] fArray, float[] fArray2) {
        fArray[0] = fArray2[5] * fArray2[10] * fArray2[15] - fArray2[5] * fArray2[11] * fArray2[14] - fArray2[9] * fArray2[6] * fArray2[15] + fArray2[9] * fArray2[7] * fArray2[14] + fArray2[13] * fArray2[6] * fArray2[11] - fArray2[13] * fArray2[7] * fArray2[10];
        fArray[1] = -fArray2[1] * fArray2[10] * fArray2[15] + fArray2[1] * fArray2[11] * fArray2[14] + fArray2[9] * fArray2[2] * fArray2[15] - fArray2[9] * fArray2[3] * fArray2[14] - fArray2[13] * fArray2[2] * fArray2[11] + fArray2[13] * fArray2[3] * fArray2[10];
        fArray[2] = fArray2[1] * fArray2[6] * fArray2[15] - fArray2[1] * fArray2[7] * fArray2[14] - fArray2[5] * fArray2[2] * fArray2[15] + fArray2[5] * fArray2[3] * fArray2[14] + fArray2[13] * fArray2[2] * fArray2[7] - fArray2[13] * fArray2[3] * fArray2[6];
        fArray[3] = -fArray2[1] * fArray2[6] * fArray2[11] + fArray2[1] * fArray2[7] * fArray2[10] + fArray2[5] * fArray2[2] * fArray2[11] - fArray2[5] * fArray2[3] * fArray2[10] - fArray2[9] * fArray2[2] * fArray2[7] + fArray2[9] * fArray2[3] * fArray2[6];
        fArray[4] = -fArray2[4] * fArray2[10] * fArray2[15] + fArray2[4] * fArray2[11] * fArray2[14] + fArray2[8] * fArray2[6] * fArray2[15] - fArray2[8] * fArray2[7] * fArray2[14] - fArray2[12] * fArray2[6] * fArray2[11] + fArray2[12] * fArray2[7] * fArray2[10];
        fArray[5] = fArray2[0] * fArray2[10] * fArray2[15] - fArray2[0] * fArray2[11] * fArray2[14] - fArray2[8] * fArray2[2] * fArray2[15] + fArray2[8] * fArray2[3] * fArray2[14] + fArray2[12] * fArray2[2] * fArray2[11] - fArray2[12] * fArray2[3] * fArray2[10];
        fArray[6] = -fArray2[0] * fArray2[6] * fArray2[15] + fArray2[0] * fArray2[7] * fArray2[14] + fArray2[4] * fArray2[2] * fArray2[15] - fArray2[4] * fArray2[3] * fArray2[14] - fArray2[12] * fArray2[2] * fArray2[7] + fArray2[12] * fArray2[3] * fArray2[6];
        fArray[7] = fArray2[0] * fArray2[6] * fArray2[11] - fArray2[0] * fArray2[7] * fArray2[10] - fArray2[4] * fArray2[2] * fArray2[11] + fArray2[4] * fArray2[3] * fArray2[10] + fArray2[8] * fArray2[2] * fArray2[7] - fArray2[8] * fArray2[3] * fArray2[6];
        fArray[8] = fArray2[4] * fArray2[9] * fArray2[15] - fArray2[4] * fArray2[11] * fArray2[13] - fArray2[8] * fArray2[5] * fArray2[15] + fArray2[8] * fArray2[7] * fArray2[13] + fArray2[12] * fArray2[5] * fArray2[11] - fArray2[12] * fArray2[7] * fArray2[9];
        fArray[9] = -fArray2[0] * fArray2[9] * fArray2[15] + fArray2[0] * fArray2[11] * fArray2[13] + fArray2[8] * fArray2[1] * fArray2[15] - fArray2[8] * fArray2[3] * fArray2[13] - fArray2[12] * fArray2[1] * fArray2[11] + fArray2[12] * fArray2[3] * fArray2[9];
        fArray[10] = fArray2[0] * fArray2[5] * fArray2[15] - fArray2[0] * fArray2[7] * fArray2[13] - fArray2[4] * fArray2[1] * fArray2[15] + fArray2[4] * fArray2[3] * fArray2[13] + fArray2[12] * fArray2[1] * fArray2[7] - fArray2[12] * fArray2[3] * fArray2[5];
        fArray[11] = -fArray2[0] * fArray2[5] * fArray2[11] + fArray2[0] * fArray2[7] * fArray2[9] + fArray2[4] * fArray2[1] * fArray2[11] - fArray2[4] * fArray2[3] * fArray2[9] - fArray2[8] * fArray2[1] * fArray2[7] + fArray2[8] * fArray2[3] * fArray2[5];
        a0D.r();
        fArray[12] = -fArray2[4] * fArray2[9] * fArray2[14] + fArray2[4] * fArray2[10] * fArray2[13] + fArray2[8] * fArray2[5] * fArray2[14] - fArray2[8] * fArray2[6] * fArray2[13] - fArray2[12] * fArray2[5] * fArray2[10] + fArray2[12] * fArray2[6] * fArray2[9];
        fArray[13] = fArray2[0] * fArray2[9] * fArray2[14] - fArray2[0] * fArray2[10] * fArray2[13] - fArray2[8] * fArray2[1] * fArray2[14] + fArray2[8] * fArray2[2] * fArray2[13] + fArray2[12] * fArray2[1] * fArray2[10] - fArray2[12] * fArray2[2] * fArray2[9];
        fArray[14] = -fArray2[0] * fArray2[5] * fArray2[14] + fArray2[0] * fArray2[6] * fArray2[13] + fArray2[4] * fArray2[1] * fArray2[14] - fArray2[4] * fArray2[2] * fArray2[13] - fArray2[12] * fArray2[1] * fArray2[6] + fArray2[12] * fArray2[2] * fArray2[5];
        fArray[15] = fArray2[0] * fArray2[5] * fArray2[10] - fArray2[0] * fArray2[6] * fArray2[9] - fArray2[4] * fArray2[1] * fArray2[10] + fArray2[4] * fArray2[2] * fArray2[9] + fArray2[8] * fArray2[1] * fArray2[6] - fArray2[8] * fArray2[2] * fArray2[5];
        float f = fArray2[0] * fArray[0] + fArray2[1] * fArray[4] + fArray2[2] * fArray[8] + fArray2[3] * fArray[12];
        if ((double)f != 0.0) {
            int n = 0;
            int n2 = n++;
            fArray[n2] = fArray[n2] / f;
            ListInvoker.b(new ListInvoker[4]);
        }
        a7r_0.a(fArray, 0.0f);
    }

    static void b(float[] fArray, float[] fArray2, float[] fArray3) {
        a0D.k();
        int n = 0;
        int n2 = 0;
        fArray[4 * n + n2] = fArray2[4 * n] * fArray3[0 + n2] + fArray2[4 * n + 1] * fArray3[4 + n2] + fArray2[4 * n + 2] * fArray3[8 + n2] + fArray2[4 * n + 3] * fArray3[12 + n2];
        ++n2;
        ++n;
    }

    static void a(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, float[] fArray, float[] fArray2) {
        aHB.b(floatBuffer2, fArray2);
        a0L.a(fArray, fArray2);
        aHB.a(floatBuffer, fArray);
    }

    static void a(float[] fArray, float[] fArray2, float[] fArray3) {
        fArray[0] = fArray2[0] * fArray3[0] + fArray2[4] * fArray3[1] + fArray2[8] * fArray3[2] + fArray2[12] * fArray3[3];
        fArray[1] = fArray2[1] * fArray3[0] + fArray2[5] * fArray3[1] + fArray2[9] * fArray3[2] + fArray2[13] * fArray3[3];
        fArray[2] = fArray2[2] * fArray3[0] + fArray2[6] * fArray3[1] + fArray2[10] * fArray3[2] + fArray2[14] * fArray3[3];
        fArray[3] = fArray2[3] * fArray3[0] + fArray2[7] * fArray3[1] + fArray2[11] * fArray3[2] + fArray2[15] * fArray3[3];
    }
}

