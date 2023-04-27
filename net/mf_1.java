/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net;

import com.google.common.util.concurrent.ListenableFuture;
import deobf.IResourcePack;
import net.minecraft.resources.ResourcePackRepository;
import java.io.File;
import java.util.List;

/*
 * Renamed from net.mF
 */
public class mf_1 {
    public static ListenableFuture a(ResourcePackRepository resourcePackRepository, String string, String string2) {
        return resourcePackRepository.a(string, string2);
    }

    public static ListenableFuture a(ResourcePackRepository resourcePackRepository, File file) {
        return resourcePackRepository.a(file);
    }

    public static void a(ResourcePackRepository resourcePackRepository, List list) {
        resourcePackRepository.a(list);
    }

    public static IResourcePack e(ResourcePackRepository resourcePackRepository) {
        return resourcePackRepository.f();
    }

    public static List b(ResourcePackRepository resourcePackRepository) {
        return resourcePackRepository.a();
    }

    public static File a(ResourcePackRepository resourcePackRepository) {
        return resourcePackRepository.i();
    }

    public static void d(ResourcePackRepository resourcePackRepository) {
        resourcePackRepository.c();
    }

    public static void c(ResourcePackRepository resourcePackRepository) {
        resourcePackRepository.d();
    }

    public static List f(ResourcePackRepository resourcePackRepository) {
        return resourcePackRepository.g();
    }
}

