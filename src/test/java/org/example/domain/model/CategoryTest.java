package org.example.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void testCategoryCreation() {
        // Crée un film avec le titre, l'année et la durée
        Category category = new Category("Horror", true, 148);

        // Teste que le titre, l'année et la durée sont corrects
        assertEquals("Horror", category.getName());
        assertEquals(true, category.getAdult());
        assertEquals(148, category.getId());
    }

    @Test
    void testGetDetails() {
        // Crée un film avec le titre, l'année et la durée
        Category category = new Category("Horror", true, 148);

        // Teste que la méthode getDetails retourne la bonne chaîne formatée
        assertEquals("Horror en adult true, 148", category.getDetails());
    }
}
