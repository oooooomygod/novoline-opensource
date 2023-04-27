/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.modules.AbstractModule;
import deobf.ModuleHolder;
import net.XL;
import net.asl_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.Pc
 */
public class pc_0<Module extends AbstractModule>
extends ModuleHolder<Module> {
    public static <Module extends AbstractModule> @NonNull pc_0<Module> a(@NonNull String string, @NonNull Module Module2) {
        asl_0.a(string, XL.c);
        asl_0.a(Module2, XL.a);
        return new pc_0<Module>(string, Module2);
    }

    private pc_0(@NonNull String string, @NonNull Module Module2) {
        super(string, Module2);
    }

    public void a(@NonNull Module Module2) {
        asl_0.a(Module2, XL.b);
        this.e = Module2;
    }
}

