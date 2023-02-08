package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.digitalingot.vendor.javax.inject.Inject;
import org.apache.commons.lang3.StringEscapeUtils;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile29 implements FeatherSourceFile688 {
   private final FeatherSourceFile143 lk;
   private final List bG = Collections.synchronizedList(new ArrayList());
   private boolean bH;

   @Inject
   FeatherSourceFile29(FeatherSourceFile143 var1) {
      this.lk = var1;
      FeatherSourceFile151.ws.oe(this::za);
   }

   public @NotNull void qn(@NotNull @NotNull String var1) {
      String var2 = var1.contains("setFeatherUser") ? "setFeatherUser" : var1;
      if (FeatherSourceFile747.as()) {
         FeatherSourceFile311.Sb.info("FE Channel <- " + var2);
      } else {
         FeatherSourceFile311.Sb.debug("FE Channel <- " + var2);
      }

      if (!this.bH) {
         this.bG.add(var1);
      } else {
         this.er(var1);
      }

   }

   private @NotNull void er(@NotNull @NotNull String var1) {
      String var2 = StringEscapeUtils.escapeEcmaScript(var1);
      this.lk.oy("window.toFe(\"" + var2 + "\");");
   }

   private void za() {
      this.bH = true;
      Iterator var1 = this.bG.iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         this.er(var2);
      }

   }
}
