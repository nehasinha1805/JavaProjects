import edu.princeton.cs.algs4.StdAudio;
import java.io.FileInputStream;
import java.io.IOException;
import edu.princeton.cs.algs4.StdIn;

public class PlayThatTune {

	public static void main(String[] args) throws IOException {
		
		System.setIn(new FileInputStream(args[0]));
		
		// repeats long as there are more integers to read in
		while(!StdIn.isEmpty())
		{
			//read in the pitch, where 0 = Concert A(A4)
			int pitch = StdIn.readInt();
			
			//read in duration in seconds
			double duration = StdIn.readDouble();
			
			//build in sine wave with desired frequency
			double hz = 440 * Math.pow(2, pitch/12.0);
			int n = (int) (StdAudio.SAMPLE_RATE * duration);
			double[] a = new double[n+1];
			for(int i = 0; i <= n; i++)
			{
				a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
			}
			
			//play it using standard audio
			StdAudio.play(a);
		}

	}

}
