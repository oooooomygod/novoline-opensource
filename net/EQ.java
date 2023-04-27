/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.modules.configurations.property.AbstractProperty;
import deobf.IntProperty;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class EQ
extends AbstractProperty<ae6_0> {
    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public boolean a() {
        IntProperty.c();
        ae6_0 ae6_02 = (ae6_0)this.a;
        int n = age_2.a(ae6_02);
        if (ae6_02 instanceof auh_2) {
            return KeyboardInvoker.a(n);
        }
        throw new UnsupportedOperationException();
    }

    @Contract(pure=true)
    public EQ(@Nullable ae6_0 ae6_02) {
        super(ae6_02);
    }
}

