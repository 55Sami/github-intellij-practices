package VideoGameSystem;

public abstract class Hero {
    private int health;

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        if(health >=0){
            this.health = health;
        }else{
            System.out.println("Error: Health cannot drop below 0!");
        }
    }
    public abstract void attack();

}
