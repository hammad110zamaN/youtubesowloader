import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;

public class YouTubeVideoDownloader {

  public static void main(String[] args) throws IOException {
    PrintWriter out = new PrintWriter(System.out);

    // Get the YouTube video URL from the user
    URL videoUrl = new URL(System.console().readLine());

    // Download the video
    InputStream inputStream = videoUrl.openStream();
    byte[] buffer = new byte[1024];
    int bytesRead;
    while ((bytesRead = inputStream.read(buffer)) != -1) {
      out.write(buffer, 0, bytesRead);
    }

    out.close();
  }
}
