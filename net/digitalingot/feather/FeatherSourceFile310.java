package net.digitalingot.feather;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile310 implements FeatherSourceFile688 {
   private final FeatherSourceFile$lh116 bV;
   private final List bG = Collections.synchronizedList(new ArrayList());
   private boolean bH;

   @Inject
   FeatherSourceFile310(FeatherSourceFile$lh116 var1) {
      this.bV = var1;
      var1.xj((var1x) -> {
         this.za();
      });
   }

   private void za() {
      this.bH = true;
      Iterator var1 = this.bG.iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         this.er(var2);
      }

   }

   public @NotNull void qn(@NotNull @NotNull String var1) {
      if (FeatherSourceFile747.as()) {
         FeatherSourceFile311.Sb.info("Rust Channel <- " + var1);
      } else {
         FeatherSourceFile311.Sb.debug("Rust Channel <- " + var1);
      }

      if (!this.bH) {
         this.bG.add(var1);
      } else {
         this.er(var1);
      }

   }

   public @NotNull void er(@NotNull @NotNull String var1) {
      Channel var2 = this.bV.mt();
      if (var2 != null && var2.isActive()) {
         var2.writeAndFlush(Unpooled.wrappedBuffer(var1.getBytes(StandardCharsets.UTF_8)));
      }

   }
}
