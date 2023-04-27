/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.Collection;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.op
 */
public class op_2
extends oj_2 {
    private ResourceLocation b5;
    private JsonParser b4;
    private String b6;
    private static List<ItemStack> b3 = a7r_0.a(new ItemStack[]{new ItemStack(Items.bow), new ItemStack(Items.iron_sword), new ItemStack(Items.wooden_sword), new ItemStack(Items.stone_pickaxe), new ItemStack(Items.diamond_pickaxe), new ItemStack(Items.iron_ingot), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.bY)});

    @Override
    @Nullable
    public ResourceLocation f() {
        return this.b5;
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    private void lambda$new$1(JsonObject jsonObject) {
        ZK.b();
        this.b6 = M0.c(jsonObject, aEJ.h) ? WN.f(M0.d(M0.b(jsonObject, aEJ.e), aEJ.k)) : aEJ.f;
    }

    public op_2(@NotNull GameProfile gameProfile, @Nullable ResourceLocation resourceLocation) {
        block3: {
            super(new ZK(), gameProfile);
            this.b4 = new JsonParser();
            try {
                oc_1.a(oc_1.a(aMF.b(ms_0.b((Collection)MapInvoker.c(ayw_0.d(a4Z.c(this.bl)), aEJ.g))), this::lambda$new$0), this::lambda$new$1);
                if (this.b6 == null) {
                    this.b6 = aEJ.j;
                }
            }
            catch (Throwable throwable) {
                if (this.b6 != null) break block3;
                this.b6 = aEJ.a;
            }
        }
        this.b5 = resourceLocation;
        this.c(0, (ItemStack)ListInvoker.get(b3, anf_2.a(anf_2.c(), ListInvoker.size(b3))));
    }

    private JsonObject lambda$new$0(Property property) {
        return M0.b(M0.b(WN.c(a1r.a(this.b4, new String(apn_1.a(anu_2.a(), po_1.b(property))))), aEJ.d), aEJ.c);
    }

    @Override
    public String v() {
        return this.b6;
    }
}

