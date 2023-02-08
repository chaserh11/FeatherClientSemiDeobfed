package net.digitalingot.feather;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile437 implements FeatherSourceFile809, FeatherSourceFile814 {
   @NotNull
   private final @NotNull File iZ;
   @Nullable
   private @Nullable InputStream ka;
   @Nullable
   private @Nullable OutputStream QV;

   public FeatherSourceFile437(@NotNull @NotNull File var1) {
      this.iZ = var1;
   }

   @NotNull
   public @NotNull InputStream wO() {
      if (this.ka != null) {
         return this.ka;
      } else {
         try {
            this.ka = new FileInputStream(this.iZ);
            return this.ka;
         } catch (Exception var2) {
            throw new FeatherSourceFile816(var2);
         }
      }
   }

   @NotNull
   public @NotNull OutputStream wT() {
      if (this.QV != null) {
         return this.QV;
      } else {
         try {
            if (!this.iZ.exists()) {
               this.iZ.getParentFile().mkdirs();
               this.iZ.createNewFile();
            }

            this.QV = new FileOutputStream(this.iZ);
            return this.QV;
         } catch (Exception var2) {
            throw new FeatherSourceFile816(var2);
         }
      }
   }

   public void close() {
      FeatherSourceFile810.lh(this.ka, this.QV);
      this.ka = null;
      this.QV = null;
   }
}
