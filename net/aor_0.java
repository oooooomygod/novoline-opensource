/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.Event;
import net.skidunion.annotations;

/*
 * Renamed from net.aOr
 */
public class aor_0
implements Event {
    private ScaledResolution b;
    private float a;

    public aor_0(ScaledResolution scaledResolution, float f) {
        this.b = scaledResolution;
        this.a = f;
    }

    @annotations
    public float getPartialTicks() {
        return this.a;
    }

    @annotations
    public ScaledResolution getResolution() {
        return this.b;
    }
}

