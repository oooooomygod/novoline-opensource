/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.OpenGlHelper;
import net.minecraft.renderer.chunk.RenderChunk;
import java.util.Iterator;

import org.lwjgl.opengl.GL11;

public class E5
extends EU {
    private static String f = "CL_00002533";

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "&i L~J\u0001W\u0010LO".toCharArray();
        int n2 = 0;
        int n3 = 85;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x30));
            n3 = n3;
        }
    }

    private void a() {
        if (ys_2.aC()) {
            axw_2.i();
        } else {
            GL11.glVertexPointer((int)3, (int)5126, (int)28, (long)0L);
            GL11.glColorPointer((int)4, (int)5121, (int)28, (long)12L);
            GL11.glTexCoordPointer((int)2, (int)5126, (int)28, (long)16L);
            OpenGlHelper.g(apl_1.ab);
            GL11.glTexCoordPointer((int)2, (int)5122, (int)28, (long)24L);
            OpenGlHelper.g(apl_1.S);
        }
    }

    @Override
    public void a(a5w_0 a5w_02) {
        if (this.a) {
            Iterator iterator = ListInvoker.iterator(this.c);
            while (dz_0.c(iterator)) {
                RenderChunk renderChunk = (RenderChunk)dz_0.b(iterator);
                aH5 aH52 = afq_2.b(renderChunk, a5w_02.ordinal());
                GlStateManagerInvoker.pushMatrix();
                this.a(renderChunk);
                afq_2.c(renderChunk);
                dg_1.a(aH52);
                this.a();
                dg_1.a(aH52, 7);
                GlStateManagerInvoker.popMatrix();
            }
            OpenGlHelper.b(apl_1.w, 0);
            GlStateManagerInvoker.e();
            ListInvoker.clear(this.c);
        }
    }
}

