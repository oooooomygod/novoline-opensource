/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.texture;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.ITextureObject;
import net.aG6;
import net.ahf_1;
import net.aiv_2;
import org.lwjgl.opengl.GL11;


public abstract class AbstractTexture
implements ITextureObject {
    protected boolean b;
    protected boolean f;
    protected boolean e;
    public aG6 a;
    protected boolean g;
    private static String d = "CL_00001047";
    protected int c = -1;

    @Override
    public int a() {
        if (this.c == -1) {
            this.c = aiv_2.a();
        }
        return this.c;
    }

    @Override
    public void a(boolean bl, boolean bl2) {
        this.e = this.g;
        this.f = this.b;
        this.b(bl, bl2);
    }

    public void b(boolean bl, boolean bl2) {
        this.g = bl;
        this.b = bl2;
        int n = 9987;
        int n2 = 9729;
        GlStateManagerInvoker.k(this.a());
        GL11.glTexParameteri((int)3553, (int)10241, (int)n);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\fR\u000fp\u0001\f{~.dw".toCharArray();
        int n2 = 0;
        int n3 = 66;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0xD));
            n3 = n3;
        }
    }

    @Override
    public void c() {
        this.b(this.e, this.f);
    }

    @Override
    public aG6 b() {
        return ahf_1.a(this);
    }

    public void b() {
        ahf_1.a(this, this.c);
        if (this.c != -1) {
            aiv_2.a(this.c);
            this.c = -1;
        }
    }
}

