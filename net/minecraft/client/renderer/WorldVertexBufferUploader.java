/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer;;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import net.minecraft.renderer.WorldRenderer;
import java.nio.ByteBuffer;
import java.util.List;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.aNg
 */
public class WorldVertexBufferUploader {
    private static String a = "CL_00002567";

    public void a(WorldRenderer worldRenderer) {
        if (WorldRendererInvoker.c(worldRenderer) > 0) {
            Object object;
            int n;
            aqn_0 aqn_02 = WorldRendererInvoker.f(worldRenderer);
            int n2 = zv_2.a(aqn_02);
            ByteBuffer byteBuffer = WorldRendererInvoker.l(worldRenderer);
            List list = zv_2.g(aqn_02);
            ayy_0.d(ail_0.c8);
            ayy_0.d(ail_0.a3);
            for (n = 0; n < ListInvoker.size(list); ++n) {
                asw_0 asw_02 = (asw_0)ListInvoker.get(list, n);
                object = ev_0.b(asw_02);
                aDb.b(object, ail_0.c8, new Object[]{aqn_02, P8.d(n), P8.d(n2), byteBuffer});
            }
            if (WorldRendererInvoker.d(worldRenderer)) {
                WorldRendererInvoker.m(worldRenderer);
            } else if (ys_2.aC()) {
                aav_0.a(WorldRendererInvoker.i(worldRenderer), 0, WorldRendererInvoker.c(worldRenderer), worldRenderer);
            } else {
                GL11.glDrawArrays((int)WorldRendererInvoker.i(worldRenderer), (int)0, (int)WorldRendererInvoker.c(worldRenderer));
            }
            int n3 = ListInvoker.size(list);
            for (n = 0; n < n3; ++n) {
                object = (asw_0)ListInvoker.get(list, n);
                aPX aPX2 = ev_0.b((asw_0)object);
                aDb.b((Object)aPX2, ail_0.a3, new Object[]{aqn_02, P8.d(n), P8.d(n2), byteBuffer});
            }
        }
        WorldRendererInvoker.b(worldRenderer);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "|\u0010m>jus\ri\u00049".toCharArray();
        int n2 = 0;
        int n3 = 6;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x39));
            n3 = n3;
        }
    }
}

