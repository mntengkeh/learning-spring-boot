public class Vehicle {

//  Tight coupling between objects as they have to me manually created by the programmer

    public Vehicle(){
        SonySpeaker speakers = new SonySpeaker();
        speakers.makeSound();
        MichelinTyre tyres = new MichelinTyre();
        tyres.rotate();
    }

    // Reduced coupling by introduction of speaker and tyre factory for central management
    // This is still limited because we have to manually pass the tyre type we are interested in
    public Vehicle(String speaker, String tyre){
        SpeakerFactory sf = new SpeakerFactory();
        var speakers = sf.getSpeaker(speaker);
        speakers.makeSound();
        TyreFactory tf = new TyreFactory();
        var tyres = tf.getTyre(tyre);
        tyres.rotate();
    }

    // best option is to use dependency injection, delegating speaker and tyre object creation to
    // the spring ioc container
}
