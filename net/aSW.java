/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  joptsimple.ArgumentAcceptingOptionSpec
 */
package net;

import joptsimple.ArgumentAcceptingOptionSpec;

public class aSW {
    public static ArgumentAcceptingOptionSpec a(ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec, Class clazz) {
        return argumentAcceptingOptionSpec.ofType(clazz);
    }

    public static ArgumentAcceptingOptionSpec a(ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec, Object object, Object[] objectArray) {
        return argumentAcceptingOptionSpec.defaultsTo(object, objectArray);
    }

    public static ArgumentAcceptingOptionSpec a(ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec) {
        return argumentAcceptingOptionSpec.required();
    }
}

