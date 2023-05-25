package ro.ase.cts.observer;

public class MainObserver {
    public static void main(String[] agrs){
        YoutubeChannel youtubeChannel = new YoutubeChannel("TestACS");
        YoutubeSubscriber subscriber1 = new YoutubeSubscriber();
        YoutubeSubscriber subscriber2 = new YoutubeSubscriber();
        youtubeChannel.subscribe(subscriber1);
        youtubeChannel.subscribe(subscriber2);
        youtubeChannel.publishVideo();
        youtubeChannel.unsuscribe(subscriber1);
        youtubeChannel.publishVideo();
    }
}
