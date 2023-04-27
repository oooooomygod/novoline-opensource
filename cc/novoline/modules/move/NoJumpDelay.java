/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.move;

import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import java.lang.invoke.MethodHandles;

import org.checkerframework.checker.nullness.qual.NonNull;

public class NoJumpDelay
extends AbstractModule {
    private static long H = a1c.a(2400490737922028725L, -8339439482296188506L, MethodHandles.lookup().lookupClass()).a(254524404148415L);

    public NoJumpDelay(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = H ^ 0x2DD1EEAE483L;
        long l5 = l4 ^ 0x2C1FCFDE956L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
    }
}

