/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayer;
import deobf.EntityPlayerMP;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import net.minecraft.network.packts.S2FPacketSetSlot;
import java.util.List;

public class Ln
extends Item {
    public Ln() {
        this.a(1);
    }

    public static int a(ItemStack itemStack) {
        return tn_0.g(act_2.a(itemStack), apd_0.h);
    }

    private void a(ItemStack itemStack, EntityPlayer entityPlayer) {
        NBTTagCompound nBTTagCompound;
        if (act_2.a(itemStack) != null && !tn_0.c(nBTTagCompound = act_2.a(itemStack), apd_0.g)) {
            tn_0.a(nBTTagCompound, apd_0.j, true);
            if (Ln.a(nBTTagCompound)) {
                NBTTagList nBTTagList = tn_0.c(nBTTagCompound, apd_0.m, 8);
                for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                    IChatComponent iChatComponent;
                    String string = kv_0.f(nBTTagList, i);
                    try {
                        iChatComponent = aGU.a(string);
                        iChatComponent = a7C.a(entityPlayer, iChatComponent, entityPlayer);
                    }
                    catch (Exception exception) {
                        iChatComponent = new ChatComponentText(string);
                    }
                    kv_0.a(nBTTagList, i, new NBTTagString(aGU.a(iChatComponent)));
                }
                tn_0.a(nBTTagCompound, apd_0.k, nBTTagList);
                if (entityPlayer instanceof EntityPlayerMP && a6w_0.n(entityPlayer) == itemStack) {
                    Slot slot = afy_2.a(entityPlayer.bI, entityPlayer.inventory, entityPlayer.inventory.a);
                    qv_0.a(((EntityPlayerMP)entityPlayer).playerNetServerHandler, new S2FPacketSetSlot(0, slot.b, itemStack));
                }
            }
        }
    }

    @Override
    public boolean h(ItemStack itemStack) {
        return true;
    }

    @Override
    public String e(ItemStack itemStack) {
        NBTTagCompound nBTTagCompound;
        String string;
        if (act_2.b(itemStack) && !aod_2.a(string = tn_0.m(nBTTagCompound = act_2.a(itemStack), apd_0.f))) {
            return string;
        }
        return super.e(itemStack);
    }

    public static boolean a(NBTTagCompound nBTTagCompound) {
        if (!aSD.a(nBTTagCompound)) {
            return false;
        }
        if (!tn_0.a(nBTTagCompound, apd_0.d, 8)) {
            return false;
        }
        String string = tn_0.m(nBTTagCompound, apd_0.e);
        return StringInvoker.c(string) <= 32 && tn_0.a(nBTTagCompound, apd_0.b, 8);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!world.isRemote) {
            this.a(itemStack, entityPlayer);
        }
        a6w_0.a(entityPlayer, itemStack);
        a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        return itemStack;
    }

    @Override
    public void a(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean bl) {
        if (act_2.b(itemStack)) {
            NBTTagCompound nBTTagCompound = act_2.a(itemStack);
            String string = tn_0.m(nBTTagCompound, apd_0.c);
            if (!aod_2.a(string)) {
                ListInvoker.add(list, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), ahq_0.a(apd_0.l, new Object[]{string})).toString());
            }
            ListInvoker.add(list, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), ahq_0.b(aL0.c(aL0.a(new StringBuilder(), apd_0.a), tn_0.g(nBTTagCompound, apd_0.i)).toString())).toString());
        }
    }
}

