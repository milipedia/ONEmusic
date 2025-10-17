package modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado absolute cinema");
        }else{
            System.out.println(audio.getTitulo() + "? Really? que tal experimentar nossa playlist top 50 brasil?");
        }
    }
}
