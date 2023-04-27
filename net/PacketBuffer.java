/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.buffer.ByteBufProcessor
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Charsets;
import deobf.IChatComponent;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;

import org.jetbrains.annotations.Nullable;

public class PacketBuffer
extends ByteBuf {
    private ByteBuf a;

    public ByteBuf setIndex(int n, int n2) {
        return this.a.setIndex(n, n2);
    }

    public ByteBuf readBytes(OutputStream outputStream, int n) throws IOException {
        return this.a.readBytes(outputStream, n);
    }

    public ByteBuf clear() {
        return this.a.clear();
    }

    public ByteBuf readBytes(byte[] byArray) {
        return this.a.readBytes(byArray);
    }

    public int forEachByteDesc(ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByteDesc(byteBufProcessor);
    }

    public ItemStack b() throws IOException {
        ItemStack itemStack = null;
        short s = this.readShort();
        byte by = this.readByte();
        short s3 = this.readShort();
        itemStack = new ItemStack(px_0.a(s), (int)by, (int)s3);
        act_2.b(itemStack, this.d());
        return itemStack;
    }

    public float getFloat(int n) {
        return this.a.getFloat(n);
    }

    public int readInt() {
        return this.a.readInt();
    }

    public int maxWritableBytes() {
        return this.a.maxWritableBytes();
    }

    public boolean release() {
        return this.a.release();
    }

    public int getUnsignedShort(int n) {
        return this.a.getUnsignedShort(n);
    }

    public <T extends Enum<T>> T a(Class<T> clazz) {
        return (T)((Enum[])ara_2.c(clazz))[this.f()];
    }

    public PacketBuffer a(String string) {
        byte[] byArray = StringInvoker.a(string, Charsets.UTF_8);
        if (byArray.length > Short.MAX_VALUE) {
            throw new EncoderException(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), zp_1.b), byArray.length), zp_1.h), Short.MAX_VALUE), zp_1.c).toString());
        }
        this.c(byArray.length);
        this.writeBytes(byArray);
        return this;
    }

    public int getUnsignedMedium(int n) {
        return this.a.getUnsignedMedium(n);
    }

    public ByteBuffer[] nioBuffers(int n, int n2) {
        return this.a.nioBuffers(n, n2);
    }

    public int readerIndex() {
        return this.a.readerIndex();
    }

    public ByteOrder order() {
        return this.a.order();
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf, int n2) {
        return this.a.getBytes(n, byteBuf, n2);
    }

    public int bytesBefore(int n, byte by) {
        return this.a.bytesBefore(n, by);
    }

    public ByteBuf resetWriterIndex() {
        return this.a.resetWriterIndex();
    }

    public boolean hasMemoryAddress() {
        return this.a.hasMemoryAddress();
    }

    public UUID a() {
        return new UUID(this.readLong(), this.readLong());
    }

    public String toString() {
        return this.a.toString();
    }

    public short getUnsignedByte(int n) {
        return this.a.getUnsignedByte(n);
    }

    public short readUnsignedByte() {
        return this.a.readUnsignedByte();
    }

    public ByteBuf setInt(int n, int n2) {
        return this.a.setInt(n, n2);
    }

    public ByteBuf writeBoolean(boolean bl) {
        return this.a.writeBoolean(bl);
    }

    public int arrayOffset() {
        return this.a.arrayOffset();
    }

    public ByteBuf setLong(int n, long l4) {
        return this.a.setLong(n, l4);
    }

    public int capacity() {
        return this.a.capacity();
    }

    public int refCnt() {
        return this.a.refCnt();
    }

    public ByteBuf markReaderIndex() {
        return this.a.markReaderIndex();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public ByteBuf getBytes(int n, byte[] byArray) {
        return this.a.getBytes(n, byArray);
    }

    public boolean isReadable(int n) {
        return this.a.isReadable(n);
    }

    public ByteBufAllocator alloc() {
        return this.a.alloc();
    }

    public ByteBuf copy() {
        return this.a.copy();
    }

    public char getChar(int n) {
        return this.a.getChar(n);
    }

    public ByteBuf setFloat(int n, float f) {
        return this.a.setFloat(n, f);
    }

    public ByteBuf copy(int n, int n2) {
        return this.a.copy(n, n2);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n, int n2) {
        return this.a.writeBytes(byteBuf, n, n2);
    }

    public PacketBuffer c(int n) {
        while ((n & 0xFFFFFF80) != 0) {
            this.writeByte(n & 0x7F | 0x80);
            n >>>= 7;
        }
        this.writeByte(n);
        return this;
    }

    public PacketBuffer a(Enum<?> enum_) {
        this.c(enum_.ordinal());
        return this;
    }

    public ByteBuf capacity(int n) {
        return this.a.capacity(n);
    }

    public double readDouble() {
        return this.a.readDouble();
    }

    public PacketBuffer a(ItemStack itemStack) {
        this.writeShort(-1);
        return this;
    }

    public long readLong() {
        return this.a.readLong();
    }

    public ByteBuf writeLong(long l4) {
        return this.a.writeLong(l4);
    }

    public PacketBuffer a(BlockPos blockPos) {
        this.writeLong(amv_2.c(blockPos));
        return this;
    }

    public IChatComponent g() throws IOException {
        return aGU.a(this.a(Short.MAX_VALUE));
    }

    public ByteBuf setByte(int n, int n2) {
        return this.a.setByte(n, n2);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n, int n2) {
        return this.a.readBytes(byteBuf, n, n2);
    }

    public ByteBuf discardReadBytes() {
        return this.a.discardReadBytes();
    }

    public int bytesBefore(int n, int n2, byte by) {
        return this.a.bytesBefore(n, n2, by);
    }

    public int readMedium() {
        return this.a.readMedium();
    }

    public byte readByte() {
        return this.a.readByte();
    }

    public boolean isDirect() {
        return this.a.isDirect();
    }

    public boolean hasArray() {
        return this.a.hasArray();
    }

    public int getMedium(int n) {
        return this.a.getMedium(n);
    }

    public boolean getBoolean(int n) {
        return this.a.getBoolean(n);
    }

    public boolean isReadable() {
        return this.a.isReadable();
    }

    public ByteBuf slice(int n, int n2) {
        return this.a.slice(n, n2);
    }

    public long readUnsignedInt() {
        return this.a.readUnsignedInt();
    }

    public int forEachByteDesc(int n, int n2, ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByteDesc(n, n2, byteBufProcessor);
    }

    public int forEachByte(ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByte(byteBufProcessor);
    }

    public BlockPos e() {
        return amv_2.a(this.readLong());
    }

    public ByteBuf writeInt(int n) {
        return this.a.writeInt(n);
    }

    public String a(int n) {
        int n2 = this.f();
        if (n2 > n * 4) {
            throw new DecoderException(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), zp_1.e), n2), zp_1.k), n * 4), zp_1.j).toString());
        }
        throw new DecoderException(zp_1.l);
    }

    public ByteBuffer nioBuffer(int n, int n2) {
        return this.a.nioBuffer(n, n2);
    }

    public int maxCapacity() {
        return this.a.maxCapacity();
    }

    public boolean readBoolean() {
        return this.a.readBoolean();
    }

    public short getShort(int n) {
        return this.a.getShort(n);
    }

    public int nioBufferCount() {
        return this.a.nioBufferCount();
    }

    public ByteBuf resetReaderIndex() {
        return this.a.resetReaderIndex();
    }

    public int writerIndex() {
        return this.a.writerIndex();
    }

    public PacketBuffer a(UUID uUID) {
        this.writeLong(awc_1.b(uUID));
        this.writeLong(awc_1.a(uUID));
        return this;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int ensureWritable(int n, boolean bl) {
        return this.a.ensureWritable(n, bl);
    }

    public boolean isWritable(int n) {
        return this.a.isWritable(n);
    }

    public ByteBuf order(ByteOrder byteOrder) {
        return this.a.order(byteOrder);
    }

    public byte[] array() {
        return this.a.array();
    }

    public int readUnsignedShort() {
        return this.a.readUnsignedShort();
    }

    public int f() {
        byte by;
        int n = 0;
        int n2 = 0;
        do {
            by = this.readByte();
            n |= (by & 0x7F) << n2++ * 7;
            if (n2 <= 5) continue;
            throw new RuntimeException(zp_1.g);
        } while ((by & 0x80) == 128);
        return n;
    }

    public String toString(Charset charset) {
        return this.a.toString(charset);
    }

    public ByteBuf setBytes(int n, byte[] byArray) {
        return this.a.setBytes(n, byArray);
    }

    public ByteBuf setBytes(int n, ByteBuffer byteBuffer) {
        return this.a.setBytes(n, byteBuffer);
    }

    public long h() {
        byte by;
        long l4 = 0L;
        int n = 0;
        do {
            by = this.readByte();
            l4 |= (long)(by & 0x7F) << n++ * 7;
            if (n <= 10) continue;
            throw new RuntimeException(zp_1.a);
        } while ((by & 0x80) == 128);
        return l4;
    }

    public ByteBuf writeShort(int n) {
        return this.a.writeShort(n);
    }

    public ByteBuf skipBytes(int n) {
        return this.a.skipBytes(n);
    }

    public int getBytes(int n, GatheringByteChannel gatheringByteChannel, int n2) throws IOException {
        return this.a.getBytes(n, gatheringByteChannel, n2);
    }

    public ByteBuf setBoolean(int n, boolean bl) {
        return this.a.setBoolean(n, bl);
    }

    public ByteBuf setZero(int n, int n2) {
        return this.a.setZero(n, n2);
    }

    public ByteBuf writeBytes(byte[] byArray, int n, int n2) {
        return this.a.writeBytes(byArray, n, n2);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf, int n2) {
        return this.a.setBytes(n, byteBuf, n2);
    }

    public int readUnsignedMedium() {
        return this.a.readUnsignedMedium();
    }

    public ByteBuf writeChar(int n) {
        return this.a.writeChar(n);
    }

    public ByteBuf getBytes(int n, byte[] byArray, int n2, int n3) {
        return this.a.getBytes(n, byArray, n2, n3);
    }

    public int forEachByte(int n, int n2, ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByte(n, n2, byteBufProcessor);
    }

    public float readFloat() {
        return this.a.readFloat();
    }

    public int setBytes(int n, ScatteringByteChannel scatteringByteChannel, int n2) throws IOException {
        return this.a.setBytes(n, scatteringByteChannel, n2);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n) {
        return this.a.writeBytes(byteBuf, n);
    }

    public ByteBuf setShort(int n, int n2) {
        return this.a.setShort(n, n2);
    }

    public ByteBuffer[] nioBuffers() {
        return this.a.nioBuffers();
    }

    public long memoryAddress() {
        return this.a.memoryAddress();
    }

    public ByteBuf writeBytes(byte[] byArray) {
        return this.a.writeBytes(byArray);
    }

    public ByteBuf writeDouble(double d) {
        return this.a.writeDouble(d);
    }

    public String toString(int n, int n2, Charset charset) {
        return this.a.toString(n, n2, charset);
    }

    public int bytesBefore(byte by) {
        return this.a.bytesBefore(by);
    }

    public double getDouble(int n) {
        return this.a.getDouble(n);
    }

    public byte[] c() {
        byte[] byArray = new byte[this.f()];
        this.readBytes(byArray);
        return byArray;
    }

    public ByteBuf ensureWritable(int n) {
        return this.a.ensureWritable(n);
    }

    public short readShort() {
        return this.a.readShort();
    }

    public ByteBuf unwrap() {
        return this.a.unwrap();
    }

    public ByteBuf getBytes(int n, ByteBuffer byteBuffer) {
        return this.a.getBytes(n, byteBuffer);
    }

    public ByteBuf getBytes(int n, OutputStream outputStream, int n2) throws IOException {
        return this.a.getBytes(n, outputStream, n2);
    }

    public int readableBytes() {
        return this.a.readableBytes();
    }

    public PacketBuffer(ByteBuf byteBuf) {
        this.a = byteBuf;
    }

    public ByteBuf discardSomeReadBytes() {
        return this.a.discardSomeReadBytes();
    }

    public char readChar() {
        return this.a.readChar();
    }

    public static int b(int n) {
        int n2 = 1;
        while ((n & -1 << n2 * 7) != 0) {
            ++n2;
        }
        return n2;
    }

    public PacketBuffer a(long l4) {
        while ((l4 & 0xFFFFFFFFFFFFFF80L) != 0L) {
            this.writeByte((int)(l4 & 0x7FL) | 0x80);
            l4 >>>= 7;
        }
        this.writeByte((int)l4);
        return this;
    }

    public ByteBuf setMedium(int n, int n2) {
        return this.a.setMedium(n, n2);
    }

    public void a(byte[] byArray) {
        this.c(byArray.length);
        this.writeBytes(byArray);
    }

    public ByteBuffer internalNioBuffer(int n, int n2) {
        return this.a.internalNioBuffer(n, n2);
    }

    public ByteBuf duplicate() {
        return this.a.duplicate();
    }

    public ByteBuf retain() {
        return this.a.retain();
    }

    public PacketBuffer a(NBTTagCompound nBTTagCompound) {
        this.writeByte(0);
        return this;
    }

    public ByteBuf writeBytes(ByteBuf byteBuf) {
        return this.a.writeBytes(byteBuf);
    }

    public long getUnsignedInt(int n) {
        return this.a.getUnsignedInt(n);
    }

    public ByteBuf readBytes(byte[] byArray, int n, int n2) {
        return this.a.readBytes(byArray, n, n2);
    }

    public ByteBuf setChar(int n, int n2) {
        return this.a.setChar(n, n2);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf, int n2, int n3) {
        return this.a.getBytes(n, byteBuf, n2, n3);
    }

    public ByteBuf writeZero(int n) {
        return this.a.writeZero(n);
    }

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    public ByteBuf slice() {
        return this.a.slice();
    }

    public int setBytes(int n, InputStream inputStream, int n2) throws IOException {
        return this.a.setBytes(n, inputStream, n2);
    }

    public ByteBuf readBytes(int n) {
        return this.a.readBytes(n);
    }

    public ByteBuf setBytes(int n, byte[] byArray, int n2, int n3) {
        return this.a.setBytes(n, byArray, n2, n3);
    }

    public ByteBuf writeFloat(float f) {
        return this.a.writeFloat(f);
    }

    public int getInt(int n) {
        return this.a.getInt(n);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf, int n2, int n3) {
        return this.a.setBytes(n, byteBuf, n2, n3);
    }

    public ByteBuf readBytes(ByteBuffer byteBuffer) {
        return this.a.readBytes(byteBuffer);
    }

    public byte getByte(int n) {
        return this.a.getByte(n);
    }

    public boolean isWritable() {
        return this.a.isWritable();
    }

    public int compareTo(ByteBuf byteBuf) {
        return this.a.compareTo(byteBuf);
    }

    public ByteBuf setDouble(int n, double d) {
        return this.a.setDouble(n, d);
    }

    public ByteBuf writeBytes(ByteBuffer byteBuffer) {
        return this.a.writeBytes(byteBuffer);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf) {
        return this.a.getBytes(n, byteBuf);
    }

    public ByteBuf readerIndex(int n) {
        return this.a.readerIndex(n);
    }

    public ByteBuffer nioBuffer() {
        return this.a.nioBuffer();
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int n) throws IOException {
        return this.a.writeBytes(scatteringByteChannel, n);
    }

    public int writableBytes() {
        return this.a.writableBytes();
    }

    public ByteBuf readBytes(ByteBuf byteBuf) {
        return this.a.readBytes(byteBuf);
    }

    public ByteBuf readSlice(int n) {
        return this.a.readSlice(n);
    }

    public PacketBuffer a(IChatComponent iChatComponent) throws IOException {
        this.a(aGU.a(iChatComponent));
        return this;
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n) {
        return this.a.readBytes(byteBuf, n);
    }

    @Nullable
    public NBTTagCompound d() throws IOException {
        this.readerIndex();
        this.readByte();
        return null;
    }

    public ByteBuf markWriterIndex() {
        return this.a.markWriterIndex();
    }

    public int writeBytes(InputStream inputStream, int n) throws IOException {
        return this.a.writeBytes(inputStream, n);
    }

    public ByteBuf writeByte(int n) {
        return this.a.writeByte(n);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf) {
        return this.a.setBytes(n, byteBuf);
    }

    public ByteBuf writerIndex(int n) {
        return this.a.writerIndex(n);
    }

    public int indexOf(int n, int n2, byte by) {
        return this.a.indexOf(n, n2, by);
    }

    public ByteBuf retain(int n) {
        return this.a.retain(n);
    }

    public long getLong(int n) {
        return this.a.getLong(n);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int n) throws IOException {
        return this.a.readBytes(gatheringByteChannel, n);
    }

    public ByteBuf writeMedium(int n) {
        return this.a.writeMedium(n);
    }

    public boolean release(int n) {
        return this.a.release(n);
    }
}

