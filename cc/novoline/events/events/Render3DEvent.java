/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.Event;
import cc.novoline.events.events.script.ScriptRender3DEvent;
import cc.novoline.invoke.EventManagerInvoker;

public class Render3DEvent
implements Event {
    private float a;

    public Render3DEvent(float f) {
        ScriptRender3DEvent scriptRender3DEvent = new ScriptRender3DEvent(f);
        EventManagerInvoker.call(scriptRender3DEvent);
        this.a = scriptRender3DEvent.getPartialTicks();
    }

    public float a() {
        return this.a;
    }
}

