/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.io.File;
import java.io.FilenameFilter;
import net.AnvilSaveConverter;
import net.aYY;

class aVP
implements FilenameFilter {
    AnvilSaveConverter a;

    @Override
    public boolean accept(File file, String string) {
        return StringInvoker.c(string, aYY.a);
    }

    aVP(AnvilSaveConverter anvilSaveConverter) {
        this.a = anvilSaveConverter;
    }
}

