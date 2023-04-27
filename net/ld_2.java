/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IntProperty;
import cc.novoline.modules.player.InvManager;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.ld
 */
public class ld_2 {
    public static IntProperty a(InvManager invManager) {
        return invManager.l();
    }

    public static IntProperty h(InvManager invManager) {
        return invManager.u();
    }

    public static boolean a(InvManager invManager, ItemStack itemStack, ItemPotion itemPotion) {
        return invManager.a(itemStack, itemPotion);
    }

    public static ListProperty e(InvManager invManager) {
        return invManager.y();
    }

    public static IntProperty b(InvManager invManager) {
        return invManager.s();
    }

    public static IntProperty f(InvManager invManager) {
        return invManager.r();
    }

    public static IntProperty g(InvManager invManager) {
        return invManager.f();
    }

    public static IntProperty d(InvManager invManager) {
        return invManager.k();
    }

    public static IntProperty c(InvManager invManager) {
        return invManager.g();
    }
}

