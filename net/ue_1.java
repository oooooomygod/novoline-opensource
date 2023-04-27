/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.awt.Color;
import net.KU;
import net.aol_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.uE
 */
public interface ue_1
extends KU {
    public int e();

    default public void a(@NonNull Color color) {
        this.f(aol_1.b(color));
    }

    public void f(int var1);
}

