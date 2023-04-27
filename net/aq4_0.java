/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.MCInvoker;
import java.util.ArrayList;
import java.util.List;
import deobf.EnumFacing;
import org.lwjgl.util.vector.Vector3f;

/*
 * Renamed from net.aq4
 */
public class aq4_0 {
    public static JE a(String string, int n) {
        KM kM = h9.b(MCInvoker.f(ys_2.at()), string);
        return aq4_0.a(kM, n);
    }

    private static a9Z a(EnumFacing enumFacing, KM kM, int n) {
        Vector3f vector3f = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f vector3f2 = new Vector3f(16.0f, 16.0f, 16.0f);
        a4M a4M2 = new a4M(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0);
        aL1 aL12 = new aL1(enumFacing, n, aL0.a(aL0.a(new StringBuilder(), akq_0.a), SJ.d(enumFacing)).toString(), a4M2);
        alt_0 alt_02 = alt_0.X0_Y0;
        WJ wJ = null;
        boolean bl = false;
        boolean bl2 = true;
        x9_0 x9_02 = new x9_0();
        a9Z a9Z2 = abj_1.a(x9_02, vector3f, vector3f2, aL12, kM, enumFacing, alt_02, wJ, bl, bl2);
        return a9Z2;
    }

    public static JE a(KM kM, int n) {
        ArrayList<a9Z> arrayList = new ArrayList<a9Z>();
        aP2.b();
        EnumFacing[] enumFacingArray = EnumFacing.VALUES;
        ArrayList<List<a9Z>> arrayList2 = new ArrayList<List<a9Z>>(enumFacingArray.length);
        int n2 = 0;
        if (n2 < enumFacingArray.length) {
            EnumFacing enumFacing = enumFacingArray[n2];
            ArrayList arrayList3 = new ArrayList();
            ListInvoker.add(arrayList3, aq4_0.a(enumFacing, kM, n));
            ListInvoker.add(arrayList2, arrayList3);
            ++n2;
        }
        aks_2 aks_22 = new aks_2(arrayList, arrayList2, true, true, kM, HL.o);
        return aks_22;
    }
}

