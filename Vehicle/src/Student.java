class Student extends Person {
    private int hate;
    public boolean verifyHate(int hate){
        return hate >= 0 && hate <= 50;
    }
    public Student(String name,int age, int hate) {
        super(name,age);
        if (!verifyHate(hate)) {
            System.err.println("Defaul value1 0");
            this.hate = 0;
        }
        this.hate = hate;
        this.mark();
    }
    public void setHate(int hate) {
        verifyHate(hate);
    }
    public int getHate() {
        return hate;
    }
    public void mark(){
        System.out.println("Name: " + getName() + ", age: " + getAge() + ", hate: " + getHate());
    }
}

