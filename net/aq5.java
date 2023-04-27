/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import net.ayp_0;

class aq5
implements ParameterizedType {
    @Override
    public Type getOwnerType() {
        return null;
    }

    aq5() {
    }

    @Override
    public Type getRawType() {
        return List.class;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{ayp_0.class};
    }
}

