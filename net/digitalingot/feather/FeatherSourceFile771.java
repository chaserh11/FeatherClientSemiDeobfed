package net.digitalingot.feather;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile771 implements FeatherSourceFile786 {
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull Provider Kq;
   @NotNull
   private final @NotNull FeatherSourceFile633 KX;
   @NotNull
   private final @NotNull FeatherSourceFile652 KY;

   @Inject
   FeatherSourceFile771(@NotNull @NotNull Minecraft var1, @NotNull @NotNull Provider var2, @NotNull @NotNull FeatherSourceFile652 var3, @NotNull @NotNull FeatherSourceFile633 var4) {
      this.minecraft = var1;
      this.Kq = var2;
      this.KY = var3;
      this.KX = var4;
   }

   public float eZ() {
      return (float)((FeatherSourceFile$nc8)((FeatherSourceFile121)this.Kq.get()).pr()).Kk;
   }

   public float fA() {
      return (float)((FeatherSourceFile$nc8)((FeatherSourceFile121)this.Kq.get()).pr()).Kn;
   }

   public float fB() {
      return (float)((FeatherSourceFile$nc8)((FeatherSourceFile121)this.Kq.get()).pr()).Ko;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh26 fC() {
      return ((FeatherSourceFile$nc8)((FeatherSourceFile121)this.Kq.get()).pr()).Ka.toCapnProto();
   }

   @NotNull
   public @NotNull List fD() {
      return (List)this.KX.fL().stream().map(FeatherSourceFile384::oa).collect(Collectors.toList());
   }

   public boolean fE() {
      return ((FeatherSourceFile$nc8)((FeatherSourceFile121)this.Kq.get()).pr()).Kg != FeatherSourceFile$nc$nc.OFF;
   }

   @Nullable
   public @Nullable @Nullable FeatherSourceFile$nc[] xj(byte[] var1) {
      FeatherSourceFile$nc[] var2 = this.fF();
      if (var2 != null) {
         return var2;
      } else {
         FeatherSourceFile$nc var3 = this.KY.lh(var1);
         return var3 == null ? null : new FeatherSourceFile$nc[]{var3};
      }
   }

   @Nullable
   public @Nullable FeatherSourceFile$nc[] fF() {
      if (!this.minecraft.field_71415_G) {
         return null;
      } else {
         boolean var1 = ((FeatherSourceFile121)this.Kq.get()).eO();
         boolean var2 = ((FeatherSourceFile121)this.Kq.get()).eN();
         FeatherSourceFile$nc[] var3;
         if (var2 && var1) {
            var3 = new FeatherSourceFile$nc[]{FeatherSourceFile$nc.PROXIMITY, FeatherSourceFile$nc.PARTY};
         } else if (var1) {
            var3 = new FeatherSourceFile$nc[]{FeatherSourceFile$nc.PROXIMITY};
         } else if (var2) {
            var3 = new FeatherSourceFile$nc[]{FeatherSourceFile$nc.PARTY};
         } else {
            var3 = null;
         }

         return var3;
      }
   }

   @Nullable
   public @Nullable FeatherSourceFile$lh4 fG() {
      EntityPlayerSP var1 = this.minecraft.field_71439_g;
      if (var1 == null) {
         return null;
      } else {
         FeatherSourceFile401 var2 = new FeatherSourceFile401((float)var1.field_70169_q, (float)var1.field_70167_r, (float)var1.field_70166_s);
         boolean var3 = this.minecraft.field_71474_y.field_74320_O != 0;
         float var4 = this.minecraft.field_71439_g.field_71109_bG;
         float var5 = this.minecraft.field_71439_g.field_70726_aT;
         return new FeatherSourceFile$lh4(var2, var3, var4, var5);
      }
   }

   @Nullable
   public @Nullable FeatherSourceFile401 qr(UUID var1) {
      EntityPlayerSP var2 = this.minecraft.field_71439_g;
      if (var2 == null) {
         return null;
      } else {
         EntityPlayer var3 = this.minecraft.field_71441_e.func_152378_a(var1);
         return var3 == null ? null : new FeatherSourceFile401((float)var3.field_70169_q, (float)var3.field_70167_r, (float)var3.field_70166_s);
      }
   }
}
