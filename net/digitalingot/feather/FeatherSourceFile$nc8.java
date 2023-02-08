package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;

@FeatherSourceFile368(
   zc = true
)
public class FeatherSourceFile$nc8 extends FeatherSourceFile136 {
   @FeatherSourceFile656(
      jm = @FeatherSourceFile655(
   kz = 0
)
   )
   @FeatherSourceFile600(
      xp = FeatherSourceFile637.CENTER_LEFT,
      vl = 0.0,
      go = -101.0
   )
   public FeatherSourceFile89 yT;
   @FeatherSourceFile655(
      kz = 10
   )
   public FeatherSourceFile68 kH = new FeatherSourceFile68("feather.titles.general");
   @FeatherSourceFile571(
      lb = "receiveMode",
      jc = "feather.modules.voice.receiveMode",
      kd = "everyone",
      jm = @FeatherSourceFile655(
   kz = 11
)
   )
   public FeatherSourceFile$nc$lh Ka;
   @FeatherSourceFile571(
      lb = "hud",
      jc = "feather.modules.voice.hud",
      kd = "true",
      jm = @FeatherSourceFile655(
   kz = 12
)
   )
   public boolean Kb;
   @FeatherSourceFile655(
      kz = 20
   )
   public FeatherSourceFile68 Kc = new FeatherSourceFile68("feather.titles.keysettings");
   @FeatherSourceFile571(
      lb = "keyProximityPTT",
      jc = "feather.modules.voice.keyProximityPTT",
      kd = "86",
      jm = @FeatherSourceFile655(
   kz = 21
)
   )
   public FeatherSourceFile344 Kd;
   @FeatherSourceFile571(
      lb = "keyPartyPTT",
      jc = "feather.modules.voice.keyPartyPTT",
      kd = "80",
      jm = @FeatherSourceFile655(
   kz = 22
)
   )
   public FeatherSourceFile344 Ke;
   @FeatherSourceFile655(
      kz = 30
   )
   public FeatherSourceFile68 Kf = new FeatherSourceFile68("feather.titles.voiceactivation");
   @FeatherSourceFile571(
      lb = "voiceActivationType",
      jc = "feather.commonterm.type",
      kd = "off",
      jm = @FeatherSourceFile655(
   kz = 31
)
   )
   public FeatherSourceFile$nc$nc Kg;
   @FeatherSourceFile571(
      lb = "voiceActivationThreshold",
      jc = "feather.modules.voice.voiceActivationThreshold",
      kd = "-30",
      jm = @FeatherSourceFile655(
   kz = 32
),
      dy = @FeatherSourceFile163(
   lb = "voiceActivationType",
   em = {"proximity", "party"}
)
   )
   @FeatherSourceFile536(
      mc = -70.0,
      ng = 0.0
   )
   public double Kh;
   @FeatherSourceFile655(
      kz = 40
   )
   public FeatherSourceFile68 Ki = new FeatherSourceFile68("feather.titles.capture");
   @FeatherSourceFile571(
      lb = "microphone",
      jc = "feather.modules.voice.device",
      kd = "Default",
      jm = @FeatherSourceFile655(
   kz = 41
)
   )
   @FeatherSourceFile765
   @FeatherSourceFile271(
      lb = "microphones"
   )
   public String Kj;
   @FeatherSourceFile571(
      lb = "microphoneAmplification",
      jc = "feather.modules.voice.amplification",
      kd = "1.0",
      jm = @FeatherSourceFile655(
   kz = 42
)
   )
   @FeatherSourceFile536
   public double Kk;
   @FeatherSourceFile655(
      kz = 50
   )
   public FeatherSourceFile68 Kl = new FeatherSourceFile68("feather.titles.playback");
   @FeatherSourceFile571(
      lb = "speaker",
      jc = "feather.modules.voice.device",
      kd = "Default",
      jm = @FeatherSourceFile655(
   kz = 51
)
   )
   @FeatherSourceFile765
   @FeatherSourceFile271(
      lb = "speakers"
   )
   public String Km;
   @FeatherSourceFile571(
      lb = "speakerAmplification",
      jc = "feather.modules.voice.amplification",
      kd = "1.0",
      jm = @FeatherSourceFile655(
   kz = 52
)
   )
   @FeatherSourceFile536
   public double Kn;
   @FeatherSourceFile571(
      lb = "maxVolume",
      jc = "feather.modules.voice.maxVolume",
      kd = "80",
      jm = @FeatherSourceFile655(
   kz = 53
)
   )
   @FeatherSourceFile536(
      mc = 10.0,
      ng = 100.0
   )
   public double Ko;

   @FeatherSourceFile271(
      lb = "microphones"
   )
   public static List eQ() {
      ArrayList var0 = new ArrayList();
      var0.add("Default");
      var0.addAll(FeatherSourceFile698.fQ());
      return var0;
   }

   @FeatherSourceFile271(
      lb = "speakers"
   )
   public static List eR() {
      ArrayList var0 = new ArrayList();
      var0.add("Default");
      var0.addAll(FeatherSourceFile698.fR());
      return var0;
   }
}
