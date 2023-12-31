package me.dio.domain.model;


import jakarta.persistence.*;

import java.util.List;
    @Entity(name = "tb_user")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        @OneToOne(cascade = CascadeType.ALL)
        private Account account;
        @OneToOne(cascade = CascadeType.ALL)
        private Card card;

        @OneToMany(cascade = CascadeType.ALL)
        private List<Feature> feature;

        @OneToMany(cascade = CascadeType.ALL)
        private List<News> news;

        public User(Long id, String name, Account account, Card card, List<Feature> feature, List<News> news) {
            this.id = id;
            this.name = name;
            this.account = account;
            this.card = card;
            this.feature = feature;
            this.news = news;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Account getAccount() {
            return account;
        }

        public void setAccount(Account account) {
            this.account = account;
        }

        public Card getCard() {
            return card;
        }

        public void setCard(Card card) {
            this.card = card;
        }

        public List<Feature> getFeature() {
            return feature;
        }

        public void setFeature(List<Feature> feature) {
            this.feature = feature;
        }

        public List<News> getNews() {
            return news;
        }

        public void setNews(List<News> news) {
            this.news = news;
        }
    }
