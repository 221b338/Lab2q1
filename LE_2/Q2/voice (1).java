class Voice {
    
    
    public void prepareVoice() {
      
        Animal[] animals = new Animal[3];
        
      
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Lion();
        
      
        hear(animals);
    }

  
    public void hear(Animal[] animals) {
       
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
     private Animal[] animals;
    private void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
      private Animal[] getAnimals() {
        return animals;
    }
}
