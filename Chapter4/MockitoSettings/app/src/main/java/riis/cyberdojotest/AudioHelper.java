package riis.cyberdojotest;

import android.media.AudioManager;

public class AudioHelper {
    public void maximizeVolume(AudioManager audioManager) {
        int max = audioManager.getStreamMaxVolume(AudioManager.STREAM_RING);
        audioManager.setStreamVolume(AudioManager.STREAM_RING, max, 0);
    }
}
