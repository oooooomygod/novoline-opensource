/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import net.JX;

/*
 * Renamed from net.a3p
 */
class a3p_0
implements ParameterizedType {
    a3p_0() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class, JX.class};
    }

    @Override
    public Type getOwnerType() {
        return null;
    }

    @Override
    public Type getRawType() {
        return Map.class;
    }
}

