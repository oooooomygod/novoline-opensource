/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import deobf.EnumFacing;
import net.minecraft.renderer.texture.TextureMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.lwjgl.util.vector.Vector3f;

/*
 * Renamed from net.apM
 */
public class apm_1 {
    public static List<String> a = my_0.a(new String[]{m4.h, m4.b, m4.f, m4.d, m4.e});

    private void a(axs_1 axs_12, List<aiv_0> list, int[] nArray, int n, int n2, int n3, int n4, boolean bl) {
        boolean bl2 = this.a(nArray, n + axs_12.c(), n2 + axs_12.b(), n3, n4);
        this.a(list, axs_12, n, n2);
    }

    private void a(List<aiv_0> list, axs_1 axs_12, int n, int n2) {
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            int n3;
            aiv_0 aiv_02 = (aiv_0)dz_0.b(iterator);
            if (aiv_02.d() != axs_12) continue;
            int n4 = n3 = axs_1.a(axs_12) ? n2 : n;
            if (aiv_02.b() != n3) continue;
            break;
        }
        int n5 = axs_1.a(axs_12) ? n2 : n;
        int n6 = axs_1.a(axs_12) ? n : n2;
        ListInvoker.add(list, new aiv_0(axs_12, n6, n5));
    }

    public aBU a(TextureMap textureMap, aBU aBU2) {
        String string;
        HashMap hashMap = MapsInvoker.a();
        ArrayList arrayList = my_0.c();
        for (int i = 0; i < ListInvoker.size(a) && ayl_0.a(aBU2, string = (String)ListInvoker.get(a, i)); ++i) {
            String string2 = ayl_0.b(aBU2, string);
            MapInvoker.c(hashMap, string, string2);
            KM kM = h9.b(textureMap, new ResourceLocation(string2).toString());
            ListInvoker.addAll(arrayList, this.a(i, string, kM));
        }
        if (ListInvoker.isEmpty(arrayList)) {
            return null;
        }
        MapInvoker.c(hashMap, m4.c, ayl_0.a(aBU2, m4.a) ? ayl_0.b(aBU2, m4.i) : (String)MapInvoker.c(hashMap, m4.g));
        return new aBU(arrayList, (Map<String, String>)hashMap, false, false, ayl_0.a(aBU2));
    }

    private List<aiv_0> a(KM kM) {
        int n = qg_2.b(kM);
        int n2 = qg_2.i(kM);
        ArrayList arrayList = my_0.c();
        for (int i = 0; i < qg_2.d(kM); ++i) {
            int[] nArray = qg_2.a(kM, i)[0];
            for (int j = 0; j < n2; ++j) {
                for (int k = 0; k < n; ++k) {
                    boolean bl = !this.a(nArray, k, j, n, n2);
                    this.a(axs_1.UP, arrayList, nArray, k, j, n, n2, bl);
                    this.a(axs_1.DOWN, arrayList, nArray, k, j, n, n2, bl);
                    this.a(axs_1.LEFT, arrayList, nArray, k, j, n, n2, bl);
                    this.a(axs_1.RIGHT, arrayList, nArray, k, j, n, n2, bl);
                }
            }
        }
        return arrayList;
    }

    private boolean a(int[] nArray, int n, int n2, int n3, int n4) {
        return n >= n3 || n2 >= n4 || (nArray[n2 * n3 + n] >> 24 & 0xFF) == 0;
    }

    private List<IE> a(int n, String string, KM kM) {
        HashMap hashMap = MapsInvoker.a();
        MapInvoker.c(hashMap, EnumFacing.SOUTH, new aL1(null, n, string, new a4M(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0)));
        MapInvoker.c(hashMap, EnumFacing.NORTH, new aL1(null, n, string, new a4M(new float[]{16.0f, 0.0f, 0.0f, 16.0f}, 0)));
        ArrayList arrayList = my_0.c();
        ListInvoker.add(arrayList, new IE(new Vector3f(0.0f, 0.0f, 7.5f), new Vector3f(16.0f, 16.0f, 8.5f), hashMap, null, true));
        ListInvoker.addAll(arrayList, this.a(kM, string, n));
        return arrayList;
    }

    private List<IE> a(KM kM, String string, int n) {
        float f = qg_2.b(kM);
        float f2 = qg_2.i(kM);
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(this.a(kM));
        while (dz_0.c(iterator)) {
            aiv_0 aiv_02 = (aiv_0)dz_0.b(iterator);
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = aiv_02.a();
            float f14 = aiv_02.c();
            float f15 = aiv_02.b();
            axs_1 axs_12 = aiv_02.d();
            switch (axs_12) {
                case UP: {
                    f7 = f13;
                    f3 = f13;
                    f5 = f8 = f14 + 1.0f;
                    f9 = f15;
                    f4 = f15;
                    f10 = f15;
                    f6 = f15;
                    f11 = 16.0f / f;
                    f12 = 16.0f / (f2 - 1.0f);
                    break;
                }
                case DOWN: {
                    f10 = f15;
                    f9 = f15;
                    f7 = f13;
                    f3 = f13;
                    f5 = f8 = f14 + 1.0f;
                    f4 = f15 + 1.0f;
                    f6 = f15 + 1.0f;
                    f11 = 16.0f / f;
                    f12 = 16.0f / (f2 - 1.0f);
                    break;
                }
                case LEFT: {
                    f7 = f15;
                    f3 = f15;
                    f8 = f15;
                    f5 = f15;
                    f10 = f13;
                    f4 = f13;
                    f6 = f9 = f14 + 1.0f;
                    f11 = 16.0f / (f - 1.0f);
                    f12 = 16.0f / f2;
                    break;
                }
                case RIGHT: {
                    f8 = f15;
                    f7 = f15;
                    f3 = f15 + 1.0f;
                    f5 = f15 + 1.0f;
                    f10 = f13;
                    f4 = f13;
                    f6 = f9 = f14 + 1.0f;
                    f11 = 16.0f / (f - 1.0f);
                    f12 = 16.0f / f2;
                }
            }
            float f16 = 16.0f / f;
            float f17 = 16.0f / f2;
            f3 *= f16;
            f5 *= f16;
            f4 *= f17;
            f6 *= f17;
            f4 = 16.0f - f4;
            f6 = 16.0f - f6;
            HashMap hashMap = MapsInvoker.a();
            MapInvoker.c(hashMap, axs_12.d(), new aL1(null, n, string, new a4M(new float[]{f7 *= f11, f9 *= f12, f8 *= f11, f10 *= f12}, 0)));
            switch (axs_12) {
                case UP: {
                    ListInvoker.add(arrayList, new IE(new Vector3f(f3, f4, 7.5f), new Vector3f(f5, f4, 8.5f), hashMap, null, true));
                    break;
                }
                case DOWN: {
                    ListInvoker.add(arrayList, new IE(new Vector3f(f3, f6, 7.5f), new Vector3f(f5, f6, 8.5f), hashMap, null, true));
                    break;
                }
                case LEFT: {
                    ListInvoker.add(arrayList, new IE(new Vector3f(f3, f4, 7.5f), new Vector3f(f3, f6, 8.5f), hashMap, null, true));
                    break;
                }
                case RIGHT: {
                    ListInvoker.add(arrayList, new IE(new Vector3f(f5, f4, 7.5f), new Vector3f(f5, f6, 8.5f), hashMap, null, true));
                }
            }
        }
        return arrayList;
    }
}

