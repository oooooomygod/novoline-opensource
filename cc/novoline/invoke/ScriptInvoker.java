/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import javax.script.ScriptEngine;

public class ScriptInvoker {
    public static Object a(ScriptEngine scriptEngine, String string) {
        return scriptEngine.eval(string);
    }

    public static void addWrapper(ScriptEngine scriptEngine, String string, Object object) {
        scriptEngine.put(string, object);
    }
}

