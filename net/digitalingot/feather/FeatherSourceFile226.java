package net.digitalingot.feather;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FeatherSourceFile226 {
   public static List lh(Path var0, Function var1) {
      ArrayList var2 = Lists.newArrayList();
      Stream var3 = Files.walk(var0, 1, new FileVisitOption[0]);

      try {
         var3.forEach((var3x) -> {
            if (!var3x.equals(var0)) {
               if (Files.isDirectory(var3x, new LinkOption[0]) && (var1 == null || var1 != null && !(Boolean)var1.apply(var3x))) {
                  FeatherSourceFile218.TE = var3x;

                  try {
                     var2.add(new FeatherSourceFile$lh130(var3x, (Collection)null, lh(var3x, var1)));
                  } catch (IOException var5) {
                     var5.printStackTrace();
                  }
               }

            }
         });
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }

      return var2;
   }

   public static boolean pq(Path var0) {
      return var0.equals(FeatherSourceFile224.zP());
   }

   public static boolean lh(Path var0, Path var1) {
      var0 = var0.normalize();
      var1 = var1.normalize();
      return var1.getNameCount() == var0.getNameCount() + 1 && var1.startsWith(var0);
   }
}
