package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$lh$nc1 extends StructFactory {
   public final FeatherSourceFile$lh$oe lh(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$lh$oe(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$lh$lh4 lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$lh$lh4(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$lh115.NQ;
   }

   public final FeatherSourceFile$lh$oe lh(FeatherSourceFile$lh$lh4 var1) {
      return var1.jC();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$lh$lh4)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.lh(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.lh(var1, var2, var3, var4, var5, var6);
   }
}
