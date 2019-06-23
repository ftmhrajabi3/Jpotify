import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class Play {

	private String filePath;
	private File sound;
	private AudioInputStream ais;
	private Clip clip;
	private int lastFrame;
	
	public Play(String filePath) {
			
		try {
			this.filePath = filePath;
			sound = new File(filePath);
			ais = AudioSystem.getAudioInputStream(sound);
			AudioFormat format = ais.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class, format);
			this.clip = (Clip) AudioSystem.getLine(info);
			this.clip.open(ais);
			clip.start();
			
		}catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
			
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, ex);
			
		}
		
//		try {
//		
//			this.filePath = filePath;
//			sound = new File(filePath);
//			ais = AudioSystem.getAudioInputStream(sound);
//			clip = AudioSystem.getClip();
//			clip.open(ais);
//			clip.start();
//			
//		}catch(Exception e) {
//			JOptionPane.showMessageDialog(null, e);
//		}
//		
	}

	public void continueSong() {
		if(lastFrame < clip.getFrameLength()) {
			clip.setFramePosition(lastFrame);
			clip.start();
		}
		else {
			clip.setFramePosition(0);
		}
		clip.start();
	}
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Clip getClip() {
		return clip;
	}
	
	public void stopSong() {
		if (clip.isRunning()) {
			lastFrame = clip.getFramePosition();
            clip.stop();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filePath == null) ? 0 : filePath.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Play other = (Play) obj;
		if (filePath == null) {
			if (other.filePath != null)
				return false;
		} else if (!filePath.equals(other.filePath))
			return false;
		return true;
	}
	
	
}
