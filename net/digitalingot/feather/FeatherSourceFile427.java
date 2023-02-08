package net.digitalingot.feather;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile427 {
   private final FeatherSourceFile426 ab;
   private final FeatherSourceFile249 sX;
   private final FeatherSourceFile665 hb;
   @NotNull
   private final @NotNull List Ro = new ArrayList();

   @Inject
   FeatherSourceFile427(FeatherSourceFile426 var1, FeatherSourceFile249 var2, FeatherSourceFile665 var3) {
      this.ab = var1;
      this.sX = var2;
      this.hb = var3;
   }

   public void fe() {
      this.xM();
      this.xN();
   }

   private void xM() {
      FeatherSourceFile357.ws.oe((var1, var2, var3) -> {
         FeatherSourceFile$lh38 var4 = this.vv(var2);
         if (var4 != null) {
            List var5 = (List)var4.xP().stream().map(FeatherSourceFile243::fromSlug).filter(Objects::nonNull).collect(Collectors.toList());
            this.ab.qr(var5);
            Stream var10000 = var5.stream();
            FeatherSourceFile665 var10001 = this.hb;
            Objects.requireNonNull(var10001);
            List var6 = (List)var10000.map(var10001::xj).map(FeatherSourceFile495::li).map(FeatherSourceFile3::kl).map(FeatherSourceFile414::jc).map(FeatherSourceFile37::nc).collect(Collectors.toList());
            FeatherSourceFile24 var7 = (new FeatherSourceFile24(FeatherSourceFile37.nc("feather.titles.disabledMods"), String.format("%s: [%s]", FeatherSourceFile37.nc("feather.notifications.serverDisabledMods"), String.join(", ", var6)))).nc(6000L);
            this.sX.lh(var7);
         }

      });
   }

   private void xN() {
      Map var1 = (Map)FeatherSourceFile815.xz("https://game-client.feathermc.com/disabled-mods.json").lh((new TypeToken() {
      }).getType());
      Iterator var2 = var1.values().iterator();

      while(var2.hasNext()) {
         FeatherSourceFile$nc18 var3 = (FeatherSourceFile$nc18)var2.next();

         try {
            FeatherSourceFile$lh38 var4 = var3.xQ();
            this.Ro.add(var4);
         } catch (Exception var5) {
            FeatherSourceFile311.Sb.error("Error while trying to compile a server metadata", var5);
         }
      }

   }

   @Nullable
   private @Nullable @NotNull FeatherSourceFile$lh38 vv(@NotNull @NotNull String var1) {
      Iterator var2 = this.Ro.iterator();

      FeatherSourceFile$lh38 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (FeatherSourceFile$lh38)var2.next();
      } while(!var3.ys(var1));

      return var3;
   }
}
