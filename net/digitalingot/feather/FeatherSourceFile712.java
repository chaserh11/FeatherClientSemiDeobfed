package net.digitalingot.feather;

import java.lang.reflect.Field;
import org.apache.commons.lang3.ClassUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile712 {
   @Nullable
   private final @Nullable Field hV;
   @NotNull
   private final @NotNull Class hW;
   @Nullable
   private final @Nullable FeatherSourceFile571 hX;
   @Nullable
   private final @Nullable FeatherSourceFile554 hY;
   @Nullable
   private final @Nullable FeatherSourceFile765 hZ;
   @Nullable
   private final @Nullable FeatherSourceFile227 ig;
   @Nullable
   private final @Nullable FeatherSourceFile536 iA;
   @Nullable
   private final @Nullable FeatherSourceFile622 iB;
   @Nullable
   private final @Nullable FeatherSourceFile702 iC;
   @Nullable
   private final @Nullable FeatherSourceFile192 iD;
   @Nullable
   private final @Nullable FeatherSourceFile196 iE;
   @Nullable
   private final @Nullable FeatherSourceFile656 iF;

   public FeatherSourceFile712(@NotNull @NotNull Class var1) {
      this.hW = ClassUtils.primitiveToWrapper(var1);
      this.hV = null;
      this.hX = null;
      this.hY = null;
      this.hZ = null;
      this.ig = null;
      this.iA = null;
      this.iB = null;
      this.iC = null;
      this.iD = null;
      this.iE = null;
      this.iF = null;
   }

   public FeatherSourceFile712(@NotNull @NotNull Field var1, @NotNull @NotNull FeatherSourceFile571 var2, @Nullable @Nullable FeatherSourceFile554 var3, @Nullable @Nullable FeatherSourceFile765 var4, @Nullable @Nullable FeatherSourceFile227 var5, @Nullable @Nullable FeatherSourceFile536 var6, @Nullable @Nullable FeatherSourceFile622 var7, @Nullable @Nullable FeatherSourceFile702 var8, @Nullable @Nullable FeatherSourceFile192 var9, @Nullable @Nullable FeatherSourceFile196 var10, @Nullable @Nullable FeatherSourceFile656 var11) {
      this.hV = var1;
      this.hW = ClassUtils.primitiveToWrapper(var1.getType());
      this.hX = var2;
      this.hY = var3;
      this.hZ = var4;
      this.ig = var5;
      this.iA = var6;
      this.iB = var7;
      this.iC = var8;
      this.iD = var9;
      this.iE = var10;
      this.iF = var11;
   }

   @NotNull
   public @NotNull @NotNull Object as(@NotNull @NotNull Object var1) {
      if (this.hV == null) {
         throw new NullPointerException("Field is null");
      } else {
         try {
            return this.hV.get(var1);
         } catch (IllegalAccessException var3) {
            throw new RuntimeException(var3);
         }
      }
   }

   public @NotNull @NotNull void nc(@NotNull @NotNull Object var1, @NotNull @NotNull Object var2) {
      if (this.hV == null) {
         throw new NullPointerException("Field is null");
      } else {
         try {
            this.hV.set(var1, var2);
         } catch (IllegalAccessException var4) {
            throw new RuntimeException(var4);
         }
      }
   }

   @NotNull
   public @NotNull Class cn() {
      return this.hW;
   }

   @Nullable
   public @Nullable Field ad() {
      return this.hV;
   }

   @Nullable
   public @Nullable FeatherSourceFile571 ce() {
      return this.hX;
   }

   @Nullable
   public @Nullable FeatherSourceFile554 qx() {
      return this.hY;
   }

   @Nullable
   public @Nullable FeatherSourceFile765 mg() {
      return this.hZ;
   }

   @Nullable
   public @Nullable FeatherSourceFile227 zq() {
      return this.ig;
   }

   @Nullable
   public @Nullable FeatherSourceFile536 or() {
      return this.iA;
   }

   @Nullable
   public @Nullable FeatherSourceFile622 wd() {
      return this.iB;
   }

   @Nullable
   public @Nullable FeatherSourceFile702 do() {
      return this.iC;
   }

   public FeatherSourceFile192 xq() {
      return this.iD;
   }

   @Nullable
   public @Nullable FeatherSourceFile196 yw() {
      return this.iE;
   }

   @Nullable
   public @Nullable FeatherSourceFile656 mo() {
      return this.iF;
   }

   public String toString() {
      return this.hV == null ? "" : this.hV.getDeclaringClass().getName() + "." + this.hV.getName();
   }
}
