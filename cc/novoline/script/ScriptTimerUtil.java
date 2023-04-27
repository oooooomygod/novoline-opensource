/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import deobf.TimerUtil;
import net.skidunion.annotations;

public class ScriptTimerUtil {
    @annotations
    public ScriptTimer getTimer() {
        return new ScriptTimer(new TimerUtil());
    }
}

