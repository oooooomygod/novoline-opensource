/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import deobf.MCInvoker;
import net.skidunion.annotations;

public class ScriptGameUtil {
    @annotations
    public void setTimer(float f) {
        MCInvoker.f().timer.timerSpeed = f;
    }
}

