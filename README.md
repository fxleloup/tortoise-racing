# Geneva Software Craftsmanship #27.06.2019 - TDD Challenge: Tortoise racing

https://www.meetup.com/Geneva-software-Craftsmanship/events/262025904/

# 1. Au programme de cette session meetup
La session se déroulera au format table ronde, où chacun d’entre nous présente la résolution du Kata ci-dessous.

# 2. Le principe
Un Kata est choisi lors de la session précédent, chaque participant essaye de le resoudre en pratiquant le test FIRST, quelque soit la pratique TDD, BDD, PDD de votre choix. 

Il est important de respecter les principes SOLID, KISS, Clean Code… et de pouvoir démontrer ca démarche a l’aide par exemple du readme.md

# 3. Détails du Kata
https://www.codewars.com/kata/tortoise-racing


### Cas particulier
* 2 tortues nommées A and B font la course. 
* La tortue A part avec une vitesse moyenne de 220m/h. 
* La jeune tortue B sait qu'elle court + vite que A, et n'a d'ailleurs pas fini de manger son chou.

Quand elle finit par partir, elle peut voir que la tortue A possède une avance de 20m, mais la vitesse de B est de 260m/h. 

=> combien de temps mettra la tortue B pour rattraper la tortue A ?

### Plus généralement
Etant données 2 vitesses (entiers stritement positifs) vA et vB et une avance (entier strictement positif), combien de temps mettra B pour rattraper A ?

Le résultat sera sur la forme d'un tableau [heure, minute, seconde] (arrondi à la seconde suivante).

Si vA >= vB alors le système retournera null.

### Exemples

##### 1. 
<pre>
Etant donné que la vitesse de la tortue A est de 220 m/h
Etant donné que la vitesse de la tortue B est de 260 m/h
Etant donné que l' avance de la tortue B est de 20 m
Quand le système exécute la course
Alors le système affiche un temps [heure, minute, seconde] égal à [0, 32, 18]
</pre>
##### 2. 
<pre>
Etant donné que la vitesse de la tortue A est de 25 m/h
Etant donné que la vitesse de la tortue B est de 28 m/h
Etant donné que l' avance de la tortue B est de 11 m
Quand le système exécute la course
Alors le système affiche un temps [heure, minute, seconde] égal à [3, 21, 49]
</pre>


### Indices
* Les tortues se fichent des fractions de seconde
* Ne manipulez que des nombres entiers


