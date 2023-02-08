package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$nc$nc2 extends StructFactory {
   public final FeatherSourceFile$nc$xj oy(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$nc$xj(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$nc$lh5 oy(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$nc$lh5(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$nc30.NQ;
   }

   public final FeatherSourceFile$nc$xj lh(FeatherSourceFile$nc$lh5 var1) {
      return var1.oE();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$nc$lh5)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.oy(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.oy(var1, var2, var3, var4, var5, var6);
   }
}
