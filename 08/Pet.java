public class Pet {

    private String name;
    private String[] nicknames;
    private int noNicknames;
    private int age;
    private String species;
    private boolean houseTrained;
    
    private int nickNameIdx;

    public Pet(String name, int age, int noNicknames, String species, boolean houseTrained) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.noNicknames = noNicknames;
        this.nicknames = new String[noNicknames];
        this.houseTrained = houseTrained;
        this.nickNameIdx = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getSpecies() {
        return species;
    }
    
    public boolean equals(Pet b) {
        return this.name.equals(b.getName()) && this.age == b.getAge() 
            && this.species.equals(b.getSpecies());
    }
    
    public boolean addNickname(String nickname) {
        boolean added = false;
        if(!hasNickname(nickname)) {
            this.nicknames[nickNameIdx] = nickname;
            nickNameIdx++;
            added = true;
        }
        return added;
    }
    
    public boolean hasNickname(String nickname) {
        for(int i = 0; i < nickNameIdx; i++) {
            if(nickname.equals(nicknames[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static Pet oldestPet(Pet[] pets) {
        Pet currentOldest = null;
        if(pets != null) {
            if(pets.length > 0) {
                currentOldest = pets[0];
                for(int i = 1; i < pets.length; i++) {
                    if(pets[i].getAge() > currentOldest.getAge()) {
                        currentOldest = pets[i];
                    }
                }
            }
        }
        return currentOldest;
    }
    
    public boolean isHouseTrained(){
        return houseTrained;
    }

    public String[] getNicknames(){
        return nicknames;
    }

}
