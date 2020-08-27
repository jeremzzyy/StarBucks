public enum Size {
    Tall, Grande,Venti;

    public String toString() {
        switch(this) {
            case Tall: return "ÖÐ±­";
            case Grande: return "´ó±­";
            case Venti: return "³¬´ó±­";
            default:    return "unspecified";
        }
    }
}