package edu.craptocraft.romans_go_home;

public enum RomansSymbols {
    
    // Principales numeros
    I (1),
    V (5),
    X (10),
    L (50),
    C (100),
    D (500),
    M (1000),

    // Restas numeros
    IV (4),
    IX (9),
    XL (40),
    XC (90),
    CD (400),
    CM (900);

    private int valorRomano;

    private RomansSymbols(int valorRomano) {
        this.valorRomano = valorRomano;
    }
    
    public int getValorRomano() {
        return valorRomano;
    }   

}
