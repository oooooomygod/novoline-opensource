/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.CopyOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import net.aev_1;
import net.ah__0;
import net.akg_1;

class FX
extends FilterWriter {
    private Path b;
    private Path a;

    @Override
    public void close() throws IOException {
        akg_1.b();
        super.close();
        aev_1.b(ah__0.b(this.b), new FileAttribute[0]);
        aev_1.a(this.a, this.b, new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        if (ListInvoker.b() != null) {
            akg_1.b(new int[2]);
        }
    }

    protected FX(Path path, Path path2, Writer writer) {
        super(writer);
        this.a = path;
        this.b = path2;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

