/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import deobf.IChatComponent;
import java.util.Iterator;
import java.util.Spliterator;
import net.ChatStyle;
import net.akx_1;
import net.anz_0;
import net.aou_1;
import net.azx_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.ao4
 */
class ao4_0
extends aou_1 {
    private static ao4_0 d;

    ao4_0() {
    }

    @Override
    public @NonNull Iterator<IChatComponent> iterator() {
        return anz_0.a();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    @Override
    public Spliterator<IChatComponent> spliterator() {
        return azx_0.a();
    }

    static ao4_0 a() {
        aou_1.b();
        if (d == null) {
            d = new ao4_0();
        }
        return d;
    }

    @Override
    public @NonNull String toString() {
        return akx_1.a;
    }

    @Override
    public IChatComponent a(String string) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IChatComponent a(ChatStyle chatStyle) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IChatComponent a(IChatComponent iChatComponent) {
        throw new UnsupportedOperationException();
    }
}

