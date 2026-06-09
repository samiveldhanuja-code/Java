interface MediaPlayer{ void play(); void pause(); }
class AudioPlayer implements MediaPlayer{
    public void play(){ System.out.println("Audio Playing"); }
    public void pause(){ System.out.println("Audio Paused"); }
}
class VideoPlayer implements MediaPlayer{
    public void play(){ System.out.println("Video Playing"); }
    public void pause(){ System.out.println("Video Paused"); }
}
class PodcastPlayer implements MediaPlayer{
    public void play(){ System.out.println("Podcast Playing"); }
    public void pause(){ System.out.println("Podcast Paused"); }
}
public class Problem7_MediaPlayer{
    public static void main(String[] args){
        MediaPlayer[] p={new AudioPlayer(),new VideoPlayer(),new PodcastPlayer()};
        for(MediaPlayer m:p){ m.play(); m.pause(); }
    }
}