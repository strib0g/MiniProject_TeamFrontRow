public abstract class Person {
    private String name;
    private String DOB;
    private String address;
    private String ID;



    public Person(){
        this.name = "user Name";
        this.ID = " user ID";
        this.address ="user Address";
        this.DOB = "..../../..";
    }


    public Person(String name, String DOB, String adress, String ID) throws Exception {
        if(name.equals("")){
            throw new Exception(" An empty name, pleas Enter a valid name");
        }
        else{
            this.name = name;
            this.DOB = DOB;
            this.address = adress;
            this.ID = ID;

        }


    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDOB() {
        return DOB;
    }

    public String getID() {
        return ID;
    }




}
