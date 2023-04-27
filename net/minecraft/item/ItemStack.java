/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net.minecraft.item;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.collect.Multimap;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import deobf.NBTBase;
import deobf.NBTTagList;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.AttributeModifier;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;
import deobf.EnumFacing;
import net.FG;
import net.H6;
import net.HX;
import net.Item;
import net.ItemBow;
import net.MM;
import net.NBTTagCompound;
import net.P8;
import net.ResourceLocation;
import net.World;
import net.a3Z;
import net.a6w_0;
import net.aBC;
import net.aBO;
import net.aH2;
import net.aL0;
import net.aLP;
import net.aS0;
import net.aSY;
import net.ahq_0;
import net.ahy_2;
import net.alf_0;
import net.amn_0;
import net.anw_0;
import net.aop_1;
import net.arq_0;
import net.atn_0;
import net.awc_1;
import net.axq_2;
import net.dz_0;
import net.kv_0;
import net.ms_0;
import net.my_0;
import net.no_2;
import net.ot_2;
import net.ow_0;
import net.px_0;
import net.ti_1;
import net.tn_0;
import net.xr_1;
import net.yl_2;
import net.zi_2;

public class ItemStack {
    private Item e;
    public int g;
    private boolean j = false;
    private Block k = null;
    public int a;
    private boolean i = false;
    private no_2 b;
    public static DecimalFormat c = new DecimalFormat(a3Z.aI);
    private int h;
    private NBTTagCompound f;
    private Block d = null;

    public Item A() {
        return this.e;
    }

    public boolean a() {
        return this.f != null;
    }

    public NBTTagCompound a(String string, boolean bl) {
        if (this.f != null && tn_0.a(this.f, string, 10)) {
            return tn_0.d(this.f, string);
        }
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        this.a(string, nBTTagCompound);
        return nBTTagCompound;
    }

    public boolean b(ItemStack itemStack) {
        return this.c(itemStack);
    }

    public String r() {
        NBTTagCompound nBTTagCompound;
        String string = px_0.g(this.e, this);
        if (this.f != null && tn_0.a(this.f, a3Z.L, 10) && tn_0.a(nBTTagCompound = tn_0.d(this.f, a3Z.v), a3Z.j, 8)) {
            string = tn_0.m(nBTTagCompound, a3Z.S);
        }
        return string;
    }

    public boolean C() {
        return this.w() && this.h > 0;
    }

    public boolean i() {
        return px_0.g(this.e);
    }

    public void b(NBTTagCompound nBTTagCompound) {
        this.e = tn_0.a(nBTTagCompound, a3Z.w, 8) ? px_0.a(tn_0.m(nBTTagCompound, a3Z.U)) : px_0.a(tn_0.o(nBTTagCompound, a3Z.K));
        this.a = tn_0.e(nBTTagCompound, a3Z.J);
        this.h = tn_0.o(nBTTagCompound, a3Z.I);
        if (this.h < 0) {
            this.h = 0;
        }
        if (tn_0.a(nBTTagCompound, a3Z.ar, 10)) {
            this.f = tn_0.d(nBTTagCompound, a3Z.C);
            if (this.e != null) {
                px_0.a(this.e, this.f);
            }
        }
    }

    public void c() {
        if (this.f != null && tn_0.a(this.f, a3Z.i, 10)) {
            NBTTagCompound nBTTagCompound = tn_0.d(this.f, a3Z.W);
            tn_0.a(nBTTagCompound, a3Z.aG);
            if (tn_0.b(nBTTagCompound)) {
                tn_0.a(this.f, a3Z.an);
                if (tn_0.b(this.f)) {
                    this.d((NBTTagCompound)null);
                }
            }
        }
    }

    public ItemStack a(World world, EntityPlayer entityPlayer) {
        return px_0.b(this.e, this, world, entityPlayer);
    }

    public boolean a(EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        boolean bl = px_0.a(this.e, this, entityPlayer, world, blockPos, enumFacing, f, f2, f3);
        a6w_0.a(entityPlayer, aop_1.p[px_0.a(this.e)]);
        return bl;
    }

    public ItemStack b(World world, EntityPlayer entityPlayer) {
        return px_0.c(this.e, this, world, entityPlayer);
    }

    public int j() {
        return this.h;
    }

    public static boolean a(ItemStack itemStack, ItemStack itemStack2) {
        return itemStack.c(itemStack2);
    }

    public boolean b() {
        return px_0.f(this.e, this) && !this.f();
    }

    public void a(Item item) {
        this.e = item;
    }

    public ItemStack(Block block) {
        this(block, 1);
    }

    public int s() {
        return this.e.b();
    }

    public ItemStack u() {
        ItemStack itemStack = new ItemStack(this.e, this.a, this.h);
        if (this.f != null) {
            itemStack.f = (NBTTagCompound)tn_0.a(this.f);
        }
        return itemStack;
    }

    public void a(int n) {
        if (!this.a()) {
            this.f = new NBTTagCompound();
        }
        tn_0.b(this.f, a3Z.ah, n);
    }

    public NBTTagCompound o() {
        return this.f;
    }

    public boolean n() {
        return px_0.i(this.e, this);
    }

    public void a(String string, NBTBase nBTBase) {
        if (this.f == null) {
            this.d(new NBTTagCompound());
        }
        tn_0.a(this.f, string, nBTBase);
    }

    public List<String> a(EntityPlayer entityPlayer, boolean bl) {
        Multimap<String, AttributeModifier> multimap;
        ArrayList arrayList = my_0.c();
        String string = this.r();
        if (this.k()) {
            string = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.ITALIC), string).toString();
        }
        string = aL0.a(aL0.a(new StringBuilder(), string), (Object)anw_0.RESET).toString();
        String string2 = a3Z.aL;
        if (!StringInvoker.g(string)) {
            string = aL0.a(aL0.a(new StringBuilder(), string), a3Z.E).toString();
            string2 = a3Z.ab;
        }
        int n = px_0.a(this.e);
        string = this.h() ? aL0.a(aL0.a(new StringBuilder(), string), StringInvoker.a(a3Z.B, new Object[]{P8.d(n), P8.d(this.h), string2})).toString() : aL0.a(aL0.a(new StringBuilder(), string), StringInvoker.a(a3Z.A, new Object[]{P8.d(n), string2})).toString();
        ListInvoker.add(arrayList, string);
        int n2 = 0;
        if (this.a() && tn_0.a(this.f, a3Z.T, 99)) {
            n2 = tn_0.g(this.f, a3Z.aq);
        }
        int cfr_ignored_0 = n2 & 0x20;
        px_0.a(this.e, this, entityPlayer, arrayList, bl);
        if (this.a()) {
            int n3;
            int cfr_ignored_1 = n2 & 1;
            NBTBase nBTBase = this.t();
            for (int i = 0; i < kv_0.c(nBTBase); ++i) {
                n3 = tn_0.o(kv_0.g(nBTBase, i), a3Z.g);
                short s = tn_0.o(kv_0.g(nBTBase, i), a3Z.Q);
                if (xr_1.a(n3) == null) continue;
                ListInvoker.add(arrayList, xr_1.c(xr_1.a(n3), s));
            }
            if (tn_0.a(this.f, a3Z.s, 10)) {
                NBTTagList nBTTagList;
                nBTBase = tn_0.d(this.f, a3Z.aw);
                if (tn_0.a((NBTTagCompound)nBTBase, a3Z.z, 3)) {
                    ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), a3Z.k), StringInvoker.a(P8.b(tn_0.g((NBTTagCompound)nBTBase, a3Z.az)))).toString());
                }
                if (tn_0.l((NBTTagCompound)nBTBase, a3Z.t) == 9 && kv_0.c(nBTTagList = tn_0.c((NBTTagCompound)nBTBase, a3Z.aJ, 8)) > 0) {
                    for (n3 = 0; n3 < kv_0.c(nBTTagList); ++n3) {
                        ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_PURPLE), a3Z.aC), (Object)anw_0.ITALIC), kv_0.f(nBTTagList, n3)).toString());
                    }
                }
            }
        }
        if (!MM.c(multimap = this.B())) {
            int cfr_ignored_2 = n2 & 2;
            ListInvoker.add(arrayList, a3Z.aK);
            Iterator iterator = ms_0.a(MM.a(multimap));
            while (dz_0.c(iterator)) {
                Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                AttributeModifier attributeModifier = (AttributeModifier)FG.a(entry);
                double d = ow_0.d(attributeModifier);
                if (ow_0.a(attributeModifier) == Item.h) {
                    d += (double)alf_0.a(this, aH2.UNDEFINED);
                }
                double d2 = ow_0.b(attributeModifier) != 1 && ow_0.b(attributeModifier) != 2 ? d : d * 100.0;
                if (d > 0.0) {
                    ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.BLUE), ahq_0.a(aL0.c(aL0.a(new StringBuilder(), a3Z.aa), ow_0.b(attributeModifier)).toString(), new Object[]{aBC.a(c, d2), ahq_0.b(aL0.a(aL0.a(new StringBuilder(), a3Z.ae), (String)FG.b(entry)).toString())})).toString());
                    continue;
                }
                if (!(d < 0.0)) continue;
                ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), ahq_0.a(aL0.c(aL0.a(new StringBuilder(), a3Z.O), ow_0.b(attributeModifier)).toString(), new Object[]{aBC.a(c, d2 *= -1.0), ahq_0.b(aL0.a(aL0.a(new StringBuilder(), a3Z.ad), (String)FG.b(entry)).toString())})).toString());
            }
        }
        if (this.a() && tn_0.c(this.f, a3Z.Y)) {
            int cfr_ignored_3 = n2 & 4;
            ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.BLUE), ahq_0.b(a3Z.h)).toString());
        }
        if (this.a() && tn_0.a(this.f, a3Z.aj, 9)) {
            int cfr_ignored_4 = n2 & 8;
            NBTTagList nBTTagList = tn_0.c(this.f, a3Z.o, 8);
            if (kv_0.c(nBTTagList) > 0) {
                ListInvoker.add(arrayList, a3Z.u);
                ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), ahq_0.b(a3Z.ai)).toString());
                for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                    Block block = BlocksInvoker.a(kv_0.f(nBTTagList, i));
                    ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_GRAY), BlocksInvoker.K(block)).toString());
                }
            }
        }
        if (this.a() && tn_0.a(this.f, a3Z.D, 9)) {
            int cfr_ignored_5 = n2 & 0x10;
            NBTTagList nBTTagList = tn_0.c(this.f, a3Z.r, 8);
            if (kv_0.c(nBTTagList) > 0) {
                ListInvoker.add(arrayList, a3Z.aA);
                ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), ahq_0.b(a3Z.c)).toString());
                for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                    Block block = BlocksInvoker.a(kv_0.f(nBTTagList, i));
                    ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_GRAY), BlocksInvoker.K(block)).toString());
                }
            }
        }
        if (this.C()) {
            ListInvoker.add(arrayList, aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), a3Z.au), this.s() - this.h), a3Z.H), this.s()).toString());
        }
        ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_GRAY), ((ResourceLocation)aLP.c(Item.k, this.e)).toString()).toString());
        if (this.a()) {
            ListInvoker.add(arrayList, aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_GRAY), a3Z.al), aS0.d(tn_0.c(this.f))), a3Z.y).toString());
        }
        return arrayList;
    }

    public boolean k() {
        return this.f != null && tn_0.a(this.f, a3Z.Z, 10) && tn_0.a(tn_0.d(this.f, a3Z.as), a3Z.ax, 8);
    }

    public String p() {
        return px_0.a(this.e, this);
    }

    public int d() {
        return px_0.m(this.e);
    }

    public ItemStack(Item item) {
        this(item, 1);
    }

    public IChatComponent q() {
        ChatComponentText chatComponentText = new ChatComponentText(this.r());
        if (this.k()) {
            HX.a(axq_2.b(chatComponentText), Boolean.TRUE);
        }
        IChatComponent iChatComponent = aBO.a(axq_2.a(new ChatComponentText(a3Z.l), chatComponentText), a3Z.b);
        if (this.e != null) {
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            this.a(nBTTagCompound);
            HX.a(aBO.f(iChatComponent), new amn_0(H6.SHOW_ITEM, new ChatComponentText(nBTTagCompound.toString())));
            HX.a(aBO.f(iChatComponent), this.m().rarityColor);
        }
        return iChatComponent;
    }

    public void a(int n, EntityLivingBase entityLivingBase) {
        if ((!(entityLivingBase instanceof EntityPlayer) || !aSY.a(((EntityPlayer)entityLivingBase).abilities)) && this.w() && this.a(n, atn_0.v(entityLivingBase))) {
            atn_0.a(entityLivingBase, this);
            --this.a;
            if (entityLivingBase instanceof EntityPlayer) {
                EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
                a6w_0.a(entityPlayer, aop_1.x[px_0.a(this.e)]);
                if (this.a == 0 && this.e instanceof ItemBow) {
                    a6w_0.t(entityPlayer);
                }
            }
            if (this.a < 0) {
                this.a = 0;
            }
            this.h = 0;
        }
    }

    public boolean a(int n, Random random) {
        if (!this.w()) {
            return false;
        }
        int n2 = alf_0.a(yl_2.k.c, this);
        int n3 = 0;
        for (int i = 0; i < n; ++i) {
            if (!ot_2.a(this, n2, random)) continue;
            ++n3;
        }
        n -= n3;
        return false;
    }

    public arq_0 m() {
        return px_0.b(this.e, this);
    }

    public void d(NBTTagCompound nBTTagCompound) {
        this.f = nBTTagCompound;
    }

    public static ItemStack a(ItemStack itemStack) {
        return null;
    }

    public void b(int n) {
        this.h = n;
        if (this.h < 0) {
            this.h = 0;
        }
    }

    public boolean a(EntityPlayer entityPlayer, EntityLivingBase entityLivingBase) {
        return px_0.a(this.e, this, entityPlayer, entityLivingBase);
    }

    public void a(World world, Block block, BlockPos blockPos, EntityPlayer entityPlayer) {
        px_0.a(this.e, this, world, block, blockPos, entityPlayer);
        a6w_0.a(entityPlayer, aop_1.p[px_0.a(this.e)]);
    }

    public NBTTagCompound a(NBTTagCompound nBTTagCompound) {
        ResourceLocation cfr_ignored_0 = (ResourceLocation)aLP.c(Item.k, this.e);
        tn_0.a(nBTTagCompound, a3Z.a, a3Z.d);
        tn_0.a(nBTTagCompound, a3Z.N, (byte)this.a);
        tn_0.a(nBTTagCompound, a3Z.F, (short)this.h);
        if (this.f != null) {
            tn_0.a(nBTTagCompound, a3Z.aB, (NBTBase)this.f);
        }
        return nBTTagCompound;
    }

    public int l() {
        return this.a() && tn_0.a(this.f, a3Z.ac, 3) ? tn_0.g(this.f, a3Z.av) : 0;
    }

    public ItemStack(Item item, int n) {
        this(item, n, 0);
    }

    public void a(World world, EntityPlayer entityPlayer, int n) {
        px_0.a(this.e, this, world, entityPlayer, n);
    }

    public ti_1 x() {
        return px_0.d(this.e, this);
    }

    public int v() {
        return px_0.e(this.e, this);
    }

    public boolean e() {
        return this.b != null;
    }

    public int y() {
        return this.h;
    }

    public void a(EntityLivingBase entityLivingBase, EntityPlayer entityPlayer) {
        px_0.a(this.e, this, entityLivingBase, (EntityLivingBase)entityPlayer);
        a6w_0.a(entityPlayer, aop_1.p[px_0.a(this.e)]);
    }

    public void a(World world, Entity entity, int n, boolean bl) {
        if (this.g > 0) {
            --this.g;
        }
        px_0.a(this.e, this, world, entity, n, bl);
    }

    public ItemStack(Block block, int n, int n2) {
        this(px_0.a(block), n, n2);
    }

    public boolean b(Block block) {
        return this.e.b(block);
    }

    public static boolean b(ItemStack itemStack, ItemStack itemStack2) {
        return itemStack.d(itemStack2);
    }

    public ItemStack c(int n) {
        ItemStack itemStack = new ItemStack(this.e, n, this.h);
        if (this.f != null) {
            itemStack.f = (NBTTagCompound)tn_0.a(this.f);
        }
        this.a -= n;
        return itemStack;
    }

    public no_2 g() {
        return this.b;
    }

    public ItemStack a(String string) {
        if (this.f == null) {
            this.f = new NBTTagCompound();
        }
        if (!tn_0.a(this.f, a3Z.ay, 10)) {
            tn_0.a(this.f, a3Z.ap, (NBTBase)new NBTTagCompound());
        }
        tn_0.a(tn_0.d(this.f, a3Z.ak), a3Z.at, string);
        return this;
    }

    public boolean f() {
        return this.f != null && tn_0.a(this.f, a3Z.p, 9);
    }

    public Multimap<String, AttributeModifier> B() {
        Multimap multimap;
        if (this.a() && tn_0.a(this.f, a3Z.aD, 9)) {
            multimap = zi_2.a();
            NBTTagList nBTTagList = tn_0.c(this.f, a3Z.f, 10);
            for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, i);
                AttributeModifier attributeModifier = ahy_2.a(nBTTagCompound);
                if (awc_1.a(ow_0.a(attributeModifier)) == 0L || awc_1.b(ow_0.a(attributeModifier)) == 0L) continue;
                MM.b(multimap, tn_0.m(nBTTagCompound, a3Z.aH), attributeModifier);
            }
        } else {
            multimap = px_0.e(this.e);
        }
        return multimap;
    }

    public boolean c(Block block) {
        if (block == this.d) {
            return this.j;
        }
        this.d = block;
        if (this.a() && tn_0.a(this.f, a3Z.aE, 9)) {
            NBTTagList nBTTagList = tn_0.c(this.f, a3Z.m, 8);
            for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                Block block2 = BlocksInvoker.a(kv_0.f(nBTTagList, i));
                if (block2 != block) continue;
                this.j = true;
                return true;
            }
        }
        this.j = false;
        return false;
    }

    private ItemStack() {
    }

    public static ItemStack c(NBTTagCompound nBTTagCompound) {
        ItemStack itemStack = new ItemStack();
        itemStack.b(nBTTagCompound);
        return itemStack.e != null ? itemStack : null;
    }

    public NBTTagList t() {
        return this.f == null ? null : tn_0.c(this.f, a3Z.ag, 10);
    }

    public boolean d(Block block) {
        if (block == this.k) {
            return this.i;
        }
        this.k = block;
        if (this.a() && tn_0.a(this.f, a3Z.af, 9)) {
            NBTTagList nBTTagList = tn_0.c(this.f, a3Z.q, 8);
            for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                Block block2 = BlocksInvoker.a(kv_0.f(nBTTagList, i));
                if (block2 != block) continue;
                this.i = true;
                return true;
            }
        }
        this.i = false;
        return false;
    }

    public float a(Block block) {
        return px_0.a(this.e, this, block);
    }

    public boolean z() {
        return this.d() > 1 && (!this.w() || !this.C());
    }

    public void a(yl_2 yl_22, int n) {
        if (this.f == null) {
            this.d(new NBTTagCompound());
        }
        if (!tn_0.a(this.f, a3Z.R, 9)) {
            tn_0.a(this.f, a3Z.V, new NBTTagList());
        }
        NBTTagList nBTTagList = tn_0.c(this.f, a3Z.e, 10);
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        tn_0.a(nBTTagCompound, a3Z.X, (short)yl_22.c);
        tn_0.a(nBTTagCompound, a3Z.x, (short)((byte)n));
        kv_0.a(nBTTagList, nBTTagCompound);
    }

    public void a(no_2 no_22) {
        this.b = no_22;
    }

    public boolean w() {
        return this.e != null && this.e.b() > 0 && (!this.a() || !tn_0.c(this.f, a3Z.P));
    }

    private boolean c(ItemStack itemStack) {
        return !(this.a != itemStack.a || this.e != itemStack.e || this.h != itemStack.h || this.f == null && itemStack.f != null || this.f != null && !this.f.equals(itemStack.f));
    }

    public boolean h() {
        return this.e.i();
    }

    public boolean d(ItemStack itemStack) {
        return this.e == itemStack.e && this.h == itemStack.h;
    }

    public static boolean c(ItemStack itemStack, ItemStack itemStack2) {
        return !(itemStack.f == null && itemStack2.f != null || itemStack.f != null && !itemStack.f.equals(itemStack2.f));
    }

    public String toString() {
        return aL0.c(aL0.a(aL0.a(aL0.a(aL0.c(new StringBuilder(), this.a), a3Z.M), this.e.d()), a3Z.ao), this.h).toString();
    }

    public ItemStack(Block block, int n) {
        this(block, n, 0);
    }

    public void b(World world, EntityPlayer entityPlayer, int n) {
        a6w_0.a(entityPlayer, aop_1.V[px_0.a(this.e)], n);
        px_0.a(this.e, this, world, entityPlayer);
    }

    public ItemStack(Item item, int n, int n2) {
        this.e = item;
        this.a = n;
        this.h = n2;
        if (this.h < 0) {
            this.h = 0;
        }
    }
}

