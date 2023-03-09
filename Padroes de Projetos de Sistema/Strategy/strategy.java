public interface Automovel {
    void acelerar();
}

public class Carro implements Automovel {
    @Override
    public void acelerar() {
    }
}

public class Onibus implements Automovel {
    @Override
    public void acelerar() {
    }
}

public class Caminhao implements Automovel {
    @Override
    public void acelerar() {
    }
}

public class FabricaAutomovel {
    public Automovel criarAutomovel() {
    }
}
