package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.Text;
import org.capnproto.Text.Reader;

public final class FeatherSourceFile$lh$xj2 extends StructReader {
   FeatherSourceFile$lh$xj2(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public boolean vC() {
      return !this._pointerFieldIsNull(0);
   }

   public Reader vG() {
      return (Reader)this._getPointerField(Text.factory, 0, (ByteBuffer)null, 0, 0);
   }

   public boolean vE() {
      return !this._pointerFieldIsNull(1);
   }

   public org.capnproto.Data.Reader vH() {
      return (org.capnproto.Data.Reader)this._getPointerField(Data.factory, 1, (ByteBuffer)null, 0, 0);
   }
}
