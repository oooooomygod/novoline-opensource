/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.player;

import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import java.lang.invoke.MethodHandles;
import net.ModuleManager;
import net.a1c;
import org.checkerframework.checker.nullness.qual.NonNull;

public class NoRotate
extends AbstractModule {
    private static long H = a1c.a(-34963934554293315L, -1113856959221710090L, MethodHandles.lookup().lookupClass()).a(217305033458118L);

    public NoRotate(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = H ^ 0x36FAF57A430BL;
        long l5 = l4 ^ 0x5F0B063628B8L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
    }
}

