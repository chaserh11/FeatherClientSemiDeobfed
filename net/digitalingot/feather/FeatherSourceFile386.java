package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile386 implements FeatherSourceFile706 {
   @SerializedName("id")
   private final int id;
   @SerializedName("peer")
   @NotNull
   private final @NotNull InetSocketAddress fK;
   @SerializedName("peer_enc_pk")
   private final byte[] fL;

   public FeatherSourceFile386(int var1, @NotNull @NotNull InetSocketAddress var2, byte[] var3) {
      this.id = var1;
      this.fK = var2;
      this.fL = var3;
   }

   public int qg() {
      return this.id;
   }

   @NotNull
   public @NotNull SocketAddress gm() {
      return this.fK;
   }

   public byte[] lo() {
      return this.fL;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.PUNCH_HOLE;
   }
}
