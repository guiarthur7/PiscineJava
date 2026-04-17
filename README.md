# 🐠 Piscine Java

Une collection complète d'exercices pratiques pour maîtriser les fondamentaux et concepts avancés de la programmation Java.

## 📋 Table des matières

- [À propos](#à-propos)
- [Structure du projet](#structure-du-projet)
- [Catégories d'exercices](#catégories-dexercices)
- [Prérequis](#prérequis)
- [Instructions d'utilisation](#instructions-dutilisation)
- [Concepts couverts](#concepts-couverts)

## À propos

La **Piscine Java** est une série d'exercices conçue pour progresser étape par étape dans l'apprentissage de Java. Chaque répertoire contient un ou plusieurs exercices focalisés sur des concepts spécifiques, du plus basique au plus avancé.

## 🏗️ Structure du projet

Chaque exercice est organisé dans son propre répertoire avec :

- 📄 Code source Java
- 🧪 Classe `ExerciseRunner` (point d'entrée pour exécuter l'exercice)
- 📁 Fichiers de données (le cas échéant)

```
PiscineJava/
├── AdventureAbstract/          # Exercices sur les classes abstraites
├── AdventureInterface/         # Exercices sur les interfaces
├── Builder/                    # Pattern Builder
├── Factory/                    # Pattern Factory
├── Singleton/                  # Pattern Singleton
├── ... (70+ répertoires d'exercices)
```

## 📚 Catégories d'exercices

### 🎮 **Programmation Orientée Objet - Adventure Series**

Explorez les concepts OOP à travers une série d'exercices en thème **RPG/aventure** :

| Répertoire | Concepts |
|-----------|----------|
| **AdventureCharacter** | Classes de base et héritage |
| **AdventureMonster** | Polymorhisme et héritage |
| **AdventureSorcerer** | Spécialisation des classes |
| **AdventureTemplar** | Composition d'objets |
| **AdventureAbstract** | Classes et méthodes abstraites |
| **AdventureInterface** | Implémentation d'interfaces |
| **AdventureException** | Gestion d'exceptions personnalisées |
| **AdventureCatch** | Capture et gestion d'erreurs |
| **AdventureWeapon** | Intégration d'objets complexes |
| **AdventureUtils** | Utilitaires et méthodes statiques |

### 🏛️ **Design Patterns**

Patterns classiques de conception :

| Répertoire | Pattern |
|-----------|---------|
| **Builder** | Construction progressive d'objets |
| **Factory** | Création d'objets via factory |
| **Singleton** | Instance unique d'une classe |

### 🌟 **Astronomie - Star Series**

Programmation orientée objet appliquée à la physique spatiale :

| Répertoire | Sujet |
|-----------|-------|
| **StarProperties** | Propriétés de base |
| **StarConstructors** | Constructeurs avancés |
| **StarGetters** | Accesseurs et encapsulation |
| **StarSetters** | Mutateurs et validations |
| **StarStatic** | Membres et méthodes statiques |
| **StarInheritance** | Héritage d'étoiles/planètes |
| **StarMass** | Calculs de masse |
| **StarPlanet** | Orbites et planètes |
| **StarGalaxy** | Galaxies et collections |
| **StarUtils** | Utilitaires astronomiques |
| **StarOverride** | Redéfinition de méthodes |

### 📊 **Collections et Structures de Données**

| Répertoire | Concept |
|-----------|---------|
| **ListContains**, **ListEquals** | Listes et opérations |
| **ListSearchIndex** | Recherche dans les listes |
| **SetEquals**, **SetOperations** | Ensembles et opérations |
| **MapEquals**, **MapInventory** | Dictionnaires et inventaires |

### 🔄 **Streams et Programmation Fonctionnelle**

| Répertoire | Concept |
|-----------|---------|
| **StreamCollect** | Collecte d'éléments |
| **StreamMap** | Transformation de données |
| **StreamReduce** | Agrégation de données |

### 🔤 **Manipulation de Chaînes de Caractères**

| Répertoire | Concept |
|-----------|---------|
| **StringConcat** | Concaténation |
| **StringContains** | Recherche de sous-chaînes |
| **StringLength** | Longueur et accès |
| **StringReplace** | Remplacement de texte |
| **Capitalize** | Transformation de casse |
| **RegexMatch** | Expressions régulières - correspondance |
| **RegexReplace** | Expressions régulières - remplacement |

### 🔢 **Opérations Mathématiques**

| Répertoire | Concept |
|-----------|---------|
| **IntOperations** | Opérations sur entiers |
| **FloatOperations** | Opérations sur décimaux |
| **ComputeArray** | Calculs sur tableaux |
| **DoOp** | Opérations personnalisées |

### 📅 **Manipulation de Dates et Heures**

| Répertoire | Concept |
|-----------|---------|
| **FormatDate** | Formatage de dates |
| **ParseDate** | Analyse de dates |
| **DifferenceBetweenDate** | Calculs entre dates |

### 📁 **Fichiers et Entrées/Sorties**

| Répertoire | Concept |
|-----------|---------|
| **Cat** | Lecture de fichiers |
| **CatInFile** | Écriture dans fichiers |
| **FileManager** | Gestion de fichiers |
| **FileSearch** | Recherche dans fichiers |

### 🎯 **Autres Concepts**

| Répertoire | Concept |
|-----------|---------|
| **HelloWorld** | Premier programme |
| **IsEven** | Conditionnelles de base |
| **SortArgs** | Traitement d'arguments |
| **SortList** | Algorithmes de tri |
| **Palindrome** | Algorithmes de texte |
| **ListEquals** | Comparaison d'objets |
| **Chifoumi** | Jeu (Pierre-Papier-Ciseaux) |
| **Wedding** | Logique complexe |
| **KeepTheChange** | Calculs avec rentes |
| **CleanExtract** | Nettoyage de données |

## 🛠️ Prérequis

- **Java Development Kit (JDK)** 8 ou supérieur
- **Un IDE** (VS Code, IntelliJ IDEA, Eclipse, NetBeans, etc.) ou éditeur de texte
- **Maven** (optionnel, pour la gestion des dépendances)

### Installation de Java

**Ubuntu/Debian :**

```bash
sudo apt-get install default-jdk
```

**macOS (avec Homebrew) :**

```bash
brew install openjdk
```

**Windows :**
Téléchargez depuis [oracle.com](https://www.oracle.com/java/technologies/downloads/) ou utilisez `choco install openjdk` avec Chocolatey.

## 🚀 Instructions d'utilisation

### Exécuter un exercice

1. **Naviguer dans le répertoire de l'exercice :**

   ```bash
   cd AdventureCharacter
   ```

2. **Compiler le code :**

   ```bash
   javac *.java
   ```

3. **Exécuter la classe `ExerciseRunner` :**

   ```bash
   java ExerciseRunner
   ```

### Exemple avec un exercice spécifique

```bash
# Explorer l'architecture OOP avec Adventure
cd AdventureAbstract
javac *.java
java ExerciseRunner

# Ou tester les patterns de conception
cd ../Builder
javac *.java
java ExerciseRunner
```

### Avec VS Code

1. Ouvrez le répertoire du projet
2. Utilisez l'extension **Extension Pack for Java** (recommandée)
3. Cliquez sur le bouton ▶️ "Run" au-dessus de `ExerciseRunner.main()`

## 📖 Concepts couverts

### Concepts Fondamentaux

- ✅ Variables et types de données
- ✅ Opérateurs et expressions
- ✅ Structures de contrôle (if, for, while)
- ✅ Tableaux et collections
- ✅ Méthodes et fonctions

### Programmation Orientée Objet

- ✅ Classes et objets
- ✅ Encapsulation et accesseurs
- ✅ Héritage et hiérarchies
- ✅ Polymorphisme
- ✅ Interfaces et contrats
- ✅ Classes abstraites
- ✅ Composition et agrégation

### Concepts Avancés

- ✅ Gestion d'exceptions
- ✅ Génériques
- ✅ Collections (List, Set, Map)
- ✅ Streams et lambdas
- ✅ Expressions régulières
- ✅ Entrées/Sorties (I/O)
- ✅ Design Patterns
- ✅ Dates et heures

## 💡 Conseils d'apprentissage

1. **Progressez graduellement** : Commencez par les fondamentaux et montez en difficulté
2. **Pratiquez régulièrement** : Faites au moins un exercice par jour
3. **Modifiez et expérimentez** : N'hésitez pas à modifier le code pour comprendre
4. **Consultez la documentation** : Lisez le code des classes fournies
5. **Débuggez activement** : Utilisez les print statements et vérifie les valeurs

## 📝 Notes

Chaque exercice est conçu comme une étape progressive. Le code fourni dans les exercices est commenté pour faciliter la compréhension.

---

**Bonne programmation ! 🚀 Java est votre aventure!**
