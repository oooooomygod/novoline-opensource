/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import java.io.IOException;
import net.ConfigurationOptions;
import net.ad__0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.Vq
 */
public interface vq_0<NodeType extends ad__0> {
    @NotNull
    public NodeType b(@NotNull ConfigurationOptions var1) throws IOException;

    public void a(@NotNull ad__0 var1) throws IOException;

    default public boolean e() {
        return true;
    }

    default public boolean a() {
        return true;
    }

    @NotNull
    public NodeType a(@NotNull ConfigurationOptions var1);

    @NotNull
    default public NodeType b() {
        return this.a(this.d());
    }

    @NotNull
    public ConfigurationOptions d();

    @NotNull
    default public NodeType c() throws IOException {
        return this.b(this.d());
    }
}

