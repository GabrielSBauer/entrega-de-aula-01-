
import com.mycompany.aula01.MarioCapa;
import com.mycompany.aula01.MarioGrande;
import com.mycompany.aula01.MarioState;

public class MarioPequeno implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario grande");
        return new MarioGrande();
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario com fogo");
        return (MarioState) new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario com capa");
        return new MarioCapa();
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario morreu");
        return this;
    }
}
