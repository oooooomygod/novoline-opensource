/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import java.nio.ByteBuffer;
import net.a0D;
import net.a8q_0;
import net.a9w_0;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.aEp
 */
public class aep_0 {
    public int b = 15;
    public int a = GL11.glGenTextures();

    public int a() {
        return this.a;
    }

    public void b() {
        GlStateManagerInvoker.g(this.a);
        this.a = 0;
    }

    public aep_0(int n, int n2) {
        byte[] byArray = this.a(n, n2);
        ByteBuffer byteBuffer = a9w_0.d(byArray.length);
        a8q_0.a(byteBuffer, byArray);
        a8q_0.f(byteBuffer);
        GlStateManagerInvoker.k(this.a);
        GL11.glTexImage2D((int)3553, (int)0, (int)6407, (int)n, (int)n2, (int)0, (int)6407, (int)5121, (ByteBuffer)byteBuffer);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GlStateManagerInvoker.k(0);
    }

    private byte a(int n, int n2, int n3) {
        int n4 = (this.a(n) + this.a(n2 * 19)) * this.a(n3 * 23) - n3;
        return (byte)(this.a(n4) % 128);
    }

    private int a(int n) {
        n ^= n << 13;
        n ^= n >> 17;
        n ^= n << 5;
        return n;
    }

    private byte[] a(int n, int n2) {
        byte[] byArray = new byte[n * n2 * 3];
        a0D.k();
        int n3 = 0;
        int n4 = 0;
        if (n4 < n2) {
            int n5 = 0;
            if (n5 < n) {
                int n6 = 1;
                byArray[n3++] = this.a(n5, n4, n6);
                ++n6;
                ++n5;
            }
            ++n4;
        }
        return byArray;
    }
}

