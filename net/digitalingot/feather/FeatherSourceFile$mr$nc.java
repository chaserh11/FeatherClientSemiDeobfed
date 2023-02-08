package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$mr$nc extends StructFactory {
   public final FeatherSourceFile$mr$xj1 lt(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$mr$xj1(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$mr$lh lt(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$mr$lh(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$mr1.NQ;
   }

   public final FeatherSourceFile$mr$xj1 lh(FeatherSourceFile$mr$lh var1) {
      return var1.lF();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$mr$lh)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.lt(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.lt(var1, var2, var3, var4, var5, var6);
   }
}
