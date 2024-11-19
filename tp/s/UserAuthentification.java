// UserAuthentification.java
package org.example.tp.s;

public class UserAuthentification {

    public void loginUser(User user) {
        // Simule l'authentification utilisateur
        if (user.getUsername().equals("john_doe") && user.getPassword().equals("Password123")) {
            System.out.println("Utilisateur connecté avec succès.");
        } else {
            System.out.println("Échec de la connexion : nom d'utilisateur ou mot de passe incorrect.");
        }
    }
}
