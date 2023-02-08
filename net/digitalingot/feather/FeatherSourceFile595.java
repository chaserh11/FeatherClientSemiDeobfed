package net.digitalingot.feather;

import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ClassUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile595 {
   public static final Pattern jE = Pattern.compile("(:?true|false/)?\\d+/\\d+/\\d+/\\d+");

   @NotNull
   public static @NotNull @NotNull List mr(@NotNull @NotNull Object var0) {
      FeatherSourceFile726 var1 = new FeatherSourceFile726(var0.getClass());
      List var2 = var1.di();
      HashMap var3 = new HashMap();
      lh((Object)var0, (Map)var3, (List)var2);
      lh((Object)var0, (Map)var3);
      return (List)var3.entrySet().stream().sorted(Entry.comparingByValue((var0x, var1x) -> {
         List var2 = var0x.size() < var1x.size() ? var0x : var1x;
         List var3 = var0x.size() < var1x.size() ? var1x : var0x;

         for(int var4 = 0; var4 < var2.size(); ++var4) {
            if ((Integer)var2.get(var4) != (Integer)var3.get(var4)) {
               return (var2 == var0x ? 1 : -1) * ((Integer)var2.get(var4) - (Integer)var3.get(var4));
            }
         }

         return Comparator.comparingInt(List::size).compare(var0x, var1x);
      })).map(Entry::getKey).collect(Collectors.toList());
   }

   private static @NotNull @NotNull @NotNull void lh(@NotNull @NotNull Object var0, @NotNull @NotNull Map var1, @NotNull @NotNull List var2) {
      lh(var0, (FeatherSourceFile600)null, var1, var2);
   }

   private static @NotNull @Nullable @NotNull @NotNull void lh(@NotNull @NotNull Object var0, @Nullable @Nullable FeatherSourceFile600 var1, @NotNull @NotNull Map var2, @NotNull @NotNull List var3) {
      Iterator var4 = var3.iterator();

      while(true) {
         while(var4.hasNext()) {
            FeatherSourceFile712 var5 = (FeatherSourceFile712)var4.next();
            if (var5.mo() != null) {
               int var11 = var5.mo().jm().kz();
               HashMap var12 = new HashMap();
               Object var13 = var5.as(var0);
               lh(var13, (FeatherSourceFile600)var5.ad().getAnnotation(FeatherSourceFile600.class), var12, (new FeatherSourceFile726(var13.getClass())).lh(var5.xq()));
               Iterator var15 = var12.values().iterator();

               while(var15.hasNext()) {
                  List var16 = (List)var15.next();
                  var16.add(0, var11);
               }

               var2.putAll(var12);
            } else {
               FeatherSourceFile571 var6 = (FeatherSourceFile571)Objects.requireNonNull(var5.ce());
               FeatherSourceFile655 var7 = var6.jm();
               int var8 = var7.kz();
               if (var8 > -10) {
                  if (var6.lb().equals("hudSelection")) {
                     FeatherSourceFile368 var9 = (FeatherSourceFile368)var0.getClass().getDeclaredAnnotation(FeatherSourceFile368.class);
                     if (var9 == null || var9.qj().bv().isEmpty()) {
                        continue;
                     }
                  }

                  if (var5.do() == null || !var5.do().ju()) {
                     FeatherSourceFile247 var14 = lh(var1, var5, var5.do());
                     if (var14 != null) {
                        ArrayList var10 = new ArrayList(1);
                        var10.add(var8);
                        var2.put(var14, var10);
                     }
                  }
               }
            }
         }

         return;
      }
   }

   @Nullable
   private static @Nullable @Nullable @NotNull @Nullable FeatherSourceFile247 lh(@Nullable @Nullable FeatherSourceFile600 var0, @NotNull @NotNull FeatherSourceFile712 var1, @Nullable @Nullable FeatherSourceFile702 var2) {
      FeatherSourceFile571 var3 = (FeatherSourceFile571)Objects.requireNonNull(var1.ce());
      String var4 = FeatherSourceFile37.nc(var3.jc());
      String var5 = var3.lb();
      if (var0 != null && var5.equals("hudEnabled")) {
         if (var0.st().isEmpty()) {
            return null;
         }

         var4 = var0.st();
      }

      FeatherSourceFile7 var6 = lh(var3);
      Class var7 = var1.cn();
      FeatherSourceFile$lh29 var8;
      if (ClassUtils.isAssignable(var7, Enum.class, true)) {
         var8 = var1.mg() != null ? FeatherSourceFile$lh29.DROPDOWN : FeatherSourceFile$lh29.RADIO;
         return new FeatherSourceFile247(var8, var4, var5, var6, new FeatherSourceFile756(ou(var7)), (Boolean)null, (Boolean)null);
      } else {
         if (ClassUtils.isAssignable(var7, String.class, true)) {
            if (var1.yw() != null) {
               var8 = var1.mg() != null ? FeatherSourceFile$lh29.DROPDOWN : FeatherSourceFile$lh29.RADIO;
               return new FeatherSourceFile247(var8, var4, var5, var6, new FeatherSourceFile756(nc(var1.yw())), (Boolean)null, (Boolean)null);
            }

            if (var1.zq() != null) {
               return new FeatherSourceFile247(FeatherSourceFile$lh29.TEXT, var4, var5, var6, (FeatherSourceFile105)null, (Boolean)null, (Boolean)null);
            }
         } else {
            if (ClassUtils.isAssignable(var7, Boolean.TYPE, true)) {
               return new FeatherSourceFile247(FeatherSourceFile$lh29.BOOLEAN, var4, var5, var6, (FeatherSourceFile105)null, (Boolean)null, (Boolean)null);
            }

            if (ClassUtils.isAssignable(var7, Integer.TYPE, true)) {
               if (var1.wd() == null) {
                  throw new IllegalArgumentException(var1.ad() + " is not annotated with @IntRange");
               }

               return new FeatherSourceFile247(FeatherSourceFile$lh29.SLIDER, var4, var5, var6, lh(var1.wd(), var2), (Boolean)null, (Boolean)null);
            }

            if (ClassUtils.isAssignable(var7, Double.TYPE, true)) {
               if (var1.or() == null) {
                  throw new IllegalArgumentException(var1.ad() + " is not annotated with @DoubleRange");
               }

               return new FeatherSourceFile247(FeatherSourceFile$lh29.SLIDER, var4, var5, var6, lh(var1.or()), (Boolean)null, (Boolean)null);
            }

            if (ClassUtils.isAssignable(var7, Collection.class, true)) {
               if (var1.qx() == null) {
                  throw new IllegalArgumentException(var1.ad() + " is not annotated with @Checkbox");
               }

               int var10 = var1.qx().xf();
               Class var9 = FeatherSourceFile246.lh(var7, 0, 0);
               if (ClassUtils.isAssignable(var9, Enum.class, true)) {
                  return new FeatherSourceFile247(FeatherSourceFile$lh29.CHECKBOX, var4, var5, var6, new FeatherSourceFile681(var10, ou(var9)), (Boolean)null, (Boolean)null);
               }

               if (var1.yw() != null) {
                  return new FeatherSourceFile247(FeatherSourceFile$lh29.CHECKBOX, var4, var5, var6, new FeatherSourceFile681(var10, nc(var1.yw())), (Boolean)null, (Boolean)null);
               }
            } else {
               if (ClassUtils.isAssignable(var7, FeatherSourceFile344.class, true)) {
                  return new FeatherSourceFile247(FeatherSourceFile$lh29.KEY_PICKER, var4, var5, var6, (FeatherSourceFile105)null, (Boolean)null, (Boolean)null);
               }

               if (ClassUtils.isAssignable(var7, Color.class, true)) {
                  return new FeatherSourceFile247(FeatherSourceFile$lh29.COLOR_PICKER, var4, var5, var6, (FeatherSourceFile105)null, false, jE.matcher(var1.ce().kd()).find());
               }

               if (ClassUtils.isAssignable(var7, FeatherSourceFile225.class, true)) {
                  return new FeatherSourceFile247(FeatherSourceFile$lh29.COLOR_PICKER, var4, var5, var6, (FeatherSourceFile105)null, true, jE.matcher(var1.ce().kd()).find());
               }
            }
         }

         throw new IllegalArgumentException(var1.ad() + " not supported in a config");
      }
   }

   @NotNull
   private static @NotNull @NotNull List nc(@NotNull @NotNull FeatherSourceFile196 var0) {
      List var1;
      try {
         var1 = (List)var0.tg().invoke((Object)null);
      } catch (InvocationTargetException | IllegalAccessException var3) {
         throw new IllegalStateException("Exception while trying to invoke @AllowedValues method", var3);
      }

      return (List)var1.stream().map((var0x) -> {
         return new FeatherSourceFile677(var0x, var0x);
      }).collect(Collectors.toList());
   }

   @NotNull
   private static @NotNull @NotNull List ou(@NotNull @NotNull Class var0) {
      Enum[] var1 = (Enum[])var0.getEnumConstants();
      ArrayList var2 = new ArrayList(var1.length);
      Enum[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Enum var6 = var3[var5];

         Field var7;
         try {
            var7 = var0.getDeclaredField(var6.name());
         } catch (NoSuchFieldException var12) {
            throw new IllegalStateException(var12);
         }

         FeatherSourceFile558 var8 = (FeatherSourceFile558)var7.getDeclaredAnnotation(FeatherSourceFile558.class);
         String var9 = var8.lb();
         String var10 = FeatherSourceFile37.nc(var8.jc());
         FeatherSourceFile677 var11 = new FeatherSourceFile677(var9, var10);
         var2.add(var11);
      }

      return var2;
   }

   @NotNull
   private static @NotNull @NotNull @Nullable FeatherSourceFile9 lh(@NotNull @NotNull FeatherSourceFile622 var0, @Nullable @Nullable FeatherSourceFile702 var1) {
      int var2 = var1 != null && var1.fk() != -9999 ? var1.fk() : var0.fk();
      int var3 = var1 != null && var1.tr() != 9999 ? var1.tr() : var0.tr();
      return new FeatherSourceFile9(var2, var3, var0.zz());
   }

   @NotNull
   private static @NotNull @NotNull FeatherSourceFile789 lh(@NotNull @NotNull FeatherSourceFile536 var0) {
      return new FeatherSourceFile789(var0.mc(), var0.ng(), var0.nm());
   }

   private static @NotNull @NotNull void lh(@NotNull @NotNull Object var0, @NotNull @NotNull Map var1) {
      Field[] var2 = var0.getClass().getFields();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Field var5 = var2[var4];
         FeatherSourceFile656 var6 = (FeatherSourceFile656)var5.getAnnotation(FeatherSourceFile656.class);
         if (var6 != null) {
            HashMap var7 = new HashMap();

            Object var8;
            try {
               var8 = var5.get(var0);
            } catch (IllegalAccessException var12) {
               throw new IllegalStateException(var12);
            }

            lh((Object)var8, (Map)var7);
            Iterator var9 = var7.values().iterator();

            while(var9.hasNext()) {
               List var10 = (List)var9.next();
               var10.add(0, var6.jm().kz());
            }

            var1.putAll(var7);
         }

         if (var5.getType() == FeatherSourceFile68.class) {
            FeatherSourceFile68 var15;
            try {
               var15 = (FeatherSourceFile68)var5.get(var0);
            } catch (IllegalAccessException var13) {
               throw new IllegalStateException(var13);
            }

            String var16 = FeatherSourceFile37.nc(var15.getName());
            FeatherSourceFile247 var17 = new FeatherSourceFile247(FeatherSourceFile$lh29.TITLE, var16, (String)null, (FeatherSourceFile7)null, (FeatherSourceFile105)null, (Boolean)null, (Boolean)null);
            FeatherSourceFile655 var14 = (FeatherSourceFile655)var5.getDeclaredAnnotation(FeatherSourceFile655.class);
            if (var14 == null) {
               throw new FeatherSourceFile584(var5, FeatherSourceFile655.class);
            }

            ArrayList var11 = new ArrayList(1);
            var11.add(var14.kz());
            var1.put(var17, var11);
         }
      }

   }

   @Nullable
   private static @Nullable @NotNull FeatherSourceFile7 lh(@NotNull @NotNull FeatherSourceFile571 var0) {
      FeatherSourceFile163 var1 = var0.dy();
      if (var1.lb().isEmpty()) {
         return null;
      } else {
         List var2;
         if (var1.em().length == 0) {
            var2 = null;
         } else {
            var2 = Arrays.asList(var1.em());
         }

         return new FeatherSourceFile7(var1.lb(), var2);
      }
   }
}
