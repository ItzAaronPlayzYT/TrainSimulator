import "javax.sound.sampled.*"
public class audioplayer {
  private Clip currentTrack;
  private float baseVolume = 0.5f;
  public void play (int difficulty,String[] path) {
    pause(); // Temporary Stopping For Track Swapping
    try {
      audioInputStream audioInput = AudioSystem.getAudioInputStream(new File(path));
      currentTrack = AudioSystem.getClip();
      currentTrack.open(AudioSystem);
    };
    public void pause() {
      if (currentTrack != null && currentTrack.isRunning()) {
        currentTrack.stop();
        currentTrack.close();
      };
    };
  };
};
