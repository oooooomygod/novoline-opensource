/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events.script;

import cc.novoline.events.Event;
import net.skidunion.annotations;

public class ScriptRender3DEvent
implements Event {
    private float a;

    public ScriptRender3DEvent(float f) {
        this.a = f;
    }

    @annotations
    public float getPartialTicks() {
        return this.a;
    }
}

