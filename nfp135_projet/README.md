Ce jeu de démineur est écrit en Java.

# Compilation cmd, pour le démarrage, avant le makefile
- javac -d . Air.java Bombe.java && javac Main.java && java Main

# Compilation makefile

# Etape 1 - Création de l'air de jeu
- Création de la classe Air de plusieurs constructeur en fonction des besoins
- Ajout d'une fonction init, commune aux consturcteurs et potentiellement réutilisable

# Etape 2 - Affiche de l'air de jeu
- Ajout d'une fonction dans la classe Air

# Etape 3 - Positionner des bombes
- Découpage de la procédure en une fonction public et des fonctions privés dans la classe Bombe
- Ajout d'accesseur et méthode de test dans la classe Air

# Etape 4 - Calcul des cases adjacentes
- Création de la fonction Evaluate, qui comptabilise le nombre de bombe dans les cellules environnantes
- Ajout d'accesseur et modifieur dans la class Air

# Etape 5 - Le programme principal (le main)
- Modification du main, ajout d'une fonction principale de jeu
- Ajout d'une fonction proposant de rejouer sans relancer le programme

# Etape 6 - Modélisation des données
- Création d'un autre fonction d'affichage qui affiche uniquement les cellules découverte
- Boucle de jeu qui propose au joueur de sélectionner une case et l'évalue
- Modification de la structure de donnée du tableau de l'air de jeu en ajoutant
    une 3 dimension, permettant de définir si la cellule est caché ou découverte
- Modification des fonctions interogeant ou modifiant le contenu du tableau modifié

# Etape 7 - Un seul coup
- 

# Etape 8 - Partie entière
- 

# ********************* RESTE A FAIRE *************************
            - makefile
            - exeption
            - transmettre en paramètre de fonction un objet
            - Faire un executable