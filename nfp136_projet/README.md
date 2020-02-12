## PROJET - SUDOKU ---------------------------------------------
Le sudoku (https://fr.wikipedia.org/wiki/Sudoku) est un jeu de grille, qui consiste, dans sa version
« régulière » à résoudre une grille de 9x9 composée de chiffres de 1 à 9, posant les contraintes
suivantes :
1. Un chiffre ne peut apparaître qu’une seule fois sur une ligne
2. Un chiffre ne peut apparaître qu’une seule fois sur une colonne
3. La grille est séparée en 9 carrés de 3x3, un chiffre ne peut apparaître qu’une seule fois dans un
carré de 3X3.
Les grilles non ambigües sont les grilles qui n’admettent qu’une seule solution, pour ce projet nous ne
nous intéresseront qu’aux grilles non ambigües.

Il vous est demandé d’écrire un programme prenant en paramètre une grille de Sudoku, qui peut soit
être entrée au clavier ou présente dans un fichier, et de la résoudre, le résultat sera soit affiché, soit
sauvegardé dans un fichier.

Vous porterez une attention toute particulière à la modélisation des données, et plus particulièrement
aux données relatives à la grille de Sudoku elle-même.



## COMMANDES ---------------------------------------------------
# Compilation cmd, pour le démarrage
- javac -d . Sudoku.java && javac Main.java && java Main

# Generation de l'executable
- jar cvmf ./MANIFEST.MF sudoku.jar *.class


## METHODES DE CREATION ---------------------------------------
# ETAPE 1 - DEFINIR UNE CLASSE SUDOKU représentant la grille 9x9
- variable boolean comme valeur de retour pour valider ou non
    la résolution de la case à remplir
- variable row et column, retenu pour être testé dans la fonction de recherche

- fonction de test d'une valeur
    - fonction vérifie que le chiffre n'existe pas dans la zone
    - fonction vérifie que le chiffre n'existe pas dans la ligne
    - fonction vérifie que le chiffre n'existe pas dans la colonne

// La fonction de backtracking, fonctionne en récurtion, dont chaque
// appel à pour objectif de trouver la meilleur valeur pour une case,
// en fonction du remplissage précédent, qu'il lui à été confié

- fonction de résolution avec stratégie de backtracking
    - double boucle pour recherché une case vide (0)
    - boucle de 1 à 9 des valeurs possibles
        - test de la valeur
        - si valide, définir dans la grille et appeler en récution
            - si la valeur choisi ne permet pas de remplir la grille

        - si invalide, itértion de la boucle des valeurs


- fonction d'affichage

- fonction d'enregistrement dans un fichier


# ETAPE 2 - DEFINIR UN PROGRAMME PRINCIPAL
- Proposer à un joueur d'utiliser une grille d'un fichier ou de lire au clavier
- Instancier un objet sudoku
- Lancer le programme de résolution automatique


# ETAPE 3 - REVU DU PROGRAMME
- Vérifier la gestion des exceptions
- Vérification de l'optimisation
