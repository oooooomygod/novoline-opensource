/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.utils.fonts.impl;

import cc.novoline.invoke.SneakyThrowingInvoker;
import cc.novoline.utils.fonts.api.FontType;
import deobf.MCInvoker;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumMap;
import net.FontFamily;
import net.ResourceLocation;
import net.SimpleFontManager;
import net.aCZ;
import net.aI_;
import net.aL0;
import net.aWR;
import net.aZ6;
import net.abh_2;
import net.ae7_0;
import net.at_;
import net.ayz_2;
import net.dw_0;
import net.j6_0;
import net.wq_0;

class FontRegistry
extends EnumMap<FontType, FontFamily> {
    private FontFamily a(FontType fontType) {
        return this.computeIfAbsent(fontType, arg_0 -> FontRegistry.lambda$fontFamily$0(fontType, arg_0));
    }

    private static FontFamily lambda$fontFamily$0(FontType fontType, FontType fontType2) {
        try {
            return ae7_0.a(fontType, FontRegistry.b(fontType));
        }
        catch (IOException iOException) {
            throw SneakyThrowingInvoker.a(iOException);
        }
    }

    FontRegistry(at_ at_3) {
        this();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static Font a(InputStream inputStream) {
        try {
            Font font = wq_0.a(0, inputStream);
            return font;
        }
        catch (FontFormatException fontFormatException) {
            throw new RuntimeException(ayz_2.b, fontFormatException);
        }
        catch (IOException iOException) {
            throw new RuntimeException(ayz_2.d, iOException);
        }
    }

    private FontRegistry() {
        super(FontType.class);
    }

    private static Font b(FontType fontType) throws IOException {
        abh_2 abh_22;
        aI_ aI_2 = MCInvoker.x(MCInvoker.f());
        SimpleFontManager.b();
        ResourceLocation resourceLocation = new ResourceLocation(aL0.a(aL0.a(new StringBuilder(), ayz_2.a), aCZ.a(fontType)).toString());
        try {
            abh_22 = j6_0.b(aI_2, resourceLocation);
        }
        catch (IOException iOException) {
            throw new IOException(aL0.a(aL0.a(new StringBuilder(), ayz_2.c), resourceLocation).toString(), iOException);
        }
        InputStream inputStream = dw_0.b(abh_22);
        Throwable throwable = null;
        try {
            Font font = FontRegistry.a(inputStream);
            return font;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            try {
                aZ6.b(inputStream);
            }
            catch (Throwable throwable3) {
                aWR.a(throwable, throwable3);
                aZ6.b(inputStream);
            }
        }
    }

    static FontFamily a(FontRegistry fontRegistry, FontType fontType) {
        return fontRegistry.a(fontType);
    }
}

