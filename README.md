
Objectifs du formateur
• CRUD pour les tables de base de données (MySQL, PostgreSQL)
• Gestion d’un TOKEN
• Gestion de rôle avec des accès contrôlée
• GIT (avec plusieurs commit)
• Génération de PDF ou XLSX

Tables

User
• Id
• Nom
• Prenom
• Role
• Password
• Telephone
• Mail

Recette
• Id
• Nom du plat
• Durée de préparation
• Durée de cuisson
• Nombre calorique
• Partage

Ingrédient
• Id
• Libelle
• Type (enum)
• Nombre de calorie

Liaison
• User a des recettes favorites
• User a des recettes persos (FK_USER dans recette)
• Recette sont constitué d’ingrédients (quantité par recette)

Contraintes
• On peut partager ou non une recette
• Recette sous forme PDF/XLSX

Contraintes techniques

• Avoir une architecture :
o Config
o Controller
o Dtos
o Entites
o Mappers
o Repositorie
o Services

##############################################################################################################################

TO DO 

1. Les entités d'abord
Je définirais toutes mes classes d'entités avec leurs annotations JPA :

User avec l'enum Role
Ingredient avec l'enum Type
Recette
Les relationsMany-to-Many (User ↔ Recettes favorites, Recette ↔ Ingredients avec la quantité)
La relation One-to-Many (User → Recettes personnelles)

Pourquoi en premier ? C'est le cœur métier, tout le reste en découle.
2. Les repositories
Des interfaces simples qui étendent JpaRepository. À ce stade, les méthodes de base suffiront.
3. La configuration de sécurité (base)

Créer l'enum Role (ADMIN, USER, etc.)
Mettre en place Spring Security avec JWT
Configuration basique pour permettre certains endpoints publics (register, login)
Service d'authentification

Pourquoi maintenant ? Parce que ça impacte tous les controllers que tu vas créer après.
4. Les DTOs et Mappers

DTOs pour les requêtes (RegisterDTO, LoginDTO, CreateRecetteDTO...)
DTOs pour les réponses (UserResponseDTO, RecetteDTO...)
Mappers (manuels ou MapStruct) pour la conversion Entité ↔ DTO

5. Les services métier
La logique applicative pour chaque entité, avec les règles métier (vérifier qu'une recette non partagée n'est visible que par son créateur, etc.)
6. Les controllers
Avec les annotations de sécurité (@PreAuthorize) pour gérer les accès selon les rôles.