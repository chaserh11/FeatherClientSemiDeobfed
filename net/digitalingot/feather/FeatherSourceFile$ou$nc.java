package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$ou$nc extends StructFactory {
   public final FeatherSourceFile$ou$xj mq(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$ou$xj(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$ou$lh mq(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$ou$lh(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$ou3.NQ;
   }

   public final FeatherSourceFile$ou$xj lh(FeatherSourceFile$ou$lh var1) {
      return var1.kM();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$ou$lh)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.mq(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.mq(var1, var2, var3, var4, var5, var6);
   }
}
