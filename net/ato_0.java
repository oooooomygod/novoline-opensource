/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Renamed from net.ato
 */
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
@Documented
public @interface ato_0 {
    public String a() default "";

    public String value();
}

