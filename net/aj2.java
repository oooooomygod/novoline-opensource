/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.MathHelper;
import net.jc_0;

public class aj2
extends Enum<aj2> {
    public static /* enum */ aj2 ANIMATED_TEXTURES;
    public static /* enum */ aj2 CHAT_HEIGHT_FOCUSED;
    public static /* enum */ aj2 CHAT_LINKS_PROMPT;
    public static /* enum */ aj2 STREAM_MIC_TOGGLE_BEHAVIOR;
    public static /* enum */ aj2 DYNAMIC_LIGHTS;
    public static /* enum */ aj2 STREAM_VOLUME_MIC;
    public static /* enum */ aj2 CHAT_COLOR;
    public static /* enum */ aj2 STREAM_VOLUME_SYSTEM;
    public static /* enum */ aj2 GRAPHICS;
    public static /* enum */ aj2 SUN_MOON;
    public static /* enum */ aj2 CHAT_HEIGHT_UNFOCUSED;
    public static /* enum */ aj2 BETTER_SNOW;
    private boolean d;
    public static /* enum */ aj2 FIREWORK_PARTICLES;
    public static /* enum */ aj2 CUSTOM_SKY;
    public static /* enum */ aj2 CLOUDS;
    public static /* enum */ aj2 POTION_PARTICLES;
    public static /* enum */ aj2 ENTITY_SHADOWS;
    private boolean h;
    public static /* enum */ aj2 STREAM_COMPRESSION;
    public static /* enum */ aj2 MIPMAP_LEVELS;
    public static /* enum */ aj2 GUI_SCALE;
    public static /* enum */ aj2 WATER_PARTICLES;
    public static /* enum */ aj2 FOV;
    public static /* enum */ aj2 STREAM_BYTES_PER_PIXEL;
    public static /* enum */ aj2 FBO_ENABLE;
    public static /* enum */ aj2 FRAMERATE_LIMIT;
    public static /* enum */ aj2 SKY;
    public static /* enum */ aj2 RAIN_SPLASH;
    public static /* enum */ aj2 DYNAMIC_FOV;
    public static /* enum */ aj2 ANIMATED_SMOKE;
    public static /* enum */ aj2 STREAM_KBPS;
    public static /* enum */ aj2 TOUCHSCREEN;
    private float b;
    public static /* enum */ aj2 STREAM_CHAT_ENABLED;
    public static /* enum */ aj2 HELD_ITEM_TOOLTIPS;
    public static /* enum */ aj2 FULLSCREEN_MODE;
    public static /* enum */ aj2 STARS;
    public static /* enum */ aj2 CUSTOM_COLORS;
    public static /* enum */ aj2 CLOUD_HEIGHT;
    public static /* enum */ aj2 CHAT_OPACITY;
    public static /* enum */ aj2 VIGNETTE;
    public static /* enum */ aj2 SMOOTH_FPS;
    public static /* enum */ aj2 STREAM_CHAT_USER_FILTER;
    public static /* enum */ aj2 FORCE_UNICODE_FONT;
    public static /* enum */ aj2 AUTOSAVE_TICKS;
    private String e;
    public static /* enum */ aj2 CHUNK_UPDATES;
    public static /* enum */ aj2 ANIMATED_WATER;
    public static /* enum */ aj2 ANIMATED_PORTAL;
    public static /* enum */ aj2 CHAT_SCALE;
    public static /* enum */ aj2 AMBIENT_OCCLUSION;
    public static /* enum */ aj2 SHOW_CAPES;
    public static /* enum */ aj2 PORTAL_PARTICLES;
    public static /* enum */ aj2 FAST_MATH;
    public static /* enum */ aj2 CLEAR_WATER;
    public static /* enum */ aj2 TRANSLUCENT_BLOCKS;
    public static /* enum */ aj2 DROPPED_ITEMS;
    public static /* enum */ aj2 BLOCK_ALTERNATIVES;
    public static /* enum */ aj2 TREES;
    public static /* enum */ aj2 AA_LEVEL;
    public static /* enum */ aj2 TIME;
    public static /* enum */ aj2 SATURATION;
    public static /* enum */ aj2 ANIMATED_REDSTONE;
    private static String g;
    private static aj2[] f;
    public static /* enum */ aj2 CUSTOM_FONTS;
    public static /* enum */ aj2 CHAT_LINKS;
    public static /* enum */ aj2 DRIPPING_WATER_LAVA;
    public static /* enum */ aj2 STREAM_SEND_METADATA;
    public static /* enum */ aj2 CHAT_VISIBILITY;
    public static /* enum */ aj2 ANIMATED_FLAME;
    public static /* enum */ aj2 CUSTOM_ITEMS;
    public static /* enum */ aj2 ANIMATED_TERRAIN;
    public static /* enum */ aj2 REDUCED_DEBUG_INFO;
    public static /* enum */ aj2 SMOOTH_WORLD;
    public static /* enum */ aj2 ANAGLYPH;
    private float c;
    public static /* enum */ aj2 MIPMAP_TYPE;
    public static /* enum */ aj2 LAGOMETER;
    public static /* enum */ aj2 VOID_PARTICLES;
    public static /* enum */ aj2 ANIMATED_FIRE;
    public static /* enum */ aj2 PROFILER;
    public static /* enum */ aj2 CHAT_WIDTH;
    public static /* enum */ aj2 WEATHER;
    public static /* enum */ aj2 USE_FULLSCREEN;
    public static /* enum */ aj2 GAMMA;
    private float a;
    public static /* enum */ aj2 RENDER_CLOUDS;
    public static /* enum */ aj2 RAIN;
    public static /* enum */ aj2 FOG_FANCY;
    public static /* enum */ aj2 SWAMP_COLORS;
    public static /* enum */ aj2 FOG_START;
    public static /* enum */ aj2 AF_LEVEL;
    public static /* enum */ aj2 ENABLE_VSYNC;
    public static /* enum */ aj2 SNOOPER_ENABLED;
    public static /* enum */ aj2 PARTICLES;
    public static /* enum */ aj2 LAZY_CHUNK_LOADING;
    public static /* enum */ aj2 RANDOM_MOBS;
    public static /* enum */ aj2 CHUNK_UPDATES_DYNAMIC;
    public static /* enum */ aj2 USE_VBO;
    public static /* enum */ aj2 CONNECTED_TEXTURES;
    public static /* enum */ aj2 ANIMATED_LAVA;
    public static /* enum */ aj2 VIEW_BOBBING;
    public static /* enum */ aj2 INVERT_MOUSE;
    public static /* enum */ aj2 STREAM_FPS;
    public static /* enum */ aj2 AO_LEVEL;
    public static /* enum */ aj2 SHOW_FPS;
    public static /* enum */ aj2 SMOOTH_BIOMES;
    public static /* enum */ aj2 SENSITIVITY;
    private static aj2[] i;
    public static /* enum */ aj2 ANIMATED_EXPLOSION;
    public static /* enum */ aj2 NATURAL_TEXTURES;
    public static /* enum */ aj2 RENDER_DISTANCE;
    public static /* enum */ aj2 BETTER_GRASS;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "N=\u0000H-\"b=GjK".toCharArray();
        int n2 = 0;
        int n3 = 85;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x58));
            n3 = n3;
        }
    }

    public boolean c() {
        return this.h;
    }

    public void a(float f) {
        this.c = f;
    }

    public String e() {
        return this.e;
    }

    public float d(float f) {
        f = this.c(f);
        return MathHelper.b(f, this.b, this.c);
    }

    static float b(aj2 aj22) {
        return aj22.b;
    }

    public float e(float f) {
        return MathHelper.b((this.d(f) - this.b) / (this.c - this.b), 0.0f, 1.0f);
    }

    public boolean b() {
        return this.d;
    }

    public static aj2[] values() {
        return (aj2[])i.clone();
    }

    static float a(aj2 aj22) {
        return aj22.c;
    }

    public int d() {
        return this.ordinal();
    }

    public static aj2 a(int n) {
        for (aj2 aj22 : aj2.values()) {
            if (aj22.d() != n) continue;
            return aj22;
        }
        return null;
    }

    protected float c(float f) {
        if (this.a > 0.0f) {
            f = this.a * (float)MathInvoker.a(f / this.a);
        }
        return f;
    }

    public static aj2 valueOf(String string) {
        return (aj2)jc_0.a(aj2.class, string);
    }

    public float b(float f) {
        return this.d(this.b + (this.c - this.b) * MathHelper.b(f, 0.0f, 1.0f));
    }

    public float a() {
        return this.c;
    }

    private aj2(String string2, int n2, String string3, boolean bl, boolean bl2) {
        this(string2, n2, string3, bl, bl2, 0.0f, 1.0f, 0.0f);
    }

    private aj2(String string2, int n2, String string3, boolean bl, boolean bl2, float f, float f2, float f3) {
        this.e = string3;
        this.d = bl;
        this.h = bl2;
        this.b = f;
        this.c = f2;
        this.a = f3;
    }
}

