package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import java.awt.Color;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile727 {
   private static final Map iM = ImmutableMap.builder().put(Boolean.class, "false").put(Double.class, "0.0").put(Integer.class, "0").put(String.class, "").put(Color.class, "255/255/255").put(FeatherSourceFile225.class, "false/255/255/255").build();
   @NotNull
   private final @NotNull FeatherSourceFile712 iK;
   @NotNull
   private final @NotNull FeatherSourceFile518 iN;
   @NotNull
   private @NotNull String iO;

   @Nullable
   private static @Nullable @NotNull String oe(@NotNull @NotNull Class var0) {
      Iterator var1 = iM.entrySet().iterator();

      Class var3;
      String var4;
      do {
         if (!var1.hasNext()) {
            return null;
         }

         Entry var2 = (Entry)var1.next();
         var3 = (Class)var2.getKey();
         var4 = (String)var2.getValue();
      } while(!var3.isAssignableFrom(var0));

      return var4;
   }

   public FeatherSourceFile727(@NotNull @NotNull Class var1, @NotNull @NotNull String var2) {
      this(new FeatherSourceFile712(var1), var2);
   }

   public FeatherSourceFile727(@NotNull @NotNull FeatherSourceFile712 var1, @Nullable @Nullable String var2) {
      this.iK = var1;
      this.iN = FeatherSourceFile668.qy(var1.cn());
      if (this.iN == null) {
         throw new IllegalArgumentException("Type " + var1.cn().getName() + " (" + var1 + ") not supported");
      } else {
         if (var2 == null) {
            if (var1.ce() == null) {
               throw new FeatherSourceFile584("Unannotated type with a null input (" + var1 + ")");
            }

            this.iO = this.qy(var1);
         } else {
            this.iO = var2;
         }

      }
   }

   @NotNull
   private @NotNull @NotNull String qy(@NotNull @NotNull FeatherSourceFile712 var1) {
      String var2 = var1.ce().kd();
      if (var1.do() != null && !var1.do().kd().isEmpty()) {
         var2 = var1.do().kd();
      }

      return !var2.isEmpty() ? var2 : (String)Objects.requireNonNull(oe(var1.cn()), "No default type for type " + var1.cn().getName() + " (" + var1 + ")");
   }

   @NotNull
   public @NotNull Object dk() {
      return this.jh(false);
   }

   @NotNull
   private @NotNull Object jh(boolean var1) {
      Class var2 = this.iK.cn();

      Object var3;
      try {
         var3 = this.iN.nc(this.iO, var2);
      } catch (FeatherSourceFile277 var6) {
         if (!var1) {
            return this.bc();
         }

         throw new FeatherSourceFile277("Default value \"" + this.iO + "\" of type  \"" + var2.getName() + "\" is invalid: " + this.iK.ad(), var6);
      }

      FeatherSourceFile617 var4 = new FeatherSourceFile617(this.iK);
      String var5 = this.iK.ce() == null ? "" : this.iK.ce().lb();
      if (!var4.mq(var3) && !var5.equals("backgroundWidth") && !var5.equals("backgroundHeight")) {
         if (var1) {
            throw new FeatherSourceFile277("Default value \"" + this.iO + "\" of type \"" + var2.getName() + "\" is invalid: " + this.iK.ad());
         } else {
            return this.bc();
         }
      } else {
         return var3;
      }
   }

   @NotNull
   private @NotNull Object bc() {
      if (this.iK.ce() == null) {
         throw new FeatherSourceFile277("Unannotated type (" + this.iK + ") couldn't be parsed.");
      } else {
         this.iO = this.qy(this.iK);
         return this.jh(true);
      }
   }
}
