/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.Event;
import deobf.GuiScreen;
import net.alw_0;

public class RenderGuiEvent
implements Event {
    private alw_0 b;
    private int c;
    private GuiScreen a;
    private int d;
    private int e;

    public RenderGuiEvent(GuiScreen guiScreen, long l4) {
        this.a = guiScreen;
        this.b = l4 == 0L ? alw_0.CLOSE : alw_0.INITIAL;
    }

    public int a() {
        return this.c;
    }

    public alw_0 d() {
        return this.b;
    }

    public RenderGuiEvent(GuiScreen guiScreen, int n, int n2) {
        this.a = guiScreen;
        this.c = n;
        this.e = n2;
        this.b = alw_0.RENDER;
    }

    public int e() {
        return this.d;
    }

    public RenderGuiEvent(GuiScreen guiScreen, int n, int n2, int n3) {
        this.a = guiScreen;
        this.c = n;
        this.e = n2;
        this.d = n3;
        this.b = alw_0.CLICK;
    }

    public GuiScreen b() {
        return this.a;
    }

    public RenderGuiEvent(GuiScreen guiScreen, int n) {
        this.a = guiScreen;
        this.d = n;
        this.b = alw_0.RELEASE;
    }

    public int c() {
        return this.e;
    }
}

