package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;

public abstract class FeatherSourceFile136 {
   @FeatherSourceFile571(
      lb = "hudSelection",
      jc = "feather.module.config.ModuleConfig.hudSelection",
      kd = "true",
      jm = @FeatherSourceFile655(
   kz = -2
)
   )
   public boolean hL;
   @FeatherSourceFile571(
      lb = "enabled",
      jc = "feather.commonterm.enabled",
      jm = @FeatherSourceFile655(
   kz = -10
)
   )
   public transient boolean enabled;
   @SerializedName("favorite")
   public transient boolean eP;
   @SerializedName("canRenderMod")
   public transient boolean hM;

   public boolean vy() {
      return this.enabled;
   }

   public Boolean wg() {
      return this.hM ? null : false;
   }

   public boolean pj() {
      return this.eP;
   }
}
