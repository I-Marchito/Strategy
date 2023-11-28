package org.example;


public class Personagem {

    private int dano;

    public int getDano(){return dano;}

    public void skillQ (int recursoAtual, int recursoNecessario){
        UsarSkill usarSkill = new UsarSkill (recursoAtual, recursoNecessario);
        this.dano = usarSkill.usar(new SkillQ());
    }

    public void skillW (int recursoAtual, int recursoNecessario){
        UsarSkill usarSkill = new UsarSkill (recursoAtual, recursoNecessario);
        this.dano = usarSkill.usar(new SkillW());
    }

    public void skillE (int recursoAtual, int recursoNecessario){
        UsarSkill usarSkill = new UsarSkill (recursoAtual, recursoNecessario);
        this.dano = usarSkill.usar(new SkillE());
    }

    public void skillR (int recursoAtual, int recursoNecessario){
        UsarSkill usarSkill = new UsarSkill (recursoAtual, recursoNecessario);
        this.dano = usarSkill.usar(new SkillR());
    }

}