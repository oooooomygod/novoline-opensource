/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

public class MH {
    private static Minecraft a = MCInvoker.f();

    public static void a(Object ... objectArray) {
        if (atz_0.a(atz_0.a()) && MH.a.world != null) {
            String string = a7r_0.b(objectArray);
            String string2 = aQ9.e;
            kp_1.a(GW.f(MH.a.ingameGUI), new ChatComponentText(aL0.a(aL0.a(new StringBuilder(), string2), string).toString()));
        }
    }

    public static ao5_0 a(String string) {
        return aar_1.a(azo_1.a(string, anw_0.LIGHT_PURPLE), aQ9.b, anw_0.GRAY);
    }

    public static void a(Object object) {
        String string = StringInvoker.a(object);
        kp_1.a(GW.f(MH.a.ingameGUI), new ChatComponentText(string));
    }

    public static ao5_0 a() {
        return aar_1.a(azo_1.a(aQ9.d, anw_0.LIGHT_PURPLE), aQ9.c, anw_0.GRAY);
    }

    public static void a(String string, Object object) {
        String string2 = aL0.a(aL0.a(aL0.a(new StringBuilder(), aar_1.a(MH.a(string))), aQ9.a), object).toString();
        kp_1.a(GW.f(MH.a.ingameGUI), new ChatComponentText(string2));
    }

    public static void a(boolean bl, Object object) {
        String string = aL0.a(aL0.a(aL0.a(new StringBuilder(), aar_1.a(MH.a())), aQ9.f), object).toString();
        kp_1.a(GW.f(MH.a.ingameGUI), new ChatComponentText(string));
    }
}

