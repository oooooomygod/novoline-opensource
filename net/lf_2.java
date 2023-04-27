/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.ErrorCode
 */
package net;

import tv.twitch.ErrorCode;

/*
 * Renamed from net.lf
 */
public class lf_2 {
    private static String b;

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    public static boolean c(ErrorCode errorCode) {
        return ErrorCode.succeeded((ErrorCode)errorCode);
    }

    static {
        if (lf_2.b() != null) {
            lf_2.b("coUGSc");
        }
    }

    public static int d(ErrorCode errorCode) {
        return errorCode.getValue();
    }

    public static String b(ErrorCode errorCode) {
        return ErrorCode.getString((ErrorCode)errorCode);
    }

    public static boolean a(ErrorCode errorCode) {
        return ErrorCode.failed((ErrorCode)errorCode);
    }
}

