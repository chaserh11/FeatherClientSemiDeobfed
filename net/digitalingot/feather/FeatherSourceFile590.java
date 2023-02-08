package net.digitalingot.feather;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class FeatherSourceFile590 {
   private static final int Mq = 65536;
   private static final int Mr = 5;

   private FeatherSourceFile590() {
      throw new AssertionError();
   }

   public static int lh(ByteBuf var0) {
      int var1 = 0;
      int var2 = 0;

      byte var3;
      do {
         var3 = var0.readByte();
         var1 |= (var3 & 127) << var2++ * 7;
         if (var2 > 5) {
            throw new RuntimeException("Malformed VarInt");
         }
      } while((var3 & 128) == 128);

      return var1;
   }

   public static void lh(ByteBuf var0, int var1) {
      while((var1 & -128) != 0) {
         var0.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      var0.writeByte(var1);
   }

   public static int bt(int var0) {
      for(int var1 = 1; var1 < 5; ++var1) {
         if ((var0 & -1 << var1 * 7) == 0) {
            return var1;
         }
      }

      return 5;
   }

   public static String nc(ByteBuf var0) {
      return nc(var0, 65536);
   }

   public static String nc(ByteBuf var0, int var1) {
      int var2 = lh(var0);
      Preconditions.checkArgument(var2 >= 0, "Got a negative-length string (%s)", new Object[]{var2});
      Preconditions.checkArgument(var2 <= var1 * 4, "Bad string size (got %s, maximum is %s)", new Object[]{var2, var1});
      Preconditions.checkState(var0.isReadable(var2), "Trying to read a string that is too long (wanted %s, only have %s)", new Object[]{var2, var0.readableBytes()});
      String var3 = var0.toString(var0.readerIndex(), var2, StandardCharsets.UTF_8);
      var0.skipBytes(var2);
      Preconditions.checkState(var3.length() <= var1, "Got a too-long string (got %s, max %s)", new Object[]{var3.length(), var1});
      return var3;
   }

   public static void lh(ByteBuf var0, CharSequence var1) {
      lh(var0, var1.toString().getBytes(StandardCharsets.UTF_8));
   }

   public static byte[] xj(ByteBuf var0) {
      return xj(var0, 65536);
   }

   public static byte[] xj(ByteBuf var0, int var1) {
      int var2 = lh(var0);
      Preconditions.checkArgument(var2 >= 0, "Got a negative-length array (%s)", new Object[]{var2});
      Preconditions.checkArgument(var2 <= var1, "Bad array size (got %s, maximum is %s)", new Object[]{var2, var1});
      Preconditions.checkState(var0.isReadable(var2), "Trying to read an array that is too long (wanted %s, only have %s)", new Object[]{var2, var0.readableBytes()});
      byte[] var3 = new byte[var2];
      var0.readBytes(var3);
      return var3;
   }

   public static void lh(ByteBuf var0, byte[] var1) {
      lh(var0, var1.length);
      var0.writeBytes(var1);
   }

   public static UUID oe(ByteBuf var0) {
      long var1 = var0.readLong();
      long var3 = var0.readLong();
      return new UUID(var1, var3);
   }

   public static void lh(ByteBuf var0, UUID var1) {
      var0.writeLong(var1.getMostSignificantBits());
      var0.writeLong(var1.getLeastSignificantBits());
   }

   public static void lh(ByteBuf var0, Object var1, Consumer var2) {
      var0.writeBoolean(var1 != null);
      if (var1 != null) {
         var2.accept(var1);
      }

   }

   public static Object lh(ByteBuf var0, Supplier var1) {
      boolean var2 = var0.readBoolean();
      return var2 ? var1.get() : null;
   }
}
