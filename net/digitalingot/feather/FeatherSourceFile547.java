package net.digitalingot.feather;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class FeatherSourceFile547 {
   public static void xj(File var0) {
      oe(var0);
   }

   private static void oe(File var0) {
      BufferedImage var1;
      try {
         var1 = ImageIO.read(var0);
      } catch (IOException var6) {
         FeatherSourceFile311.Sb.error("Could not read image from file: " + var0.getAbsolutePath());
         return;
      }

      FeatherSourceFile168 var2 = new FeatherSourceFile168(var1);
      Clipboard var3 = Toolkit.getDefaultToolkit().getSystemClipboard();

      try {
         var3.setContents(var2, (ClipboardOwner)null);
      } catch (Exception var5) {
      }

   }
}
