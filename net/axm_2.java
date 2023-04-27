/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.yn_0;

/*
 * Renamed from net.axm
 */
public enum axm_2 {
    ANTIALIASING(yn_0.an, yn_0.ah, yn_0.o),
    NORMAL_MAP(yn_0.m, yn_0.t, yn_0.v),
    SPECULAR_MAP(yn_0.b, yn_0.P, yn_0.a),
    RENDER_RES_MUL(yn_0.am, yn_0.N, yn_0.Y),
    SHADOW_RES_MUL(yn_0.U, yn_0.A, yn_0.aq),
    HAND_DEPTH_MUL(yn_0.T, yn_0.E, yn_0.p),
    CLOUD_SHADOW(yn_0.y, yn_0.r, yn_0.aj),
    OLD_HAND_LIGHT(yn_0.at, yn_0.G, yn_0.D),
    OLD_LIGHTING(yn_0.ac, yn_0.V, yn_0.w),
    SHADER_PACK(yn_0.ad, yn_0.al, yn_0.x),
    TWEAK_BLOCK_DAMAGE(yn_0.n, yn_0.X, yn_0.l),
    SHADOW_CLIP_FRUSTRUM(yn_0.j, yn_0.C, yn_0.ai),
    TEX_MIN_FIL_B(yn_0.ag, yn_0.ao, yn_0.O),
    TEX_MIN_FIL_N(yn_0.q, yn_0.ae, yn_0.I),
    TEX_MIN_FIL_S(yn_0.ab, yn_0.S, yn_0.Z),
    TEX_MAG_FIL_B(yn_0.as, yn_0.F, yn_0.i),
    TEX_MAG_FIL_N(yn_0.ar, yn_0.Q, yn_0.K),
    TEX_MAG_FIL_S(yn_0.u, yn_0.g, yn_0.af);

    private String d = null;
    private String a = null;
    private String c = null;

    public String b() {
        return this.d;
    }

    private axm_2(String string2, String string3, String string4) {
        this.d = string2;
        this.a = string3;
        this.c = string4;
    }

    public String a() {
        return this.c;
    }

    public String c() {
        return this.a;
    }
}

