package net.digitalingot.feather;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile617 {
   @NotNull
   private final @NotNull FeatherSourceFile712 iK;

   public FeatherSourceFile617(@NotNull @NotNull FeatherSourceFile712 var1) {
      this.iK = var1;
   }

   public @NotNull boolean mq(@NotNull @NotNull Object var1) {
      if (this.iK.yw() != null) {
         Collection var7 = this.lh(this.iK.yw());
         Iterator var3 = var7.iterator();

         Object var4;
         do {
            if (!var3.hasNext()) {
               return false;
            }

            var4 = var3.next();
         } while(!var4.equals(var1));

         return true;
      } else if (this.iK.or() != null) {
         double var6 = (Double)var1;
         return !(var6 > this.iK.or().ng()) && !(var6 < this.iK.or().mc());
      } else if (this.iK.wd() != null) {
         int var5 = (Integer)var1;
         return var5 <= this.iK.wd().tr() && var5 >= this.iK.wd().fk();
      } else if (this.iK.zq() == null) {
         return true;
      } else {
         String var2 = (String)var1;
         return var2.length() <= this.iK.zq().tr() && var2.length() >= this.iK.zq().fk();
      }
   }

   @NotNull
   private @NotNull @NotNull Collection lh(@NotNull @NotNull FeatherSourceFile196 var1) {
      Method var2 = var1.tg();
      if (!Collection.class.isAssignableFrom(var2.getReturnType())) {
         throw new IllegalStateException(var2.getName() + " does not return a Collection or a subtype of one");
      } else {
         Object var3;
         try {
            var3 = var2.invoke((Object)null);
         } catch (InvocationTargetException | IllegalAccessException var6) {
            throw new IllegalStateException(var6);
         }

         Class var4 = FeatherSourceFile246.lh((ParameterizedType)((ParameterizedType)var2.getGenericReturnType()), 0);
         if (var4 == String.class) {
            Collection var5 = (Collection)var3;
            return this.lh(var5, (Class)var1.nr());
         } else {
            return (Collection)var3;
         }
      }
   }

   @NotNull
   private @NotNull Collection lh(Collection var1, Class var2) {
      ArrayList var3 = new ArrayList();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         FeatherSourceFile727 var6 = new FeatherSourceFile727(var2, var5);
         Object var7 = var6.dk();
         var3.add(var7);
      }

      return var3;
   }
}
