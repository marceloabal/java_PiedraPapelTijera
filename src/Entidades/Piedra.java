package Entidades;

public class Piedra implements Peleable {

	Valores x = Valores.PIEDRA;
	
    @Override
    public Peleable vs(Peleable peleable) {
        return peleable.vs(this);
    }

    @Override
    public Peleable vs(Tijera tijera) {
        return this;
    }

    @Override
    public Peleable vs(Papel papel) {
        return papel;
    }

    @Override
    public Peleable vs(Piedra piedra) {
        return this;
    }

}
