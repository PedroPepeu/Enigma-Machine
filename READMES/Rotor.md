# Circular List Node

<img src="assets/images/icon.png" alt="profile_pic" width="200"/>


## Profile
**Dev**: Pedro Pepeu Duarte de Freitas

**Subject**: Estrutura de Dados 1

**Objective**: Do list node structure


## Description
>The rotor:\
>Is a part of the letter scramble in Enigma, it is a circle that contains the letter from A to Z and each time an key is pressed it rolls.

### configRotor
It's created an char array with capital letters from A to Z and is added as `addFirst()` to set up all the letters.

### roll
It deserves to when a key is pressed it roll one time, updating the `currentLetter`.

### reset
When need to set the configuration as default.

### lastLetter
Its used to check if the letter is Z, in other words, the last letter and the last node.

### position
Returns an char, used to know in what letter the `currentLetter` is.