/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpecBuilder
 */
package net;

import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpecBuilder;

public class EB {
    public static OptionSpecBuilder a(OptionParser optionParser, String string) {
        return optionParser.accepts(string);
    }

    public static void a(OptionParser optionParser) {
        optionParser.allowsUnrecognizedOptions();
    }

    public static OptionSet a(OptionParser optionParser, String[] stringArray) {
        return optionParser.parse(stringArray);
    }

    public static NonOptionArgumentSpec b(OptionParser optionParser) {
        return optionParser.nonOptions();
    }
}

