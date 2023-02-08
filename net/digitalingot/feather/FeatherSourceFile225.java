package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.awt.Color;
import net.digitalingot.featherserverapi.proto.models.ChromaColor;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile225 {
   @SerializedName("chroma")
   private boolean jC;
   @SerializedName("color")
   @NotNull
   private @NotNull Color jD;

   public FeatherSourceFile225(boolean var1, @NotNull @NotNull Color var2) {
      this.jC = var1;
      this.jD = var2;
   }

   public int lm() {
      return this.jD.getRGB();
   }

   public void gr(boolean var1) {
      this.jC = var1;
   }

   public @NotNull void ou(@NotNull @NotNull Color var1) {
      this.jD = var1;
   }

   public boolean on() {
      return this.jC;
   }

   @NotNull
   public @NotNull Color dm() {
      return this.jD;
   }

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile225 lh(@NotNull @NotNull ChromaColor var0) {
      return new FeatherSourceFile225(var0.isChroma(), new Color(var0.getColor()));
   }
}
