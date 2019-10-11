package controller;

import bo.Collaborateur;
import services.CollaborateurService;
import services.Constantes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "newCollabServlet", urlPatterns = {"/collaborateurs/newCollab"})
public class CreateCollaborateurController extends HttpServlet {

    private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // utilisation du service
        req.getRequestDispatcher("/WEB-INF/views/collab/newCollab.jsp");
    }
}