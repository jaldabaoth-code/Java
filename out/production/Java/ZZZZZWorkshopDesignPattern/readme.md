# Sujet

En utilisant les DP Factory et Singleton (pour la factory), instanciez :

- un carré
    - rouge si la taille est supérieur à 25
    - bleu sinon
- un rond
    - bleu si la taille est supérieur à 25
    - rouge sinon

On a donc au moins 4 classes (CarreRouge, CarreBleu, RondRouge, RondBleu).
Chacune de ses formes doit pouvoir se décrire avec une fonction "QuiSuisJe()".


# Etapes : 

1 - tu fais les classes des formes
2 - tu fais les new dans le main
3 - tu crée une class factory avec une méthode qui prend les paramètres et fait if/else
4 - tu utilise cette factory dans main
5 - tu transforme la factory en singleton