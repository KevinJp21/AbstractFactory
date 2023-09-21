interface FabricaDispositivos {
    Celular crearCelular();
    Computadora crearComputadora();
}

// Clase concreta de fábrica para Apple
class FabricaApple implements FabricaDispositivos {
    @Override
    public Celular crearCelular() {
        return new IPhone();
    }

    @Override
    public Computadora crearComputadora() {
        return new MacBook();
    }
}

// Clase concreta de fábrica para Samsung
class FabricaSamsung implements FabricaDispositivos {
    @Override
    public Celular crearCelular() {
        return new Galaxy();
    }

    @Override
    public Computadora crearComputadora() {
        return new GalaxyBook();
    }
}

// Interfaz abstracta para los celulares
interface Celular {
    String especificaciones();
}

// Clase de celular iPhone
class IPhone implements Celular {
    @Override
    public String especificaciones() {
        return "Iphone: Pantalla Retina, iOS, cámara avanzada, chip A14 Bionic.";
    }
}

// Clase de celular Galaxy
class Galaxy implements Celular {
    @Override
    public String especificaciones() {
        return "Galaxy: Pantalla AMOLED, Android, cámara versátil, procesador Exynos.";
    }
}

// Interfaz abstracta para las computadoras
interface Computadora {
    String especificaciones();
}

// Clase de computadora MacBook
class MacBook implements Computadora {
    @Override
    public String especificaciones() {
        return "MacBook: Pantalla Retina, macOS, rendimiento excepcional, diseño elegante.";
    }
}

// Clase de computadora GalaxyBook
class GalaxyBook implements Computadora {
    @Override
    public String especificaciones() {
        return "GalaxyBook: Pantalla táctil, Windows, portabilidad, versatilidad.";
    }
}
