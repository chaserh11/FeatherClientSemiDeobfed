package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.DataList;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.Data.Reader;

public final class FeatherSourceFile$as$xj1 extends StructReader {
   FeatherSourceFile$as$xj1(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public boolean kW() {
      return !this._pointerFieldIsNull(0);
   }

   public Reader la() {
      return (Reader)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
   }

   public final boolean kY() {
      return !this._pointerFieldIsNull(1);
   }

   public final org.capnproto.DataList.Reader lp() {
      return (org.capnproto.DataList.Reader)this._getPointerField(DataList.factory, 1, (SegmentReader)null, 0);
   }

   public final FeatherSourceFile$nc10 gZ() {
      switch (this._getShortField(0)) {
         case 0:
            return FeatherSourceFile$nc10.EVERYONE;
         case 1:
            return FeatherSourceFile$nc10.PROXIMITY;
         default:
            return FeatherSourceFile$nc10._NOT_IN_SCHEMA;
      }
   }
}
