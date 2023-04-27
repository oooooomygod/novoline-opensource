/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import deobf.GuiControls;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.a8l
 */
public class a8l_0
extends aij_1 {
    private Minecraft z;
    private avh_2[] y;
    private GuiControls x;
    private int A = 0;

    public a8l_0(GuiControls guiControls, Minecraft minecraft) {
        super(minecraft, guiControls.n, guiControls.f, 63, guiControls.f - 32, 20);
        this.x = guiControls;
        this.z = minecraft;
        Object[] objectArray = (aII[])aoe_2.c(minecraft.gameSettings.aP);
        this.y = new avh_2[objectArray.length + aS0.d(GameSettingsInvoker.e())];
        a7r_0.d(objectArray);
        int n = 0;
        String string = null;
        for (Object object : objectArray) {
            int n2;
            String string2 = GameSettingsInvoker.c((aII)object);
            if (!string2.equals(string)) {
                string = string2;
                this.y[n++] = new aRY(this, string2);
            }
            if ((n2 = FontRendererInvoker.a(minecraft.fontRendererObj, I18n.format(GameSettingsInvoker.f((aII)object), new Object[0]))) > this.A) {
                this.A = n2;
            }
            this.y[n++] = new awr_1(this, (aII)object, null);
        }
    }

    static int b(a8l_0 a8l_02) {
        return a8l_02.A;
    }

    @Override
    public int d() {
        return super.d() + 32;
    }

    @Override
    protected int h() {
        return super.h() + 15;
    }

    @Override
    protected int f() {
        return this.y.length;
    }

    static Minecraft c(a8l_0 a8l_02) {
        return a8l_02.z;
    }

    static GuiControls a(a8l_0 a8l_02) {
        return a8l_02.x;
    }

    @Override
    public avh_2 a(int n) {
        return this.y[n];
    }
}

