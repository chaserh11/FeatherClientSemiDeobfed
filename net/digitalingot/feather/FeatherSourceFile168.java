package net.digitalingot.feather;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile168 implements Transferable {
   @NotNull
   private final @NotNull BufferedImage Jv;

   public FeatherSourceFile168(@NotNull @NotNull BufferedImage var1) {
      this.Jv = var1;
   }

   public DataFlavor[] getTransferDataFlavors() {
      return new DataFlavor[]{DataFlavor.imageFlavor};
   }

   public boolean isDataFlavorSupported(DataFlavor var1) {
      return DataFlavor.imageFlavor.equals(var1);
   }

   public Object getTransferData(DataFlavor var1) {
      if (DataFlavor.imageFlavor.equals(var1)) {
         return this.Jv;
      } else {
         throw new UnsupportedFlavorException(var1);
      }
   }
}
