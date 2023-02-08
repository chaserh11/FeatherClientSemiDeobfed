package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$lh$nc extends StructFactory {
   public final FeatherSourceFile$lh$xj2 xy(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$lh$xj2(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$lh$lh2 xy(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$lh$lh2(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$lh44.NQ;
   }

   public final FeatherSourceFile$lh$xj2 lh(FeatherSourceFile$lh$lh2 var1) {
      return var1.vB();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$lh$lh2)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.xy(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.xy(var1, var2, var3, var4, var5, var6);
   }
}
