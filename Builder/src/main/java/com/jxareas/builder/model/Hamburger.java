package com.jxareas.builder.model;

public class Hamburger {

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;
    private final String vegetables;


    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;
        private String vegetables;

        public Builder() {

        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder vegetables(String vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public Hamburger build() {
            return new Hamburger(this);
        }


    }

    private Hamburger(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
        this.vegetables = builder.vegetables;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public String getVegetables() {
        return vegetables;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", dressing='" + dressing + '\'' +
                ", meat='" + meat + '\'' +
                ", vegetables='" + vegetables + '\'' +
                '}';
    }
}
