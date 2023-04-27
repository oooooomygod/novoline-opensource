/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package net.skidunion;

import kotlin.Metadata;
import net.jc_0;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lnet/net.skidunion/M;", "", "(Ljava/lang/String;I)V", "PLAY", "LOGIN", "SERVERBOUND", "client"})
public class M
extends Enum<M> {
    public static /* enum */ M LOGIN;
    public static /* enum */ M SERVERBOUND;
    private static /* synthetic */ M[] a;
    public static /* enum */ M PLAY;

    public static M valueOf(String string) {
        return (M)jc_0.a(M.class, string);
    }

    static {
        M[] mArray = new M[3];
        M[] mArray2 = mArray;
        mArray[0] = PLAY = new M();
        mArray[1] = LOGIN = new M();
        mArray[2] = SERVERBOUND = new M();
        a = mArray;
    }

    public static M[] values() {
        return (M[])a.clone();
    }
}

