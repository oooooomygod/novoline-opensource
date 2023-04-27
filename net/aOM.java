/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jdk.nashorn.api.scripting.ClassFilter
 */
package net;

import cc.novoline.invoke.StringInvoker;
import cc.novoline.script.Script;
import jdk.nashorn.api.scripting.ClassFilter;
import net.tu_2;

public class aOM
implements ClassFilter {
    public boolean exposeToScripts(String string) {
        Script.g();
        return StringInvoker.i(string, tu_2.a) == 0;
    }
}

