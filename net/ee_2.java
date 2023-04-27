/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import deobf.FontRenderer;
import deobf.IChatComponent;
import deobf.TileEntity;
import java.util.List;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.ee
 */
public class ee_2
extends eg_0 {
    private static ResourceLocation c;
    private rp_1 d = new rp_1();
    private static String e = "CL_00000970";

    public void a(TileEntity tileEntity, double d, double d2, double d3, float f, int n) {
        this.a((a6z_0)tileEntity, d, d2, d3, f, n);
    }

    public void a(a6z_0 a6z_02, double d, double d2, double d3, float f, int n) {
        float f2;
        Block block = aIE.g(a6z_02);
        GlStateManagerInvoker.pushMatrix();
        float f3 = 0.6666667f;
        if (block == Blocks.bp) {
            GlStateManagerInvoker.translate((float)d + 0.5f, (float)d2 + 0.75f * f3, (float)d3 + 0.5f);
            float f4 = (float)(aIE.b(a6z_02) * 360) / 16.0f;
            GlStateManagerInvoker.b(-f4, 0.0f, 1.0f, 0.0f);
            this.d.h.p = true;
        } else {
            int n2 = aIE.b(a6z_02);
            f2 = 0.0f;
            if (n2 == 2) {
                f2 = 180.0f;
            }
            if (n2 == 4) {
                f2 = 90.0f;
            }
            if (n2 == 5) {
                f2 = -90.0f;
            }
            GlStateManagerInvoker.translate((float)d + 0.5f, (float)d2 + 0.75f * f3, (float)d3 + 0.5f);
            GlStateManagerInvoker.b(-f2, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.translate(0.0f, -0.3125f, -0.4375f);
            this.d.h.p = false;
        }
        this.a(a[n]);
        GlStateManagerInvoker.matrixMode(5890);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c(4.0f, 2.0f, 1.0f);
        GlStateManagerInvoker.translate(0.0625f, 0.0625f, 0.0625f);
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c(f3, -f3, -f3);
        ary_2.a(this.d);
        GlStateManagerInvoker.popMatrix();
        FontRenderer fontRenderer = this.c();
        f2 = 0.015625f * f3;
        GlStateManagerInvoker.translate(0.0f, 0.5f * f3, 0.07f * f3);
        GlStateManagerInvoker.c(f2, -f2, f2);
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)(-1.0f * f2));
        GlStateManagerInvoker.c(false);
        int n3 = 0;
        if (ys_2.aF()) {
            n3 = ajT.a(n3);
        }
        for (int i = 0; i < a6z_02.i.length; ++i) {
            String string;
            if (a6z_02.i[i] == null) continue;
            IChatComponent iChatComponent = a6z_02.i[i];
            List list = rc_0.a(iChatComponent, 90, fontRenderer, false, true);
            String string2 = string = !ListInvoker.isEmpty(list) ? aBO.a((IChatComponent)ListInvoker.get(list, 0)) : aZU.d;
            if (i == a6z_02.j) {
                string = aL0.a(aL0.a(aL0.a(new StringBuilder(), aZU.c), string), aZU.b).toString();
            }
            FontRendererInvoker.a(fontRenderer, string, -FontRendererInvoker.a(fontRenderer, string) / 2, i * 10 - a6z_02.i.length * 5, n3);
        }
        GlStateManagerInvoker.c(true);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.matrixMode(5890);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.matrixMode(5888);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "]L\u0007&sb5.9o&".toCharArray();
        int n2 = 0;
        int n3 = 68;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x5A));
            n3 = n3;
        }
    }
}

