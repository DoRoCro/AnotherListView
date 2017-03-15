package com.codeclan.anotherlistview;

/**
 * Created by user on 15/03/2017.
 */

public class Thing {

        private int ranking;
        private String name;
        private String url;

        public Thing(Integer ranking, String name, String url) {
            this.ranking = ranking;
            this.name = name;
            this.url = url;
        }

        public Integer getRanking() {
            return ranking;
        }

        public String getName() {
            return name;
        }

        public String getUrl() {
            return url;
        }

}
