/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.Event;
import cc.novoline.invoke.EventManagerInvoker;
import net.ScaledResolution;
import net.aor_0;

public class Render2DEvent
implements Event {
    private ScaledResolution b;
    private float a;

    public float a() {
        return this.a;
    }

    public ScaledResolution b() {
        return this.b;
    }

    public Render2DEvent(ScaledResolution scaledResolution, float f) {
        aor_0 aor_02 = new aor_0(scaledResolution, f);
        EventManagerInvoker.call(aor_02);
        this.b = aor_02.getResolution();
        this.a = aor_02.getPartialTicks();
    }
}

