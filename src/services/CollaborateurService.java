package services;

import bo.Collaborateur;

import java.util.ArrayList;
import java.util.List;

public class CollaborateurService {
    List<Collaborateur> listeCollaborateurs = new ArrayList<>();

    public List<Collaborateur> listerCollaborateurs() {
        return listeCollaborateurs;
    }

    public void sauvegarderCollaborateur(Collaborateur collab) {
        listeCollaborateurs.add(collab);
    }
}
