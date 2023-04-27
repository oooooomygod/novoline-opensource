/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.ModuleHolder;
import java.util.List;

/*
 * Renamed from net.aWe
 */
public class awe_0 {
    public static List a(ModuleArrayMap moduleArrayMap, EnumModuleType enumModuleType) {
        return moduleArrayMap.a(enumModuleType);
    }

    public static AbstractModule a(ModuleArrayMap moduleArrayMap, String string) {
        return moduleArrayMap.a(string);
    }

    public static AbstractModule a(ModuleArrayMap moduleArrayMap, Class clazz) {
        return moduleArrayMap.b(clazz);
    }

    public static ModuleHolder b(ModuleArrayMap moduleArrayMap, Class clazz) {
        return moduleArrayMap.a(clazz);
    }
}

