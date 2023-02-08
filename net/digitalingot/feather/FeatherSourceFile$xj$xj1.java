package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$xj$xj1 extends StructFactory {
   public final FeatherSourceFile$xj$oe pq(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$xj$oe(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$xj$lh pq(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$xj$lh(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$xj12.NQ;
   }

   public final FeatherSourceFile$xj$oe lh(FeatherSourceFile$xj$lh var1) {
      return var1.kC();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$xj$lh)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.pq(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.pq(var1, var2, var3, var4, var5, var6);
   }
}
