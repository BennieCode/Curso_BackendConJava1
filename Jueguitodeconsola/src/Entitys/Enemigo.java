package Entitys;

/**
 *
 * @author Costanzo
 */
public class Enemigo {
    
    private String name;
    private double hp;
    private double magic;
    private double mana;
    private double atk;

    public Enemigo() {
    }
    
    public Enemigo(String name, double hp, double magic, double mana, double atk) {
        this.name = name;
        this.hp = hp;
        this.magic = magic;
        this.mana = mana;
        this.atk = atk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMagic() {
        return magic;
    }

    public void setMagic(double magic) {
        this.magic = magic;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }
}
