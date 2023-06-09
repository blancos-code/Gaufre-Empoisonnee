# Gaufre-Empoisonnée


## Description 
### Projet de Licence
UGA, [IM2AG](https://im2ag.univ-grenoble-alpes.fr/)

### Règles du jeu de la gaufre empoisonnée
C'est un jeu à 2 joueurs. Le but du jeu est d'obliger l'autre joueur à jouer le coup perdant. 
Déroulement de la partie :
L'un des deux joueurs commence. Ensuite, chacun joue à tour de rôle et est obligé de jouer (passer son tour est interdit) jusqu'à ce qu'un des joueurs joue le coup perdant. La partie est alors terminée, ce dernier joueur est déclaré perdant et l'autre gagnant.
Description des coups autorisés et du coup perdant :
- Description arithmétique. La gaufre est représentée par un entier g de la forme $2^a3^b$ où a et b sont des entiers positifs. Un coup est un diviseur $2^i3^j$ de g qui ne soit pas multiple d'un coup déjà joué. Le coup perdant est 1.
- Description géométrique. La gaufre est représentée par une matrice $(0..a, 0..b)$. Un coup (qui consiste à mordre dans la gaufre) est un couple $(i, j)$ avec $1≤i≤a$ et $1≤j≤b$. Après qu'un coup $(i; j)$ ait été joué, la partie de la gaufre telle que  $(i'≥i et j'≥j)$ disparaît. Le coup perdant (la case empoisonnée) est $(0, 0)$.
La taille standard de la gaufre est $6*8 (a=5, b=7)$.


## Fonctionnalités

| Priorité | Description |
| --- | --- |
| 1 | <ul><li> - [x] Gaufre fonctionnelle : lorsqu'on clique sur une case, elle est correctement croquée </li></ul>
| 1 | <ul><li> - [x] Affichage visuel de la gaufre                                                       </li></ul>
| 2 | <ul><li> - [x] Bouton "coup précédent" qui fonctionne (historique des coups)                       </li></ul>
| 2 | <ul><li> - [x] Bouton quitter la partie                                                            </li></ul>
| 2 | <ul><li> - [x] Affichage de la fin du jeu, et retour au menu principal                             </li></ul>
| 3 | <ul><li> - [x] Sauvegarde de la partie                                                             </li></ul>
| 3 | <ul><li> - [x] Charger la partie                                                                   </li></ul>
| 3 | <ul><li> - [x] IA aléatoire                                                                        </li></ul>
| 3 | <ul><li> - [x] IA intelligente utilisant un arbre ET/OU                                            </li></ul>
| 3 | <ul><li> - [x] Score                                                                               </li></ul>
| 4 | <ul><li> - [x] Menu de jeu                                                                         </li></ul>
| 4 | <ul><li> - [x] Boutons qui changent d'apparence si la souris les survole                           </li></ul>
| 5 | <ul><li> - [x] Singe qui vole les boutons                                                          </li></ul>
| 5 | <ul><li> - [x] Femme de ménage                                                                     </li></ul>
| 5 | <ul><li> - [x] Pluie de gaufres                                                                    </li></ul>


## Screenshots
![image](https://user-images.githubusercontent.com/79577721/234116964-ebafdac6-c0f9-4ac8-adcf-47aa7841ad69.png)
![image](https://user-images.githubusercontent.com/79577721/234117059-8a88b13d-f6e7-482b-ad4d-360c7a9c0cf7.png)
![image](https://user-images.githubusercontent.com/79577721/234117088-375a0ef8-739c-4ea0-a928-b5234e2d6dd8.png)
