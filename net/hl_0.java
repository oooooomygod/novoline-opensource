/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jdk.nashorn.api.scripting.ClassFilter
 *  jdk.nashorn.api.scripting.NashornScriptEngineFactory
 */
package net;

import javax.script.ScriptEngine;
import jdk.nashorn.api.scripting.ClassFilter;
import jdk.nashorn.api.scripting.NashornScriptEngineFactory;

/*
 * Renamed from net.Hl
 */
public class hl_0 {
    private static String b = "TXboBb";

    public static String b() {
        return b;
    }

    static {
        if (hl_0.b() == null) {
            hl_0.b("TXboBb");
        }
    }

    public static ScriptEngine a(NashornScriptEngineFactory nashornScriptEngineFactory, ClassFilter classFilter) {
        return nashornScriptEngineFactory.getScriptEngine(classFilter);
    }

    public static void b(String string) {
        b = string;
    }
}

