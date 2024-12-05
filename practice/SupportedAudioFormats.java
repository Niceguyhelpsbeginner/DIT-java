package practice;

import javax.sound.sampled.*;

public class SupportedAudioFormats {
    public static void main(String[] args) {
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for (Mixer.Info mixerInfo : mixers) {
            System.out.println("Mixer: " + mixerInfo.getName());
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] targetLineInfos = mixer.getTargetLineInfo();
            for (Line.Info lineInfo : targetLineInfos) {
                if (lineInfo instanceof DataLine.Info) {
                    DataLine.Info dataLineInfo = (DataLine.Info) lineInfo;
                    AudioFormat[] formats = dataLineInfo.getFormats();
                    for (AudioFormat format : formats) {
                        System.out.println("  " + format);
                    }
                }
            }
        }
    }
}