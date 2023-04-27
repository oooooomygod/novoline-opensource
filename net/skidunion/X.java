/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.MutablePropertyReference0
 *  kotlin.reflect.KDeclarationContainer
 *  org.jetbrains.annotations.Nullable
 */
package net.skidunion;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.reflect.KDeclarationContainer;
import net.YI;
import net.kl_0;
import net.skidunion.Q;
import net.x6_0;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=3)
class X
extends MutablePropertyReference0 {
    X(Q q) {
        super((Object)q);
    }

    public KDeclarationContainer getOwner() {
        return YI.a(Q.class);
    }

    public String getName() {
        return kl_0.b;
    }

    public String getSignature() {
        return kl_0.a;
    }

    public void set(@Nullable Object object) {
        x6_0.a((Q)this.receiver, (Throwable)object);
    }

    @Nullable
    public Object get() {
        return x6_0.b((Q)this.receiver);
    }
}

