package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$qy$nc extends StructFactory {
   public final FeatherSourceFile$qy$xj km(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$qy$xj(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$qy$lh km(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$qy$lh(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$qy5.NQ;
   }

   public final FeatherSourceFile$qy$xj lh(FeatherSourceFile$qy$lh var1) {
      return var1.kL();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$qy$lh)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.km(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.km(var1, var2, var3, var4, var5, var6);
   }
}
