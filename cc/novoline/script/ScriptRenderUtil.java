/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3d
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.script;

import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import deobf.EntityLivingBase;
import deobf.MCInvoker;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.vecmath.Vector3d;
import net.minecraft.client.Minecraft;
import net.minecraft.block.BlockPos;
import net.N4;
import net.ScaledResolution;
import net.a1V;
import net.aHB;
import net.afs_2;
import net.arn_1;
import org.lwjgl.opengl.GL11;
import net.skidunion.annotations;

public class ScriptRenderUtil {
    private IntBuffer d = N4.a(16);
    private FloatBuffer b;
    private FloatBuffer c = N4.d(16);
    private FloatBuffer a;

    @annotations
    private Vector3d worldToScreen(ScaledResolution scaledResolution, double d, double d2, double d3) {
        GL11.glGetFloat((int)2982, (FloatBuffer)this.c);
        GL11.glGetFloat((int)2983, (FloatBuffer)this.a);
        GL11.glGetInteger((int)2978, (IntBuffer)this.d);
        if (afs_2.a((float)d, (float)d2, (float)d3, this.c, this.a, this.d, this.b)) {
            return new Vector3d((double)(aHB.b(this.b, 0) / (float)ScaledResolutionInvoker.getScaleFactor(scaledResolution)), (double)(((float)DisplayInvoker.getHeight() - aHB.b(this.b, 1)) / (float)ScaledResolutionInvoker.getScaleFactor(scaledResolution)), (double)aHB.b(this.b, 2));
        }
        return null;
    }

    @annotations
    public void drawRoundedRectangle(float f, float f2, float f3, float f4, float f5, int n) {
        a1V.a(f, f2, f3, f4, f5, n);
    }

    @annotations
    public void drawBlockBox(double d, double d2, double d3, int n) {
        a1V.d(d, d2, d3, n);
    }

    @annotations
    public double getRenderPosY() {
        return MCInvoker.j((Minecraft)MCInvoker.f()).h;
    }

    @annotations
    public void drawFilledRectangle(double d, double d2, double d3, double d4, int n) {
        a1V.b(d, d2, d3, d4, n);
    }

    @annotations
    public void renderString(String string, float f, float f2, int n, boolean bl) {
        FontRendererInvoker.a(MCInvoker.f().fontRendererObj, string, f, f2, n, bl);
    }

    @annotations
    public double getRenderPosZ() {
        return MCInvoker.j((Minecraft)MCInvoker.f()).m;
    }

    public ScriptRenderUtil() {
        ScriptWorld.b();
        this.a = N4.d(16);
        this.b = N4.d(4);
        ListInvoker.b(new ListInvoker[1]);
    }

    @annotations
    public double getRenderPosX() {
        return MCInvoker.j((Minecraft)MCInvoker.f()).s;
    }

    @annotations
    public void drawEntityOnScreen(int n, int n2, float f, EntityLivingBase entityLivingBase) {
        arn_1.a(n, n2, f, entityLivingBase);
    }

    @annotations
    public void drawBlockBox(BlockPos blockPos, int n) {
        a1V.b(blockPos, n);
    }

    @annotations
    public void drawRainbowBox(double d, double d2, double d3, double d4, float f, boolean bl, boolean bl2) {
        arn_1.a(d, d2, d3, d4, f, bl, bl2);
    }

    @annotations
    public void drawCircle(float f, float f2, float f3, int n) {
        a1V.b(f, f2, f3, 360.0f, n);
    }

    @annotations
    public void drawBorderedRectangle(float f, float f2, float f3, float f4, float f5, int n, int n2) {
        a1V.a(f, f2, f3, f4, f5, n, n2);
    }
}

