package org.example.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    @Test
    void testActorCreation() {
        // Crée un film avec le titre, l'année et la durée
        Actor actor = new Actor("Jake", true, "12/12/24",132);

        // Teste que le titre, l'année et la durée sont corrects
        assertEquals("Jake", actor.getName());
        assertEquals(true, actor.getAdult());
        assertEquals("12/12/24", actor.getBirthDate());
        assertEquals(132, actor.getId());
    }

    @Test
    void testGetDetails() {
        // Crée un film avec le titre, l'année et la durée
        Actor actor = new Actor("Jake", true, "12/12/24",132);


        // Teste que la méthode getDetails retourne la bonne chaîne formatée
        assertEquals("Jake en adult true né le 12/12/24, 132", actor.getDetails());
    }
}
