/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import java.util.ArrayList;
import java.util.List;
import net.UW;
import net.a5K;
import net.aBE;
import net.aWW;
import net.ady_2;
import net.als_1;
import net.asj_0;
import net.rr_1;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;

public class aQ2 {
    public List<aBE> c = new ArrayList<aBE>();
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public void a(float f) {
        aQ2.b();
        int n = 0;
        if (n < ListInvoker.size(this.c)) {
            ((aBE)ListInvoker.get(this.c, (int)n)).b += f;
            ++n;
        }
        if ((n = 0) < ListInvoker.size(this.c)) {
            if (((aBE)ListInvoker.get(this.c, (int)n)).b > 20.0f) {
                ListInvoker.remove(this.c, ListInvoker.get(this.c, n));
            }
            ++n;
        }
    }

    static {
        if (aQ2.b() == null) {
            aQ2.b(new String[3]);
        }
    }

    public void a() {
        ListInvoker.clear(this.c);
    }

    public void a(rr_1 rr_12) {
        aBE aBE2 = new aBE(this, rr_12);
        UW.a(aBE2.g, (a5K)rr_12.q);
        aQ2.b();
        UW.e(aBE2.g, rr_12.q.g, rr_12.q.o, rr_12.q.z);
        UW.c(aBE2.g, rr_12.q.e, rr_12.q.r, rr_12.q.f);
        UW.a(aBE2.e, (a5K)rr_12.h);
        UW.e(aBE2.e, rr_12.h.g, rr_12.h.o, rr_12.h.z);
        UW.c(aBE2.e, rr_12.h.e, rr_12.h.r, rr_12.h.f);
        UW.a(aBE2.d, rr_12.E);
        UW.e(aBE2.d, rr_12.E.g, rr_12.E.o, rr_12.E.z);
        UW.c(aBE2.d, rr_12.E.e, rr_12.E.r, rr_12.E.f);
        ady_2.a(aBE2.a, (ReadableVector3f)rr_12.S.e);
        ady_2.a(aBE2.c, (ReadableVector3f)rr_12.Q.e);
        ady_2.a(aBE2.f, (ReadableVector3f)rr_12.A.e);
        ListInvoker.add(this.c, aBE2);
        ListInvoker.b(new ListInvoker[2]);
    }

    public static String[] b() {
        return b;
    }

    public void b(rr_1 rr_12) {
        GL11.glPushMatrix();
        aQ2.b();
        TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), als_1.c);
        GL11.glDepthFunc((int)515);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)2884);
        GL11.glDisable((int)2896);
        GL11.glHint((int)3152, (int)4354);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        int n = 0;
        if (n < ListInvoker.size(this.c)) {
            aBE aBE2 = (aBE)ListInvoker.get(this.c, n);
            float f = aBE2.b / 5.0f;
            f = aWW.a(f, 1.0f);
            f = 1.0f - f;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
            Vector3f[] vector3fArray = new Vector3f[]{new Vector3f(0.0f, 0.0f, -8.0f + 8.0f * f), new Vector3f(0.0f, 0.0f, -8.0f - 8.0f * f)};
            aWW.a(vector3fArray, ady_2.a(aBE2.f));
            aWW.c(vector3fArray, ady_2.b(aBE2.f));
            aWW.b(vector3fArray, ady_2.d(aBE2.f));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
            aWW.a(vector3fArray, new Vector3f(-1.0f, -6.0f, 0.0f));
            aWW.a(vector3fArray, aBE2.d.t / (float)Math.PI * 180.0f);
            aWW.c(vector3fArray, aBE2.d.m / (float)Math.PI * 180.0f);
            aWW.b(vector3fArray, aBE2.d.n / (float)Math.PI * 180.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
            aWW.a(vector3fArray, asj_0.c(aBE2.d.H));
            aWW.c(vector3fArray, asj_0.a(aBE2.d.H));
            aWW.b(vector3fArray, -asj_0.b(aBE2.d.H));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
            aWW.a(vector3fArray, new Vector3f(0.0f, -4.0f, 0.0f));
            aWW.a(vector3fArray, aBE2.e.t / (float)Math.PI * 180.0f);
            aWW.c(vector3fArray, aBE2.e.m / (float)Math.PI * 180.0f);
            aWW.b(vector3fArray, aBE2.e.n / (float)Math.PI * 180.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
            aWW.a(vector3fArray, asj_0.c(aBE2.e.H));
            aWW.c(vector3fArray, asj_0.a(aBE2.e.H));
            aWW.b(vector3fArray, -asj_0.b(aBE2.e.H));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
            aWW.a(vector3fArray, new Vector3f(-5.0f, 10.0f, 0.0f));
            aWW.a(vector3fArray, aBE2.g.t / (float)Math.PI * 180.0f);
            aWW.c(vector3fArray, aBE2.g.m / (float)Math.PI * 180.0f);
            aWW.b(vector3fArray, aBE2.g.n / (float)Math.PI * 180.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
            aWW.a(vector3fArray, asj_0.c(aBE2.g.H));
            aWW.c(vector3fArray, asj_0.a(aBE2.g.H));
            aWW.b(vector3fArray, asj_0.b(aBE2.g.H));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
            aWW.a(vector3fArray, new Vector3f(0.0f, 12.0f, 0.0f));
            aWW.a(vector3fArray, ady_2.a(aBE2.c));
            aWW.c(vector3fArray, ady_2.b(aBE2.c));
            aWW.a(vector3fArray, aBE2.a);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
            GL11.glVertex3f((float)vector3fArray[0].x, (float)vector3fArray[0].y, (float)vector3fArray[0].z);
            GL11.glVertex3f((float)vector3fArray[1].x, (float)vector3fArray[1].y, (float)vector3fArray[1].z);
            if (n == ListInvoker.size(this.c) - 1) {
                GL11.glVertex3f((float)vector3fArray[1].x, (float)vector3fArray[1].y, (float)vector3fArray[1].z);
                GL11.glVertex3f((float)vector3fArray[0].x, (float)vector3fArray[0].y, (float)vector3fArray[0].z);
            }
            ++n;
        }
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2884);
        GL11.glEnable((int)2896);
        GL11.glPopMatrix();
        if (ListInvoker.b() != null) {
            aQ2.b(new String[2]);
        }
    }
}

