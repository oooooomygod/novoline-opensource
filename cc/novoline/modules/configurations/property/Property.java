/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.modules.configurations.property;

import org.jetbrains.annotations.Nullable;

public interface Property<Type> {
    public void a(@Nullable Type var1);

    @Nullable
    public Type get();
}

