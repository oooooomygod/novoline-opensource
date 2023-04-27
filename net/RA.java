/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import com.google.gson.JsonParseException;
import deobf.EntityPlayer;
import deobf.GuiScreen;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.NBTTagList;
import net.minecraft.network.packts.C17PacketCustomPayload;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class RA
extends GuiScreen {
    private int B = 192;
    private qi_0 P;
    private QG I;
    private int v = -1;
    private qi_0 C;
    private int y;
    private boolean L;
    private ItemStack E;
    private boolean x;
    private static ResourceLocation z = new ResourceLocation(a5c_0.e);
    private int N = 1;
    private boolean G;
    private String O = a5c_0.A;
    private EntityPlayer H;
    private int F;
    private QG M;
    private QG A;
    private NBTTagList w;
    private QG J;
    private List<IChatComponent> D;
    private int K = 192;

    private void d() {
        this.P.j = !this.x && (this.F < this.N - 1 || this.G);
        this.C.j = !this.x && this.F > 0;
        boolean bl = this.M.j = !this.G || !this.x;
        if (this.G) {
            this.J.j = !this.x;
            this.A.j = this.x;
            this.I.j = this.x;
            this.I.g = !StringInvoker.g(StringInvoker.h(this.O));
        }
    }

    private void a(boolean bl) throws IOException {
        if (this.G && this.L && this.w != null) {
            Object object;
            while (kv_0.c(this.w) > 1 && StringInvoker.g((String)(object = kv_0.f(this.w, kv_0.c(this.w) - 1)))) {
                kv_0.e(this.w, kv_0.c(this.w) - 1);
            }
            if (act_2.b(this.E)) {
                object = act_2.a(this.E);
                tn_0.a((NBTTagCompound)object, a5c_0.l, this.w);
            } else {
                act_2.a(this.E, a5c_0.F, this.w);
            }
            object = a5c_0.i;
            object = a5c_0.B;
            act_2.a(this.E, a5c_0.u, new NBTTagString(a6w_0.C(this.H)));
            act_2.a(this.E, a5c_0.c, new NBTTagString(StringInvoker.h(this.O)));
            for (int i = 0; i < kv_0.c(this.w); ++i) {
                String string = kv_0.f(this.w, i);
                ChatComponentText chatComponentText = new ChatComponentText(string);
                string = aGU.a(chatComponentText);
                kv_0.a(this.w, i, new NBTTagString(string));
            }
            act_2.a(this.E, Items.written_book);
            PacketBuffer packetBuffer = new PacketBuffer(FH.d());
            PacketBufferInvoker.a(packetBuffer, this.E);
            aDM.a(MCInvoker.aa(this.t), new C17PacketCustomPayload((String)object, packetBuffer));
        }
    }

    private void a() {
        if (this.w != null && kv_0.c(this.w) < 50) {
            kv_0.a(this.w, new NBTTagString(a5c_0.a));
            ++this.N;
            this.L = true;
        }
    }

    private void b(String string) {
        if (this.w != null && this.F >= 0 && this.F < kv_0.c(this.w)) {
            kv_0.a(this.w, this.F, new NBTTagString(string));
            this.L = true;
        }
    }

    static ResourceLocation e() {
        return z;
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        IChatComponent iChatComponent = this.a(n, n2);
        if (this.a(iChatComponent)) {
            return;
        }
        super.b(n, n2, n3);
    }

    private void a(String string) {
        String string2 = this.b();
        String string3 = aL0.a(aL0.a(new StringBuilder(), string2), string).toString();
        int n = FontRendererInvoker.c(this.q, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string3), a5c_0.I), (Object)anw_0.BLACK), a5c_0.r).toString(), 118);
        if (n <= 128 && StringInvoker.c(string3) < 256) {
            this.b(string3);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public IChatComponent a(int n, int n2) {
        int n3;
        if (this.D == null) {
            return null;
        }
        this.getClass();
        int n4 = n - (this.n - 192) / 2 - 36;
        int n5 = n2 - 2 - 16 - 16;
        int n6 = MathInvoker.b(128 / FontRendererInvoker.d(this.q), ListInvoker.size(this.D));
        if (n4 <= 116 && n5 < FontRendererInvoker.d(this.t.fontRendererObj) * n6 + n6 && (n3 = n5 / FontRendererInvoker.d(this.t.fontRendererObj)) < ListInvoker.size(this.D)) {
            IChatComponent iChatComponent = (IChatComponent)ListInvoker.get(this.D, n3);
            int n7 = 0;
            Iterator iterator = iChatComponent.iterator();
            while (dz_0.c(iterator)) {
                IChatComponent iChatComponent2 = (IChatComponent)dz_0.b(iterator);
                if (!(iChatComponent2 instanceof ChatComponentText) || (n7 += FontRendererInvoker.a(this.t.fontRendererObj, axq_2.a((ChatComponentText)iChatComponent2))) <= n4) continue;
                return iChatComponent2;
            }
        }
        return null;
    }

    @Override
    public void a(int n, int n2, float f) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), z);
        this.getClass();
        int n3 = (this.n - 192) / 2;
        this.getClass();
        this.getClass();
        this.c(n3, 2, 0, 0, 192, 192);
        if (this.x) {
            String string = this.O;
            if (this.G) {
                string = this.y / 6 % 2 == 0 ? aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), a5c_0.m), (Object)anw_0.BLACK), a5c_0.v).toString() : aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), a5c_0.E), (Object)anw_0.GRAY), a5c_0.p).toString();
            }
            String string2 = I18n.format(a5c_0.H, new Object[0]);
            int n4 = FontRendererInvoker.a(this.q, string2);
            FontRendererInvoker.a(this.q, string2, n3 + 36 + (116 - n4) / 2, 34.0f, 0);
            int n5 = FontRendererInvoker.a(this.q, string);
            FontRendererInvoker.a(this.q, string, n3 + 36 + (116 - n5) / 2, 50.0f, 0);
            String string3 = I18n.format(a5c_0.f, new Object[]{a6w_0.C(this.H)});
            int n6 = FontRendererInvoker.a(this.q, string3);
            FontRendererInvoker.a(this.q, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_GRAY), string3).toString(), n3 + 36 + (116 - n6) / 2, 60.0f, 0);
            String string4 = I18n.format(a5c_0.o, new Object[0]);
            FontRendererInvoker.a(this.q, string4, n3 + 36, 82, 116, 0);
        } else {
            String string = I18n.format(a5c_0.s, new Object[]{P8.d(this.F + 1), P8.d(this.N)});
            String string5 = a5c_0.g;
            if (this.w != null && this.F >= 0 && this.F < kv_0.c(this.w)) {
                string5 = kv_0.f(this.w, this.F);
            }
            if (this.G) {
                string5 = FontRendererInvoker.a(this.q) ? aL0.a(aL0.a(new StringBuilder(), string5), a5c_0.n).toString() : (this.y / 6 % 2 == 0 ? aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string5), a5c_0.k), (Object)anw_0.BLACK), a5c_0.G).toString() : aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string5), a5c_0.w), (Object)anw_0.GRAY), a5c_0.C).toString());
            } else if (this.v != this.F) {
                IChatComponent iChatComponent;
                if (aK1.a(act_2.a(this.E))) {
                    try {
                        iChatComponent = aGU.a(string5);
                        this.D = rc_0.a(iChatComponent, 116, this.q, true, true);
                    }
                    catch (JsonParseException jsonParseException) {
                        this.D = null;
                    }
                } else {
                    iChatComponent = new ChatComponentText(aL0.a(aL0.a(new StringBuilder(), anw_0.DARK_RED.toString()), a5c_0.D).toString());
                    this.D = my_0.a(iChatComponent);
                }
                this.v = this.F;
            }
            int n7 = FontRendererInvoker.a(this.q, string);
            this.getClass();
            FontRendererInvoker.a(this.q, string, n3 - n7 + 192 - 44, 18.0f, 0);
            if (this.D == null) {
                FontRendererInvoker.a(this.q, string5, n3 + 36, 34, 116, 0);
            } else {
                int n8 = MathInvoker.b(128 / FontRendererInvoker.d(this.q), ListInvoker.size(this.D));
                for (int i = 0; i < n8; ++i) {
                    IChatComponent iChatComponent = (IChatComponent)ListInvoker.get(this.D, i);
                    FontRendererInvoker.a(this.q, aBO.d(iChatComponent), n3 + 36, 34 + i * FontRendererInvoker.d(this.q), 0);
                }
                IChatComponent iChatComponent = this.a(n, n2);
                this.a(iChatComponent, n, n2);
            }
        }
        super.a(n, n2, f);
    }

    public RA(EntityPlayer entityPlayer, ItemStack itemStack, boolean bl) {
        this.H = entityPlayer;
        this.E = itemStack;
        this.G = bl;
        if (act_2.b(itemStack)) {
            NBTTagCompound nBTTagCompound = act_2.a(itemStack);
            this.w = tn_0.c(nBTTagCompound, a5c_0.q, 8);
            if (this.w != null) {
                this.w = (NBTTagList)kv_0.b(this.w);
                this.N = kv_0.c(this.w);
                if (this.N < 1) {
                    this.N = 1;
                }
            }
        }
        if (this.w == null) {
            this.w = new NBTTagList();
            kv_0.a(this.w, new NBTTagString(a5c_0.b));
            this.N = 1;
        }
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
    }

    private String b() {
        return this.w != null && this.F >= 0 && this.F < kv_0.c(this.w) ? kv_0.f(this.w, this.F) : a5c_0.t;
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 0) {
                MCInvoker.displayGuiScreen(this.t, null);
                this.a(false);
            } else if (qG.m == 3 && this.G) {
                this.x = true;
            } else if (qG.m == 1) {
                if (this.F < this.N - 1) {
                    ++this.F;
                } else if (this.G) {
                    this.a();
                    if (this.F < this.N - 1) {
                        ++this.F;
                    }
                }
            } else if (qG.m == 2) {
                if (this.F > 0) {
                    --this.F;
                }
            } else if (qG.m == 5 && this.x) {
                this.a(true);
                MCInvoker.displayGuiScreen(this.t, null);
            } else if (qG.m == 4 && this.x) {
                this.x = false;
            }
            this.d();
        }
    }

    private void b(char c, int n) {
        if (GuiScreen.a(n)) {
            this.a(GuiScreen.o());
        } else {
            switch (n) {
                case 14: {
                    String string = this.b();
                    if (!StringInvoker.g(string)) {
                        this.b(StringInvoker.b(string, 0, StringInvoker.c(string) - 1));
                    }
                    return;
                }
                case 28: 
                case 156: {
                    this.a(a5c_0.j);
                    return;
                }
            }
            if (KF.a(c)) {
                this.a(aze_0.d(c));
            }
        }
    }

    @Override
    protected boolean a(IChatComponent iChatComponent) {
        return false;
    }

    private void c(char c, int n) throws IOException {
        switch (n) {
            case 14: {
                if (!StringInvoker.g(this.O)) {
                    this.O = StringInvoker.b(this.O, 0, StringInvoker.c(this.O) - 1);
                    this.d();
                }
                return;
            }
            case 28: 
            case 156: {
                if (!StringInvoker.g(this.O)) {
                    this.a(true);
                    MCInvoker.displayGuiScreen(this.t, null);
                }
                return;
            }
        }
        if (StringInvoker.c(this.O) < 16 && KF.a(c)) {
            this.O = aL0.a(aL0.a(new StringBuilder(), this.O), c).toString();
            this.d();
            this.L = true;
        }
    }

    @Override
    public void g() {
        super.g();
        ++this.y;
    }

    @Override
    protected void a(char c, int n) throws IOException {
        super.a(c, n);
        if (this.G) {
            if (this.x) {
                this.c(c, n);
            } else {
                this.b(c, n);
            }
        }
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        KeyboardInvoker.a(true);
        if (this.G) {
            int n = this.n / 2 - 100;
            this.getClass();
            this.J = new QG(3, n, 196, 98, 20, I18n.format(a5c_0.y, new Object[0]));
            ListInvoker.add(this.l, this.J);
            int n2 = this.n / 2 + 2;
            this.getClass();
            this.M = new QG(0, n2, 196, 98, 20, I18n.format(a5c_0.h, new Object[0]));
            ListInvoker.add(this.l, this.M);
            int n3 = this.n / 2 - 100;
            this.getClass();
            this.I = new QG(5, n3, 196, 98, 20, I18n.format(a5c_0.x, new Object[0]));
            ListInvoker.add(this.l, this.I);
            int n4 = this.n / 2 + 2;
            this.getClass();
            this.A = new QG(4, n4, 196, 98, 20, I18n.format(a5c_0.d, new Object[0]));
            ListInvoker.add(this.l, this.A);
        } else {
            int n = this.n / 2 - 100;
            this.getClass();
            this.M = new QG(0, n, 196, 200, 20, I18n.format(a5c_0.z, new Object[0]));
            ListInvoker.add(this.l, this.M);
        }
        this.getClass();
        int n = (this.n - 192) / 2;
        this.P = new qi_0(1, n + 120, 156, true);
        ListInvoker.add(this.l, this.P);
        this.C = new qi_0(2, n + 38, 156, false);
        ListInvoker.add(this.l, this.C);
        this.d();
    }
}

