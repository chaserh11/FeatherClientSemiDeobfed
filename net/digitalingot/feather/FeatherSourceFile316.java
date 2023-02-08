package net.digitalingot.feather;

import java.util.List;
import java.util.stream.Collectors;
import net.digitalingot.featherserverapi.proto.models.Mod;
import net.minecraftforge.fml.common.Loader;

public class FeatherSourceFile316 {
   public static List sm() {
      return (List)Loader.instance().getIndexedModList().values().stream().map((var0) -> {
         return new Mod(var0.getModId(), var0.getVersion());
      }).collect(Collectors.toList());
   }
}
