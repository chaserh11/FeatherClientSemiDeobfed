package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;

public final class FeatherSourceFile$mq$nc extends StructFactory {
   public final FeatherSourceFile$mq$xj wz(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return new FeatherSourceFile$mq$xj(var1, var2, var3, var4, var5, var6);
   }

   public final FeatherSourceFile$mq$lh wz(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return new FeatherSourceFile$mq$lh(var1, var2, var3, var4, var5);
   }

   public final StructSize structSize() {
      return FeatherSourceFile$mq1.NQ;
   }

   public final FeatherSourceFile$mq$xj lh(FeatherSourceFile$mq$lh var1) {
      return var1.lE();
   }

   // $FF: synthetic method
   public StructReader asReader(Object var1) {
      return this.lh((FeatherSourceFile$mq$lh)var1);
   }

   // $FF: synthetic method
   public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      return this.wz(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      return this.wz(var1, var2, var3, var4, var5, var6);
   }
}
