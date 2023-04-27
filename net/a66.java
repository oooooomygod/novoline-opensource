/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.S20PacketEntityProperties;
import java.util.Collection;
import net.AttributeModifier;

public class a66 {
    private Collection<AttributeModifier> d;
    private String b;
    S20PacketEntityProperties a;
    private double c;

    public double a() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public Collection<AttributeModifier> b() {
        return this.d;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public a66(S20PacketEntityProperties s20PacketEntityProperties, String string, double d, Collection collection) {
        this.a = s20PacketEntityProperties;
        this.b = string;
        this.c = d;
        this.d = collection;
    }
}

