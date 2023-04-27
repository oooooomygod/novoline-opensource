/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import net.a8d_0;

class AS
implements ParameterizedType {
    @Override
    public Type getOwnerType() {
        return null;
    }

    AS() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{a8d_0.class};
    }

    @Override
    public Type getRawType() {
        return List.class;
    }
}

