/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.internal.Reflection
 *  kotlin.reflect.KClass
 */
package net;

import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

public class YI {
    public static KClass a(Class clazz) {
        return Reflection.getOrCreateKotlinClass((Class)clazz);
    }
}

