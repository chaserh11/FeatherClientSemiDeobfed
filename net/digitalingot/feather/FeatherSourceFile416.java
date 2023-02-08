package net.digitalingot.feather;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class FeatherSourceFile416 {
   private static final List rk = new ArrayList();

   private FeatherSourceFile416() {
   }

   public static void zl() {
      rk.forEach(FeatherSourceFile642::an);
   }

   public static FeatherSourceFile519 lh(Class var0, Function var1) {
      FeatherSourceFile642 var2 = new FeatherSourceFile642(var0, var1);
      rk.add(var2);
      return var2;
   }

   private static Object nc(Class var0, Function var1) {
      Method var2 = null;
      Method[] var3 = var0.getMethods();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Method var6 = var3[var5];
         if ((var6.getModifiers() & 2050) == 0) {
            if (var2 != null) {
               throw new IllegalStateException("Multiple virtual methods in " + var0 + "; cannot build empty invoker!");
            }

            var2 = var6;
         }
      }

      if (var2 == null) {
         throw new IllegalStateException("No virtual methods in " + var0 + "; cannot build empty invoker!");
      } else {
         Object var10 = null;

         try {
            MethodHandle var11 = MethodHandles.lookup().unreflect(var2);
            MethodType var12 = var11.type().dropParameterTypes(0, 1);
            if (var12.returnType() != Void.TYPE) {
               MethodType var13 = MethodType.genericMethodType(var12.parameterCount()).changeReturnType(var12.returnType()).insertParameterTypes(0, new Class[]{var11.type().parameterType(0)});
               MethodHandle var7 = MethodHandles.explicitCastArguments(var11, var13);
               Object[] var8 = new Object[var11.type().parameterCount()];
               var8[0] = var1.apply((Object[])Array.newInstance(var0, 0));
               var10 = var7.invokeWithArguments(var8);
            }
         } catch (Throwable var9) {
            throw new RuntimeException(var9);
         }

         return Proxy.newProxyInstance(FeatherSourceFile416.class.getClassLoader(), new Class[]{var0}, (var1x, var2x, var3x) -> {
            return var10;
         });
      }
   }
}
