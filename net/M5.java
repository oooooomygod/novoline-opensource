/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.Event;
import net.ScaledResolution;

public class M5
implements Event {
    private float b;
    private ScaledResolution a;

    public M5(ScaledResolution scaledResolution, float f) {
        this.a = scaledResolution;
        this.b = f;
    }

    public ScaledResolution a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }
}

