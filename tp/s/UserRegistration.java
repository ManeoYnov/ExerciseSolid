package org.example.tp.s;
public class UserRegistration {
    private UserValidator validator = new UserValidator();

    public void registerUser(User user) {
        // Valider le nom d'utilisateur et le mot de passe
        if (validator.validateUsername(user.getUsername()) && validator.validatePassword(user.getUsername())) {
            // Enregistrer l'utilisateur dans la base de données
            System.out.println("Utilisateur enregistré avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }

}
