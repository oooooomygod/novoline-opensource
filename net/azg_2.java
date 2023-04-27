/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import com.google.common.reflect.TypeToken;
import deobf.TypeSerializerCollection;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import net.GE;
import net.a68;
import net.ad__0;
import net.at6;
import net.ki_0;
import net.ow_1;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.azg
 */
class azg_2
implements GE<Pattern> {
    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable Pattern pattern, @NonNull ad__0 ad__02) {
        TypeSerializerCollection.b();
        ki_0.a(ad__02, pattern != null ? ow_1.a(pattern) : null);
    }

    azg_2(at6 at62) {
        this();
    }

    @Override
    public Pattern a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a68 {
        try {
            return ow_1.c(ki_0.o(ad__02));
        }
        catch (PatternSyntaxException patternSyntaxException) {
            throw new a68(patternSyntaxException);
        }
    }

    private static PatternSyntaxException a(PatternSyntaxException patternSyntaxException) {
        return patternSyntaxException;
    }

    private azg_2() {
    }
}

