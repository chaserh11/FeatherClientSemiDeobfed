package net.digitalingot.feather;

import com.google.common.collect.Sets;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class FeatherSourceFile252 {
   public static final Function TT = (var0) -> {
      boolean var1 = Files.isRegularFile(var0, new LinkOption[0]) && var0.getFileName().toString().endsWith(".zip");
      boolean var2 = Files.isDirectory(var0, new LinkOption[0]) && Files.isRegularFile(var0.resolve("pack.mcmeta"), new LinkOption[0]);
      return var1 || var2;
   };
   private static final FeatherSourceFile254 TU = new FeatherSourceFile250();

   public static Set zT() {
      return xj(TT);
   }

   public static Set xj(Function var0) {
      HashSet var1 = Sets.newHashSet();

      try {
         FeatherSourceFile226.lh(FeatherSourceFile224.zP(), var0).forEach((var1x) -> {
            TU.lh(var1x, var1);
         });
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      return var1;
   }
}
