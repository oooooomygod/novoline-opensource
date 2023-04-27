/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package net.skidunion;

import kotlin.Metadata;
import net.jc_0;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lnet/net.skidunion/I;", "", "(Ljava/lang/String;I)V", "CONNECTING", "DISCONNECTED", "LOGIN", "LOGIN_SENT", "AUTHENTICATED", "client"})
public class I
extends Enum<I> {
    public static /* enum */ I AUTHENTICATED;
    public static /* enum */ I DISCONNECTED;
    public static /* enum */ I LOGIN_SENT;
    public static /* enum */ I LOGIN;
    public static /* enum */ I CONNECTING;
    private static /* synthetic */ I[] a;

    static {
        I[] iArray = new I[5];
        I[] iArray2 = iArray;
        iArray[0] = CONNECTING = new I();
        iArray[1] = DISCONNECTED = new I();
        iArray[2] = LOGIN = new I();
        iArray[3] = LOGIN_SENT = new I();
        iArray[4] = AUTHENTICATED = new I();
        a = iArray;
    }

    public static I valueOf(String string) {
        return (I)jc_0.a(I.class, string);
    }

    public static I[] values() {
        return (I[])a.clone();
    }
}

