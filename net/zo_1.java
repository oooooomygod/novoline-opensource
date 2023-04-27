/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.io.File;
import java.io.FileNotFoundException;
import net.aE7;

/*
 * Renamed from net.zO
 */
public class zo_1
extends FileNotFoundException {
    public zo_1(File file, String string) {
        super(StringInvoker.a(aE7.a, new Object[]{string, file}));
    }
}

