package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import net.minecraft.network.PacketBuffer;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile449 {
   @SerializedName("external_address")
   @NotNull
   private final @NotNull InetSocketAddress RE;
   @SerializedName("public_key")
   private final byte[] fL;

   public FeatherSourceFile449(@NotNull @NotNull InetSocketAddress var1, byte[] var2) {
      this.RE = var1;
      this.fL = var2;
   }

   public static FeatherSourceFile449 lh(PacketBuffer var0) {
      InetSocketAddress var1 = nc(var0);
      byte[] var2 = var0.func_179251_a();
      return new FeatherSourceFile449(var1, var2);
   }

   private static InetSocketAddress nc(PacketBuffer var0) {
      byte var1 = var0.readByte();
      InetAddress var2;
      byte[] var3;
      if (var1 == 0) {
         var3 = new byte[]{var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte()};
         var2 = InetAddress.getByAddress(var3);
      } else {
         if (var1 != 1) {
            throw new IllegalArgumentException("Unknown address type: " + var1);
         }

         var3 = new byte[]{var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte(), var0.readByte()};
         var2 = InetAddress.getByAddress(var3);
      }

      short var4 = var0.readShort();
      return new InetSocketAddress(var2, var4);
   }

   public void xj(PacketBuffer var1) {
      this.lh(var1, this.RE);
      var1.writeBytes(this.fL);
   }

   private void lh(PacketBuffer var1, InetSocketAddress var2) {
      byte[] var3 = var2.getAddress().getAddress();
      int var4;
      if (var3.length == 4) {
         var1.writeByte(0);

         for(var4 = 0; var4 < 4; ++var4) {
            var1.writeByte(var3[var4]);
         }
      } else {
         var1.writeByte(1);

         for(var4 = 0; var4 < 16; ++var4) {
            var1.writeByte(var3[var4]);
         }
      }

      var1.writeShort(var2.getPort());
   }

   @NotNull
   public @NotNull InetSocketAddress xX() {
      return this.RE;
   }

   public byte[] lo() {
      return this.fL;
   }
}
