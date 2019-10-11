<%--
  Created by IntelliJ IDEA.
  User: salle
  Date: 10/10/2019
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SGP - App</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css">
    <style>
        body {
            width: 50%;
            margin: auto;
        }

        h1 {
            margin-bottom: 50px;
        }

        label {
            font-weight: bold;
        }

        input[type=submit] {
            float: right;
        }

        input[type=number]::-webkit-inner-spin-button,
        input[type=number]::-webkit-outer-spin-button {
            -webkit-appearance: none;
            margin: 0;
        }
    </style>
</head>
<body>
<h1>Nouveau collaborateur</h1>
<form method="POST" action="">
    <div class="form-group">
        <label for="nom">Nom : </label><input class="form-control" type="text" id="nom" name="nom" required>
    </div>
    <div class="form-group">
        <label for="prenom">Prénom : </label><input class="form-control" type="text" id="prenom" name="prenom" required>
    </div>
    <div class="form-group">
        <label for="dateNaissance">Date de naissance : </label><input class="form-control" type="date"
                                                                      id="dateNaissance"
                                                                      name="dateNaissance" required>
    </div>
    <div class="form-group">
        <label for="adresse">Adresse : </label><input class="form-control" type="text" id="adresse" name="adresse"
                                                      required>
    </div>
    <div class="form-group">
        <label for="noSecuSociale">Numéro de sécurité sociale : </label><input class="form-control" type="number"
                                                                               id="noSecuSociale"
                                                                               name="noSecuSociale" required>
    </div>
    <input type="submit" class="btn btn-primary btn-lg">
</form>
</body>
</html>