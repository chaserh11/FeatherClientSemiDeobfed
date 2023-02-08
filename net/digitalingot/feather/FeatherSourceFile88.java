package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile88 {
   private static final FeatherSourceFile465 FEATHER$CUSTOM_CHAT_PROVIDER = FeatherSourceFile665.nc(FeatherSourceFile39.class);
   private final FeatherSourceFile180 GF = new FeatherSourceFile180();

   @Inject
   private FeatherSourceFile88() {
   }

   public String jv(String var1) {
      String var2 = this.GF.mq(var1, ((FeatherSourceFile$lh14)((FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag()).pr()).Gg.getCode());
      return var2 != null ? var2 : "There was an error translating this message. Please try again.";
   }
}
