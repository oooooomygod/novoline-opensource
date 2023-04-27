/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.ady_2;
import net.ay_2;
import net.sn_1;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

/*
 * Renamed from net.aMo
 */
public class amo_0 {
    public static void a(float f, float f2, float f3, float f4) {
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex3f((float)(f + 0.0f), (float)(f2 + 0.0f), (float)0.0f);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex3f((float)(f + 0.0f), (float)(f2 + f4), (float)0.0f);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex3f((float)(f + f3), (float)(f2 + f4), (float)0.0f);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex3f((float)(f + f3), (float)(f2 + 0.0f), (float)0.0f);
        GL11.glEnd();
    }

    public static void a(float f, float f2, float f3, float f4, sn_1 sn_12, sn_1 sn_13) {
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glHint((int)3152, (int)4354);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        GL11.glColor4f((float)sn_12.g, (float)sn_12.f, (float)sn_12.d, (float)sn_12.i);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex3f((float)(f + 0.0f), (float)(f2 + 0.0f), (float)0.0f);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex3f((float)(f + 0.0f), (float)(f2 + f4), (float)0.0f);
        GL11.glColor4f((float)sn_13.g, (float)sn_13.f, (float)sn_13.d, (float)sn_13.i);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex3f((float)(f + f3), (float)(f2 + f4), (float)0.0f);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex3f((float)(f + f3), (float)(f2 + 0.0f), (float)0.0f);
        GL11.glEnd();
    }

    public static void a(float f) {
        ay_2.b();
        GL11.glBegin((int)2);
        float f2 = 360.0f;
        int n = 0;
        float f3 = (float)n - f2;
        int cfr_ignored_1 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
        amo_0.a((float)n / f2 * 360.0f, f);
        ++n;
        GL11.glEnd();
    }

    private static void a(float f, float f2) {
        Vector3f vector3f = new Vector3f((float)MathInvoker.m((double)(f / 180.0f) * Math.PI), 0.0f, (float)MathInvoker.i((double)(f / 180.0f) * Math.PI));
        vector3f = (Vector3f)ady_2.c(vector3f);
        ady_2.a(vector3f, f2);
        GL11.glVertex3f((float)vector3f.x, (float)vector3f.y, (float)vector3f.z);
    }
}

