/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityLivingBase;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.b4
 */
public class b4_0
extends am_0 {
    private static iy_2 a(iy_2 iy_22) {
        return iy_22;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aoq_0.h;
    }

    @Override
    public String b() {
        return aoq_0.g;
    }

    protected String[] a() {
        return ServerInvoker.d().C();
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        block8: {
            int n;
            block9: {
                int n2;
                int n3;
                int n4;
                EntityLivingBase entityLivingBase;
                block12: {
                    Potion potion;
                    block10: {
                        block11: {
                            block7: {
                                if (stringArray.length < 2) {
                                    throw new ip_2(aoq_0.d, new Object[0]);
                                }
                                entityLivingBase = b4_0.a(iCommandSender, stringArray[0], EntityLivingBase.class);
                                if (!stringArray[1].equals(aoq_0.b)) break block7;
                                if (ms_0.c(atn_0.n(entityLivingBase))) {
                                    throw new ht_1(aoq_0.a, atn_0.L(entityLivingBase));
                                }
                                atn_0.f(entityLivingBase);
                                b4_0.a(iCommandSender, (ICommand)this, aoq_0.e, atn_0.L(entityLivingBase));
                                break block8;
                            }
                            try {
                                n = b4_0.a(stringArray[1], 1);
                                n4 = 600;
                                n3 = 30;
                                n2 = 0;
                            }
                            catch (iy_2 iy_22) {
                                Potion potion2 = ari_0.a(stringArray[1]);
                                throw iy_22;
                            }
                            if (n >= Potion.potionTypes.length || Potion.potionTypes[n] == null) break block9;
                            potion = Potion.potionTypes[n];
                            if (stringArray.length < 3) break block10;
                            n3 = b4_0.a(stringArray[2], 0, 1000000);
                            if (!ari_0.h(potion)) break block11;
                            n4 = n3;
                            break block12;
                        }
                        n4 = n3 * 20;
                        break block12;
                    }
                    if (ari_0.h(potion)) {
                        n4 = 1;
                    }
                }
                if (stringArray.length >= 4) {
                    n2 = b4_0.a(stringArray[3], 0, 255);
                }
                boolean bl = true;
                if (stringArray.length >= 5 && StringInvoker.d(aoq_0.l, stringArray[4])) {
                    bl = false;
                }
                a2l_0 a2l_02 = new a2l_0(n, n4, n2, false, bl);
                atn_0.a(entityLivingBase, a2l_02);
                b4_0.a(iCommandSender, (ICommand)this, aoq_0.c, new aoz_1(a3M.d(a2l_02), new Object[0]), P8.d(n), P8.d(n2), atn_0.L(entityLivingBase), P8.d(n3));
                break block8;
            }
            throw new iy_2(aoq_0.j, P8.d(n));
        }
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? b4_0.a(stringArray, this.a()) : (stringArray.length == 2 ? b4_0.a(stringArray, ari_0.c()) : (stringArray.length == 5 ? b4_0.a(stringArray, aoq_0.m, aoq_0.i) : null));
    }

    @Override
    public int a() {
        return 2;
    }
}

