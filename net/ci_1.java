/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.StringPropertyInvoker;
import deobf.IntProperty;
import java.util.Collection;
import java.util.List;
import net.Ba;
import net.BooleanProperty;
import net.DoubleProperty;
import net.E3;
import net.EQ;
import net.FloatProperty;
import net.ListProperty;
import net.MD;
import net.StringProperty;
import net.a9V;
import net.aUL;
import net.aay_1;
import net.ac7;
import net.adt_2;
import net.ae6_0;
import net.asl_0;
import net.auk_2;
import net.ava_0;
import net.eu_0;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.cI
 */
public class ci_1 {
    @NotNull
    public static BooleanProperty c() {
        return Ba.a(auk_2.b(false));
    }

    @NotNull
    public static <Subtype> ListProperty<Subtype> a(@NotNull Collection<Subtype> collection) {
        return ava_0.a(collection);
    }

    @NotNull
    public static IntProperty a(@Nullable Integer n) {
        return adt_2.a(n);
    }

    @NotNull
    public static BooleanProperty b() {
        return Ba.c();
    }

    @NotNull
    public static BooleanProperty g() {
        return Ba.a(auk_2.b(true));
    }

    @NotNull
    public static DoubleProperty a(@Nullable Double d) {
        return MD.a(d);
    }

    @Contract(value="_ -> new", pure=true)
    @NotNull
    public static EQ a(@NotNull ae6_0 ae6_02) {
        asl_0.a(ae6_02, aay_1.a);
        return new EQ(ae6_02);
    }

    @NotNull
    public static <Subtype> ListProperty<Subtype> a(@Nullable Subtype Subtype, @Nullable Subtype Subtype2, @Nullable Subtype Subtype3) {
        return ava_0.a(Subtype, Subtype2, Subtype3);
    }

    @NotNull
    public static BooleanProperty a(@Nullable Boolean bl) {
        return Ba.a(bl);
    }

    @NotNull
    public static IntProperty h() {
        return adt_2.a();
    }

    @NotNull
    public static StringProperty a(@Nullable String string) {
        return StringPropertyInvoker.c(string);
    }

    @NotNull
    public static FloatProperty a(@Nullable Float f) {
        return a9V.a(f);
    }

    @NotNull
    public static StringProperty f() {
        return StringPropertyInvoker.c();
    }

    @NotNull
    public static BooleanProperty a() {
        return Ba.d();
    }

    @NotNull
    public static FloatProperty e() {
        return a9V.a();
    }

    @NotNull
    public static <Subtype> ListProperty<Subtype> a(@NotNull List<Subtype> list) {
        return ava_0.a(list);
    }

    @NotNull
    public static DoubleProperty d() {
        return MD.a();
    }

    @NotNull
    public static <Subtype> ListProperty<Subtype> a(@Nullable Subtype Subtype, @Nullable Subtype Subtype2) {
        return ava_0.a(Subtype, Subtype2);
    }

    @NotNull
    public static E3 a(@Nullable Long l4) {
        return ac7.a(l4);
    }

    @NotNull
    public static E3 i() {
        return ac7.a();
    }

    @SafeVarargs
    @NotNull
    public static <Subtype> ListProperty<Subtype> a(Subtype ... SubtypeArray) {
        return ava_0.a(SubtypeArray);
    }

    @NotNull
    public static eu_0 b(@Nullable Integer n) {
        return aUL.a(n);
    }

    @NotNull
    public static <Subtype> ListProperty<Subtype> a(@Nullable Subtype Subtype) {
        return ava_0.a(Subtype);
    }
}

