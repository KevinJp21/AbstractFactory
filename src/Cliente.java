public class Cliente {
    public static void main(String[] args) {
        FabricaDispositivos fabricaApple = new FabricaApple();
        Celular celularApple = fabricaApple.crearCelular();
        Computadora computadoraApple = fabricaApple.crearComputadora();

        System.out.println("Especificaciones del celular Apple:");
        System.out.println(celularApple.especificaciones());

        System.out.println("\nEspecificaciones de la computadora Apple:");
        System.out.println(computadoraApple.especificaciones());

        FabricaDispositivos fabricaSamsung = new FabricaSamsung();
        Celular celularSamsung = fabricaSamsung.crearCelular();
        Computadora computadoraSamsung = fabricaSamsung.crearComputadora();

        System.out.println("\nEspecificaciones del celular Samsung:");
        System.out.println(celularSamsung.especificaciones());

        System.out.println("\nEspecificaciones de la computadora Samsung:");
        System.out.println(computadoraSamsung.especificaciones());
    }
}