/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/*
 * Renamed from net.aDd
 */
class add_0
implements ParameterizedType {
    @Override
    public Type getRawType() {
        return List.class;
    }

    add_0() {
    }

    @Override
    public Type getOwnerType() {
        return null;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class};
    }
}

