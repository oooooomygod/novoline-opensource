/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package deobf;

import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import java.lang.invoke.MethodHandles;
import net.ModuleManager;
import net.a1c;
import org.checkerframework.checker.nullness.qual.NonNull;

public class ItemPhysic
extends AbstractModule {
    public static boolean H;
    private static long I;

    @Override
    public void w() {
        H = false;
    }

    @Override
    public void o() {
        H = true;
    }

    public ItemPhysic(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = I ^ 0xDE7C533069AL;
        long l5 = l4 ^ 0x68009BC73CA9L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
    }

    static {
        I = a1c.a(911432612430830377L, 6990222369038443271L, MethodHandles.lookup().lookupClass()).a(28566856280011L);
    }
}

