package org.example;

public class UsarSkill {

    private int recursoAtual;

    private int recursoNecessario;

    public UsarSkill (int recursoAtual, int recursoNecessario){
        this.recursoAtual = recursoAtual;
        this.recursoNecessario = recursoNecessario;
    }

    public int usar(Skill skill) {return skill.usar(recursoAtual, recursoNecessario);}
}
