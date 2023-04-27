/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import deobf.TimerUtil;
import net.skidunion.annotations;

public class ScriptTimer {
    private TimerUtil a;

    public ScriptTimer(TimerUtil timerUtil) {
        this.a = timerUtil;
    }

    @annotations
    public boolean delay(long l4) {
        return this.a.c(l4);
    }

    @annotations
    public void reset() {
        this.a.a();
    }
}

