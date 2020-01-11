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

# ********************* RESTE A FAIRE *************************
            - makefile
            - exeption
            - Faire un executable
            - Refaire le main pour proposer des commandes user 
