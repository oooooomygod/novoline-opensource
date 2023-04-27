/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import java.nio.FloatBuffer;
import net.MathHelper;
import net.N4;
import net.aHB;
import net.iw_0;
import net.qr_2;

/*
 * Renamed from net.qu
 */
public class qu_2
extends qr_2 {
    private static qu_2 i = new qu_2();
    private FloatBuffer h;
    private FloatBuffer f;
    private FloatBuffer g = N4.d(16);

    public static qr_2 b() {
        i.a();
        return i;
    }

    public qu_2() {
        this.f = N4.d(16);
        this.h = N4.d(16);
    }

    private void a(float[] fArray) {
        float f = MathHelper.g(fArray[0] * fArray[0] + fArray[1] * fArray[1] + fArray[2] * fArray[2]);
        fArray[0] = fArray[0] / f;
        fArray[1] = fArray[1] / f;
        fArray[2] = fArray[2] / f;
        fArray[3] = fArray[3] / f;
    }

    public void a() {
        aHB.a(this.g);
        aHB.a(this.f);
        aHB.a(this.h);
        GlStateManagerInvoker.a(2983, this.g);
        GlStateManagerInvoker.a(2982, this.f);
        float[] fArray = this.c;
        float[] fArray2 = this.e;
        iw_0.a(aHB.b(this.g), 16);
        aHB.b(this.g, fArray);
        iw_0.a(aHB.b(this.f), 16);
        aHB.b(this.f, fArray2);
        this.b[0] = fArray2[0] * fArray[0] + fArray2[1] * fArray[4] + fArray2[2] * fArray[8] + fArray2[3] * fArray[12];
        this.b[1] = fArray2[0] * fArray[1] + fArray2[1] * fArray[5] + fArray2[2] * fArray[9] + fArray2[3] * fArray[13];
        this.b[2] = fArray2[0] * fArray[2] + fArray2[1] * fArray[6] + fArray2[2] * fArray[10] + fArray2[3] * fArray[14];
        this.b[3] = fArray2[0] * fArray[3] + fArray2[1] * fArray[7] + fArray2[2] * fArray[11] + fArray2[3] * fArray[15];
        this.b[4] = fArray2[4] * fArray[0] + fArray2[5] * fArray[4] + fArray2[6] * fArray[8] + fArray2[7] * fArray[12];
        this.b[5] = fArray2[4] * fArray[1] + fArray2[5] * fArray[5] + fArray2[6] * fArray[9] + fArray2[7] * fArray[13];
        this.b[6] = fArray2[4] * fArray[2] + fArray2[5] * fArray[6] + fArray2[6] * fArray[10] + fArray2[7] * fArray[14];
        this.b[7] = fArray2[4] * fArray[3] + fArray2[5] * fArray[7] + fArray2[6] * fArray[11] + fArray2[7] * fArray[15];
        this.b[8] = fArray2[8] * fArray[0] + fArray2[9] * fArray[4] + fArray2[10] * fArray[8] + fArray2[11] * fArray[12];
        this.b[9] = fArray2[8] * fArray[1] + fArray2[9] * fArray[5] + fArray2[10] * fArray[9] + fArray2[11] * fArray[13];
        this.b[10] = fArray2[8] * fArray[2] + fArray2[9] * fArray[6] + fArray2[10] * fArray[10] + fArray2[11] * fArray[14];
        this.b[11] = fArray2[8] * fArray[3] + fArray2[9] * fArray[7] + fArray2[10] * fArray[11] + fArray2[11] * fArray[15];
        this.b[12] = fArray2[12] * fArray[0] + fArray2[13] * fArray[4] + fArray2[14] * fArray[8] + fArray2[15] * fArray[12];
        this.b[13] = fArray2[12] * fArray[1] + fArray2[13] * fArray[5] + fArray2[14] * fArray[9] + fArray2[15] * fArray[13];
        this.b[14] = fArray2[12] * fArray[2] + fArray2[13] * fArray[6] + fArray2[14] * fArray[10] + fArray2[15] * fArray[14];
        this.b[15] = fArray2[12] * fArray[3] + fArray2[13] * fArray[7] + fArray2[14] * fArray[11] + fArray2[15] * fArray[15];
        float[] fArray3 = this.d[0];
        fArray3[0] = this.b[3] - this.b[0];
        fArray3[1] = this.b[7] - this.b[4];
        fArray3[2] = this.b[11] - this.b[8];
        fArray3[3] = this.b[15] - this.b[12];
        this.a(fArray3);
        float[] fArray4 = this.d[1];
        fArray4[0] = this.b[3] + this.b[0];
        fArray4[1] = this.b[7] + this.b[4];
        fArray4[2] = this.b[11] + this.b[8];
        fArray4[3] = this.b[15] + this.b[12];
        this.a(fArray4);
        float[] fArray5 = this.d[2];
        fArray5[0] = this.b[3] + this.b[1];
        fArray5[1] = this.b[7] + this.b[5];
        fArray5[2] = this.b[11] + this.b[9];
        fArray5[3] = this.b[15] + this.b[13];
        this.a(fArray5);
        float[] fArray6 = this.d[3];
        fArray6[0] = this.b[3] - this.b[1];
        fArray6[1] = this.b[7] - this.b[5];
        fArray6[2] = this.b[11] - this.b[9];
        fArray6[3] = this.b[15] - this.b[13];
        this.a(fArray6);
        float[] fArray7 = this.d[4];
        fArray7[0] = this.b[3] - this.b[2];
        fArray7[1] = this.b[7] - this.b[6];
        fArray7[2] = this.b[11] - this.b[10];
        fArray7[3] = this.b[15] - this.b[14];
        this.a(fArray7);
        float[] fArray8 = this.d[5];
        fArray8[0] = this.b[3] + this.b[2];
        fArray8[1] = this.b[7] + this.b[6];
        fArray8[2] = this.b[11] + this.b[10];
        fArray8[3] = this.b[15] + this.b[14];
        this.a(fArray8);
    }
}

