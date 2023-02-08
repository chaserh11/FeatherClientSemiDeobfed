package net.digitalingot.feather;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collection;

public class FeatherSourceFile248 implements FileVisitor {
   private final Path TV;
   private final Collection TW;

   public FeatherSourceFile248(Path var1, Collection var2) {
      this.TV = var1;
      this.TW = var2;
   }

   public FileVisitResult nc(Path var1, BasicFileAttributes var2) {
      Path var3 = var1.resolve("pack.mcmeta");
      if (!var1.equals(this.TV) && Files.exists(var3, new LinkOption[0]) && Files.isRegularFile(var3, new LinkOption[0])) {
         this.TW.add(var1);
         return FileVisitResult.SKIP_SUBTREE;
      } else {
         return FileVisitResult.CONTINUE;
      }
   }

   public FileVisitResult xj(Path var1, BasicFileAttributes var2) {
      if (var1.toString().endsWith(".zip")) {
         this.TW.add(var1);
      }

      return FileVisitResult.SKIP_SUBTREE;
   }

   public FileVisitResult lh(Path var1, IOException var2) {
      return FileVisitResult.SKIP_SUBTREE;
   }

   public FileVisitResult nc(Path var1, IOException var2) {
      return FileVisitResult.CONTINUE;
   }

   // $FF: synthetic method
   public FileVisitResult postVisitDirectory(Object var1, IOException var2) {
      return this.nc((Path)var1, var2);
   }

   // $FF: synthetic method
   public FileVisitResult visitFileFailed(Object var1, IOException var2) {
      return this.lh((Path)var1, var2);
   }

   // $FF: synthetic method
   public FileVisitResult visitFile(Object var1, BasicFileAttributes var2) {
      return this.xj((Path)var1, var2);
   }

   // $FF: synthetic method
   public FileVisitResult preVisitDirectory(Object var1, BasicFileAttributes var2) {
      return this.nc((Path)var1, var2);
   }
}
