public class Build {
    private final String name;
    private final String description;
    private final String Id;

    private Build(Builder b) {
        this.name = b.name;
        this.description = b.description;
        this.Id = b.Id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return Id;
    };

    

    @Override
    public String toString() {
        return "Build [name=" + name + ", description=" + description + ", Id=" + Id + "]";
    }



    static class Builder {
        private String name;
        private String description;
        private String Id;
        
        // public Builder(){};
        private Builder(){};

        public static Builder getBuilder()
        {
            return new Builder();
        }

        //public Builder setName(String name) {

        //? This syntax is called method chaining. We are returning the object so that we can contineously call the other method of the same class.
        //* eg: .setName("Gopal").build(); .setName() returns an object of the class, using object, we are calling build() method in continuation.
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.Id = id;
            return this;
        }

        public Build build() {
            return new Build(this);
        }
    }
}
