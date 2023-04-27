/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.aON;
import net.acm_0;
import net.awc_2;

public enum ajP {
    R1_18(ProtocolVersion.v1_18, acm_0.j),
    R1_17_1(ProtocolVersion.v1_17_1, acm_0.A),
    R1_17(ProtocolVersion.v1_17, acm_0.C),
    R1_16_4(ProtocolVersion.v1_16_4, acm_0.o),
    R1_16_3(ProtocolVersion.v1_16_3, acm_0.c),
    R1_16_2(ProtocolVersion.v1_16_2, acm_0.g),
    R1_16_1(ProtocolVersion.v1_16_1, acm_0.B),
    R1_16(ProtocolVersion.v1_16, acm_0.m),
    R1_15_2(ProtocolVersion.v1_15_2, acm_0.f),
    R1_15_1(ProtocolVersion.v1_15_1, acm_0.u),
    R1_15(ProtocolVersion.v1_15, acm_0.w),
    R1_14_4(ProtocolVersion.v1_14_4, acm_0.p),
    R1_14_3(ProtocolVersion.v1_14_3, acm_0.F),
    R1_14_2(ProtocolVersion.v1_14_2, acm_0.H),
    R1_14_1(ProtocolVersion.v1_14_1, acm_0.G),
    R1_14(ProtocolVersion.v1_14, acm_0.e),
    R1_13_2(ProtocolVersion.v1_13_2, acm_0.I),
    R1_13_1(ProtocolVersion.v1_13_1, acm_0.l),
    R1_13(ProtocolVersion.v1_13, acm_0.d),
    R1_12_2(ProtocolVersion.v1_12_2, acm_0.D),
    R1_12_1(ProtocolVersion.v1_12_1, acm_0.J),
    R1_12(ProtocolVersion.v1_12, acm_0.v),
    R1_11_1(ProtocolVersion.v1_11_1, acm_0.t),
    R1_11(ProtocolVersion.v1_11, acm_0.q),
    R1_10(ProtocolVersion.v1_10, acm_0.n),
    R1_9_3(ProtocolVersion.v1_9_3, acm_0.k),
    R1_9_2(ProtocolVersion.v1_9_2, acm_0.b),
    R1_9_1(ProtocolVersion.v1_9_1, acm_0.r),
    R1_9(ProtocolVersion.v1_9, acm_0.z),
    R1_8(ProtocolVersion.v1_8, acm_0.E),
    R1_7_6(ProtocolVersion.v1_7_6, acm_0.h),
    R1_7(ProtocolVersion.v1_7_1, acm_0.s);

    private ProtocolVersion c;
    private aON a;

    public ProtocolVersion b() {
        return this.c;
    }

    public static ajP a(int n) {
        aON.b();
        ajP[] ajPArray = ajP.values();
        int n2 = ajPArray.length;
        int n3 = 0;
        if (n3 < n2) {
            ajP ajP2 = ajPArray[n3];
            if (awc_2.b(ajP2.b()) == n) {
                return ajP2;
            }
            ++n3;
        }
        return null;
    }

    public aON a() {
        return this.a;
    }

    private ajP(ProtocolVersion protocolVersion, aON aON2) {
        this.c = protocolVersion;
        this.a = aON2;
    }

    public static ProtocolVersion b(int n) {
        ajP[] ajPArray = ajP.values();
        int n2 = ajPArray.length;
        aON.b();
        int n3 = 0;
        if (n3 < n2) {
            ajP ajP2 = ajPArray[n3];
            if (awc_2.b(ajP2.b()) == n) {
                return ajP2.b();
            }
            ++n3;
        }
        if (ListInvoker.b() != null) {
            aON.b(new ListInvoker[3]);
        }
        return null;
    }

    public static aON c(int n) {
        aON.b();
        ajP[] ajPArray = ajP.values();
        int n2 = ajPArray.length;
        int n3 = 0;
        if (n3 < n2) {
            ajP ajP2 = ajPArray[n3];
            if (awc_2.b(ajP2.b()) == n) {
                return ajP2.a();
            }
            ++n3;
            ListInvoker.b(new ListInvoker[2]);
        }
        return null;
    }
}

