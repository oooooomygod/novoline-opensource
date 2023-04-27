/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import java.awt.Color;
import net.KU;
import net.a7l_0;
import net.aol_1;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.agc
 */
public interface agc_2
extends KU {
    public @NonNull FontRenderer a();

    default public void b(@NonNull Color color) {
        this.h(aol_1.b(color));
    }

    public @Nullable String h();

    public void a(@Nullable String var1);

    default public int i() {
        return a7l_0.a(this.a(), this.h());
    }

    public void h(int var1);

    public int g();

    public void a(@NonNull FontRenderer var1);
}

