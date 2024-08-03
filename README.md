#Test
Lancer le programme avec : mvn quarkus:dev

Endpoints :

POST localhost:8081/person : ajoute une personne.
body :
{
    "nom": "PSAU",
    "prenom": "Marc",
    "date": "24/04/1974"
}

GET localhost:8081/inscrits : donne la liste des inscrits avec leurs données.
