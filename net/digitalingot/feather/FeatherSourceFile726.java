package net.digitalingot.feather;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ClassUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile726 {
   private static final Map iG = new HashMap();
   @NotNull
   private final @NotNull Class iH;

   public FeatherSourceFile726(@NotNull @NotNull Class var1) {
      this.iH = var1;
   }

   @NotNull
   public @NotNull List di() {
      return this.lh((FeatherSourceFile192)null);
   }

   @NotNull
   public @NotNull List lh(FeatherSourceFile192 var1) {
      List var2 = (List)iG.get(this.iH);
      if (var2 != null && var1 == null) {
         return var2;
      } else {
         ArrayList var3 = new ArrayList();
         Field[] var4 = this.iH.getFields();
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            Field var7 = var4[var6];
            FeatherSourceFile712 var8 = this.lh(var7, var1);
            if (var8 != null) {
               var3.add(var8);
            }
         }

         if (var1 == null) {
            iG.put(this.iH, var3);
         }

         return var3;
      }
   }

   @Nullable
   private @Nullable @Nullable FeatherSourceFile712 lh(Field var1, @Nullable @Nullable FeatherSourceFile192 var2) {
      FeatherSourceFile571 var3 = (FeatherSourceFile571)var1.getDeclaredAnnotation(FeatherSourceFile571.class);
      FeatherSourceFile656 var4 = (FeatherSourceFile656)var1.getDeclaredAnnotation(FeatherSourceFile656.class);
      if (var3 == null && var4 == null) {
         return null;
      } else if (var3 != null && var4 != null) {
         throw new IllegalStateException("Field " + var1.getName() + " cannot have both @Value and @Nested annotations");
      } else {
         FeatherSourceFile554 var5 = (FeatherSourceFile554)var1.getDeclaredAnnotation(FeatherSourceFile554.class);
         if (var5 != null && !ClassUtils.isAssignable(var1.getType(), Collection.class, true)) {
            throw new IllegalStateException("@Checkbox applied on a non-Collection field");
         } else {
            FeatherSourceFile227 var6 = (FeatherSourceFile227)var1.getDeclaredAnnotation(FeatherSourceFile227.class);
            if (var6 != null && !ClassUtils.isAssignable(var1.getType(), String.class, true)) {
               throw new IllegalStateException("@TextLength applied on a non-String field");
            } else {
               FeatherSourceFile536 var7 = (FeatherSourceFile536)var1.getDeclaredAnnotation(FeatherSourceFile536.class);
               if (var7 != null && !ClassUtils.isAssignable(var1.getType(), Double.TYPE, true)) {
                  throw new IllegalStateException("@DoubleRange applied on non-double field");
               } else {
                  FeatherSourceFile622 var8 = (FeatherSourceFile622)var1.getDeclaredAnnotation(FeatherSourceFile622.class);
                  if (var8 != null && !ClassUtils.isAssignable(var1.getType(), Integer.TYPE, true)) {
                     throw new IllegalStateException("@IntegerRange applied on non-integer field");
                  } else {
                     FeatherSourceFile192 var9 = (FeatherSourceFile192)var1.getDeclaredAnnotation(FeatherSourceFile192.class);
                     FeatherSourceFile702 var10 = null;
                     if (var2 != null && var9 != null && var4 == null) {
                        FeatherSourceFile702[] var11 = var2.iq();
                        int var12 = var11.length;

                        for(int var13 = 0; var13 < var12; ++var13) {
                           FeatherSourceFile702 var14 = var11[var13];
                           if (var14.bn().equals(var3.lb())) {
                              var10 = var14;
                              break;
                           }
                        }
                     }

                     FeatherSourceFile271 var15 = (FeatherSourceFile271)var1.getDeclaredAnnotation(FeatherSourceFile271.class);
                     FeatherSourceFile196 var16;
                     if (var15 != null) {
                        Method var17 = this.lh(var15);
                        if (var17 == null) {
                           throw new FeatherSourceFile584("No matching @AllowedValues found for value = \"" + var15.lb() + "\" in class " + this.iH.getName());
                        }

                        var16 = new FeatherSourceFile196(var15, ClassUtils.primitiveToWrapper(var1.getType()), var17);
                     } else {
                        var16 = null;
                     }

                     FeatherSourceFile765 var18 = (FeatherSourceFile765)var1.getDeclaredAnnotation(FeatherSourceFile765.class);
                     if (var18 != null) {
                        if (ClassUtils.isAssignable(var1.getType(), String.class, true)) {
                           if (var16 == null) {
                              throw new IllegalStateException("@Dropdown applied on String field without @AllowedValues");
                           }
                        } else if (!ClassUtils.isAssignable(var1.getType(), Enum.class, true)) {
                           throw new IllegalStateException("@Dropdown applied on non-enum or non-String field");
                        }
                     }

                     return new FeatherSourceFile712(var1, var3, var5, var18, var6, var7, var8, var10, var9, var16, var4);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private @Nullable @NotNull Method lh(@NotNull @NotNull FeatherSourceFile271 var1) {
      String var2 = var1.lb();
      Method[] var3 = this.iH.getMethods();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Method var6 = var3[var5];
         FeatherSourceFile271 var7 = (FeatherSourceFile271)var6.getDeclaredAnnotation(FeatherSourceFile271.class);
         if (var7 != null && Modifier.isStatic(var6.getModifiers()) && var7.lb().equals(var2)) {
            return var6;
         }
      }

      return null;
   }
}
