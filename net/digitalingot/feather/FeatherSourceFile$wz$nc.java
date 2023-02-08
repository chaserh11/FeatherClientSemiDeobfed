package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$wz$nc extends StructFactory {
   public final FeatherSourceFile$wz$oe1 ep(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$wz$oe1(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$wz$lh1 ep(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$wz$lh1(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$wz1.NQ;
   }

   public final FeatherSourceFile$wz$oe1 lh(FeatherSourceFile$wz$lh1 var1) {
      return var1.lK();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$wz$lh1)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.ep(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.ep(var1, var2, var3, var4, var5, var6);
   }
}
