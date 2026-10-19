public class MainUsuario {
    static void main() {
        Usuario u1 = new Usuario("BowserV95", "mati.valla95@gmail.com");
        Usuario u2 = new Usuario("AJ1207", "armandolandia@gmail.com");
        System.out.println("ID: " + u1.getId() + " Username: " + u1.getUsername() + " Correo: " + u1.getCorreo());
        System.out.println("Usuario disponible? " + u1.isActivo());

        System.out.println("ID: " + u2.getId() + " Username: " + u2.getUsername() + " Correo: " + u2.getCorreo());
        System.out.println("Usuario disponible? " + u2.isActivo());
    }
}
