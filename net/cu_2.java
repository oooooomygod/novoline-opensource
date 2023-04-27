/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import deobf.Entity;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.cu
 */
public class cu_2
extends am_0 {
    @Override
    public String b() {
        return aA4.f;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        Entity entity;
        if (stringArray.length < 1) {
            throw new ip_2(aA4.h, new Object[0]);
        }
        int n = 0;
        if (stringArray.length != 2 && stringArray.length != 4 && stringArray.length != 6) {
            entity = cu_2.a(iCommandSender);
        } else {
            entity = cu_2.b(iCommandSender, stringArray[0]);
            n = 1;
        }
        if (stringArray.length != 1 && stringArray.length != 2) {
            if (stringArray.length < n + 3) {
                throw new ip_2(aA4.a, new Object[0]);
            }
            if (entity.worldObj != null) {
                int n2 = n + 1;
                HY hY = cu_2.b(entity.posX, stringArray[n], true);
                HY hY2 = cu_2.a(entity.posY, stringArray[n2++], 0, 0, false);
                HY hY3 = cu_2.b(entity.posZ, stringArray[n2++], true);
                HY hY4 = cu_2.b(entity.rotationYaw, stringArray.length > n2 ? stringArray[n2++] : aA4.d, false);
                HY hY5 = cu_2.b(entity.rotationPitch, stringArray.length > n2 ? stringArray[n2] : aA4.b, false);
                if (entity instanceof EntityPlayerMP) {
                    EnumSet enumSet = ace_2.b(adg_0.class);
                    if (aqa_0.b(hY)) {
                        aS0.b((Set)enumSet, (Object)adg_0.X);
                    }
                    if (aqa_0.b(hY2)) {
                        aS0.b((Set)enumSet, (Object)adg_0.Y);
                    }
                    if (aqa_0.b(hY3)) {
                        aS0.b((Set)enumSet, (Object)adg_0.Z);
                    }
                    if (aqa_0.b(hY5)) {
                        aS0.b((Set)enumSet, (Object)adg_0.X_ROT);
                    }
                    if (aqa_0.b(hY4)) {
                        aS0.b((Set)enumSet, (Object)adg_0.Y_ROT);
                    }
                    float f = (float)aqa_0.c(hY4);
                    if (!aqa_0.b(hY4)) {
                        f = MathHelper.a(f);
                    }
                    float f2 = (float)aqa_0.c(hY5);
                    if (!aqa_0.b(hY5)) {
                        f2 = MathHelper.a(f2);
                    }
                    if (f2 > 90.0f || f2 < -90.0f) {
                        f2 = MathHelper.a(180.0f - f2);
                        f = MathHelper.a(f + 180.0f);
                    }
                    ayj_0.b(entity, null);
                    qv_0.a(((EntityPlayerMP)entity).playerNetServerHandler, aqa_0.c(hY), aqa_0.c(hY2), aqa_0.c(hY3), f, f2, enumSet);
                    ayj_0.a(entity, f);
                } else {
                    float f = (float)MathHelper.j(aqa_0.a(hY4));
                    float f3 = (float)MathHelper.j(aqa_0.a(hY5));
                    if (f3 > 90.0f || f3 < -90.0f) {
                        f3 = MathHelper.a(180.0f - f3);
                        f = MathHelper.a(f + 180.0f);
                    }
                    ayj_0.b(entity, aqa_0.a(hY), aqa_0.a(hY2), aqa_0.a(hY3), f, f3);
                    ayj_0.a(entity, f);
                }
                cu_2.a(iCommandSender, (ICommand)this, aA4.i, ayj_0.x(entity), db_0.a(aqa_0.a(hY)), db_0.a(aqa_0.a(hY2)), db_0.a(aqa_0.a(hY3)));
            }
        } else {
            Entity entity2 = cu_2.b(iCommandSender, stringArray[stringArray.length - 1]);
            if (entity2.worldObj != entity.worldObj) {
                throw new ht_1(aA4.g, new Object[0]);
            }
            ayj_0.b(entity, null);
            if (entity instanceof EntityPlayerMP) {
                qv_0.a(((EntityPlayerMP)entity).playerNetServerHandler, entity2.posX, entity2.posY, entity2.posZ, entity2.rotationYaw, entity2.rotationPitch);
            } else {
                ayj_0.b(entity, entity2.posX, entity2.posY, entity2.posZ, entity2.rotationYaw, entity2.rotationPitch);
            }
            cu_2.a(iCommandSender, (ICommand)this, aA4.e, ayj_0.x(entity), ayj_0.x(entity2));
        }
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length != 1 && stringArray.length != 2 ? null : cu_2.a(stringArray, ServerInvoker.r(ServerInvoker.d()));
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aA4.c;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }
}

