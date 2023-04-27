/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package cc.novoline.invoke;

import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.block.BlockPos;
import net.NBTTagCompound;
import net.PacketBuffer;

public class PacketBufferInvoker {
    private static int[] b;

    public static ByteBuf a(PacketBuffer packetBuffer, ByteBuf byteBuf, int n, int n2) {
        return packetBuffer.writeBytes(byteBuf, n, n2);
    }

    public static String d(PacketBuffer packetBuffer, int n) {
        return packetBuffer.a(n);
    }

    public static Enum a(PacketBuffer packetBuffer, Class clazz) {
        return packetBuffer.a(clazz);
    }

    public static ByteBuf a(PacketBuffer packetBuffer, ByteBuf byteBuf) {
        return packetBuffer.writeBytes(byteBuf);
    }

    public static ByteBuf e(PacketBuffer packetBuffer, int n) {
        return packetBuffer.writeInt(n);
    }

    public static int a(int n) {
        return PacketBuffer.b(n);
    }

    public static double s(PacketBuffer packetBuffer) {
        return packetBuffer.readDouble();
    }

    public static IChatComponent q(PacketBuffer packetBuffer) {
        return packetBuffer.g();
    }

    public static boolean i(PacketBuffer packetBuffer) {
        return packetBuffer.readBoolean();
    }

    public static PacketBuffer a(PacketBuffer packetBuffer, Enum enum_) {
        return packetBuffer.a(enum_);
    }

    public static byte[] j(PacketBuffer packetBuffer) {
        return packetBuffer.c();
    }

    public static BlockPos o(PacketBuffer packetBuffer) {
        return packetBuffer.e();
    }

    public static int p(PacketBuffer packetBuffer) {
        return packetBuffer.readInt();
    }

    public static ByteBuf a(PacketBuffer packetBuffer, byte[] byArray, int n, int n2) {
        return packetBuffer.writeBytes(byArray, n, n2);
    }

    public static int[] b() {
        return b;
    }

    public static PacketBuffer a(PacketBuffer packetBuffer, IChatComponent iChatComponent) {
        return packetBuffer.a(iChatComponent);
    }

    public static PacketBuffer b(PacketBuffer packetBuffer, int n) {
        return packetBuffer.c(n);
    }

    public static PacketBuffer b(PacketBuffer packetBuffer, long l4) {
        return packetBuffer.a(l4);
    }

    static {
        if (PacketBufferInvoker.b() == null) {
            PacketBufferInvoker.b(new int[3]);
        }
    }

    public static ByteBuf a(PacketBuffer packetBuffer, byte[] byArray) {
        return packetBuffer.writeBytes(byArray);
    }

    public static ByteBuf b(PacketBuffer packetBuffer, byte[] byArray) {
        return packetBuffer.readBytes(byArray);
    }

    public static short k(PacketBuffer packetBuffer) {
        return packetBuffer.readShort();
    }

    public static ItemStack g(PacketBuffer packetBuffer) {
        return packetBuffer.b();
    }

    public static short n(PacketBuffer packetBuffer) {
        return packetBuffer.readUnsignedByte();
    }

    public static int d(PacketBuffer packetBuffer) {
        return packetBuffer.writerIndex();
    }

    public static PacketBuffer a(PacketBuffer packetBuffer, UUID uUID) {
        return packetBuffer.a(uUID);
    }

    public static ByteBuf c(PacketBuffer packetBuffer, int n) {
        return packetBuffer.writeByte(n);
    }

    public static PacketBuffer a(PacketBuffer packetBuffer, ItemStack itemStack) {
        return packetBuffer.a(itemStack);
    }

    public static float m(PacketBuffer packetBuffer) {
        return packetBuffer.readFloat();
    }

    public static long r(PacketBuffer packetBuffer) {
        return packetBuffer.h();
    }

    public static int f(PacketBuffer packetBuffer) {
        return packetBuffer.readableBytes();
    }

    public static PacketBuffer a(PacketBuffer packetBuffer, BlockPos blockPos) {
        return packetBuffer.a(blockPos);
    }

    public static PacketBuffer a(PacketBuffer packetBuffer, NBTTagCompound nBTTagCompound) {
        return packetBuffer.a(nBTTagCompound);
    }

    public static ByteBuf a(PacketBuffer packetBuffer, int n) {
        return packetBuffer.readBytes(n);
    }

    public static boolean t(PacketBuffer packetBuffer) {
        return packetBuffer.release();
    }

    public static ByteBuf a(PacketBuffer packetBuffer, long l4) {
        return packetBuffer.writeLong(l4);
    }

    public static ByteBuf f(PacketBuffer packetBuffer, int n) {
        return packetBuffer.ensureWritable(n);
    }

    public static int c(PacketBuffer packetBuffer) {
        return packetBuffer.readUnsignedShort();
    }

    public static void c(PacketBuffer packetBuffer, byte[] byArray) {
        packetBuffer.a(byArray);
    }

    public static UUID h(PacketBuffer packetBuffer) {
        return packetBuffer.a();
    }

    public static PacketBuffer a(PacketBuffer packetBuffer, String string) {
        return packetBuffer.a(string);
    }

    public static ByteBuf g(PacketBuffer packetBuffer, int n) {
        return packetBuffer.writeShort(n);
    }

    public static byte l(PacketBuffer packetBuffer) {
        return packetBuffer.readByte();
    }

    public static ByteBuf writeDouble(PacketBuffer packetBuffer, double d) {
        return packetBuffer.writeDouble(d);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static ByteBuf a(PacketBuffer packetBuffer, boolean bl) {
        return packetBuffer.writeBoolean(bl);
    }

    public static int b(PacketBuffer packetBuffer) {
        return packetBuffer.f();
    }

    public static long e(PacketBuffer packetBuffer) {
        return packetBuffer.readLong();
    }

    public static ByteBuf writeFloat(PacketBuffer packetBuffer, float f) {
        return packetBuffer.writeFloat(f);
    }

    public static NBTTagCompound a(PacketBuffer packetBuffer) {
        return packetBuffer.d();
    }
}

