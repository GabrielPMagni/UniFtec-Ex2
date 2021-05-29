/*

Crie uma classe chamada Televisor que possua o atributo volume e os
métodos aumentaVolume() e diminuiVolume() que nada retornam. O método
aumentaVolume aumenta em 1 (incrementa) a variável volume, desde que não
esteja com volume igual a 40, neste caso, o método não deve realizar nenhuma
ação. Já o método diminuiVolume diminui em 1 (decrementa) a variável volume,
desde que já não esteja com volume igual a zero. O volume deve ser iniciado no
construtor com o valor igual a zero. Crie o método retornaVolume(), que irá
retornar o volume do televisor. Crie a classe Principal para testar os métodos
desenvolvidos.

*/

public class App2 {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        
        tv.aumentaVolume();

        tv.diminuiVolume();
        int vol = tv.retornaVolume();

        System.out.println(vol);
    }
}