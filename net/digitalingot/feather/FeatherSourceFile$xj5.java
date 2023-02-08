package net.digitalingot.feather;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.client.resources.SkinManager.SkinAvailableCallback;
import net.minecraft.util.ResourceLocation;

class FeatherSourceFile$xj5 {
   private final GameProfile oK;
   private boolean oL;
   private String oM;
   private ResourceLocation oN;
   private ResourceLocation oO;

   public FeatherSourceFile$xj5(GameProfile var1) {
      this.oK = var1;
   }

   public boolean cv() {
      return this.oN != null;
   }

   public String vq() {
      return this.oM;
   }

   public ResourceLocation ne() {
      this.gu();
      return this.oN;
   }

   public ResourceLocation ix() {
      this.gu();
      return this.oO;
   }

   protected void gu() {
      synchronized(this) {
         if (!this.oL) {
            this.oL = true;
            SkinAvailableCallback var2 = (var1, var2x, var3x) -> {
               switch (var1) {
                  case SKIN:
                     this.oN = var2x;
                     this.oM = var3x.getMetadata("model");
                     if (this.oM == null) {
                        this.oM = "default";
                     }
                     break;
                  case CAPE:
                     this.oO = var2x;
               }

            };
            SkinManager var3 = Minecraft.func_71410_x().func_152342_ad();
            var3.func_152790_a(this.oK, var2, true);
         }

      }
   }
}
