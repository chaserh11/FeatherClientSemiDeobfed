package net.digitalingot.feather;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import net.digitalingot.feather.serverapi.messaging.ClientMessageHandler;
import net.digitalingot.feather.serverapi.messaging.Message;
import net.digitalingot.feather.serverapi.messaging.MessageDecoder;
import net.digitalingot.feather.serverapi.messaging.MessageEncoder;
import net.digitalingot.feather.serverapi.messaging.domain.FeatherMod;
import net.digitalingot.feather.serverapi.messaging.domain.Platform;
import net.digitalingot.feather.serverapi.messaging.domain.PlatformMod;
import net.digitalingot.feather.serverapi.messaging.messages.client.S2CCreateFUI;
import net.digitalingot.feather.serverapi.messaging.messages.client.S2CDestroyFUI;
import net.digitalingot.feather.serverapi.messaging.messages.client.S2CFUIMessage;
import net.digitalingot.feather.serverapi.messaging.messages.client.S2CFUIResponse;
import net.digitalingot.feather.serverapi.messaging.messages.client.S2CHandshake;
import net.digitalingot.feather.serverapi.messaging.messages.client.S2CSetFUIState;
import net.digitalingot.feather.serverapi.messaging.messages.server.C2SClientHello;
import net.digitalingot.feather.serverapi.messaging.messages.server.C2SFUILoadError;
import net.digitalingot.feather.serverapi.messaging.messages.server.C2SFUIRequest;
import net.digitalingot.feather.serverapi.messaging.messages.server.C2SFUIStateChange;
import net.digitalingot.feather.serverapi.messaging.messages.server.C2SHandshake;
import net.digitalingot.feather.serverapi.messaging.messages.server.C2SFUIStateChange.StateType;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile454 implements ClientMessageHandler {
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile665 hb;
   private final Provider Rx;
   private FeatherSourceFile$lh92 Ry;

   @Inject
   FeatherSourceFile454(@NotNull @NotNull Minecraft var1, @NotNull @NotNull FeatherSourceFile665 var2, @NotNull @NotNull Provider var3) {
      this.minecraft = var1;
      this.hb = var2;
      this.Rx = var3;
   }

   public void fe() {
      FeatherSourceFile456.lh("feather:client", this::qr);
      FeatherSourceFile83.gp.oe((var1) -> {
         if (var1.contains("feather:client")) {
            this.Ry = FeatherSourceFile$lh92.EXPECTING_HANDSHAKE;
            FeatherSourceFile747.oe().lh(() -> {
               C2SHandshake var0 = new C2SHandshake();
               byte[] var1 = MessageEncoder.SERVER_BOUND.encode(var0);
               FeatherSourceFile456.lh("feather:client", var1);
            }, 1L);
         }
      });
   }

   @Nullable
   private static @Nullable Message ep(byte[] var0) {
      try {
         return MessageDecoder.CLIENT_BOUND.decode(var0);
      } catch (Exception var2) {
         return null;
      }
   }

   private void qr(byte[] var1) {
      if (this.Ry != FeatherSourceFile$lh92.REJECTED) {
         Message var2;
         if (this.Ry == FeatherSourceFile$lh92.EXPECTING_HANDSHAKE) {
            var2 = ep(var1);
            if (var2 instanceof S2CHandshake && ((S2CHandshake)var2).getProtocolVersion() == 1) {
               this.Ry = FeatherSourceFile$lh92.ACCEPTED;
               this.xT();
            } else {
               this.Ry = FeatherSourceFile$lh92.REJECTED;
            }
         } else {
            var2 = ep(var1);
            if (var2 != null) {
               this.minecraft.func_152344_a(() -> {
                  var2.handle(this);
               });
            }
         }
      }
   }

   private void xT() {
      Platform var1 = Platform.FORGE;
      List var2 = (List)this.hb.dx().stream().filter(FeatherSourceFile495::uj).map(FeatherSourceFile495::fg).map(FeatherSourceFile243::getSlug).collect(Collectors.toList());
      List var3 = FeatherSourceFile316.sm();
      C2SClientHello var4 = new C2SClientHello(var1, (Collection)var3.stream().map((var0) -> {
         return new PlatformMod(var0.getName(), var0.getVersion());
      }).collect(Collectors.toList()), (Collection)var2.stream().map(FeatherMod::new).collect(Collectors.toList()));
      byte[] var5 = MessageEncoder.SERVER_BOUND.encode(var4);
      FeatherSourceFile456.lh("feather:client", var5);
   }

   public void aq(String var1) {
      this.lh(var1, StateType.CREATED);
   }

   public void wz(String var1, String var2) {
      this.lh((Message)(new C2SFUILoadError(var1, var2)));
   }

   public void cj(String var1) {
      this.lh(var1, StateType.DESTROYED);
   }

   public void gq(String var1) {
      this.lh(var1, StateType.VISIBLE);
   }

   public void tk(String var1) {
      this.lh(var1, StateType.INVISIBLE);
   }

   public void ut(String var1) {
      this.lh(var1, StateType.FOCUS_GAINED);
   }

   public void gx(String var1) {
      this.lh(var1, StateType.FOCUS_LOST);
   }

   private void lh(String var1, StateType var2) {
      this.lh((Message)(new C2SFUIStateChange(var1, var2)));
   }

   public void lh(int var1, String var2, String var3, String var4) {
      this.lh((Message)(new C2SFUIRequest(var1, var2, var3, var4)));
   }

   public void lh(Message var1) {
      if (this.minecraft.func_147114_u() != null) {
         if (this.Ry == FeatherSourceFile$lh92.ACCEPTED) {
            byte[] var2 = MessageEncoder.SERVER_BOUND.encode(var1);
            FeatherSourceFile456.lh("feather:client", var2);
         }
      }
   }

   public void handle(S2CCreateFUI var1) {
      ((FeatherSourceFile124)this.Rx.get()).lh(var1.getFrame(), var1.getUrl());
   }

   public void handle(S2CDestroyFUI var1) {
      ((FeatherSourceFile124)this.Rx.get()).rg();
   }

   public void handle(S2CSetFUIState var1) {
      switch (var1.getAction()) {
         case FOCUS:
            ((FeatherSourceFile124)this.Rx.get()).lh(var1.getFrame(), var1.isState());
            break;
         case VISIBILITY:
            ((FeatherSourceFile124)this.Rx.get()).nc(var1.getFrame(), var1.isState());
      }

   }

   public void handle(S2CFUIMessage var1) {
      ((FeatherSourceFile124)this.Rx.get()).oe(var1.getFrame(), var1.getPayload());
   }

   public void handle(S2CFUIResponse var1) {
      ((FeatherSourceFile124)this.Rx.get()).nc(var1.getId(), var1.isFound(), var1.getPayload());
   }
}
