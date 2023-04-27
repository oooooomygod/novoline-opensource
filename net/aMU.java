/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.Event;
import cc.novoline.modules.configurations.property.AbstractProperty;

public class aMU
implements Event {
    private String b;
    private AbstractProperty a;

    public AbstractProperty b() {
        return this.a;
    }

    public aMU(AbstractProperty abstractProperty, String string) {
        this.a = abstractProperty;
        this.b = string;
    }

    public String a() {
        return this.b;
    }
}

