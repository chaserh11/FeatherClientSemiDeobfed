package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.StructList.Factory;

public class FeatherSourceFile$km {
   public static final StructSize NQ = new StructSize((short)0, (short)0);
   public static final FeatherSourceFile$km.nc1 OP = new FeatherSourceFile$km.nc1();
   public static final Factory NS;

   static {
      NS = new Factory(OP);
   }

   public static final class nc1 extends StructFactory {
      public final FeatherSourceFile$km.xj1 hg(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$km.xj1(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$km.lh1 hg(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$km.lh1(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$km.NQ;
      }

      public final FeatherSourceFile$km.xj1 lh(FeatherSourceFile$km.lh1 var1) {
         return var1.qS();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$km.lh1)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.hg(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.hg(var1, var2, var3, var4, var5, var6);
      }
   }

   public static final class xj1 extends StructReader {
      xj1(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }
   }

   public static final class lh1 extends StructBuilder {
      lh1(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$km.xj1 qS() {
         return new FeatherSourceFile$km.xj1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }
   }
}
