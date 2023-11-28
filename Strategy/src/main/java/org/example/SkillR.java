package org.example;

public class SkillR implements Skill{

    public int usar(int recursoAtual, int recursoNecessario){
        if (recursoNecessario > recursoAtual){
            throw new IllegalArgumentException("Recurso insuficiente para usar habilidade");
        }else {
            return (recursoNecessario + recursoAtual)*4;
        }
    }
}
