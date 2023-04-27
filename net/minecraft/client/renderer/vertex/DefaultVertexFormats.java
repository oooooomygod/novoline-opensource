/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.vertex;

import net.aDb;
import net.aSG;
import net.ail_0;
import net.VertexFormat;
import net.VertexFormatElement;
import net.atm_0;
import net.ys_2;
import net.zv_2;

public class DefaultVertexFormats {
    public static VertexFormatElement t;
    public static VertexFormat f;
    public static VertexFormat u;
    private static VertexFormat b;
    public static VertexFormat i;
    public static VertexFormatElement m;
    public static VertexFormat a;
    private static VertexFormat r;
    public static VertexFormatElement q;
    public static VertexFormat g;
    public static VertexFormat n;
    public static VertexFormat POSITION_TEX_COLOR;
    public static VertexFormatElement e;
    public static VertexFormatElement p;
    public static VertexFormat k;
    private static String s = "CL_00002403";
    public static VertexFormatElement j;
    public static VertexFormat c;
    public static VertexFormat l;
    public static VertexFormat d;
    public static VertexFormat h;

    public static void a() {
        if (ys_2.aC()) {
            g = atm_0.a();
            n = atm_0.b();
        } else {
            g = b;
            n = r;
        }
        if (aSG.a(ail_0.V)) {
            VertexFormat aqn_02 = n;
            VertexFormat aqn_03 = (VertexFormat)aDb.a(ail_0.V);
            zv_2.b(aqn_03);
            for (int i = 0; i < zv_2.h(aqn_02); ++i) {
                zv_2.a(aqn_03, zv_2.a(aqn_02, i));
            }
        }
    }
}

