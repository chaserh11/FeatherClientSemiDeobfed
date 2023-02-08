package net.digitalingot.feather;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public abstract class FeatherSourceFile360 extends FeatherSourceFile495 implements FeatherSourceFile685 {
   @NotNull
   protected final @NotNull List gK;
   @NotNull
   private final @NotNull FeatherSourceFile$lh87 gL;

   protected FeatherSourceFile360() {
      FeatherSourceFile629 var1 = (FeatherSourceFile629)this.getClass().getAnnotation(FeatherSourceFile629.class);
      if (var1 == null) {
         throw new FeatherSourceFile584(this.getClass(), FeatherSourceFile629.class);
      } else {
         ArrayList var2 = new ArrayList(var1.jt().length);
         FeatherSourceFile503[] var3 = var1.jt();
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile503 var6 = var3[var5];
            Class var7 = var6.al();

            try {
               FeatherSourceFile413 var8 = (FeatherSourceFile413)var7.getDeclaredConstructor(this.getClass()).newInstance(this);
               var8.nc(this);
               var2.add(var8);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException var9) {
               throw new IllegalStateException(var9);
            }
         }

         if (var2.isEmpty()) {
            throw new IllegalStateException("HUD Module must have at least one element");
         } else {
            this.gK = Collections.unmodifiableList(var2);
            this.gL = var1.ms();
         }
      }
   }

   protected FeatherSourceFile360(@NotNull @NotNull FeatherSourceFile$lh87 var1, @NotNull FeatherSourceFile413... var2) {
      this(var1, Arrays.asList(var2));
   }

   protected FeatherSourceFile360(@NotNull @NotNull FeatherSourceFile$lh87 var1, @NotNull @NotNull List var2) {
      if (var2.size() == 0) {
         throw new IllegalStateException("HUD Module must have at least one element");
      } else {
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            FeatherSourceFile413 var4 = (FeatherSourceFile413)var3.next();
            var4.nc(this);
         }

         this.gK = Collections.unmodifiableList(var2);
         this.gL = var1;
      }
   }

   public void pu() {
      super.pu();
      Iterator var1 = this.gK.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile413 var2 = (FeatherSourceFile413)var1.next();
         var2.pu();
      }

   }

   @NotNull
   public final @NotNull FeatherSourceFile413 vb() {
      return (FeatherSourceFile413)this.gK.get(0);
   }

   @NotNull
   public final @NotNull List hh() {
      return this.gK;
   }

   public void sy() {
      Iterator var1 = this.gK.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile413 var2 = (FeatherSourceFile413)var1.next();
         if (var2.hk().ca()) {
            var2.sy();
         }
      }

   }

   public int no() {
      int var1 = 0;

      FeatherSourceFile413 var3;
      for(Iterator var2 = this.gK.iterator(); var2.hasNext(); var1 += var3.no()) {
         var3 = (FeatherSourceFile413)var2.next();
      }

      return var1;
   }

   public int sv() {
      int var1 = 0;

      FeatherSourceFile413 var3;
      for(Iterator var2 = this.gK.iterator(); var2.hasNext(); var1 = Math.max(var1, var3.sv())) {
         var3 = (FeatherSourceFile413)var2.next();
      }

      return var1;
   }

   public FeatherSourceFile$lh87 ni() {
      return this.gL;
   }
}
