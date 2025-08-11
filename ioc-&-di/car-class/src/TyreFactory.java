public class TyreFactory {
    public Tyre getTyre(String tyre){
        if (tyre == null) return null;
        else if (tyre.equalsIgnoreCase("michelin")) return new MichelinTyre();
        else if (tyre.equalsIgnoreCase("bridgestone")) return new BrideStoneTyre();
        return null;
    }
}
