package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$oe$nc1 extends StructFactory {
   public final FeatherSourceFile$oe$xj as(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$oe$xj(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$oe$lh1 as(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$oe$lh1(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$oe9.NQ;
   }

   public final FeatherSourceFile$oe$xj lh(FeatherSourceFile$oe$lh1 var1) {
      return var1.kH();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$oe$lh1)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.as(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.as(var1, var2, var3, var4, var5, var6);
   }
}
