public class SpeakerFactory {
    public Speaker getSpeaker(String speaker){
        if (speaker == null) return null;
        else if (speaker.equalsIgnoreCase("sony")) return new SonySpeaker();
        else if (speaker.equalsIgnoreCase("bose")) return new BoseSpeaker();
        return null;
    }
}
