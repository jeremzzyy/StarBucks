public enum Size {
    Tall, Grande,Venti;

    public String toString() {
        switch(this) {
            case Tall: return "�б�";
            case Grande: return "��";
            case Venti: return "����";
            default:    return "unspecified";
        }
    }
}