package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveUsarSkillQ() {
        Personagem pc = new Personagem();
        pc.skillQ(100, 20);
        assertEquals(140, pc.getDano());
    }

    @Test
    void deveRetornarRecursoInsuficienteSkillQ() {
        try{
            Personagem pc = new Personagem();
            pc.skillQ(100, 110);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Recurso insuficiente para usar habilidade", e.getMessage());
        }
    }

    @Test
    void deveUsarSkillW() {
        Personagem pc = new Personagem();
        pc.skillW(100, 40);
        assertEquals(100, pc.getDano());
    }

    @Test
    void deveRetornarRecursoInsuficienteSkillW() {
        try{
            Personagem pc = new Personagem();
            pc.skillW(100, 110);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Recurso insuficiente para usar habilidade", e.getMessage());
        }
    }

    @Test
    void deveUsarSkillE() {
        Personagem pc = new Personagem();
        pc.skillE(100, 30);
        assertEquals(330, pc.getDano());
    }

    @Test
    void deveRetornarRecursoInsuficienteSkillE() {
        try{
            Personagem pc = new Personagem();
            pc.skillE(100, 110);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Recurso insuficiente para usar habilidade", e.getMessage());
        }
    }

    @Test
    void deveUsarSkillR() {
        Personagem pc = new Personagem();
        pc.skillR(100, 50);
        assertEquals(600, pc.getDano());
    }

    @Test
    void deveRetornarRecursoInsuficienteSkillR() {
        try{
            Personagem pc = new Personagem();
            pc.skillR(100, 110);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Recurso insuficiente para usar habilidade", e.getMessage());
        }
    }

}