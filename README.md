# Test Driven Development

## Qu'est-ce que le Test driven Development ?

Le test driven development est l'une des pratiques mise en avant par la méthode agile **Extreme programming**.
Elle est vivement recommandée par les artisans développeurs (software crafters, cf. Software Craftsmanship).

Elle est certainement la méthode de design de code la plus efficace connue actuellement !  
Cependant, malgré son incroyable efficience, elle est souvent mal comprise.

![Red green refactor](docs/red_green_refactor.png)

1️⃣ On commence par RED. Dans cette phase, on va écrire un test qui ne passe pas (s’il ne compile pas, il ne passe pas). À ce moment, on ne se concentre que sur l'intention que l'on veut donner à cette méthode, la logique métier.

2️⃣ Vient ensuite la phase GREEN, ici on va écrire le code le simple possible pour faire passer notre test (sans casser un test précédent).

3️⃣ On termine le cycle avec le REFACTORING, où on va retravailler notre code pour :

 - Avoir un code plus élégant, plus lisible ;
 - Améliorer le design ;
 - Expliciter au mieux les traitements qui y sont faits ;
 - Supprimer les duplications...

➡️ On répète ce cycle toutes les quelques secondes voire minutes. Il n'est absolument pas question ici de cycle sur plusieurs jours. On fait plusieurs centaines de cycles de TDD dans une journée !

### Comment ?
Il peut être décrit succinctement par l'ensemble des règles suivantes :

1. Ecrire un "seul" test décrivant un comportement
2. Exécuter le test, qui doit échouer parce que le programme n'a pas cette fonctionnalité
3. écrire "juste assez" de code, le plus simple possible, pour faire passer le test
4. "remanier" le code jusqu'à ce qu'il soit qualitatif
4. répéter, en "accumulant" les tests et donc les règles du comportement attendu.

### Avantages
 - Meilleure architecture du programme et meilleure qualité du code (petites fonctions, principes DRY)
 - réductions significatives des taux de défauts
 - Augmente la compréhension du code (documentation détaillée du projet)
 - permet de mettre en évidence les cas à la marge
 - réduit le temps nécessaire au développement du projet (feedback rapide, moins de bugs ou d'erreurs)

### Tips

#### Se focaliser d'abord sur les cas simples

D'abord se focaliser sur les cas simples.
Par exemple dans le cas de FizzBuzz, nous commençons par les chiffres non compris dans les règles à implémenter => 1 & 2.

#### Comportement / Behavior

Un test doit décrire un comportement. L'objectif de la suite de tests est de mettre en avant tout ce qui défini ce que l'on veut développer.  
Ces tests prouvent que le code écrit fonctionne.

#### Écrire le code MINIMAL

On ne fait pas ce que les tests ne nous ont pas demandé de faire ! L'objectif est de faire passer le test au plus vite, on va droit au but pour faire passer le test que nous venons d'écrire.
Ensuite, nous pouvons refactor.

#### Isolation

Un test doit être unitaire, ne pas être connecté de manière quelconque à un autre test.   
Exemple : Si on écrit quelque chose en base de données, il ne faut pas qu'un autre test fail du fait qu'un élément a été ajouté auparavant.

Attention cela ne signifie pas que l'on ne test qu'une seule fonction avec un test, on test bien un comportement !

#### La triangulation

Après avoir implémenté une règle métier / un test (avec Red-Green-Refactor), assurez-vous de trouver toutes les "bizarreries" ou non-généralités dans le code de production et éliminez-les une par une en écrivant un test qui prouve cette non-généralité.
Assurez-vous de tester les cas à la marge !
