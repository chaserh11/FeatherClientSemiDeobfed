package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$si$nc1 extends StructFactory {
   public final FeatherSourceFile$si$xj1 hb(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$si$xj1(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$si$lh hb(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$si$lh(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$si1.NQ;
   }

   public final FeatherSourceFile$si$xj1 lh(FeatherSourceFile$si$lh var1) {
      return var1.lG();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$si$lh)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.hb(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.hb(var1, var2, var3, var4, var5, var6);
   }
}
