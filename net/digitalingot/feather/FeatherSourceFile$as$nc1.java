package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$as$nc1 extends StructFactory {
   public final FeatherSourceFile$as$xj1 ux(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$as$xj1(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$as$lh1 ux(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$as$lh1(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$as1.NQ;
   }

   public final FeatherSourceFile$as$xj1 lh(FeatherSourceFile$as$lh1 var1) {
      return var1.kV();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$as$lh1)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.ux(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.ux(var1, var2, var3, var4, var5, var6);
   }
}
