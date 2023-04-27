/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.OptionSpecBuilder
 */
package net;

import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionSpecBuilder;

/*
 * Renamed from net.aDo
 */
public class ado_0 {
    public static ArgumentAcceptingOptionSpec a(OptionSpecBuilder optionSpecBuilder) {
        return optionSpecBuilder.withRequiredArg();
    }

    public static ArgumentAcceptingOptionSpec b(OptionSpecBuilder optionSpecBuilder) {
        return optionSpecBuilder.withOptionalArg();
    }
}

