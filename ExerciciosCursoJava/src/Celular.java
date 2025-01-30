public class Celular {
    private String marca;
    private String modelo;
    private int bateria;
    

    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void ligar() {
        if (bateria > 0) {
            System.out.println("O celular está ligado.");
        } else {
            System.out.println("Bateria insuficiente para ligar.");
        }
    }

    public void desligar() {
        System.out.println("O celular está desligado.");
    }

    public void usarCelular(int consumo) {
        if (bateria > 0) {
            bateria -= consumo;
            if (bateria < 0) bateria = 0;
            System.out.println("O celular foi usado. Bateria restante: " + bateria + "%.");
        } else {
            System.out.println("Bateria esgotada. Recarregue o celular.");
        }
    //imprimir
    public String imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }


    }
}
