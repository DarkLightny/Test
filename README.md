#Test
Lancer le programme avec : mvn quarkus:dev

Endpoints :

POST localhost:8081/person : ajoute une personne.
body :
{
    "nom": "nom",
    "prenom": "prenom",
    "date": "dd/mm/yyyy"
}

GET localhost:8081/inscrits : donne la liste des inscrits avec leurs données.
