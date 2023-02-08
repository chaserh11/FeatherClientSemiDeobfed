package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile229 {
   private final Minecraft minecraft;
   private final FeatherSourceFile308 yz;
   private final FeatherSourceFile207 hf;
   private final FeatherSourceFile87 pg;
   private final FeatherSourceFile568 uI;
   private final FeatherSourceFile541 rd;
   private final FeatherSourceFile703 uJ;
   @NotNull
   private final @NotNull FeatherSourceFile143 lk;

   @Inject
   FeatherSourceFile229(Minecraft var1, FeatherSourceFile308 var2, FeatherSourceFile207 var3, FeatherSourceFile87 var4, FeatherSourceFile568 var5, FeatherSourceFile541 var6, FeatherSourceFile703 var7, @NotNull @NotNull FeatherSourceFile143 var8) {
      this.minecraft = var1;
      this.yz = var2;
      this.hf = var3;
      this.pg = var4;
      this.uI = var5;
      this.rd = var6;
      this.uJ = var7;
      this.lk = var8;
   }

   public void fe() {
      this.uI.fe();
      this.rd.fe();
      this.uJ.fe();
      this.e();
   }

   public @NotNull void pq(@NotNull @NotNull Color var1) {
      this.uI.x();
      if (this.minecraft.field_71462_r == this.lk) {
         this.lk.gp();
         this.lk.ym();
      }

      this.yz.sa();
      this.yz.lh(var1);
   }

   public void d() {
      this.hf.pp();
      this.hf.rj();
      this.hf.fy();
      this.hf.zb();
      this.hf.jx();
   }

   private void e() {
      this.yz.ga();
      FeatherSourceFile461.ws.oe((var1) -> {
         switch (var1) {
            case "cosmetics":
               this.minecraft.func_147108_a(this.lk);
               this.pg.gx();
               break;
            case "featherMods":
               this.minecraft.func_147108_a(this.lk);
               this.yz.eo();
         }

      });
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         this.yz.ga();
      });
   }

   public void lv() {
      this.yz.lv();
   }
}
