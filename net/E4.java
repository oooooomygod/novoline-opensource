/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.renderer.chunk.RenderChunk;
import java.util.Iterator;

import org.lwjgl.opengl.GL11;

public class E4
extends EU {
    private static String f = "CL_00000957";

    @Override
    public void a(a5w_0 a5w_02) {
        if (this.a) {
            if (ListInvoker.isEmpty(this.c)) {
                return;
            }
            Iterator iterator = ListInvoker.iterator(this.c);
            while (dz_0.c(iterator)) {
                RenderChunk renderChunk = (RenderChunk)dz_0.b(iterator);
                GR gR = (GR)renderChunk;
                GlStateManagerInvoker.pushMatrix();
                this.a(renderChunk);
                GL11.glCallList((int)ho_1.a(gR, a5w_02, ho_1.a(gR)));
                GlStateManagerInvoker.popMatrix();
            }
            if (ys_2.O()) {
                GlStateManagerInvoker.I();
            }
            GlStateManagerInvoker.e();
            ListInvoker.clear(this.c);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "|7n\u0002`o3\u000fB\u0004\u0005".toCharArray();
        int n2 = 0;
        int n3 = 28;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x23));
            n3 = n3;
        }
    }
}

