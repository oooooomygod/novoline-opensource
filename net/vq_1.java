/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaManagerImpl
 *  com.viaversion.viaversion.ViaManagerImpl$ViaManagerBuilder
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 */
package net;

import com.viaversion.viaversion.ViaManagerImpl;
import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;

/*
 * Renamed from net.vq
 */
public class vq_1 {
    public static ViaManagerImpl.ViaManagerBuilder a(ViaManagerImpl.ViaManagerBuilder viaManagerBuilder, ViaPlatformLoader viaPlatformLoader) {
        return viaManagerBuilder.loader(viaPlatformLoader);
    }

    public static ViaManagerImpl a(ViaManagerImpl.ViaManagerBuilder viaManagerBuilder) {
        return viaManagerBuilder.build();
    }

    public static ViaManagerImpl.ViaManagerBuilder a(ViaManagerImpl.ViaManagerBuilder viaManagerBuilder, ViaPlatform viaPlatform) {
        return viaManagerBuilder.platform(viaPlatform);
    }

    public static ViaManagerImpl.ViaManagerBuilder a(ViaManagerImpl.ViaManagerBuilder viaManagerBuilder, ViaInjector viaInjector) {
        return viaManagerBuilder.injector(viaInjector);
    }
}

