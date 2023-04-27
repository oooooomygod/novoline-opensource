/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IPlayerUsage;
import net.PlayerUsageSnooper;

/*
 * Renamed from net.aOk
 */
public class aok_0 {
    public static boolean a(IPlayerUsage iPlayerUsage) {
        return iPlayerUsage.a();
    }

    public static void b(IPlayerUsage iPlayerUsage, PlayerUsageSnooper playerUsageSnooper) {
        iPlayerUsage.addServerTypeToSnooper(playerUsageSnooper);
    }

    public static void a(IPlayerUsage iPlayerUsage, PlayerUsageSnooper playerUsageSnooper) {
        iPlayerUsage.a(playerUsageSnooper);
    }
}

