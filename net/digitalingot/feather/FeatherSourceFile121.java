package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.VOICE,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.voice",
   jl = "https://assets.feathercdn.net/game/mods/voice.svg",
   od = "feather.moduledescription.voice",
   wr = {}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh20.class
)}
)
public class FeatherSourceFile121 extends FeatherSourceFile360 {
   private final Minecraft minecraft;
   private final FeatherSourceFile55 kQ;
   private final FeatherSourceFile75 JS;
   private final FeatherSourceFile70 JT;
   private final FeatherSourceFile111 JU;
   private final FeatherSourceFile549 JV;
   private boolean JW;
   private boolean JX;

   @Inject
   FeatherSourceFile121(Minecraft var1, FeatherSourceFile55 var2, @NotNull @NotNull FeatherSourceFile75 var3, FeatherSourceFile70 var4, FeatherSourceFile111 var5, FeatherSourceFile549 var6) {
      this.minecraft = var1;
      this.kQ = var2;
      this.JS = var3;
      this.JT = var4;
      this.JU = var5;
      this.JV = var6;
   }

   public void ex() {
      this.JS.fe();
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$nc8)this.fS).Ke;
      }, () -> {
         this.JX = true;
      }, () -> {
         this.JX = false;
      });
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$nc8)this.fS).Kd;
      }, () -> {
         this.JW = true;
      }, () -> {
         this.JW = false;
      });
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         this.JX = false;
         this.JW = false;
      });
   }

   public void ml() {
      this.JS.mr(((FeatherSourceFile$nc8)this.fS).Km, ((FeatherSourceFile$nc8)this.fS).Kj);
      this.JV.eW();
   }

   public void ze() {
      this.JW = false;
      this.JX = false;
      this.JS.eU();
      this.JV.eX();
   }

   public void pu() {
      this.JX = false;
      this.JW = false;
      this.JS.ux(((FeatherSourceFile$nc8)this.fS).Km, ((FeatherSourceFile$nc8)this.fS).Kj);
      this.JT.rp((float)((FeatherSourceFile$nc8)this.fS).Ko);
   }

   @Nullable
   public @Nullable FeatherSourceFile75 eM() {
      return this.JS;
   }

   public boolean eN() {
      return this.JX;
   }

   public boolean eO() {
      return this.JW;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lh(FeatherSourceFile121 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile70 nc(FeatherSourceFile121 var0) {
      return var0.JT;
   }

   // $FF: synthetic method
   static FeatherSourceFile111 xj(FeatherSourceFile121 var0) {
      return var0.JU;
   }

   // $FF: synthetic method
   static Minecraft oe(FeatherSourceFile121 var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qy(FeatherSourceFile121 var0) {
      return var0.fS;
   }
}
