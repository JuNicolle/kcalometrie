
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